package it.polito.tdp.ufo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sighting {
	private int id ;
	private LocalDateTime datetime ;
	private String city ;
	private String state ;
	private String country ;
	private String shape ;
	private int duration ;
	private String duration_hm ;
	private String comments ;
	private LocalDate date_posted ;
	private double latitude ;
	private double longitude ;
	
	public Sighting(int id, LocalDateTime datetime, String city, String state, String country, String shape,
			int duration, String duration_hm, String comments, LocalDate date_posted, double latitude,
			double longitude) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.city = city;
		this.state = state;
		this.country = country;
		this.shape = shape;
		this.duration = duration;
		this.duration_hm = duration_hm;
		this.comments = comments;
		this.date_posted = date_posted;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDuration_hm() {
		return duration_hm;
	}
	public void setDuration_hm(String duration_hm) {
		this.duration_hm = duration_hm;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getDate_posted() {
		return date_posted;
	}
	public void setDate_posted(LocalDate date_posted) {
		this.date_posted = date_posted;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sighting other = (Sighting) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Sighting [datetime=%s, city=%s, state=%s, country=%s, shape=%s, duration=%s]", datetime,
				city, state, country, shape, duration);
	}

}