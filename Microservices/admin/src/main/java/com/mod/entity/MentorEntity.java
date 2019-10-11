package com.mod.entity;

import javax.persistence.*;

//@Entity
//@Table(name="mentor_details")
public class MentorEntity {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="mentor_id")
	private Integer mentorId;
//	@Column(name="mentor_name")
	private String mentorName;
//	@Column(name="mentor_email")
	private String mentorEmail;
//	@Column(name="mentor_years_exp")
	private Integer mentorYearsExp;
//	@Column(name="mentor_linkdin_url")
	private String mentorLinkdinUrl;
//	@Column(name="mentor_phone")
	private String mentorPhone;
//	@Column(name="no_of_trainings")
	private Integer trainings;
//	@Column(name="rating")
	private float rating;
	
//	@OneToOne(targetEntity= ActorsEntity.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="actor_id")
	private ActorsEntity actor;
	
	public MentorEntity() {
		super();
	}

	public MentorEntity(String mentorName, String mentorEmail, Integer mentorYearsExp, String mentorLinkdinUrl, String mentorPhone, Integer trainings, float rating) {
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorYearsExp = mentorYearsExp;
		this.mentorLinkdinUrl = mentorLinkdinUrl;
		this.mentorPhone = mentorPhone;
		this.trainings = trainings;
		this.rating = rating;
	}

	public ActorsEntity getActor() {
		return actor;
	}

	public void setActor(ActorsEntity actor) {
		this.actor = actor;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getMentorEmail() {
		return mentorEmail;
	}

	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}

	public Integer getMentorYearsExp() {
		return mentorYearsExp;
	}

	public void setMentorYearsExp(Integer mentorYearsExp) {
		this.mentorYearsExp = mentorYearsExp;
	}

	public String getMentorLinkdinUrl() {
		return mentorLinkdinUrl;
	}

	public void setMentorLinkdinUrl(String mentorLinkdinUrl) {
		this.mentorLinkdinUrl = mentorLinkdinUrl;
	}

	public String getMentorPhone() {
		return mentorPhone;
	}

	public void setMentorPhone(String mentorPhone) {
		this.mentorPhone = mentorPhone;
	}

	public Integer getTrainings() {
		return trainings;
	}

	public void setTrainings(Integer trainings) {
		this.trainings = trainings;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
