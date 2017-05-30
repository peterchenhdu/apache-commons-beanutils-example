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
import java.util.List;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.RowSetDynaClass;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月30日
 */

public class RowSetDyna
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

            RowSetDynaClass rowSet = new RowSetDynaClass(rs);

            rs.close();
            stmt.close();
            conn.close();

            List<DynaBean> rowlist = rowSet.getRows();
            for (DynaBean row : rowlist)
            {
                System.out.print("id: " + row.get("id"));
                System.out.print(", name: " + row.get("name"));
                System.out.print(", address: " + row.get("address"));
                System.out.println(", state: " + row.get("state"));
            }
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
