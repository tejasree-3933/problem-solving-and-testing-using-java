import java.util.Scanner;
public class VTU25044_w1_Arrayindex {
    public static void main(String[] args){
        int[] arr={12,34,56,78,90};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index to access the array element:");
        int i=sc.nextInt();
        if(i>=0 && i<arr.length){
            System.out.println("The array element at index "+i+" is: "+arr[i]);
        
    }

    
}
}