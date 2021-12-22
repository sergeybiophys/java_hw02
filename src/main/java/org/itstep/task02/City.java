package org.itstep.task02;

public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

    public City() {
        this.name = "SinCity";
        this.region = "Unknown";
        this.country = "Default";
        this.inhabitants=0;
        this.index="00000";
        this.code="00000";
    }

    public City(String name,
                String region,
                String country,
                int inhabitants,
                String index,
                String code)
    {
        this.name = name;
        this.country = country;
        this.region = region;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public  String getName()
    {
        return  name;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }
    public String getRegion()
    {
        return  region;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getCountry()
    {
        return country;
    }
    public void setInhabitants(int inhabitants)
    {
        this.inhabitants = inhabitants;
    }
    public int getInhabitants()
    {
        return  inhabitants;
    }
    public void setIndex(String index)
    {
        this.index = index;
    }
    public String getIndex()
    {
        return  index;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public String getCode()
    {
        return code;
    }

}
