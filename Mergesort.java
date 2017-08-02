package copart;

import java.util.Arrays;

/**
 * Created by fan on 7/30/17.
 */

public class Mergesort {


    public static void main(String[] args)
    {
        int[] a = {2, 6, 3, 5, 1, 7, 9, 0, 8};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void mergeSort(int[] a){
        int[] temp = new int[a.length];
        divide(a,temp,0,a.length-1);
    }

    public static void divide(int[] a, int[] temp, int left, int right) {
        if(left<right){
            int mid =(left+right)/2;
            divide(a,temp,left,mid);
            divide(a,temp,mid+1,right);
            merge(a,temp,left,mid+1,right);
        }

    }

    private static void merge(int[] a, int[] tmp, int left, int right, int End) {

        int index= left;
        int leftEnd= right-1;
        int n=End-left+1;

        while(left<=leftEnd && right<=End){
            if(a[left]<a[right]){
                tmp[index++]=a[left++];
            }else{
                tmp[index++]=a[right++];
            }
        }
        while(left<=leftEnd) tmp[index++]=a[left++];

        while(right<=End) tmp[index++]=a[right++];

        for(int i=0;i<n;i++,End--){
            a[End]=tmp[End];
        }
    }

}
