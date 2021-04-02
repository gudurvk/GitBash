import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
        Connection c=null;
        try{
            Class.forName("org.postgresql.Driver");
            c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","supercell1?");
            Statement st=c.createStatement();


           // st.executeUpdate("create table mt1061.profile"+"(name varchar(20),"+" runs int,"+" team varchar(10)) ");
            //st.executeUpdate("insert into mt1061.profile(name,runs,team)" +"values ('Rohit',5465,'MI'),('Dhawan',4563,'DC'),('MS',10000,'CSK');");
            ResultSet rs=st.executeQuery("select * from mt1061.profile");
            while (rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
            }
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
