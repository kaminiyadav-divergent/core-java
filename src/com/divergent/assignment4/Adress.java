package com.divergent.assignment4;

public class Adress implements Cloneable{
	private String city;
	private String state;
	private int pincode;

	public Adress(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
