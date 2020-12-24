import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {
    public static void main(String[] args) {
        int[] arr = new int[] {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if(i==arr.length-1)
                arr[i]=-1;
            else {
                int[] newArr = Arrays.copyOfRange(arr, i + 1, arr.length);
                arr[i] = Arrays.stream(newArr).max().getAsInt();
            }
            i++;
        }
        return arr;
    }
}