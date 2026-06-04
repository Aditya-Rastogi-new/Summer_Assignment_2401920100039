class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != n * m)
            return mat;
        if (r == m && n == c)
            return mat;
        int[][] reshape = new int[r][c];
        int[] temp = new int[n * m];
        int p = 0, q = 0, k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[k++] = mat[i][j];
            }
        }
        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshape[i][j] = temp[k++];
            }
        }
        return reshape;
    }
}
