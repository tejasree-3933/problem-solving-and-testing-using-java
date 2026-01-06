import java.util.Scanner;

public class VTU25044_w1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,34,56,78,90};
        //since we dont't know the initial maximum number we assumed as zero
        int max=0;
        for(int a=0;a<arr.length;a++){
             if(arr[a]>max){
                 max=arr[a];
             }
             System.out.println(arr[a]);

        }
        System.out.println("The maximum number is:"+max);

    }
}
