package copart;

/**
 * Created by fan on 7/30/17.
 */
public class Insertion {
    public static void main(String[] args) {
        int[] a ={3,5,2,1,6,9,7,8};

        insertionSort(a);
        for(int x:a){
            System.out.println(x);
        }

    }

    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            int insertValue=a[i];
            int index=i-1;
            while(index>=0 && a[index]>insertValue){
                a[index+1]=a[index];
                index--;
            }
            a[index+1]=insertValue;
        }
    }
}
