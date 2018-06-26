package me.hourui.echo.bean.product;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author hourui 2018/6/8 11:26 AM
 */
@Builder
public class Spec implements Serializable {

    private String spid;
    private String svid;
    private String specialValName;
    private String specialPropName;

}
