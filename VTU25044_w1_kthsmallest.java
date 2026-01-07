
import java.util.Arrays;
public class VTU25044_w1_kthsmallest{
public static void main(String[] args){
int[] arr={5,6,7,3,4};
int k=3;
int ans=kthelement(arr,k);
System.out.println(ans);


}
static int kthelement(int[] arr,int k){
Arrays.sort(arr);
return arr[k-1];
}
}

