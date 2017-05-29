package apache.commons.beanutils.example.pojo;

import java.util.List;

public class IndexedBean {
    private List<Employee> employeeList;
    private Integer[] intArr;

    /**
     * @return the employeeList
     */
    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    /**
     * @param employeeList the employeeList to set
     */
    public void setEmployeeList(List<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }

    /**
     * @return the intArr
     */
    public Integer[] getIntArr()
    {
        return intArr;
    }

    /**
     * @param intArr the intArr to set
     */
    public void setIntArr(Integer[] intArr)
    {
        this.intArr = intArr;
    }
}