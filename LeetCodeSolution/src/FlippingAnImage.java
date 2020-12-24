import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(A)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][A.length];
        int[][] temp = new int[A.length][A.length];
        //flip each row
        int k=0;
        for(int i=0;i<A.length;i++) {
            k=0;
            for(int j=A[i].length-1;j>=0;j--) {
                temp[i][k]=A[i][j];
                k++;
            }
        }
        //invert each row
        for(int i=0;i<temp.length;i++) {
            for(int j=0;j<temp[i].length;j++) {
                if(temp[i][j]==0)
                    res[i][j]=1;
                else
                    res[i][j]=0;
            }
        }
        return res;
    }
}