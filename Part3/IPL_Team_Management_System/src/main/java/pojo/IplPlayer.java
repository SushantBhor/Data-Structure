package pojo;

import java.sql.*;

public class IplPlayer {
	private int Player_id;
	private String First_Name;
	private String Last_Name;
	private Date Dob;
	private double batting_avg;
	private int wickets_taken;
	private int Team;
	public IplPlayer() {
		// TODO Auto-generated constructor stub
	}
	public IplPlayer(int player_id, String first_Name, String last_Name, Date dob, double batting_avg,
			int wickets_taken, int team) {
		super();
		Player_id = player_id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Dob = dob;
		this.batting_avg = batting_avg;
		this.wickets_taken = wickets_taken;
		Team = team;
	}
	public int getPlayer_id() {
		return Player_id;
	}
	public void setPlayer_id(int player_id) {
		Player_id = player_id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public double getBatting_avg() {
		return batting_avg;
	}
	public void setBatting_avg(double batting_avg) {
		this.batting_avg = batting_avg;
	}
	public int getWickets_taken() {
		return wickets_taken;
	}
	public void setWickets_taken(int wickets_taken) {
		this.wickets_taken = wickets_taken;
	}
	public int getTeam() {
		return Team;
	}
	public void setTeam(int team) {
		Team = team;
	}
	@Override
	public String toString() {
		return "IplPlayer [Player_id=" + Player_id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Dob=" + Dob + ", batting_avg=" + batting_avg + ", wickets_taken=" + wickets_taken + ", Team="
				+ Team + "]";
	}

}
