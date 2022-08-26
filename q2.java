import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int nums[]={ 49, 1, 3, 200, 2, 4, 70, 5};
        int count =1;
        int max = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                count++;
            }else{
                max = Math.max(max,count);
                count=1;
            }
            
       }        
        System.out.println(max);
        
    }
}
