package me.hourui.echo.bean.retail;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hourui 2018/6/8 9:57 AM
 */
@Builder
@ToString
public class Lock implements Serializable {

    private Employee employee;
    private String lockTime;
    private String lockReason;
    private boolean locked;
    private Date unLockTime;

}
