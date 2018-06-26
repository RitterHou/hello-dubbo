package me.hourui.echo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import me.hourui.echo.bean.*;
import me.hourui.echo.bean.product.Cat;
import me.hourui.echo.bean.product.Product;
import me.hourui.echo.bean.product.Spec;
import me.hourui.echo.bean.product.Stock;
import me.hourui.echo.bean.retail.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service(version = "1.0.0")
public class EchoImpl implements Echo {

    private AtomicInteger i = new AtomicInteger(0);

    {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
//                log.info("{} in one minute", i);
                int j = i.get();
                i.set(0);
//                System.out.println(j);
            }
        }, 0, 1000);
    }

    @Override
    public User echo(String firstName, String lastName, int age, double salary, boolean graduated) {
//        System.out.println("The consumer has connected here...");
//        System.out.println("The consumer send somrthing here: " + str);
        Name name = Name.builder().firstName(firstName).lastName(lastName).build();

        Location location = new Location();
        location.setProvince("江苏省");
        location.setCity("南京市");
        location.setStreet("软件大道");

        List<Name> friends = new ArrayList<>();
        friends.add(Name.builder().firstName("老").lastName("王").build());
        friends.add(Name.builder().firstName("小").lastName("赵").build());
        friends.add(Name.builder().firstName("王").lastName("小丽").build());
        friends.add(Name.builder().firstName("安倍").lastName("晋三").build());

        List<Integer> workDays = new ArrayList<>();
        workDays.add(23);
        workDays.add(18);
        workDays.add(25);
        workDays.add(21);
        workDays.add(20);
        workDays.add(23);

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("11", "12");
        map1.put("12", "12");
        map1.put("13", "12");
        map1.put("14", "12");
        Map<String, String> map2 = new HashMap<>();
        map2.put("21", "12");
        map2.put("22", "12");
        map2.put("23", "12");
        map2.put("24", "12");
        list.add(map1);
        list.add(map2);

        String[] books = new String[]{"深入理解计算机系统", "算法导论", "编译原理", "程序员的自我修养，链接、装载和库"};

        User user = new User();
        user.setAge(age);
        user.setSalary(salary);
        user.setGraduated(graduated);
        user.setName(name);
        user.setLocation(location);
        user.setFriends(friends);
        user.setHairs(System.currentTimeMillis());
        user.setObject(null);
        user.setWorkDays(workDays);
        user.setFuck(list);
        user.setBooks(books);

        System.out.println(user);

        return user;
    }

    @Override
    public String echo1(String name) {
        return name;
    }

    @Override
    public boolean echo2(boolean b) {
        return b;
    }

    @Override
    public int echo3(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }

    @Override
    public double echo4(double d1, double d2, double d3, double d4, double d5) {
        return d1 + d2 + d3 + d4 + d5;
    }

    @Override
    public int echo5(int i) {
        return i;
    }

    @Override
    public double echo6(double d) {
//        System.out.println(d);
        return d;
    }

    @Override
    public long echo7(long i) {
        System.out.println(i);
        return i;
    }

    @Override
    public List<String> echo8() {
        List<String> list = new ArrayList<>();
        list.add("数学之美");
        list.add("硅谷之谜");
        list.add("浪潮之巅");
        return list;
    }

    @Override
    public String[] echo9() {
        return new String[]{"微软", "苹果", "facebook"};
    }

    @Override
    public List<Integer> echo10() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }

    @Override
    public int[] echo11() {
        return new int[]{10, 20, 30};
    }

    @Override
    public Integer[] echo12() {
        return new Integer[]{10, 20, 30};
    }

    @Override
    public List<Location> echo13() {
        List<Location> list = new ArrayList<>();
        list.add(Location.builder().province("浙江省").city("杭州市").street("余杭区").build());
        list.add(Location.builder().province("江苏省").city("南京市").street("雨花区").build());
        return list;
    }

    @Override
    public Location[] echo14() {
        return new Location[]{
                Location.builder().province("浙江省").city("杭州市").street("余杭区").build(),
                Location.builder().province("江苏省").city("南京市").street("雨花区").build()
        };
    }

    @Override
    public Date echo15() {
        return new Date();
    }

    @Override
    public Date echo16() {
        long now = System.currentTimeMillis();
        return new Date(now - now % 60000L);
    }

    @Override
    public String echo17() {
        throw new RuntimeException("呵呵呵呵呵");
    }

    @Override
    public void echo18() {
        i.getAndIncrement();
    }

    @Override
    public void echo19() {

    }

    @Override
    public View echo20() {
        return View.builder()
                .verified(false)
                .consumption(Consumption.builder().changeTime(new Date(1522598400000L)).totalPrice(0).build())
                .cid("C00000001059720")
                .mobile("13122222225")
                .lock(Lock.builder().lockReason("").locked(false).employee(Employee.builder().build()).build())
                .userOpenIds(new ArrayList<>())
                .connOpenIds(new ArrayList<>())
                .userId("VOzcWFEKWKbBM9Zkkhf4")
                .userLogo("https://pic.qianmi.com/qmui/v0.2/img/avatar-default.png")
                .shortStop(false)
                .modifyTime(new Date(1528259297285L))
                .level(Level.builder().discount(100).defaultLevel(true).id("24794").name("普通会员").auto(true).build())
                .nickName("13122222221")
                .create(Create.builder().ip("127.0.0.1").client("PARTY_B_MOBILE_WECHAT").type("By_PartyB").time(new Date(1522598400000L)).build())
                .store(Store.builder().type("onlineMall").id("A874458").build())
                .remark(Remark.builder().build())
                .build();
    }

    @Override
    public Product echo21() {
        List<String> images = new ArrayList<>(6);
        images.add("875338/4e8713485e96cb12ff877716b95a42d6.jpg");
        images.add("875338/7c6cb41096f34f09b312dbf96db4702d.jpg");
        images.add("875338/1194583ab1b990c10395d97aa466a007.jpg");
        images.add("875338/5946ad5eca472d7e772884f6d9c448e2.jpg");
        images.add("875338/0f6b3b37a0a5ffcaf522908542091776.jpg");
        images.add("875338/4076eea4c5c7fa9482e4a712c92b53e0.jpg");

        List<Spec> specs = new ArrayList<>(2);
        specs.add(Spec.builder().spid("37001").svid("96402").specialPropName("颜色").specialValName("白色").build());
        specs.add(Spec.builder().spid("37002").svid("96405").specialPropName("版本").specialValName("Paperwhite").build());

        Cat child = Cat.builder().id("1003").name("数码").children(new ArrayList<>()).build();
        List<Cat> children = new ArrayList<>(1);
        children.add(child);

        Cat cat = Cat.builder().id("b2c").name("b2c").children(children).build();
        List<Cat> cats = new ArrayList<>(3);
        cats.add(cat);
        cats.add(cat);

        return Product.builder()
                .images(images)
                .specs(specs)
                .stock(Stock.builder().name("总量").stock(2997).status(true).build())
                .cats(cats)
                .addTime(1504236338000L)
                .build();
    }

    @Override
    public Shop[] echo22() {
        Shop shop = new Shop();
        return new Shop[]{shop, shop};
    }

    @Override
    public Same echo23() {
        Bean bean = new Bean();
        String[] strings = new String[]{"张三", "李四"};
        Map<String, String> map = new HashMap<>();
        map.put("name", "淀真嗣");
        return Same.builder()
                .bean(bean)
                .bean1(bean)
                .strings(strings)
                .strings1(strings)
                .map(map)
                .map1(map)
                .build();
    }

    @Override
    public Set<String> echo24() {
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("老王");
        set.add("公孙永浩");
        set.add("理解万岁");
        set.add("❤");
        set.add("عربي/عربىالعَرَبِيَّة");

        return set;
    }

    @Override
    public Bean test0(Bean bean) {
        System.out.println(bean);
        return bean;
    }

    @Override
    public NewUser test1(NewUser newUser, Name name, String s, Location location, Lock lock) {
        System.out.println(newUser);
        System.out.println(name);
        System.out.println(s);
        System.out.println(location);
        System.out.println(lock);
        return newUser;
    }

    @Override
    public String test2(String s) {
        System.out.println(s);
        return s;
    }

    @Override
    public void test3(String s) {
        System.out.println(s);
    }

    @Override
    public CityEnum getCity(CityEnum city) {
        System.out.println(city);
        return city;
    }

    @Override
    public void test4(String[] strings, int[] ints, Object4Array object4Array) {
        System.out.println(strings.length);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

        System.out.println(object4Array);
    }

}
