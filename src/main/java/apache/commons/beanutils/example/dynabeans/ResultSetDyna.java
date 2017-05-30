/*
 * File Name: ResultSetDyna.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.dynabeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.ResultSetDynaClass;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月30日
 */

public class ResultSetDyna
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/demo";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "SELECT id, name, address, state FROM user";
            stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery(sql);

            // while (rs.next())
            // {
            // Long id = rs.getLong("id");
            // String name = rs.getString("name");
            // String address = rs.getString("address");
            // boolean state = rs.getBoolean("state");
            //
            // System.out.print("id: " + id);
            // System.out.print(", name: " + name);
            // System.out.print(", address: " + address);
            // System.out.println(", state: " + state);
            // }

            Iterator<DynaBean> rows = (new ResultSetDynaClass(rs)).iterator();
            while (rows.hasNext())
            {
                DynaBean row = rows.next();
                System.out.print("id: " + row.get("id"));
                System.out.print(", name: " + row.get("name"));
                System.out.print(", address: " + row.get("address"));
                System.out.println(", state: " + row.get("state"));
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (stmt != null)
                    stmt.close();
            }
            catch (SQLException se2)
            {
            }
            try
            {
                if (conn != null)
                    conn.close();
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
    }

}
