import java.util.*;
import java.util.stream.*;

public class VTU25044_w2_SecondHighestBeginner {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();          // number of elements
int[] arr = new int[n];        // array to store numbers
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
 }

// Convert array to stream
 int result = Arrays.stream(arr)
.distinct()                       // remove duplicates
.boxed()                          // convert int to Integer
.sorted(Comparator.reverseOrder())// sort in descending order
.skip(1)                          // skip highest
.findFirst()                      // take second highest
.orElse(-1);                      // if not present, return -1
 System.out.println(result);
    }
}
