import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Stack<Integer> maxStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for(int i=0;i<n;i++) {
            String[] strs = scanner.nextLine().split(" ");
            switch (strs[0]) {
                case "1" : {
                    if(Integer.parseInt(strs[1])>maxStack.peek()) {
                        maxStack.pop();
                        maxStack.push(Integer.parseInt(strs[1]));
                    }
                    stack.push(Integer.parseInt(strs[1]));
                    break;
                }
                case "2" : {
                    int poppedVal = stack.pop();
                    if(maxStack.contains(poppedVal)) {
                        maxStack.pop();
                        if(maxStack.isEmpty() && !stack.isEmpty())
                            maxStack.push(Collections.max(stack));
                        else if(stack.isEmpty())
                            maxStack.push(Integer.MIN_VALUE);
                    }
                    break;
                }
                case "3" : {
                    System.out.println(maxStack.peek());
                    break;
                }
            }
        }
        scanner.close();
    }
}