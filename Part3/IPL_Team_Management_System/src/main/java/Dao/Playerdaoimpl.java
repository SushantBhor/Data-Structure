package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import pojo.IplPlayer;
import utils.dbutils;

public class Playerdaoimpl implements Playerdao {
	private Connection cn;
	private PreparedStatement pst1;

	public Playerdaoimpl() throws SQLException {
		cn = dbutils.getconnection();
		pst1 = cn.prepareStatement("insert into Players value(default,?,?,?,?,?,?)");
	}
//	 player_id     | int         | NO   | PRI | NULL    | auto_increment |
//	 | first_name    | varchar(20) | YES  |     | NULL    |                |
//	 | last_name     | varchar(20) | YES  |     | NULL    |                |
//	 | dob           | date        | YES  |     | NULL    |                |
//	 | batting_avg   | double      | YES  |     | NULL    |                |
//	 | wickets_taken | int         | YES  |     | NULL    |                |
//	 | team_id
	@Override
	public boolean InsertPlayer(IplPlayer p) throws SQLException {
		pst1.setString(1, p.getFirst_Name());
		pst1.setString(2,p.getLast_Name());
		pst1.setDate(3, p.getDob());
		pst1.setDouble(4, p.getBatting_avg());
		pst1.setInt(5, p.getWickets_taken());
		pst1.setInt(6, p.getTeam());
	
		if (pst1.executeUpdate()== 1) {
			return true;
		} else {
			return false;
		}

	}

	public void closeconnection() throws SQLException {
		if (pst1 != null) {
			pst1.close();
		}
	}
}

