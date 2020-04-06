package com.spring.sample.form.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String type;
	private Double price;
	private String teammembers;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime launchDate;
	private Integer days;
	private Boolean featured;
	private Boolean highpriority;
	private String description;

	private String projectmanager;
	private String productowner;
	private String departments;
	private String practice;
	private String regions;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime approvaldate;
	private Integer ranking;
	private Boolean risksidentified;
	private Boolean resolutionplan;
	private String summary;

	public Project(Long id, String title, String type, Double price, String teammembers, LocalDateTime launchDate,
			Integer days, Boolean featured, Boolean highpriority, String description, String projectmanager,
			String productowner, String departments, String practice, String regions, LocalDateTime approvaldate,
			Integer ranking, Boolean risksidentified, Boolean resolutionplan, String summary) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.price = price;
		this.teammembers = teammembers;
		this.launchDate = launchDate;
		this.days = days;
		this.featured = featured;
		this.highpriority = highpriority;
		this.description = description;
		this.projectmanager = projectmanager;
		this.productowner = productowner;
		this.departments = departments;
		this.practice = practice;
		this.regions = regions;
		this.approvaldate = approvaldate;
		this.ranking = ranking;
		this.risksidentified = risksidentified;
		this.resolutionplan = resolutionplan;
		this.summary = summary;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
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

	public LocalDateTime getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDateTime launchDate) {
		this.launchDate = launchDate;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public Boolean getHighpriority() {
		return highpriority;
	}

	public void setHighpriority(Boolean highpriority) {
		this.highpriority = highpriority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjectmanager() {
		return projectmanager;
	}

	public void setProjectmanager(String projectmanager) {
		this.projectmanager = projectmanager;
	}

	public String getProductowner() {
		return productowner;
	}

	public void setProductowner(String productowner) {
		this.productowner = productowner;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public String getRegions() {
		return regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public LocalDateTime getApprovaldate() {
		return approvaldate;
	}

	public void setApprovaldate(LocalDateTime approvaldate) {
		this.approvaldate = approvaldate;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Boolean getRisksidentified() {
		return risksidentified;
	}

	public void setRisksidentified(Boolean risksidentified) {
		this.risksidentified = risksidentified;
	}

	public Boolean getResolutionplan() {
		return resolutionplan;
	}

	public void setResolutionplan(Boolean resolutionplan) {
		this.resolutionplan = resolutionplan;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((approvaldate == null) ? 0 : approvaldate.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((departments == null) ? 0 : departments.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((featured == null) ? 0 : featured.hashCode());
		result = prime * result + ((highpriority == null) ? 0 : highpriority.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((launchDate == null) ? 0 : launchDate.hashCode());
		result = prime * result + ((practice == null) ? 0 : practice.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productowner == null) ? 0 : productowner.hashCode());
		result = prime * result + ((projectmanager == null) ? 0 : projectmanager.hashCode());
		result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		result = prime * result + ((resolutionplan == null) ? 0 : resolutionplan.hashCode());
		result = prime * result + ((risksidentified == null) ? 0 : risksidentified.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + ((teammembers == null) ? 0 : teammembers.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Project other = (Project) obj;
		if (approvaldate == null) {
			if (other.approvaldate != null)
				return false;
		} else if (!approvaldate.equals(other.approvaldate))
			return false;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (departments == null) {
			if (other.departments != null)
				return false;
		} else if (!departments.equals(other.departments))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (featured == null) {
			if (other.featured != null)
				return false;
		} else if (!featured.equals(other.featured))
			return false;
		if (highpriority == null) {
			if (other.highpriority != null)
				return false;
		} else if (!highpriority.equals(other.highpriority))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (launchDate == null) {
			if (other.launchDate != null)
				return false;
		} else if (!launchDate.equals(other.launchDate))
			return false;
		if (practice == null) {
			if (other.practice != null)
				return false;
		} else if (!practice.equals(other.practice))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productowner == null) {
			if (other.productowner != null)
				return false;
		} else if (!productowner.equals(other.productowner))
			return false;
		if (projectmanager == null) {
			if (other.projectmanager != null)
				return false;
		} else if (!projectmanager.equals(other.projectmanager))
			return false;
		if (ranking == null) {
			if (other.ranking != null)
				return false;
		} else if (!ranking.equals(other.ranking))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (resolutionplan == null) {
			if (other.resolutionplan != null)
				return false;
		} else if (!resolutionplan.equals(other.resolutionplan))
			return false;
		if (risksidentified == null) {
			if (other.risksidentified != null)
				return false;
		} else if (!risksidentified.equals(other.risksidentified))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (teammembers == null) {
			if (other.teammembers != null)
				return false;
		} else if (!teammembers.equals(other.teammembers))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", type=" + type + ", price=" + price + ", teammembers="
				+ teammembers + ", launchDate=" + launchDate + ", days=" + days + ", featured=" + featured
				+ ", highpriority=" + highpriority + ", description=" + description + ", projectmanager="
				+ projectmanager + ", productowner=" + productowner + ", departments=" + departments + ", practice="
				+ practice + ", regions=" + regions + ", approvaldate=" + approvaldate + ", ranking=" + ranking
				+ ", risksidentified=" + risksidentified + ", resolutionplan=" + resolutionplan + ", summary=" + summary
				+ "]";
	}

}
