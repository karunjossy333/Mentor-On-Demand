package com.mod.entity;

import javax.persistence.*;

public class Technology {

	private  Integer techId;
	private  String techName;
	private  String techFee;
	private  String techCommission;

	public Technology() {
		super();
	}

	public Technology(String techName, String techFee, String techCommission) {
		this.techName = techName;
		this.techFee = techFee;
		this.techCommission = techCommission;
	}

	public Integer getTechId() {
		return techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechFee() {
		return techFee;
	}

	public void setTechFee(String techFee) {
		this.techFee = techFee;
	}

	public String getTechCommission() {
		return techCommission;
	}

	public void setTechCommission(String techCommission) {
		this.techCommission = techCommission;
	}
}
