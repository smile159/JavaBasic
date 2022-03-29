package cachePool;

/**
 * @author smile
 * @ClassName IntegerCache.java
 * @Description TODO
 * @createTime 2022年03月29日 10:29:00
 */
public class IntegerCache {
    public static void main(String[] args) {
        /*
         *   new Integer(123) 与 Integer.valueOf(123)
         *
         * */


        Integer a = new Integer(111);
        Integer b = new Integer(111);
        // a和b都是新创建的对象，所以不可能相等
        System.out.println(a == b);
        // 而Integer.valueOf()是从池里面取出数据的
        /*
        *
        * 源码
        public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                    return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }
        * 第一步：先判断i是否在[IntegerCache.low,IntegerCache.high]之间，如果为true，则
         */
        Integer c = Integer.valueOf(111);
        Integer d = Integer.valueOf(111);

        System.out.println(c == d);



        Integer e = 666;
        Integer f = 666;
        System.out.println(e == f);

        Integer g = 127;
        Integer h = 127;
        System.out.println(g == h);



        int aa = 10;
        Integer aaa = aa;
        System.out.println(aaa);
    }
}
