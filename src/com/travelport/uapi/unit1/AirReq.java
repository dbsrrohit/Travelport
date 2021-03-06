package com.travelport.uapi.unit1;

import java.math.BigInteger;

import com.travelport.schema.air_v42_0.AirLegModifiers;
import com.travelport.schema.air_v42_0.AirPricingModifiers;
import com.travelport.schema.air_v42_0.AirSearchModifiers;
import com.travelport.schema.air_v42_0.AirSearchModifiers.PreferredProviders;
import com.travelport.schema.air_v42_0.BaseLowFareSearchReq;
import com.travelport.schema.air_v42_0.FlightType;
import com.travelport.schema.air_v42_0.PermittedCarriers;
import com.travelport.schema.air_v42_0.PreferredCabins;
import com.travelport.schema.air_v42_0.ProhibitedCarriers;
import com.travelport.schema.air_v42_0.SearchAirLeg;
import com.travelport.schema.common_v42_0.Carrier;
import com.travelport.schema.common_v42_0.Airport;
import com.travelport.schema.common_v42_0.BaseCoreReq;
import com.travelport.schema.common_v42_0.BaseSearchReq;
import com.travelport.schema.common_v42_0.BillingPointOfSaleInfo;
import com.travelport.schema.common_v42_0.CabinClass;
import com.travelport.schema.common_v42_0.City;
import com.travelport.schema.common_v42_0.CityOrAirport;
import com.travelport.schema.common_v42_0.Distance;
import com.travelport.schema.common_v42_0.Provider;
import com.travelport.schema.common_v42_0.SearchPassenger;
import com.travelport.schema.common_v42_0.TypeFlexibleTimeSpec;
import com.travelport.schema.common_v42_0.TypeFlexibleTimeSpec.SearchExtraDays;
import com.travelport.schema.common_v42_0.TypeSearchLocation;

/**
 * Namespace for static functions that can manipulate an air request in
 * useful ways.
 *
 */
public class AirReq {

	/**
	 * As of v18 of air wsdl, the point of sale is required.  This sets
	 * the point of sale just contain the GDS and the application name.
	 * @param req the request to modify
	 * @param appName the name to send as application name
	 */
	public static void addPointOfSale(BaseSearchReq req, String appName ) {
		BillingPointOfSaleInfo posInfo = new BillingPointOfSaleInfo();
		posInfo.setOriginApplication(appName);
		req.setBillingPointOfSaleInfo(posInfo);
	}
	
	public static void addPointOfSale(BaseCoreReq req, String appName ) {
		BillingPointOfSaleInfo posInfo = new BillingPointOfSaleInfo();
		posInfo.setOriginApplication(appName);
		req.setBillingPointOfSaleInfo(posInfo);
	}

	/**
	 * Add the search passengers to the request.  We only add ADT (adult)
	 * passengers and this only works for LowFareSearchReq objects.
	 * @param request the req to add the passenger parameter to
	 * @param n number of adults to put in the requset
	 */
	public static void addAdultPassengers(BaseLowFareSearchReq request, int n) {
		for (int i = 0; i < n; ++i) {
			SearchPassenger adult = new SearchPassenger();
			adult.setCode("ADT");
			request.getSearchPassenger().add(adult);
		}
	}



