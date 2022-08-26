public class q3 {
    public static void main(String[] args) {
        int a[]={ 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
    //    int a[] = { 1, 2, -3, 4, 5, 6 };
        // int a[]= { 1, 2, -2, 3, 4, 5, 6 };
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==0){
                    for(int k=i;k<=j;k++){
                        System.out.print(" "+a[k]);
                    }
                    
                }

            }                System.out.println();

        }
    }
}
