package com.javabrains.SpringJdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.javabrains.SpringJdbc.model.Circle;

@Component
public class JdbcDaoImpl {	
	
	//private DataSource dataSource;	
	
	private JdbcTemplate jdbcTemplate;

	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 */
	
	/*
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */
//	public DataSource getDataSource() {
//		return dataSource;
//	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	 
	public int getCircleCount() {
		String sql = "select count(*) from circle";		 				 
		 //jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate.queryForObject(sql, Integer.class);

	}
	
	public String getCircleName(int circleId) {
		String sql="select name from circle where id=?";		
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
	}
	
	private static final class CircleMapper implements RowMapper<Circle>{

		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle circle= new Circle();
			circle.setId(rs.getInt("id"));
			circle.setName(rs.getString("name"));
			return circle;
		}
		
	}	
	
	public Circle getCircleforId(int circleId) { 
		String sql="select * from circle where id=?"; 
	    return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
	  
	 }
	
	public List<Circle> getAllCircles() { 
		String sql="select * from circle"; 
	    return jdbcTemplate.query(sql, new CircleMapper());
	  
	 }
	
	/*
	 * public Circle getCircle(int circleId) {
	 * 
	 * Connection con=null; PreparedStatement ps; ResultSet rs; Circle circle =
	 * null; try {
	 * 
	 * String driver = "com.mysql.cj.jdbc.Driver";
	 * Class.forName(driver).newInstance(); String url =
	 * "jdbc:mysql://localhost:3306/hibdb"; String user = "root"; String pwd =
	 * "admin"; con = DriverManager.getConnection(url, user, pwd);
	 * 
	 * con= dataSource.getConnection(); ps =
	 * con.prepareStatement("Select * from circle where id=?"); ps.setInt(1,
	 * circleId); rs = ps.executeQuery(); while (rs.next()) { circle = new Circle();
	 * circle.setId(rs.getInt("id")); circle.setName(rs.getString("name")); }
	 * rs.close(); ps.close(); return circle; }catch (Exception e) {
	 * System.out.println(e); throw new RuntimeException(e); } finally { try {
	 * con.close(); } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 */
}