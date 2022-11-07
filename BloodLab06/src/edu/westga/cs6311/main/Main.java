package edu.westga.cs6311.main;

import edu.westga.cs6311.house.House;

/**
 * Main class to call info from House class 
 * @author Anna Blood
 * @version 10/03/22
 *
 */
public class Main {

	/**
	 * Application entry point
	 * @param args Not used 
	 */
	public static void main(String[] args) {
		House houseOne = new House("42 Wallaby Way, Sydney, AU", true, 1965, 427599);
		House houseTwo = new House("4 Privet Drive, Little Whinging, Surrey, UK", false, 2499, 378259);
		houseOne.updateHouseColor("#335BFF");
		houseTwo.updateHouseColor("#AAB7B8");
		System.out.println(houseOne.getHouseDetails());
		System.out.println(houseTwo.getHouseDetails());
		houseOne.updateAddress("12 Grimmauld Place, London, UK");
		houseTwo.updateAddress("4 Privet Drive, Little Whinging, Surrey, UK");
		houseOne.updateSalePrice(399895);
		houseOne.updateSalePrice(378259);
		houseOne.updateSqFootage(2100);
		houseTwo.updateSqFootage(2499);
		houseOne.updateHouseColor("#FF3333");
		houseTwo.updateHouseColor("#FDFEFE");
		houseOne.updateIsForSale(false);
		houseTwo.updateIsForSale(true);
		System.out.println(houseOne.getHouseDetails());
		System.out.println(houseTwo.getHouseDetails());
	}
}
