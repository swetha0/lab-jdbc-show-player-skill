package controller;

import java.sql.SQLException;
import java.util.List;
import dao.SkillDAO;
import model.Skill;
import utility.ConnectionManager;

public class Main
{
	public static void main(String[] args) throws SQLException, Exception
	{
		
		  System.out.println("Displaying all types of skills: "); SkillDAO skillDao =
		  new SkillDAO(); System.out.println("Done with SkillDAo"); List<Skill> list =
		  skillDao.listAllSkills();
		  

		  for(Skill s : list) { System.out.println(s.getSkillName()); }
		 
		
	}
}