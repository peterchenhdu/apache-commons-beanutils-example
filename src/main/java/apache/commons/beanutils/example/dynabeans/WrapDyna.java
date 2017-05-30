/*
 * File Name: WrapDyna.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.dynabeans;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.WrapDynaBean;
import apache.commons.beanutils.example.pojo.Employee;

/**
 * 
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class WrapDyna
{

    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.setFirstName("hello");

        DynaBean wrapper = new WrapDynaBean(e);
        String firstName = (String) wrapper.get("firstName");
        System.out.println(firstName);

    }
}
