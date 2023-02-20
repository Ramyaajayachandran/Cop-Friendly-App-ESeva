package com.javaprog.copfriendlyapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ViolatorDao {

	public static int save(Violator s){
		int status=0;
		try{
			Connection con=InspectorDao.getCon();
			PreparedStatement ps=con.prepareStatement("insert into FineStatus_Violator(id,name,email,violence,fine,paid,due,address,city,state,country,contactno) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,s.getid());
			ps.setString(2,s.getName());
			ps.setString(3,s.getEmail());
			ps.setString(4, s.getviolence());
			ps.setInt(5,s.getfine());
			ps.setInt(6,s.getPaid());
			ps.setInt(7,s.getDue());
			ps.setString(8,s.getAddress());
			ps.setString(9,s.getCity());
			ps.setString(10,s.getState());
			ps.setString(11,s.getCountry());
			ps.setString(12,s.getContactno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Violator s){
		int status=0;
		try{
			Connection con=InspectorDao.getCon();
			PreparedStatement ps=con.prepareStatement("update FineStatus_Violator set id=?,name=?,email=?,violence=?,fine=?,paid=?,due=?,address=?,city=?,state=?,country=?,contactno=? where id=?");
			ps.setInt(1,s.getid());
			ps.setString(2,s.getName());
			ps.setString(3,s.getEmail());
			ps.setString(4, s.getviolence());
			ps.setInt(5,s.getfine());
			ps.setInt(6,s.getPaid());
			ps.setInt(7,s.getDue());
			ps.setString(8,s.getAddress());
			ps.setString(9,s.getCity());
			ps.setString(10,s.getState());
			ps.setString(11,s.getCountry());
			ps.setString(12,s.getContactno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Violator> view(){
		List<Violator> list=new ArrayList<Violator>();
		try{
			Connection con=InspectorDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from FineStatus_Violator");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Violator s=new Violator();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setviolence(rs.getString("violence"));
				s.setfine(rs.getInt("fine"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Violator getViolatorByid(int id){
		Violator s=new Violator();
		try{
			Connection con=InspectorDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from FineStatus_Violator where id=?");
			//ps.setInt(1,id);
			//int id=1;
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setviolence(rs.getString("violence"));
				s.setfine(rs.getInt("fine"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	public static List<Violator> due(){
		List<Violator> list=new ArrayList<Violator>();
		try{
			Connection con=InspectorDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from FineStatus_Violator where due>0");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Violator s=new Violator();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setviolence(rs.getString("violence"));
				s.setfine(rs.getInt("fine"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setState(rs.getString("state"));
				s.setCountry(rs.getString("country"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
