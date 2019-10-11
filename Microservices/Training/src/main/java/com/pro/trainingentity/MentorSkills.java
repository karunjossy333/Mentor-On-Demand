package com.pro.trainingentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_skills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="skill_id")
	private int skillId;
	@Column(name="skill_name")
	private  String skillName;
	
	@ManyToOne
	private MentorDetails md;
	
	public MentorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorDetails getMd() {
		return md;
	}
	public void setMd(MentorDetails md) {
		this.md = md;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	public MentorSkills(int skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		
	}
	

}
