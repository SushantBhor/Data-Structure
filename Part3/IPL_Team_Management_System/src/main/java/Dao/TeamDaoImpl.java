package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import pojo.IplPlayer;
import pojo.Teams;
import utils.dbutils;

public class TeamDaoImpl implements TeamDao {
	private Connection cn;
	private PreparedStatement pst1,pst2;

	public TeamDaoImpl() throws SQLException {
		cn = dbutils.getconnection();
		pst1 = cn.prepareStatement(" select team_id,abbrevation from teams");
		pst2 = cn.prepareStatement(" select * from teams where team_id=?");
	}
	@Override
	public HashMap<Integer, String> GetTeamDetails() throws SQLException {
		ResultSet rst=pst1.executeQuery();
		HashMap<Integer,String> list=new HashMap<>();
		while(rst.next())
		{
			System.out.println(rst.getInt(1)+rst.getString(2));
			list.put(rst.getInt(1),rst.getString(2));
		}
		return list;
	}
	@Override
	public Teams GetTeamInfo(IplPlayer P) throws SQLException {
		pst2.setInt(1, P.getTeam());
		ResultSet rst=pst2.executeQuery();
		while(rst.next())
		{
			//team_id | name| abbrevation | owner  | max_age | batting_avg | wickets_taken
			return new Teams(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getDouble(6),rst.getInt(7));
		}
		return null;
	}

}
