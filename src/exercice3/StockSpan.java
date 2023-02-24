package exercice3;

import java.util.*;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];

        // Stack to keep track of previous days where the price was lower
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Push the first day index onto the stack

        spans[0] = 1; // The span for the first day is always 1

        for (int i = 1; i < n; i++) {
            // Pop days from the stack until the price for the day at the top of the stack
            // is greater than the price for the current day
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack is empty, then the current day is the highest price seen so far
            // and the span is just the number of days from the first day up to this day
            if (stack.isEmpty()) {
                spans[i] = i + 1;
            }
            // Otherwise, the current day is lower than the day at the top of the stack,
            // so the span is the difference between the current day and the day at the top
            // of the stack
            else {
                spans[i] = i - stack.peek();
            }

            // Push the index of the current day onto the stack for the next iteration
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);
        System.out.println(Arrays.toString(spans)); // [1, 1, 1, 2, 1, 4, 6]
    }
}
