package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hourui 2018/6/8 9:59 AM
 */
@Builder
public class Create implements Serializable {

    private String ip;
    private String client;
    private String type;
    private Date time;

}
