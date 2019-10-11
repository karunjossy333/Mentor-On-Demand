package com.pro.trainingentity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="mentor_details")
public class MentorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mentor_id")
	private Integer mentorId;
	@Column(name="mentor_name")
	private String mentorName;
	@Column(name="mentor_email")
	private String mentorEmail;
	@Column(name="mentor_years_exp")
	private Integer mentorYearsExp;
	@Column(name="mentor_linkdin_url")
	private String mentorLinkdinUrl;
	@Column(name="mentor_phone")
	private String mentorPhone;
	@Column(name="no_of_trainings")
	private Integer trainings;
	@Column(name="rating")
	private float rating;
	
	@OneToMany(mappedBy = "md",cascade = CascadeType.ALL)
	private List<MentorTraining> mt;
	
	
	@OneToMany(mappedBy = "md",cascade = CascadeType.ALL)
	private List<MentorSkills> ms;


	public MentorDetails() {
		super();
	}


	public MentorDetails(Integer mentorId, String mentorName, String mentorEmail, Integer mentorYearsExp,
			String mentorLinkdinUrl, String mentorPhone, Integer trainings, float rating, List<MentorTraining> mt,
			List<MentorSkills> ms) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorYearsExp = mentorYearsExp;
		this.mentorLinkdinUrl = mentorLinkdinUrl;
		this.mentorPhone = mentorPhone;
		this.trainings = trainings;
		this.rating = rating;
		this.mt = mt;
		this.ms = ms;
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


	

	public List<MentorTraining> getMt() {
		return mt;
	}


	public void setMt(List<MentorTraining> mt) {
		this.mt = mt;
	}


	public List<MentorSkills> getMs() {
		return ms;
	}


	public void setMs(List<MentorSkills> ms) {
		this.ms = ms;
	}
	
	
	
	
}