package com.intEthic.dto;

import java.io.Serializable;

import lombok.Data;


public class StudentDTO implements Serializable {
	private String name;
	private String fname;
	private int physics_marks;
	private int chemistry_mark;
	private int bio_marks;
	private int english_marks;
	private int rollNum;
	private double percentage;
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getOutOf() {
		return outOf;
	}

	public void setOutOf(int outOf) {
		this.outOf = outOf;
	}
	private int outOf;

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
	
}
