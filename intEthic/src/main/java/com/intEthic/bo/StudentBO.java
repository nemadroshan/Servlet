package com.intEthic.bo;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class StudentBO {
	private String name;
	private String fname;
	private int physics_marks;
	private int chemistry_mark;
	private int bio_marks;
	private int english_marks;
	private int out_of;
	private float percentage;
	private int rollNum;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPhysics_marks() {
		return physics_marks;
	}

	public void setPhysics_marks(int physics_marks) {
		this.physics_marks = physics_marks;
	}

	public int getChemistry_mark() {
		return chemistry_mark;
	}

	public void setChemistry_mark(int chemistry_mark) {
		this.chemistry_mark = chemistry_mark;
	}

	public int getBio_marks() {
		return bio_marks;
	}

	public void setBio_marks(int bio_marks) {
		this.bio_marks = bio_marks;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentBO [name=" + name + ", fname=" + fname + ", physics_marks=" + physics_marks + ", chemistry_mark="
				+ chemistry_mark + ", bio_marks=" + bio_marks + ", english_marks=" + english_marks + ", percentage="
				+ percentage + "]";
	}

	public int getOut_of() {
		return out_of;
	}

	public void setOut_of(int out_of) {
		this.out_of = out_of;
	}

}
