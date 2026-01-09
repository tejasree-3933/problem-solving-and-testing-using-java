import java.util.*;
import java.util.function.Predicate;

public class VTU25044_w2_Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int T = sc.nextInt();   
Predicate<Integer> isOdd = n -> n % 2 != 0;
Predicate<Integer> isPrime = n -> {
if (n < 2) return false;
for (int i = 2; i * i <= n; i++) {
if (n % i == 0) return false;
}
return true;
};

Predicate<Integer> isPalindrome = n -> {
String s = String.valueOf(n);
String rev = new StringBuilder(s).reverse().toString();
return s.equals(rev);
};
while (T-- > 0) {
int type = sc.nextInt();   
int num  = sc.nextInt();
if (type == 1) {               
if (isOdd.test(num))
System.out.println("ODD");
else
System.out.println("EVEN");
}
 else if (type == 2) {          
if (isPrime.test(num))
System.out.println("PRIME");
else
System.out.println("COMPOSITE");
}
 else if (type == 3) {                          
if (isPalindrome.test(num))
System.out.println("PALINDROME");
else
System.out.println("NOT PALINDROME");
 }
 }
 }
 }
