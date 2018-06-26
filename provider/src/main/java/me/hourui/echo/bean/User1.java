package me.hourui.echo.bean;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author hourui 2018/5/18 11:36
 */
@Getter
@ToString
public class User1 implements Serializable {

    private String name = "张三";

}
