package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public List <Skill> listAllSkills() throws SQLException, Exception
	{
		Statement st = ConnectionManager.getConnection().createStatement();
        //Connection  con = Connection
		
		
		
		//if()
		 
		 ResultSet rs1 = st.executeQuery("SELECT * FROM SKILLS");
		 System.out.println("Result SET values" + rs1);
		 
		 while(rs1.next())
		 {
			 System.out.println("Inside while");
				 System.out.println("ID: " + rs1.getInt("ID"));
				 System.out.println("Coach: " + rs1.getString("NAME"));
		 }
		 
		ResultSet rs2 = st.executeQuery("SELECT * FROM SKILLS ORDER BY NAME ASC");
		 System.out.println("Result SET values" + rs2);
		while(rs2.next())
		{
			int id = rs2.getInt("ID");
			String name = rs2.getString("NAME");
			Skill skill = new Skill(id, name);
			List<Skill> list = new ArrayList<Skill>();
			list.add(skill);
			return list;
		}
		ConnectionManager.getConnection().close();
		return null;
	}
}