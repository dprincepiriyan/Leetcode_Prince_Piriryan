class NumMatrix {
    private int[][] prefix;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length == 0) return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // CRITICAL CHECK: Ensure rows maps to the first dimension, cols to the second
        this.prefix = new int[rows + 1][cols + 1];
        
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                this.prefix[r][c] = this.prefix[r - 1][c] 
                                  + this.prefix[r][c - 1] 
                                  - this.prefix[r - 1][c - 1] 
                                  + matrix[r - 1][c - 1];
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        // Shift dimensions safely
        r1++; c1++; r2++; c2++;
        
        // If prefix was allocated as [rows + 1][cols + 1], this calculation stays safe
        return this.prefix[r2][c2] 
             - this.prefix[r1 - 1][c2] 
             - this.prefix[r2][c1 - 1] 
             + this.prefix[r1 - 1][c1 - 1];
    }
}