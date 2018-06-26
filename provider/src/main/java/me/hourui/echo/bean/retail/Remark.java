package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 9:55 AM
 */
@Builder
public class Remark implements Serializable {

    private String name;
    private String other;

}
