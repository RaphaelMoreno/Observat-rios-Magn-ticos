/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.geo.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author Raphael Moreno
 */
public class Local {
        @SerializedName("IAGA")
	@Expose
	private String iAGA;
        
        
	@SerializedName("Name")
	@Expose
	private String name;
        
        
	@SerializedName("Country")
	@Expose
	private String country;
        
        
	@SerializedName("Colatitute")
	@Expose
	private String colatitute;
        
        
	@SerializedName("EastLongitude")
	@Expose
	private String eastLongitude;
        
        
	@SerializedName("Institute")
	@Expose
	private String institute;
        
        
	@SerializedName("GIN")
	@Expose
	private String gIN;

	public String getIAGA() {
		return iAGA;
	}

	public void setIAGA(String iAGA) {
		this.iAGA = iAGA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getColatitute() {
		return colatitute;
	}

	public void setColatitute(String colatitute) {
		this.colatitute = colatitute;
	}

	public String getEastLongitude() {
		return eastLongitude;
	}

	public void setEastLongitude(String eastLongitude) {
		this.eastLongitude = eastLongitude;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getGIN() {
		return gIN;
	}

	public void setGIN(String gIN) {
		this.gIN = gIN;
	}
}
