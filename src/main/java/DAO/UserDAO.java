package DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import Entiity.User;

public class UserDAO {
	private JdbcTemplate t;

	public JdbcTemplate getT() {
		return t;
	}

	public void setT(JdbcTemplate t) {
		this.t = t;
	}
	
	public int insert(User u)
	{
       String query="insert into user(id,name,email,city)values(?,?,?,?)";
       Integer i=this.t.update(query,u.getId(),u.getName(),u.getEmail(),u.getCity());
       return i;
	}
	
	public int update(User u)
	{
		String query="update user set name=?,email=?,city=? where id=?";
	Integer i	=this.t.update(query,u.getName(),u.getEmail(),u.getCity(),u.getId());
	 
	   return i;
	}
	
	

}
