package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 9:56 AM
 */
@Builder
public class Employee implements Serializable {

    private String id;
    private String name;

}
