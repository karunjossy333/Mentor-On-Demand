package com.mod.entity;

//@Entity
//@Table(name="actors")
public class ActorsEntity {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="actor_id")
	private Integer id;
	public void setUserDetails(UserEntity userDetails) {
		this.userDetails = userDetails;
	}

//	@Column(name="actor_email")
	private String actorEmail;
//	@Column(name="actor_password")
	private String actorPassword;
//	@Column(name="actor_type")
	private String actorType;
//	@Column(name="actor_status")
	private Boolean actorStatus;
	
//	@OneToOne(targetEntity= UserEntity.class,cascade= CascadeType.ALL)
//	@JoinColumn(name="user_id")
	private UserEntity userDetails;
	
//	@OneToOne(targetEntity=MentorDetailsEntity.class)
//	@JoinColumn(name="mentor_id")
	private MentorEntity mentorDetails;
	

	public ActorsEntity() {
		super();
	}

	public ActorsEntity(String actorEmail, String actorPassword, String actorType, Boolean actorStatus) {
		super();
		this.actorEmail = actorEmail;
		this.actorPassword = actorPassword;
		this.actorType = actorType;
		this.actorStatus = actorStatus;
	}

	public void setMentorDetails(MentorEntity mentorDetails) {
		this.mentorDetails = mentorDetails;
	}


	public Integer getId() {
		return id;
	}

	public String getActorEmail() {
		return actorEmail;
	}


	public void setActorEmail(String actorEmail) {
		this.actorEmail = actorEmail;
	}


	public String getActorPassword() {
		return actorPassword;
	}


	public void setActorPassword(String actorPassword) {
		this.actorPassword = actorPassword;
	}


	public String getActorType() {
		return actorType;
	}


	public void setActorType(String actorType) {
		this.actorType = actorType;
	}


	public Boolean getActorStatus() {
		return actorStatus;
	}


	public void setActorStatus(Boolean actorStatus) {
		this.actorStatus = actorStatus;
	}


	
}
