package Mysql;

import java.sql.*;

public class DataConnection {

	private static Statement stat;

	public static void init(){
		try{
			//注册mysql驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
		}catch(Exception e){
			System.out.print("加载错误");
		}
		//获取数据库连接
		Connection con = null;//同时按下CTRL+SHIFT+O
		try{
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/haoziweizhi","root","");
			
			System.out.print("建立数据库连接成功");
			stat = con.createStatement();
		}catch (Exception e){
			e.printStackTrace();
			System.out.print("建立数据库连接失败");
		}
	}
	public static Statement getStat(){
		if(stat==null) init();
		return stat;
	}
}