	/**
	 * Create a leg for a search based on simple origin and destination 
	 * between two airports.
	 * 
	 * @param originAirportCode
	 * @param destAirportCode
	 * @return  
	 */
	public static SearchAirLeg createLeg(String originAirportCode,
			String destAirportCode) {
		TypeSearchLocation originLoc = new TypeSearchLocation();
		TypeSearchLocation destLoc = new TypeSearchLocation();

		// airport objects are just wrappers for their codes
		Airport origin = new Airport(), dest = new Airport();
		origin.setCode(originAirportCode);
		dest.setCode(destAirportCode);
		
		
		// city objects are just wrappers for their codes
		/*City origin = new City(), dest = new City();
		origin.setCode(originAirportCode);
		dest.setCode(destAirportCode);*/
		
		// search locations can be things other than airports but we are using
		// the airport version...
		originLoc.setAirport(origin);
		destLoc.setAirport(dest);

		return createLeg(originLoc, destLoc);
	}
	/**
	 * Create a leg based on the (more general) TypeSearchLocation which can
	 * be a variety of different things (such as non-iata named rail stations).
	 * 
	 * @param originLoc starting point of leg
	 * @param destLoc endpoint of leg
	 * @return
	 */
	public static SearchAirLeg createLeg(TypeSearchLocation originLoc,
			TypeSearchLocation destLoc) {
		SearchAirLeg leg = new SearchAirLeg();

		// add the origin and dest to the leg
		leg.getSearchDestination().add(destLoc);
		leg.getSearchOrigin().add(originLoc);	
		
		AirLegModifiers legModifiers = new AirLegModifiers();
		
		//maximum journey time
		legModifiers.setMaxJourneyTime(new Integer("10"));
		//maximum stops
		FlightType flightType = new FlightType();
		flightType.setMaxStops(new Integer("1"));
		
		legModifiers.setFlightType(flightType);
		
		leg.setAirLegModifiers(legModifiers);
		
		return leg;
	}
	
	/**
	 * Make a search location based on a city or airport code (city is 
	 * preferred to airport in a conflict) and set the search radius to
	 * 50mi.
	 */
	public static TypeSearchLocation createLocationNear(String cityOrAirportCode) {
		TypeSearchLocation result = new TypeSearchLocation();
		
		//city
		CityOrAirport place = new CityOrAirport();
		place.setCode(cityOrAirportCode);
		place.setPreferCity(true);
		result.setCityOrAirport(place);

		//distance
		Distance dist = new Distance();
		dist.setUnits("mi");
		dist.setValue(BigInteger.valueOf(50));
		result.setDistance(dist);
		
		return result;
	}
	 
	
	/**
	 * Mmodify a search leg to use economy class of service as preferred.
	 * 
	 * @param outbound the leg to modify
	 */
	public static void addEconomyPreferred(SearchAirLeg outbound) {
		AirLegModifiers modifiers = new AirLegModifiers();
		PreferredCabins cabins = new PreferredCabins();
		CabinClass econ = new CabinClass();
		econ.setType("Economy");
		
		//cabins.getCabinClass().add(econ);
		cabins.setCabinClass(econ);
		modifiers.setPreferredCabins(cabins);
		outbound.setAirLegModifiers(modifiers);
	}

	/**
	 * Modify a search leg based on a departure date
	 * 
	 * @param outbound the leg to modify
	 * @param departureDate the departure date in YYYY-MM-dd
	 */
	public static void addDepartureDate(SearchAirLeg outbound, String departureDate) {
		// flexible time spec is flexible in that it allows you to say
		// days before or days after
		TypeFlexibleTimeSpec noFlex = new TypeFlexibleTimeSpec();
		
		SearchExtraDays extraDays = new SearchExtraDays();
		extraDays.setDaysAfter(new Integer("3"));
		extraDays.setDaysBefore(new Integer("3"));
		
		noFlex.setPreferredTime(departureDate);
		//noFlex.setSearchExtraDays(extraDays);
		outbound.getSearchDepTime().add(noFlex);
	}

