import java.util.Scanner;
public class VTU25044_w1_pairs{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array:");
int n=sc.nextInt();
int arr[]=new int [n];
for (int i=0;i<n;i++){
 arr[i]=sc.nextInt();
}
printpairs(arr,n);




}
static void printpairs(int[] arr,int n){
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
 System.out.println(arr[i] +" "+arr[j]);
}
}
}
}