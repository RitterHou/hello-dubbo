package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 9:58 AM
 */
@Builder
public class Level implements Serializable {

    private int discount;
    private boolean defaultLevel;
    private String id;
    private String name;
    private boolean auto;

}
