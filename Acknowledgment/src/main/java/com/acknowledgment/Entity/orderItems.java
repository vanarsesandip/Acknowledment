package com.acknowledgment.Entity;

public class orderItems {
	private int ordItemId;
	private int productNo;
	private String productname;
	private String productquantity;
	private String productPrice;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "orderItems [ordItemId=" + ordItemId + ", productNo=" + productNo + ", productname=" + productname
				+ ", productquantity=" + productquantity + ", productPrice=" + productPrice + "]";
	}
	
	
	
	public orderItems(int ordItemId, int productNo, String productname, String productquantity, String productPrice) {
		super();
		this.ordItemId = ordItemId;
		this.productNo = productNo;
		this.productname = productname;
		this.productquantity = productquantity;
		this.productPrice = productPrice;
	}



	public int getOrdItemId() {
		return ordItemId;
	}
	public void setOrdItemId(int ordItemId) {
		this.ordItemId = ordItemId;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
