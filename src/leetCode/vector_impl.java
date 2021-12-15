package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector_impl
{
    static void originalArray(final int greater[], final int n){
        // Array that is used to include every
        // element only once
        final Vector<Integer> temp = new Vector<Integer>();
        for (int i = 0; i <= n; i++)
        {
            temp.add(i);
        }
        final List<Integer> al = new ArrayList<>();
        for(int i=0;i<=n;i++){
            al.add(i);
        }

        // Traverse the array element
        final int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {

            // find the K-th (n-greater[i]-i)
            // smallest element in Include_Array
            final int k = n - greater[i] - i;

            //arr[i] = temp.get(k);
            arr[i] = al.get(k);
            // remove current k-th element
            // from Include array
            //temp.remove(k);
            al.remove(k);
        }

        // print resultant array
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(final String[] args){

        final Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(4);
        v.add(3);
        System.out.println(v.get(0)
                );

        final List<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(8);
        System.out.println(arrList.get(0));

        final int Arr[] = { 6, 3, 2, 1, 0, 1, 0 };
        final int n = Arr.length;
        originalArray(Arr, n);

    }
}
