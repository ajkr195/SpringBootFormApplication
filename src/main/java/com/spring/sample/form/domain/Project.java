package com.spring.sample.form.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Project implements Serializable {

	private Long id;
	private String title;
	private String type;
	private String description;
	private Integer days;
	private Double price;
	private String teammembers;
	private Boolean featured;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime launchDate;

	public Project() {
	}

	public Project(Long id, String title, String type, String description, Integer days, Double price,
			String teammembers, Boolean featured, LocalDateTime launchDate) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.description = description;
		this.days = days;
		this.teammembers = teammembers;
		this.price = price;
		this.featured = featured;
		this.launchDate = launchDate;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTeammembers() {
		return teammembers;
	}

	public void setTeammembers(String teammembers) {
		this.teammembers = teammembers;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public LocalDateTime getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDateTime launchDate) {
		this.launchDate = launchDate;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", type=" + type + ", description=" + description + ", days="
				+ days + ", price=" + price + ", teammembers=" + teammembers + ", featured=" + featured
				+ ", launchDate=" + launchDate + "]";
	}

	

}
