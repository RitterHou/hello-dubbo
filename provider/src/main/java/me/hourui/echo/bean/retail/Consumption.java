package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hourui 2018/6/8 9:56 AM
 */
@Builder
public class Consumption implements Serializable {

    private Date changeTime;
    private double totalPrice;

}
