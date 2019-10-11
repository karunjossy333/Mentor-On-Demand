package com.mod.entity;

import javax.persistence.*;

public class Technology {

	private  Integer techId;
	private  String techName;
	private  float techFee;
	private  float techCommission;

	public Technology() {
		super();
	}

	public Technology(String techName, float techFee, float techCommission) {
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

	public float getTechFee() {
		return techFee;
	}

	public void setTechFee(float techFee) {
		this.techFee = techFee;
	}

	public float getTechCommission() {
		return techCommission;
	}

	public void setTechCommission(float techCommission) {
		this.techCommission = techCommission;
	}
}
