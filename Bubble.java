package copart;

/**
 * Created by fan on 7/30/17.
 */
public class Bubble {
    public static void main(String[] args) {
        int[] a ={3,5,2,1,6,9,7,8};
        bubbleSort(a);
        for(int x:a){
            System.out.println(x);
        }


    }

    public static void bubbleSort(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                     temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
}
