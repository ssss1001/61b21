package timingtest;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */

/*本题考察：aList 的操作 addLast()
 *         代码的阅读能力*/
public class TimeAList {
    /*Ns:数据结构的大小，有多少个节点
     * times:操作的时间
     * opCount:操作的数目(和多少个节点是一样的，即和Ns在数值上是一样的)
     * timePerOp:平均操作时间*/
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");  //打印第一行文字
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;        //1e6含义：1*10^6
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);  //Ns中的值，times的值，opCount中的值，timePerOp中的值
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        int[] num = {1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};

        AList<Integer> Ns = new AList<>();
        for (int i = 0; i < num.length; i++) {
            Ns.addLast(num[i]);
        }
        AList<Double> times = new AList<>();
        AList<Integer> opCount = Ns;
        for (int i = 0; i < num.length; i++) {
            double n = aListAdd(num[i]);
            times.addLast(n);
        }
        printTimingTable(Ns, times, opCount);
    }

    public static double aListAdd(int num) {
        Stopwatch sw = new Stopwatch();
        AList<Integer> a = new AList<>();
        for (int i = 0; i < num; i++) {
            a.addLast(1);
        }
        double timeInSeconds = sw.elapsedTime();
        return timeInSeconds;

    }
}
