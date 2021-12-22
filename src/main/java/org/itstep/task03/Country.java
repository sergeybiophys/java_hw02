package org.itstep.task03;

import org.itstep.task02.City;

public class Country {
    private  int count;
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public Country()
    {
        this.count = 0;
        this.name = "Default";
        this.continent= "Neverland";
        this.code = "0000";
        this.capital = new City();
        this.cities=null;

    }

    public Country(String name,
                   String continent,
                   String code,
                   City capital)
    {
        this.count = 0;
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = null;

    }

    public void setName(String name)
    {
        this.name = name;
    }
    public  String getName()
    {
        return  name;
    }

    public void  setContinent(String continent){
        this.continent = continent;
    }
    public String getContinent()
    {
        return  continent;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
    public String getCode()
    {
        return code;
    }

    public void setCapital(City capital)
    {
        this.capital = capital;
    }
    public City getCapital()
    {
        return capital;
    }

    public City[] getCities()
    {
        return this.cities;
    }

    public void addCity(City city)
    {
        if(this.cities==null)
        {
            this.cities = new City[5];
            this.cities[count++] = city;
        }
        else
        {
            this.cities[count++] = city;
        }
    }

    public int getInhabitants()
    {
        int count = 0;
        if(this.cities!=null)
        {
            for(int i = 0; i<this.count; i++)
            {
                count+=this.cities[i].getInhabitants();
            }
        }
        return count;
    }
}
