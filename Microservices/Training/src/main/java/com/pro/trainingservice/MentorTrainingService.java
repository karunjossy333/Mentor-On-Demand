package com.pro.trainingservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.trainingentity.MentorDetails;
import com.pro.trainingentity.MentorTraining;
import com.pro.trainingrepository.MentorDetailsRepo;
import com.pro.trainingrepository.MentorTrainingRepository;



@Service
public class MentorTrainingService {
	

	@Autowired
	private MentorTrainingRepository mtr;
	private  MentorDetailsRepo mdr;

	
	
	public List<MentorTraining> getMentorTraining() {
		List<MentorTraining> ls=new ArrayList<>();
		mtr.findAll().forEach(ls::add);
		return ls;
	}
	
	public MentorTraining getMentorTraining(Integer id) {
		// TODO Auto-generated method stub
		//return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
		return mtr.findById(id).orElse(null);
	}
	
	public void setMentorTraining(MentorTraining mt, Integer id) {
//		System.out.println(ts.getTechName()+"===");
		MentorDetails mid = new MentorDetails();
		
		mid=mdr.findById(id).get();
		mt.setMd(mid);
		mtr.save(mt);
		mdr.save(mid);
		
	}
	
	
	
//	public void addDetails(MentorTraining mt) {
//		mtr.save(mt);
//	}
//	
//	public void updateDetails(MentorTraining mt,Integer id) {
//		mtr.save(mt);
//	}
//	public void deleteDetails(Integer id) {
//		mtr.deleteById(id);
//	}


	

}
