package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {
		public static void main(String[] args) throws Exception {
		SkillDAO skilldao = new SkillDAO();
		

		List<Skill> list = skilldao.listAllSkills();
		
		for(Skill s: list)
		{
			System.out.println(s.getSkillId()+" "+s.getSkillName());
		}
	}
}
