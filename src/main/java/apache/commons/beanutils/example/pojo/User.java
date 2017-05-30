/*
 * File Name: User.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.pojo;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class User
{
    private Long id;
    private String name;
    private String address;
    private boolean state;
    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    /**
     * @return the state
     */
    public boolean isState()
    {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(boolean state)
    {
        this.state = state;
    }

}
