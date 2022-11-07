package edu.westga.cs6311.house;

/**
 * Create variables, constructors, methods, getters, and setters for House
 * @author Anna Blood
 * @version 10/03/22
 *
 */
public class House {
	private String address;
	private boolean isForSale;
	private int sqFootage;
	private double salePrice;
	private String houseColor;
	
	/**
	 * Constructor
	 * @param newAddress sets new Address
	 * @param newIsForSale sets new for sale
	 * @param newSqFootage sets new sq footage
	 * @param newSalePrice sets new sale price 
	 */
	public House(String newAddress, boolean newIsForSale, int newSqFootage, double newSalePrice) {
		this.setAddress(newAddress);
		this.setIsForSale(newIsForSale);
		this.setSqFootage(newSqFootage);
		this.setSalePrice(newSalePrice);
		this.setHouseColor(this.determineHouseColor(""));
	}
	
	/**
	 * Compare House Address
	 * @param compareAddress sets address to compare 
	 * @return true or false 
	 */
	private boolean compareHouseAddress(String compareAddress) {
		return (this.getAddress().equals(compareAddress));
	}
	
	/**
	 * Compare Sq footage
	 * @param compareFootage sets footage to compare
	 * @return True of false
	 */
	private boolean compareSqFootage(int compareFootage) {
		return (this.getSqFootage() == compareFootage);
	}
	
	/**
	 * Compare Sale Price
	 * @param comparePrice Sets price to compare 
	 * @return true or false 
	 */
	private boolean compareSalePrice(double comparePrice) {
		return (this.getSalePrice() == comparePrice);
	}
	
	/**
	 * Compare House Color
	 * @param compareColor sets color to compare
	 * @return true or false 
	 */
	private boolean compareHouseColor(String compareColor) {
		return (this.getHouseColor().equals(compareColor));
	}
	
	/**
	 * Determines house color 
	 * @param colorCode gives hex color code
	 * @return the corresponding color 
	 */
	public String determineHouseColor(String colorCode) {
		switch (colorCode) {
			case "#17202A": return "Black";
			case "#FF3333": return "Red";
			case "#335BFF": return "Blue";
			case "#FDFEFE": return "White";
			case "#AAB7B8": return "Grey";
			default: return "Beige";
		}
	}
	
	/**
	 * Update address if different from field value
	 * @param newAddress sets new address
	 */
	public void updateAddress(String newAddress) {
		if (!this.compareHouseAddress(newAddress)) {
			this.setAddress(newAddress);
		}
	}
	
	/**
	 * Update isForSale if different from field value
	 * @param newIsForSale sets newForSale
	 */
	public void updateIsForSale(boolean newIsForSale) {
		this.setIsForSale(newIsForSale);
	}

	/**
	 * Update sqft if different from field value
	 * @param newSqFootage sets new sqft
	 */
	public void updateSqFootage(int newSqFootage) {
		if (!this.compareSqFootage(newSqFootage)) {
			this.setSqFootage(newSqFootage);
		}
	}
	
	/**
	 * Update sale price if different from field value
	 * @param newSalePrice sets new sale price
	 */
	public void updateSalePrice(double newSalePrice) {
		if (!this.compareSalePrice(newSalePrice)) {
			this.setSalePrice(newSalePrice);
		}
	}
	
	/**
	 * Update house color if different from field value
	 * @param newHouseColor sets new color
	 */
	public void updateHouseColor(String newHouseColor) {
		if (!this.compareHouseColor(newHouseColor)) {
			this.setHouseColor(this.determineHouseColor(newHouseColor));
		}
	}
	
	/**
	 * Get House Details
	 * @return the house details 
	 */
	public String getHouseDetails() {
		return "House Details - Address: " + this.getAddress() + ", Color: " 
				+ this.getHouseColor() + ", SqFt: " + this.getSqFootage() + ", Price $" 
				+ String.format("%,3.2f", this.getSalePrice()) + ". For Sale: " + this.getIsForSale();
	}
	
	/**
	 * Getter for address
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Setter for address
	 * @param nAddress to set new address
	 */
	public void setAddress(String nAddress) {
		if (nAddress != null && nAddress.length() >= 0) {
			this.address = nAddress;
		}
	}
	
	/**
	 * Getter for isForSale
	 * @return the isForSale
	 */
	public boolean getIsForSale() {
		return this.isForSale;
	}
	
	/**
	 * Setter for isForSale
	 * @param nIsForSale to set new isForSale
	 */
	public void setIsForSale(boolean nIsForSale) {
		if (this.isForSale != nIsForSale) {
			this.isForSale = nIsForSale;
		}
	}
	
	/**
	 * Getter for sqFootage
	 * @return the sqFootage
	 */
	public int getSqFootage() {
		return this.sqFootage;
	}
	
	/**
	 * Setter for sqFootage
	 * @param nSqFootage to set new sqFootage
	 */
	public void setSqFootage(int nSqFootage) {
		if (nSqFootage > 0) {
			this.sqFootage = nSqFootage;
		}
	}
	
	/**
	 * Getter for salePrice
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return this.salePrice;
	}
	
	/**
	 * Setter for salePrice
	 * @param nSalePrice to set new salePrice
	 */
	public void setSalePrice(double nSalePrice) {
		if (nSalePrice > 0) {
			this.salePrice = nSalePrice;
		}
	}
	
	/**
	 * Getter for houseColor
	 * @return the houseColor
	 */
	public String getHouseColor() {
		return this.houseColor;
	}
	
	/**
	 * Setter for houseColor
	 * @param nHouseColor to set new houseColor
	 */
	public void setHouseColor(String nHouseColor) {
		if (nHouseColor != null && nHouseColor.length() >= 0) {
			this.houseColor = nHouseColor;
		}
	}

}
