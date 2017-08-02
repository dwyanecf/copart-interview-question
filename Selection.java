package copart;

/**
 * Created by fan on 7/30/17.
 */
public class Selection {
    public static void main(String[] args) {
        int[] a ={3,5,2,1,6,9,7,8};
        selectSort(a);
        for(int n:a){
            System.out.println(n);
        }
    }

    public static void selectSort(int[] a){
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=i;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            temp=a[i];
            a[i]=min;
            a[index]=temp;
        }
    }
}
