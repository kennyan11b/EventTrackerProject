package com.skilldistillery.trails.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name = "image_url")
	private String imageUrl;

	private String description;
	
	@Column(name = "trail_length")
	private Double trailLength;
	
	@Column(name = "elevation_gain")
	private String elevationGain;
	
	@Column(name = "route_type")
	private String routeType;
	
	@Column(name = "date_hiked")
	private LocalDateTime dateHiked;
	
// ------ Mapping ------- //
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
		
// ------ Methods ------- //

	public Trail() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTrailLength() {
		return trailLength;
	}

	public void setTrailLength(Double trailLength) {
		this.trailLength = trailLength;
	}

	public String getElevationGain() {
		return elevationGain;
	}

	public void setElevationGain(String elevationGain) {
		this.elevationGain = elevationGain;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public LocalDateTime getDateHiked() {
		return dateHiked;
	}

	public void setDateHiked(LocalDateTime dateHiked) {
		this.dateHiked = dateHiked;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trail other = (Trail) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Trail [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", description=" + description
				+ ", trailLength=" + trailLength + ", elevationGain=" + elevationGain + ", routeType=" + routeType
				+ ", dateHiked=" + dateHiked + "]";
	}
	
}
