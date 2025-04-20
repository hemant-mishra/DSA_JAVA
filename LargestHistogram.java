import java.util.*;

public class LargestHistogram {

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];  // Append a dummy 0 height
            
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];  // Pop the height
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;  // Compute width
                maxArea = Math.max(maxArea, height * width);
            }
            
            stack.push(i);  // Push index
        }

        return maxArea;
    }

    public static void main(String args[]) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int maxArea = largestRectangleArea(arr);
        System.out.println("Largest Rectangle Area: " + maxArea);
    }
}
