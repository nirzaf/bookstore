package bookstore.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDb {

	public static int save(String name, String author, String publisher, String quantity) {
		int status = 0;
		try {
			Connection con = Db.getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into AddBooksDb(name,author,publisher,quantity) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, author);
			ps.setString(3, publisher);
			ps.setString(4, quantity);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
