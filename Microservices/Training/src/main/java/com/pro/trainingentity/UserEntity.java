package com.pro.trainingentity;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "user_entity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_phone")
    private String userPhone;
    @Column(name="user_email")
    private String userEmail;

    @OneToMany(mappedBy = "ud",cascade = CascadeType.ALL)
	private List<UserTraining> ut;

	public UserEntity() {
		super();
	}

	public UserEntity(Integer userId, String userName, String userPhone, String userEmail, List<UserTraining> ut) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.ut = ut;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<UserTraining> getUt() {
		return ut;
	}

	public void setUt(List<UserTraining> ut) {
		this.ut = ut;
	}

	
   
}
