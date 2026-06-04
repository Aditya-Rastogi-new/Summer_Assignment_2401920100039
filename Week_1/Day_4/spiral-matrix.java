class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;
        while (firstRow <= lastRow && firstCol <= lastCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                ans.add(matrix[firstRow][i]);
            }
            firstRow++;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = lastCol; i >= firstCol; i--) {
                ans.add(matrix[lastRow][i]);
            }
            lastRow--;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = lastRow; i >= firstRow; i--) {
                ans.add(matrix[i][firstCol]);
            }
            firstCol++;
        }
        return ans;
    }
}
