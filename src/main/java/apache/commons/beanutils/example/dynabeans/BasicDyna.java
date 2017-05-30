/*
 * File Name: Main.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.dynabeans;

import java.util.HashMap;

import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;

import apache.commons.beanutils.example.pojo.Employee;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月29日
 */

public class BasicDyna
{

    /**
     * 
     * 
     * @param args
     * @throws InstantiationException
     * @throws IllegalAccessException
     */

    public static void main(String[] args) throws IllegalAccessException, InstantiationException
    {
        DynaProperty[] props = new DynaProperty[]
        { new DynaProperty("address", java.util.Map.class),
            new DynaProperty("subordinate", Employee[].class),
            new DynaProperty("firstName", String.class),
            new DynaProperty("lastName", String.class) };
        BasicDynaClass dynaClass = new BasicDynaClass("employee", null, props);

        DynaBean employee = dynaClass.newInstance();
        employee.set("address", new HashMap<String, Object>());
        employee.set("subordinate", new Employee[0]);
        employee.set("firstName", "Fred");
        employee.set("lastName", "Flintstone");

        System.out.println(employee.get("firstName"));
    }

}
