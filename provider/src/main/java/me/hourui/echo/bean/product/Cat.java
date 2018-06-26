package me.hourui.echo.bean.product;

import lombok.Builder;

import java.io.Serializable;
import java.util.List;

/**
 * @author hourui 2018/6/8 11:27 AM
 */
@Builder
public class Cat implements Serializable {

    private String id;
    private String name;
    private List<Cat> children;

}
