/*
 * File Name: Employee.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.pojo;

import java.util.Date;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月29日
 */

public class Employee
{
    private String firstName;
    private String lastName;
    private Date hireDate;
    private boolean isManager;

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate()
    {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate)
    {
        this.hireDate = hireDate;
    }

    /**
     * @return the isManager
     */
    public boolean isManager()
    {
        return isManager;
    }

    /**
     * @param isManager the isManager to set
     */
    public void setManager(boolean isManager)
    {
        this.isManager = isManager;
    }

    /**
     * @return the fullName
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }


}
