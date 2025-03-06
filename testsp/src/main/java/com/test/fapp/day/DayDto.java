package com.test.fapp.day;

import java.time.LocalDate;

public class DayDto {
	
	private String seq;
	private String special_day;
	private LocalDate date;
	private Boolean lift_force;
	private Integer account_seq;
	private Boolean represent;
	
	private String nick_Name;

	

	
	public String getNick_Name() {
		return nick_Name;
	}
	public void setNick_Name(String nick_Name) {
		this.nick_Name = nick_Name;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getSpecial_day() {
		return special_day;
	}
	public void setSpecial_day(String special_day) {
		this.special_day = special_day;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Boolean getLift_force() {
		return lift_force;
	}
	public void setLift_force(Boolean lift_force) {
		this.lift_force = lift_force;
	}
	public Integer getAccount_seq() {
		return account_seq;
	}
	public void setAccount_seq(Integer account_seq) {
		this.account_seq = account_seq;
	}
	public Boolean getRepresent() {
		return represent;
	}
	public void setRepresent(Boolean represent) {
		this.represent = represent;
	}
	
	//----------------
	
	
}
