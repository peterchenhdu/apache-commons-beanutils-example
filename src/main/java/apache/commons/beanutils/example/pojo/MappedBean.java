/*
 * File Name: MappedBean.java
 * Description: 
 * Author: PiChen
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.pojo;

import java.util.Map;

/**
 * 
 * @author    PiChen
 * @version   2017年5月29日
 */

public class MappedBean
{
    private Map<String, Object> mapProperty;

    /**
     * @return the mapProperty
     */
    public Map<String, Object> getMapProperty()
    {
        return mapProperty;
    }

    /**
     * @param mapProperty the mapProperty to set
     */
    public void setMapProperty(Map<String, Object> mapProperty)
    {
        this.mapProperty = mapProperty;
    }

}
