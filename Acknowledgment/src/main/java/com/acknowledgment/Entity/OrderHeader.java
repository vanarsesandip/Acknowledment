package com.acknowledgment.Entity;

public class OrderHeader {

	private int ordID;
	private String userName;
	private String userMobileno;
	private String purchaseOrdNo;
	private String purchaseOrdDate;
	private String orderItems;
	private String address;
	
	
	
	
	
	@Override
	public String toString() {
		return "OrderHeader [ordID=" + ordID + ", userName=" + userName + ", userMobileno=" + userMobileno
				+ ", purchaseOrdNo=" + purchaseOrdNo + ", purchaseOrdDate=" + purchaseOrdDate + ", orderItems="
				+ orderItems + ", address=" + address + "]";
	}
	public OrderHeader(int ordID, String userName, String userMobileno, String purchaseOrdNo, String purchaseOrdDate,
			String orderItems, String address) {
		super();
		this.ordID = ordID;
		this.userName = userName;
		this.userMobileno = userMobileno;
		this.purchaseOrdNo = purchaseOrdNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderItems = orderItems;
		this.address = address;
	}
	public int getOrdID() {
		return ordID;
	}
	public void setOrdID(int ordID) {
		this.ordID = ordID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileno() {
		return userMobileno;
	}
	public void setUserMobileno(String userMobileno) {
		this.userMobileno = userMobileno;
	}
	public String getPurchaseOrdNo() {
		return purchaseOrdNo;
	}
	public void setPurchaseOrdNo(String purchaseOrdNo) {
		this.purchaseOrdNo = purchaseOrdNo;
	}
	public String getPurchaseOrdDate() {
		return purchaseOrdDate;
	}
	public void setPurchaseOrdDate(String purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}
	public String getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
