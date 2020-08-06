package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	
	static List<Skill> skillList = new ArrayList<Skill>();
	public List<Skill> listAllSkills() throws Exception {
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM SKILL ORDER BY NAME");
		ResultSet result = st.executeQuery();
		
		while(result.next()) {
			long id = result.getLong(1);
			String name = result.getString(2);
			Skill skill = new Skill(id,name);
			skillList.add(skill);
		}
		return skillList;
	}
}