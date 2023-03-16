package com.acknowledgment.Entity;

public class address {
	private String area;
	private String city;
	private String State;
	private String postalCode;
	
	
	
	
	@Override
	public String toString() {
		return "address [area=" + area + ", city=" + city + ", State=" + State + ", postalCode=" + postalCode + "]";
	}

	public address(String area, String city, String state, String postalCode) {
		super();
		this.area = area;
		this.city = city;
		State = state;
		this.postalCode = postalCode;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	

	
}
