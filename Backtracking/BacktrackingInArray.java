import java.util.*;

class BacktrackingInArray{

    public static void change(int[] arr,int i,int n){

        if(i==arr.length){
            print1(arr);
            return;
        }
        arr[i]=n;
        change(arr,i+1,n+1);
        arr[i]=arr[i]-2;



    }

    public static void print1(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println(" ");

    }
    public static void main(String[] args){
        int arr[] = new int[5];
        change(arr,0,1);
        print1(arr);


    }
}