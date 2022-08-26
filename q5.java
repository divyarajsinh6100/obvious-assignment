public class q5 {
    public static void main(String[] args) {
        int a[]={ 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
        int n=a.length;
        int inc[]=new int[n];
        int dec[]=new int[n];
        inc[0]=1;
        dec[n-1]=1;
        int hi=-1;
        int lo=-1;


        for(int i=1;i<n;i++){
        inc[i]=(a[i]>a[i-1]) ? inc[i-1] + 1 : 1;
        }

        for(int i=n-2;i>=0;i--){
            dec[i]=(a[i]>a[i+1]) ? dec[i+1]+1 :1; 
        }
       int max=inc[0]+dec[0]-1;
       for(int i=0;i<n;i++){
        if (inc[i] + dec[i] - 1 > max){
                max = inc[i] + dec[i] - 1;
                hi=i+dec[i]-1;
                lo=i-inc[i]+1;
        }
       }
       System.out.println("The length of longest bitonic subarray is"+max);
    System.out.println(lo+" "+hi);
        for(int i=lo;i<=hi;i++){
            System.out.print(a[i]+" ");
        }
    }
}
