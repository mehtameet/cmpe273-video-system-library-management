package Servlet;

import java.util.HashMap;
import java.util.Map;

import exception.MalformedException;

public class ValidateInput {

	private final Map<String, String> stateMap = new HashMap<String, String>();
	
	public ValidateInput(){
		intializeStates();
	}

	/*
	 * public boolean validateFirstName(String firstName) { return
	 * firstName.matches("[A-Z][a-zA-Z]*"); }
	 * 
	 * public boolean validateLastName(String lastName) { return
	 * lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*"); }
	 * 
	 * public boolean validateAddress(String address) { return
	 * address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"); }
	 * 
	 * public boolean validateCity(String city) { return
	 * city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"); }
	 */
	
	public boolean validateZipCode(String zipCode) throws MalformedException {
		if (zipCode.matches("\\d{5}") || zipCode.matches("\\d{5}-\\d{4}")) {
			return true;
		} else {
			throw (new MalformedException("Zip Code is invalid! "));
		}
	}

	public boolean validatePhone(String phone) throws MalformedException {
		if (phone.matches("[1-9]\\d{2}-\\d{2}-\\d{4}")) {
			return true;
		} else {
			throw (new MalformedException("Phone number is invalid! "));
		}
	}

	public boolean validateMemberShipId(String memberShipId)
			throws MalformedException {
		if (memberShipId.matches("\\d{3}-\\d{2}-\\d{4}")) {
			return true;
		} else {
			throw (new MalformedException("Social security Number is Invalid! "));
		}
	}

	public boolean validateState(String state) throws MalformedException {
		if (stateMap != null
				&& (stateMap.containsKey(state) || stateMap
						.containsValue(state))) {
			return true;
		} else {
			throw (new MalformedException("State name is invalid! "));
		}
	}

	private void intializeStates() {

		// initialize all states and it abbreviations
		stateMap.put("Alabama", "AL");
		stateMap.put("Alaska", "AK");
		stateMap.put("Arizona", "AZ");
		stateMap.put("Arkansas", "AR");
		stateMap.put("California", "CA");
		stateMap.put("Colorado", "CO");
		stateMap.put("Connecticut", "CT");
		stateMap.put("Delaware", "DE");
		stateMap.put("District of Columbia", "DC");
		stateMap.put("Florida", "FL");
		stateMap.put("Georgia", "GA");
		stateMap.put("Hawaii", "HI");
		stateMap.put("Idaho", "ID");
		stateMap.put("Illinois", "IL");
		stateMap.put("Indiana", "IN");
		stateMap.put("Iowa", "IA");
		stateMap.put("Kansas", "KS");
		stateMap.put("Kentucky", "KY");
		stateMap.put("Louissiana", "LA");
		stateMap.put("Maine", "ME");
		stateMap.put("Maryland", "MD");
		stateMap.put("Massachusetts", "MA");
		stateMap.put("Michigan", "MI");
		stateMap.put("Minnesota", "MN");
		stateMap.put("Mississippi", "MS");
		stateMap.put("Missouri", "MO");
		stateMap.put("Montana", "MT");
		stateMap.put("Nebraska", "NE");
		stateMap.put("Nevada", "NV");
		stateMap.put("New Hampshire", "NH");
		stateMap.put("New Jersey", "NJ");
		stateMap.put("New Mexico", "NM");
		stateMap.put("New York", "NY");
		stateMap.put("North Carolina", "NC");
		stateMap.put("North Dakota", "ND");
		stateMap.put("Ohio", "OH");
		stateMap.put("Oklahoma", "OK");
		stateMap.put("Oregon", "OR");
		stateMap.put("Pennsylvania", "PA");
		stateMap.put("Rhode island", "RI");
		stateMap.put("South Carolina", "SC");
		stateMap.put("South Dakota", "SD");
		stateMap.put("Tennessee", "TN");
		stateMap.put("Texas", "TX");
		stateMap.put("Utah", "UT");
		stateMap.put("Vermont", "VT");
		stateMap.put("Virginia", "VA");
		stateMap.put("Washington", "WA");
		stateMap.put("Wisconsin", "WI");
		stateMap.put("Wyoming", "WY");

	}
}