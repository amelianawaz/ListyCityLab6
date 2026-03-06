package com.example.listycitylab6;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<Object>{
    /**
     * This is a string variable that defines a city name.
     */
    private String city;
    /**
     * This is a string variable that defines a province name.
     */
    private String province;
    /**
     * This is a method that defines a city.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This is a getter for city name.
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This is a getter for province name.
     */
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}
