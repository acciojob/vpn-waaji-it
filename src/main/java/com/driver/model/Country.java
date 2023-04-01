// Note: Do not write @Enumerated annotation above CountryName in this model.
package com.driver.model;

import com.driver.Enum.CountryName;

import javax.persistence.*;

@Entity
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private CountryName countryName;
    private String code;

    //child of user
    @OneToOne @JoinColumn User user;
    @ManyToOne @JoinColumn ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(CountryName countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}