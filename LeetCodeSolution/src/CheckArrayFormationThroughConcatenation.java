public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        int[] arr = {49,18,16};
        int[][] pieces = {{16,18,49}};
        System.out.println(canFormArray(arr,pieces));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        boolean flag = true;

        //List<Integer>


        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<pieces.length;j++) {
                for(int k=0;k<pieces[i].length;k++) {
                    if(pieces[j][k]==arr[i])
                        continue;

                }
            }
        }
        return false;
    }
}
