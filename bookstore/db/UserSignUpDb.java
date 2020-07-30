package bookstore.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSignUpDb {
		
		public static int save(String fname,String lname,String email,String username, String password,String contact){
			int status=0;
			try{
				Connection con=Db.getConnection();
				PreparedStatement ps=con.prepareStatement("insert into SignUpDb(fname,lname,email,username,password,contact) values(?,?,?,?,?,?)");
				ps.setString(1,fname);
				ps.setString(2,lname);
				ps.setString(3,email);
				ps.setString(4,username);
				ps.setString(5,password);
				ps.setString(6,contact);
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}
		public static int delete(int id){
			int status=0;
			try{
				Connection con=Db.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from SignUpDb where username=?");
				ps.setInt(1,id);
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}

		public static boolean validate(String username,String password){
			boolean status=false;
			try{
				Connection con=Db.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from SignUpDb where username=? and password=?");
				ps.setString(1,username);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				status=rs.next();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}

	}

