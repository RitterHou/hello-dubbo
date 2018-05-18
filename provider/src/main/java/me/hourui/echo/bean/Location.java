package me.hourui.echo.bean;

import lombok.*;

import java.io.Serializable;

/**
 * @author hourui 2018/5/16 17:37
 */
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {

    private String province;
    private String city;
    private String street;

}
