import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private byte[] contentArray;
    private WeightedQuickUnionUF unionArray;

    private void assessLength(int id) {
        if (id >= contentArray.length) {
            throw new IllegalArgumentException("not in range");
        }
    }

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        // 0 = closed, 1 = open, but empty, 2 = full
        contentArray = new byte[n * n];
        unionArray = new WeightedQuickUnionUF(n * n);
        for (int i = 0; i < contentArray.length; i++) {
            contentArray[i] = 0;
        }
        unionArray.find(0);
    }

    private static int coordToId(int[] coords) {
        int row = coords[0];
        int col = coords[1];
        return (row - 1) * 10 + col - 1;
    }

    // Row, Col
    /*
    private static int[] idToCoord(int id) {
        int surplus = (id % 10);
        int base10 = id - surplus;
        return new int[] { (base10 / 10) + 1, surplus + 1 };
    }
    */


    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        int id = coordToId(new int[] { row, col });
        contentArray[id] = 1;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {

        int id = coordToId(new int[] { row, col });
        assessLength(id);
        return contentArray[id] != 0;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        int id = coordToId(new int[] { row, col });
        assessLength(id);
        return contentArray[id] == 2;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        int totalOpenSites = 0;
        for (int i = 0; i < contentArray.length; i++) {
            if (contentArray[i] == 1 || contentArray[i] == 2) {
                totalOpenSites++;
            }
        }
        return totalOpenSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return true;
    }

    // test client (optional)
    public static void main(String[] args) {
    }
}
