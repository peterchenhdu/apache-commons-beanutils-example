/*
 * File Name: NestedBean.java
 * Description: 
 * Author: PiChen
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.pojo;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author    PiChen
 * @version   2017年5月29日
 */

public class NestedBean
{

    private List<Employee> listProperty;
    private Map<String, Employee> mapProperty;
    /**
     * @return the listProperty
     */
    public List<Employee> getListProperty()
    {
        return listProperty;
    }
    /**
     * @param listProperty the listProperty to set
     */
    public void setListProperty(List<Employee> listProperty)
    {
        this.listProperty = listProperty;
    }
    /**
     * @return the mapProperty
     */
    public Map<String, Employee> getMapProperty()
    {
        return mapProperty;
    }
    /**
     * @param mapProperty the mapProperty to set
     */
    public void setMapProperty(Map<String, Employee> mapProperty)
    {
        this.mapProperty = mapProperty;
    }
}
