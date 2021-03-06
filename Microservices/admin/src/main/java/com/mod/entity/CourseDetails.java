package com.mod.entity;

import javax.persistence.*;
import java.sql.Date;

public class CourseDetails {

	private Integer courseId;
	private Float fees;
	private Date startDate;
	private String courseStatus;
	private Integer courseProgress;
	private Date endDate;
	private Integer user;
	private Integer mentor;

	private Technology tech;

	public CourseDetails() {
		super();
	}

	public CourseDetails(Float fees, Date startDate, String courseStatus, Integer courseProgress, Date endDate, Integer user, Integer mentor, Technology tech) {
		this.fees = fees;
		this.startDate = startDate;
		this.courseStatus = courseStatus;
		this.courseProgress = courseProgress;
		this.endDate = endDate;
		this.user = user;
		this.mentor = mentor;
		this.tech = tech;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public Float getFees() {
		return fees;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Technology getTech() {
		return tech;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setTech(Technology tech) {
		this.tech = tech;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getMentor() {
		return mentor;
	}

	public void setMentor(Integer mentor) {
		this.mentor = mentor;
	}

	public Integer getCourseProgress() {
		return courseProgress;
	}

	public void setCourseProgress(Integer courseProgress) {
		this.courseProgress = courseProgress;
	}
}
