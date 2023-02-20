package com.javaprog.copfriendlyapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmergencyDao {
	public static Connection getCon1(){
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","raga@1234");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Emergency s){
		int status=0;
		try{
			Connection con=EmergencyDao.getCon1();
			PreparedStatement ps=con.prepareStatement("insert into emergency(id,name,incidenttype,location,phno1,phno2,phno3,patientaddress,bloodgroup,actiontaken,witnessphno,offenderphno) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,s.getid());
			ps.setString(2,s.getName());
			ps.setString(3,s.getincidenttype());
			ps.setString(4, s.getlocation());
			ps.setString(5,s.getphno1());
			ps.setString(6,s.getphno2());
			ps.setString(7,s.getphno3());
			ps.setString(8,s.getpatientaddress());
			ps.setString(9,s.getbloodgroup());
			ps.setString(10,s.getactiontaken());
			ps.setString(11,s.getwitnessphno());
			ps.setString(12,s.getoffenderphno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	private static Connection getCon() {
		// TODO Auto-generated method stub
		return null;
	}
	public static int update(Emergency s){
		int status=0;
		try{
			Connection con=EmergencyDao.getCon1();
			PreparedStatement ps=con.prepareStatement("update emergency set id=?,name=?,incidenttype=?,location=?,phno1=?,phno2=?,phno3=?,patientaddress=?,bloodgroup=?,actiontaken=?,witnessphno=?,offenderphno=? where id=?");
			ps.setInt(1,s.getid());
			ps.setString(2,s.getName());
			ps.setString(3,s.getincidenttype());
			ps.setString(4, s.getlocation());
			ps.setString(5,s.getphno1());
			ps.setString(6,s.getphno2());
			ps.setString(7,s.getphno3());
			ps.setString(8,s.getpatientaddress());
			ps.setString(9,s.getbloodgroup());
			ps.setString(10,s.getactiontaken());
			ps.setString(11,s.getwitnessphno());
			ps.setString(12,s.getoffenderphno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Emergency> view(){
		List<Emergency> list=new ArrayList<Emergency>();
		try{
			Connection con=EmergencyDao.getCon1();
			PreparedStatement ps=con.prepareStatement("select * from emergency");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Emergency s=new Emergency();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setincidenttype(rs.getString("incidenttype"));
				s.setlocation(rs.getString("location"));
				s.setphno1(rs.getString("phno1"));
				s.setphno2(rs.getString("phno2"));
				s.setphno3(rs.getString("phno3"));
				s.setpatientaddress(rs.getString("patientaddress"));
				s.setbloodgroup(rs.getString("bloodgroup"));
				s.setactiontaken(rs.getString("actiontaken"));
				s.setwitnessphno(rs.getString("witnessphno"));
				s.setoffenderphno(rs.getString("offenderphno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Emergency getEmergencyByid(int id){
		Emergency s=new Emergency();
		try{
			Connection con=EmergencyDao.getCon1();
			PreparedStatement ps=con.prepareStatement("select * from emergency where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setincidenttype(rs.getString("incidenttype"));
				s.setlocation(rs.getString("location"));
				s.setphno1(rs.getString("phno1"));
				s.setphno2(rs.getString("phno2"));
				s.setphno3(rs.getString("phno3"));
				s.setpatientaddress(rs.getString("patientaddress"));
				s.setbloodgroup(rs.getString("bloodgroup"));
				s.setactiontaken(rs.getString("actiontaken"));
				s.setwitnessphno(rs.getString("witnessphno"));
				s.setoffenderphno(rs.getString("offenderphno"));
				
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	public static List<Emergency> due(){
		List<Emergency> list=new ArrayList<Emergency>();
		try{
			Connection con=EmergencyDao.getCon1();
			PreparedStatement ps=con.prepareStatement("select * from emergency where id=?");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Emergency s=new Emergency();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setincidenttype(rs.getString("incidenttype"));
				s.setlocation(rs.getString("location"));
				s.setphno1(rs.getString("phno1"));
				s.setphno2(rs.getString("phno2"));
				s.setphno3(rs.getString("phno3"));
				s.setpatientaddress(rs.getString("patientaddress"));
				s.setbloodgroup(rs.getString("bloodgroup"));
				s.setactiontaken(rs.getString("actiontaken"));
				s.setwitnessphno(rs.getString("witnessphno"));
				s.setoffenderphno(rs.getString("offenderphno"));
				
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
