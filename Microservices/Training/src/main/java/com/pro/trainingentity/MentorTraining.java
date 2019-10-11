package com.pro.trainingentity;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="mentor_training")
public class MentorTraining {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="training_id")
	private Integer trainingId;
	@Column(name="current_technology")
	private String currentTechnology;
	@Column(name="progress")
	private Integer progress;
	@Column(name="completed_technology")
	private String completedTechnology;
	@Column(name="fees")
	private Float fees;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	
	@ManyToOne
	private MentorDetails md;

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getCurrentTechnology() {
		return currentTechnology;
	}

	public void setCurrentTechnology(String currentTechnology) {
		this.currentTechnology = currentTechnology;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getCompletedTechnology() {
		return completedTechnology;
	}

	public void setCompletedTechnology(String completedTechnology) {
		this.completedTechnology = completedTechnology;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public MentorDetails getMd() {
		return md;
	}

	public void setMd(MentorDetails md) {
		this.md = md;
	}

	public MentorTraining(Integer trainingId, String currentTechnology, Integer progress, String completedTechnology,
			Float fees, Date startDate, Date endDate, MentorDetails md) {
		super();
		this.trainingId = trainingId;
		this.currentTechnology = currentTechnology;
		this.progress = progress;
		this.completedTechnology = completedTechnology;
		this.fees = fees;
		this.startDate = startDate;
		this.endDate = endDate;
		this.md = md;
	}

	public MentorTraining() {
		super();
	}
	
	
	
}
	