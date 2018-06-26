package me.hourui.echo.bean.retail;

import lombok.Builder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author hourui 2018/6/8 9:54 AM
 */
@Builder
public class View implements Serializable {

    private Remark remark;
    private boolean verified;
    private Consumption consumption;
    private String cid;
    private String mobile;
    private Lock lock;
    private List<String> userOpenIds;
    private List<String> connOpenIds;
    private String userId;
    private String userLogo;
    private boolean shortStop;
    private Date modifyTime;
    private Level level;
    private String nickName;
    private Create create;
    private Store store;

}
