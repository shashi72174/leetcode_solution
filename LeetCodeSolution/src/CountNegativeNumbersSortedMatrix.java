public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{3,2},{1,0}};
        System.out.println(countNegatives(matrix));
    }

    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]<0)
                    count++;
            }
        }
        return count;
    }
}