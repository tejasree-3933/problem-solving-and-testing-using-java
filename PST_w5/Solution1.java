import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
        int maxContiguous = arr.get(0);
    int currentSum = arr.get(0);

    int maxNonContiguous = 0;
    int maxElement = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {

        int num = arr.get(i);

        // Kadane's Algorithm for contiguous sum
        if (i > 0) {
            currentSum = Math.max(num, currentSum + num);
            maxContiguous = Math.max(maxContiguous, currentSum);
        }

        // Non-contiguous sum (sum of positives)
        if (num > 0) {
            maxNonContiguous += num;
        }

        // Track maximum element (for all negative case)
        maxElement = Math.max(maxElement, num);
    }

    // If all numbers are negative
    if (maxNonContiguous == 0) {
        maxNonContiguous = maxElement;
    }

    List<Integer> result = new ArrayList<>();
    result.add(maxContiguous);
    result.add(maxNonContiguous);

    return result;

    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> result = Result.maxSubarray(arr);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