	/**
	 * Search modifiers to create, usually a GDS code plus optionally 
	 * RCH (Helper.RAIL_PROVIDER) or ACH (Helper.LOW_COST_PROVIDER).
	 * 
	 * @param providerCode  one or more provider codes (zero will not work!)
	 * @return the modifiers object
	 */
	public static AirSearchModifiers createModifiersWithProviders(String ... providerCode) {
		AirSearchModifiers modifiers = new AirSearchModifiers();
		PreferredProviders providers = new PreferredProviders();
		for (int i=0; i<providerCode.length;++i) {
			Provider p = new Provider();
			// set the code for the provider
			p.setCode(providerCode[i]);
			// can be many providers, but we just use one
			providers.getProvider().add(p);
			break;
		}
		modifiers.setPreferredProviders(providers);
		
		PermittedCarriers permittedCarriers = new PermittedCarriers();
		
		Carrier c = new Carrier();
		c.setCode("QF");
		permittedCarriers.getCarrier().add(c);
		
		modifiers.setPermittedCarriers(permittedCarriers);
		
		/*FlightType ft = new FlightType();
		ft.setMaxStops(1);
		ft.setSingleOnlineCon(true);
        ft.setNonStopDirects(false);
        ft.setStopDirects(true);        
        ft.setDoubleOnlineCon(true);
        ft.setTripleOnlineCon(true);
        ft.setSingleInterlineCon(false);
        ft.setDoubleInterlineCon(false);
        ft.setTripleInterlineCon(false);

		modifiers.setFlightType(ft);*/
		
		ProhibitedCarriers prohibitedCarriers = new ProhibitedCarriers();
		
		Carrier c1 = new Carrier();
		c1.setCode("JQ");
		prohibitedCarriers.getCarrier().add(c1);		
		
		
		//modifiers.setProhibitedCarriers(prohibitedCarriers);
		
		return modifiers;
	}

	public static SearchAirLeg createSearchLeg(String originAirportCode, String destAirportCode) {
		// TODO Auto-generated method stub
		TypeSearchLocation originLoc = new TypeSearchLocation();
		TypeSearchLocation destLoc = new TypeSearchLocation();

		// airport objects are just wrappers for their codes
		Airport origin = new Airport(), dest = new Airport();
		origin.setCode(originAirportCode);
		dest.setCode(destAirportCode);
		
		// search locations can be things other than airports but we are using
		// the airport version...
		originLoc.setAirport(origin);
		destLoc.setAirport(dest);

		return createSearchLeg(originLoc, destLoc);
	}

	private static SearchAirLeg createSearchLeg(TypeSearchLocation originLoc,
			TypeSearchLocation destLoc) {
		// TODO Auto-generated method stub
		SearchAirLeg leg = new SearchAirLeg();

		// add the origin and dest to the leg
		leg.getSearchDestination().add(destLoc);
		leg.getSearchOrigin().add(originLoc);	
		
		
		return leg;
	}

	public static void addSearchDepartureDate(SearchAirLeg outbound,
			String departureDate) {
		// TODO Auto-generated method stub
		// flexible time spec is flexible in that it allows you to say
		// days before or days after
		TypeFlexibleTimeSpec noFlex = new TypeFlexibleTimeSpec();
		noFlex.setPreferredTime(departureDate);
		outbound.getSearchDepTime().add(noFlex);
	}

	public static void addSearchEconomyPreferred(SearchAirLeg outbound) {
		// TODO Auto-generated method stub
		AirLegModifiers modifiers = new AirLegModifiers();
		PreferredCabins cabins = new PreferredCabins();
		CabinClass econ = new CabinClass();
		econ.setType("Economy");

		//cabins.getCabinClass().add(econ);
		cabins.setCabinClass(econ);
		modifiers.setPreferredCabins(cabins);
		outbound.setAirLegModifiers(modifiers);
	}

	public static void addChildPassengers(BaseLowFareSearchReq request, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; ++i) {
			SearchPassenger child = new SearchPassenger();
			child.setCode("CNN");
			child.setAge(new BigInteger("10"));
			request.getSearchPassenger().add(child);
		}
	}

	public static AirPricingModifiers createPricingModifiers() {
		// TODO Auto-generated method stub
		AirPricingModifiers modifiers = new AirPricingModifiers();
		modifiers.setCurrencyType("USD");
		
		return modifiers;
	}
	
}
