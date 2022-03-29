package questions;

/**
 * @author smile
 * @ClassName question1.java
 * @Description 函数是否会改变外部的变量值
 * @createTime 2022年03月29日 19:55:00
 */
public class question1 {
    public static void main(String[] args) {
        /*
        *
        * */
        // 第一种情况 b是调用的valueOf，并且在[-128,127]之间
        //int a = 10;
        //Integer b = 20;

        /*
        *
        * output:
        int a = 10;
        Integer b = 20;
        * */


        // 第二种情况，b是调用的valueOf,不在[-128,127]之间
        //int a = 10;
        //Integer b = 666;
        /*
        *
        * output:
        int a = 10;
        Integer b = 666;
        * */




        // 第三种情况，使用的new Integer，在[-128,127]之间
        //int a = 10;
        //Integer b = new Integer(110);

        /*
        *
        * output:
            调用函数前的值为：a=10	b=110
            调用函数后的值为：a=10	b=110
        *
        * */

        // 第四种情况，使用的new Integer，不在[-128,127]之间
        int a = 10;
        Integer b = new Integer(666);
        /*
        * output:
            调用函数前的值为：a=10	b=666
            调用函数后的值为：a=10	b=666
        *
        * */



        System.out.println("调用函数前的值为：a="+a+"\tb="+b);
        exchange(a,b);
        System.out.println("调用函数后的值为：a="+a+"\tb="+b);
    }
    public static void exchange(int x,Integer y){
        x = 100;
        //y = 100;
        y = 999;
    }
}
