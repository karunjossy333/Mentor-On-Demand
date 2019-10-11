package com.pro.trainingcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.trainingentity.MentorTraining;
import com.pro.trainingentity.UserTraining;
import com.pro.trainingservice.MentorTrainingService;
//import com.pro.trainingservice.UserTrainingService;



@RestController
public class TrainingController {

	@Autowired
	private MentorTrainingService mts;
//	@Autowired
//	private UserTrainingService uts;
//	
	

	@RequestMapping("/mentortraining")
	public List<MentorTraining> getMentorTraining() {
	return mts.getMentorTraining();
	}
	
	@RequestMapping("/mentortraining/{id}")
	public MentorTraining getMentorTraining(@PathVariable Integer id) {
	return mts.getMentorTraining(id);
	}
//	
//	
	@RequestMapping(method=RequestMethod.POST,value="/mentortraining/{id}")
	public void setDetails(@RequestBody MentorTraining te,@PathVariable Integer id) {
		mts.setMentorTraining(te,id);
		
	}
	
	
	
	
	
	

//	@RequestMapping("/UserTraining")
//	public List<UserTraining> getUserDetails() {
//	return uts.getUserDetails();
//	}
//	
//	@RequestMapping("/UserTraining/{id}")
//	public UserTraining getUserDetails(@PathVariable Integer id) {
//	return uts.getUserDetails(id);
//	}
////	
////	
//	@RequestMapping(method=RequestMethod.POST,value="/UserTraining/{id}")
//	public void setUserDetails(@RequestBody UserTraining ut,@PathVariable Integer id) {
//		uts.setUserTraining(ut,id);
//		
//	}
}

	