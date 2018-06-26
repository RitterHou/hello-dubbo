package me.hourui.echo.bean.product;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 11:26 AM
 */
@Builder
public class Stock implements Serializable {

    private String name;
    private int stock;
    private boolean status;

}
