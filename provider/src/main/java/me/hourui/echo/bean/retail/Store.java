package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 10:00 AM
 */
@Builder
public class Store implements Serializable {

    private String type;
    private String id;
    private String name;

}
