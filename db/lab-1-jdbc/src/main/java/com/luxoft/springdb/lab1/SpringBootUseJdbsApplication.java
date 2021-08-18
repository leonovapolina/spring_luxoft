package com.luxoft.springdb.lab1;

import com.luxoft.springdb.lab1.dao.CountryDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootUseJdbsApplication { //

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootUseJdbsApplication.class, args);

        CountryDao countryDao = context.getBean(CountryDao.class);
        System.out.println(countryDao.getCountryList());

        System.out.println(countryDao.getCountryByCodeName("RU"));

        countryDao.updateCountryName("RU", "RUSSIA");

        System.out.println(countryDao.getCountryByCodeName("RU"));
    }
}
