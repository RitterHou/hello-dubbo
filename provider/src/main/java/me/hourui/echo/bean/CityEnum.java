package me.hourui.echo.bean;

import lombok.Getter;

/**
 * @author hourui 2018/6/26 10:46 AM
 */
public enum CityEnum {

    Nanjing("nanjing"),
    Shanghai("shanghai");

    @Getter
    private String city;

    CityEnum(String city) {
        this.city = city;
    }

}
