package date;

import java.util.Date;

/**
 * @author smile
 * @ClassName DateAndDateTime.java
 * @Description TODO
 * @createTime 2022年03月29日 20:22:00
 */
public class DateAndDateTime {
    public static void main(String[] args) throws InterruptedException {
        // 1.获取时间戳
        System.out.println("现在的时间戳为："+System.currentTimeMillis());



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
        System.out.println("Date.getTime() = "+date.getTime());
        // out:Date.getTime() = 1648557637143
        /*
        * 分析：返回的就是一个时间戳
        * */

        // 2.setTime(long time)
        Thread.sleep(3000);
        //date.setTime(System.currentTimeMillis());
        System.out.println("睡眠三秒后的时间为："+date.getTime());

        // 3.测试指定日期是否在当前日期之前/也就是判断是不是以往的日期
        System.out.println(date.before(new Date()));
        /*
        * 分析：原理就是获取两个日期的时间戳，比较时间戳，如果小于，
        *
        *
        *  public boolean before(Date when) {
               return getMillisOf(this) < getMillisOf(when);
           }
        * */




        //

    }
}
