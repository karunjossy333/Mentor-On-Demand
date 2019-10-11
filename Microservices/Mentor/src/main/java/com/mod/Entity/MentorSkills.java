package com.mod.Entity;

import javax.persistence.*;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id")
	private Integer skillId;
	@Column(name="tech_id")
	private Integer techId;
	@Column(name="mentor_id")
	private Integer mentorId;

	public MentorSkills() {
	}

	public MentorSkills(Integer techId, Integer mentorId) {
		this.techId = techId;
		this.mentorId = mentorId;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public Integer getSkillName() {
		return techId;
	}

	public void setSkillName(Integer techId) {
		this.techId = techId;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}
}
