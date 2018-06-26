package me.hourui.echo.bean.product;

import lombok.Builder;

import java.io.Serializable;
import java.util.List;

/**
 * @author hourui 2018/6/8 11:25 AM
 */
@Builder
public class Product implements Serializable {

    private List<String> images;
    private List<Spec> specs;
    private Stock stock;
    private List<Cat> cats;
    private Long addTime;

}
