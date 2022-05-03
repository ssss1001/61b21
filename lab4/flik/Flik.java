package flik;

import afu.org.checkerframework.checker.igj.qual.I;
import org.junit.Test;

/** An Integer tester created by Flik Enterprises.
 * @author Josh Hug
 * */
public class Flik {
    /** @param a Value 1
     *  @param b Value 2
     *  @return Whether a and b are the same */
    public static boolean isSameNumber(Integer a, Integer b) {
        return a.intValue() == b.intValue();
    }


    @Test
    public void test(){
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        System.out.println(isSameNumber(a, b));

        a = 2;
        System.out.println(a);
        System.out.println(isSameNumber(a, b));
    }
}

