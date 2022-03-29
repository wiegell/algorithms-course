import edu.princeton.cs.algs4.StdOut;

public class PercolationStats {

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {

    }

    // sample mean of percolation threshold
    public double mean() {
        return 1;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return 1;
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return 1;
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return 1;
    }

    // test client (see below)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        Percolation perc = new Percolation(n);
        StdOut.println(n + T);
    }

}
