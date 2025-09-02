package edu.jsp.XmlAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("144")
	private int hno;
	@Value("line no 2")
	private String lineno;
	@Value("Anna nagar")
	private String streetname;
	@Value("Namakkal")
	private String district;
	@Value("636015")
	private long pincode;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", lineno=" + lineno + ", streetname=" + streetname + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLineno() {
		return lineno;
	}
	public void setLineno(String lineno) {
		this.lineno = lineno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	

}
