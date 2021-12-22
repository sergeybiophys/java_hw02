package org.itstep.task01;

public class Human {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    public Human()
    {
        this.fullName = "Unknown Unknown";
        this.dateOfBirth = "1/1/2000";
        this.phone = "+380500000001";
        this.city = "SinCity";
        this.country = "Default";
        this.address = "Somewhere St.01";
    }
    public Human(String fullName,
                 String dateOfBirth,
                 String phone,
                 String city,
                 String country,
                 String address)
    {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address  = address;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public  String getFullName()
    {
        return  fullName;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth =dateOfBirth;
    }
    public String getDateOfBirth()
    {
        return  dateOfBirth;
    }

    public  void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getPhone()
    {
        return  phone;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getCountry()
    {
        return country;
    }

    public  void setCity(String city)
    {
        this.city = city;
    }
    public String getCity()
    {
        return  city;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
}
