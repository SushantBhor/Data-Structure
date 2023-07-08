package Dao;

import java.sql.SQLException;
import java.util.HashMap;

import pojo.IplPlayer;
import pojo.Teams;

public interface TeamDao {
	
	HashMap<Integer,String> GetTeamDetails()throws SQLException;
	
	Teams GetTeamInfo(IplPlayer P)throws SQLException;
}
