//package com.pro.trainingservice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import com.pro.trainingentity.UserEntity;
//import com.pro.trainingentity.UserTraining;
//import com.pro.trainingrepository.UserRepository;
//import com.pro.trainingrepository.UserTrainingRepository;
//
//
//
//@Service
//public class UserTrainingService {
//	
//
//	@Autowired
//	private UserTrainingRepository utr;
//	@Autowired
//	private  UserRepository ur;
//
//	
//	
//	public List<UserEntity> getUserDetails() {
//		List<UserEntity> ls=new ArrayList<>();
//		utr.findAll().forEach(ls::add);
//		return ls;
//	}
//	
//	public void setUserTraining(UserTraining ut, Integer id) {
////		System.out.println(ts.getTechName()+"===");
//		UserEntity uid = new UserEntity();
//		
//		uid=ur.findById(id).get();
//		ut.setUd(uid);
//		utr.save(ut);
//		ur.save(uid);
//		
//	}
//	
//	
//	
//	public UserEntity getUserDetails(Integer id) {
//		// TODO Auto-generated method stub
//		//return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
//		return utr.findById(id).orElse(null);
//	}
//	
//	public void addUserDetails(UserEntity mt) {
//		utr.save(mt);
//	}
//	
//	public void updateUserDetails(UserEntity mt,Integer id) {
//		utr.save(mt);
//	}
//	public void deleteUserDetails(Integer id) {
//		utr.deleteById(id);
//	}
//
//
//	
//
//}
