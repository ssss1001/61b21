package timingtest;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
//Stopwatch() 函数的实例
public class StopwatchDemo {
    /** Computes the nth Fibonacci number using a slow naive recursive strategy.*/
    /* 用一种慢但自然的递归方法计算第 n 个斐波那契额树*/
    private static int fib(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        int fib41 = fib(41);
        double timeInSeconds = sw.elapsedTime();
        System.out.println("The 50th fibonacci number is " + fib41);
        System.out.println("Time taken to compute 41st fibonacci number: " + timeInSeconds + " seconds.");
    }
}
