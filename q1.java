import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int a[]={5,8,59,10,52,65,2,44,31,7};
        Arrays.sort(a);
        int diff=a[a.length-1]-a[0];
        System.out.println(diff);
        
    }
}
