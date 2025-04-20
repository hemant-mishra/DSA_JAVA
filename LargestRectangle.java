import java.util.*;

public class LargestRectangle {

    public static int[] NextSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek(); 
            st.push(i);
        }
        return nse;
    }

    public static int[] PreviousSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek(); 
            st.push(i);
        }
        return pse;
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nextSmaller = NextSE(heights);
        int[] prevSmaller = PreviousSE(heights);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nextSmaller[i] - prevSmaller[i] - 1; 
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int maxArea = largestRectangleArea(arr);
        System.out.println("Largest Rectangle Area: " + maxArea);
    }
}
