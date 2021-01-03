package Mysql;

import java.sql.*;

public class User {

	private int uid;
	private String uname;
	private String upw;

	public User(){
		
	}
	public User(int uid, String uname, String upw) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upw = upw;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	/**
	 * 登录
	 * @throws ClassNotFoundException 
	 */
	public boolean login(String id,String pw) throws SQLException, ClassNotFoundException{
		User u = null;
		String sql = "select * from user where uid="+id+" and upw='"+pw+"'";
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			u = new User(rs.getInt(1),rs.getString(2),rs.getString("upw"));
		}
		return u != null;
	}
	/**
	 * 注册
	 */
	public int register(String name, String pw) throws SQLException, ClassNotFoundException{
		int n = -1;
		String sql ="insert into user(uname,upw) values('"+name+"','"+pw+"')";
		DataConnection.getStat().executeUpdate(sql);
		
		sql = "select * from user where uname='"+name+"' and upw='"+pw+"'";
		ResultSet rs = DataConnection.getStat().executeQuery(sql);
		if(rs.next()){
			n = rs.getInt(1);
		}
		return n;
		
	}
}
