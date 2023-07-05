import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/test";
		String un="root";
		String pwd="root";
		String qry = "select * from Data";
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(qry);
		while(res.next())
		{
			String name = res.getString(1);
			String password = res.getString(2);
			System.out.println(name+" "+password);
		}
		
		

	}

}
