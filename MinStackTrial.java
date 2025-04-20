import java.util.*;

class trial {
    Stack<Integer> st;
    int min;

    public trial() {
        st = new Stack<>();
    }

    public void add(int val) {
        if (st.empty()) {
            min = val;
            st.push(val);
        } else {
            if (val < min) {
                st.push(2 * val - min); // Encodes the previous min value
                min = val;
            } else {
                st.push(val);
            }
        }
    }

    public void remove() {
        if (st.empty()) {
            System.out.println("Stack is empty, cannot remove.");
            return;
        }
        int x = st.pop();
        if (x < min) {
            min = 2 * min - x; // Restore previous min
        }
    }

    public int top() {
        if (st.empty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int x = st.peek();
        return (x < min) ? min : x; // If x is encoded, return min
    }

    public int getMin() {
        if (st.empty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return min;
    }
}

class MinStackTrial{
    public static void main(String[] args) {
        trial s = new trial();
        s.add(8);
        s.add(10);
        s.add(12);
        s.add(8);
        s.add(3);
        s.add(13);

        System.out.println("Min: " + s.getMin()); // Should print 3
        System.out.println("Top: " + s.top());   // Should print 13
        s.remove();
        System.out.println("Min after pop: " + s.getMin()); // Should print 3
        s.remove();
        System.out.println("Min after pop: " + s.getMin()); // Should print 8
    }
}
