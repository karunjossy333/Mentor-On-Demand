package com.mod.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.Entity.MentorSkills;
import com.mod.Repository.MentorSkillsRepo;
@Service
public class MentorSkillsService {

	@Autowired
	private MentorSkillsRepo msr;

	public List<MentorSkills> getSkills(Integer skillName) {
		return msr.getSkills(skillName);
	}
	
	public void addSkills(MentorSkills md) {
		msr.save(md);
	}

	public void deleteSkills(Integer id) {
		msr.deleteById(id);
	}

}
