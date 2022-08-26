import java.util.ArrayList;
public class q4 {
    public static void main(String[] args) {
        int a[]={ 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }else{
                arrlist.add(a[i]);
                
            }
        }
        for(int i=0;i<count;i++){
            arrlist.add(1);
        }
        
            System.out.println(arrlist);
    }

    
}
