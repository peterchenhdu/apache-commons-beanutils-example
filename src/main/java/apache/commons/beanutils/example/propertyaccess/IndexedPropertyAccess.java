/*
 * File Name: Main.java
 * Description: 
 * Author: PiChen
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.propertyaccess;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import apache.commons.beanutils.example.pojo.Employee;
import apache.commons.beanutils.example.pojo.IndexedBean;

/**
 * 
 * @author PiChen
 * @version 2017年5月29日
 */

public class IndexedPropertyAccess
{

    /**
     * 
     * 
     * @param args
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */

    public static void main(String[] args)
        throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        // 初始工作
        IndexedBean indexedBean = new IndexedBean();
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee e1 = new Employee();
        e1.setLastName("Chen");
        Employee e2 = new Employee();
        e2.setLastName("Wang");
        employeeList.add(e1);
        employeeList.add(e2);
        indexedBean.setEmployeeList(employeeList);
        indexedBean.setIntArr(new Integer[]{ 0, 1, 2 });

        // API测试
        int index0 = 0;
        String name0 = "employeeList[" + index0 + "]";
        Employee employee0 = (Employee) PropertyUtils.getIndexedProperty(indexedBean, name0);
        System.out.println(employee0.getLastName());

        int index1 = 1;
        String name1 = "employeeList[" + index1 + "]";
        Employee employee1 = (Employee) PropertyUtils.getIndexedProperty(indexedBean, name1);
        System.out.println(employee1.getLastName());

        Employee employee00 = (Employee) PropertyUtils.getIndexedProperty(indexedBean,"employeeList", 0);
        Employee employee11 = (Employee) PropertyUtils.getIndexedProperty(indexedBean,"employeeList", 1);
        System.out.println(employee00.getLastName());
        System.out.println(employee11.getLastName());
        
        Integer i = (Integer) PropertyUtils.getIndexedProperty(indexedBean,"intArr", 1);
        System.out.println(i);
    }

}
