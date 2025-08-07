class Solution16 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(i);
                    inner.add(j);
                    arr.add(inner);
                }
            }
        }
        for(List<Integer> a : arr) {
            int i = a.get(0), j = a.get(1);
            while(i < row) {
                matrix[i][j] = 0;
                i++;
            }
            i = a.get(0);
            while(i >= 0) {
                matrix[i][j] = 0;
                i--;
            }
            i = a.get(0);
            while(j < col) {
                matrix[i][j] = 0;
                j++;
            }
            j = a.get(1);
            while(j >= 0) {
                matrix[i][j] = 0;
                j--;
            }
            j = a.get(1);
        }
    }
}
