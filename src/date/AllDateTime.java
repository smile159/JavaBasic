package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author smile
 * @ClassName AllDateTime.java
 * @Description TODO
 * @createTime 2022年03月29日 20:22:00
 */
public class AllDateTime {
    public static void main(String[] args) throws InterruptedException {
        // 1.获取时间戳
        System.out.println("现在的时间戳为：" + System.currentTimeMillis());


        Date date = new Date();
        System.out.println(date);
        // out:Tue Mar 29 20:22:47 CST 2022
        /*
        * 分析：new Date()是一个空参的构造函数，但其实还是有参数的，在空参函数里面使用了System.currentTimeMillis()作为参数传递给有参构造器，然后返回
        * 源码：
        public Date() {
            this(System.currentTimeMillis());
        }
        * */

        // 1.getTime()
        System.out.println("Date.getTime() = " + date.getTime());
        // out:Date.getTime() = 1648557637143
        /*
         * 分析：返回的就是一个时间戳
         * */

        // 2.setTime(long time)
        Thread.sleep(3000);
        //date.setTime(System.currentTimeMillis());
        System.out.println("睡眠三秒后的时间为：" + System.currentTimeMillis());

        // 3.测试指定日期是否在当前日期之前/也就是判断是不是以往的日期
        System.out.println(date.before(new Date()));
        /*
        * 分析：原理就是获取两个日期的时间戳，比较时间戳，如果小于，则为true，表示date日期在指定日期之前，否则在之后
        *  public boolean before(Date when) {
               return getMillisOf(this) < getMillisOf(when);
           }
        * */

        // 4.判断指定日期是否在date日期之后
        System.out.println("当前日期是否在date之后？" + date.after(new Date()));

        // 5.判断两个日期是否相等
        System.out.println("两个日期是否相等：" + date.equals(new Date()));

        // 6.两个日期比较
        System.out.println("比较两个日期：" + date.compareTo(new Date()));

        // 7.将date object 转换成instant object
        Instant instant = date.toInstant();
        System.out.println();

        // 8.将instant转换成date对象
        System.out.println(Date.from(instant));


        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date1);


        //1.toLocalDate
        System.out.println(date1.toLocalDate());

        System.out.println(java.sql.Date.valueOf("2022-04-02"));


        //LocalDate
        //LocalDateTime
        //LocalTime
    }
}
