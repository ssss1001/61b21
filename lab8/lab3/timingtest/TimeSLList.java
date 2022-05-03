package timingtest;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        int[] num = {1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};

        AList<Integer> Ns = new AList<>();
        for (int i = 0; i < num.length; i++) {
            Ns.addLast(num[i]);
        }
        AList<Double> times = new AList<>();
        AList<Integer> opCount = Ns;
        for (int i = 0; i < num.length; i++) {
            double n = sListGet(num[i]);
            times.addLast(n);
        }
        printTimingTable(Ns, times, opCount);
    }

    public static double sListGet(int num) {
        Stopwatch sw = new Stopwatch();
        SLList l = new SLList();

        for (int i = 0; i < num; i++) {
            l.addLast(1);
        }
        double timeInSeconds = sw.elapsedTime();
        return timeInSeconds;
    }

}
