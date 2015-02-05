package org.Week2;

public class CartItem {

	private int itemID;
	private double itemPrice;
	private int taxBand;

	public int getItemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public double getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getTaxBand() {
		return this.taxBand;
	}

	public void setTaxBand(int taxBand) {
		this.taxBand = taxBand;
	}

	public CartItem() {
	}
	
	public CartItem (newItemID, newItemPrice, newTaxBand){
	
		itemID = newItemID;
		itemPrice = newItemPrice;
		taxBand = newTaxBand;
		
	}

}
