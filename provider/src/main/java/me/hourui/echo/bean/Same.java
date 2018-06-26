package me.hourui.echo.bean;

import lombok.Builder;

import java.io.Serializable;
import java.util.Map;

/**
 * @author hourui 2018/6/8 5:09 PM
 */
@Builder
public class Same implements Serializable {

    private Bean bean;
    private Bean bean1;

    private String[] strings;
    private String[] strings1;

    private Map<String, String> map;
    private Map<String, String> map1;

}
