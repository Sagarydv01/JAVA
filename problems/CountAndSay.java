/*
Problem: Count and Say

The count-and-say sequence is defined recursively:

1. countAndSay(1) = "1"
2. countAndSay(n) is the run-length encoding (RLE) of countAndSay(n - 1).

Run-length encoding (RLE):
- Consecutive identical digits are replaced by:
  (count of digits) + (digit itself)
- Example:
  Input:  "3322251"
  Groups: "33" "222" "5" "1"
  Output: "23321511"
  Explanation:
    "33"   -> "23"  (two 3s)
    "222"  -> "32"  (three 2s)
    "5"    -> "15"  (one 5)
    "1"    -> "11"  (one 1)

Example:
n = 4

countAndSay(1) = "1"
countAndSay(2) = "11"
countAndSay(3) = "21"
countAndSay(4) = "1211"

Constraints:
1 <= n <= 30
*/

public class CountAndSay {

    public String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    next.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }

            next.append(count).append(result.charAt(result.length() - 1));
            result = next.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        CountAndSay solution = new CountAndSay();
        int n = 4;
        String output = solution.countAndSay(n);
        System.out.println("countAndSay(" + n + ") = " + output);
    }
}