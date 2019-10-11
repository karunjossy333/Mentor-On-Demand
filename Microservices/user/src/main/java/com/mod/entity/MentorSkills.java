package com.mod.entity;

import javax.persistence.*;

public class MentorSkills {
	
	private Integer skillId;
	private  String skillName;
	private Integer mentorId;

	public MentorSkills() {
	}

	public MentorSkills(String skillName, Integer mentorId) {
		this.skillName = skillName;
		this.mentorId = mentorId;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
}
