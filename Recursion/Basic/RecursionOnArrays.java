import java.util.ArrayList;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int []  arr1 = {7,5,6,9,10};
        int[] arr2 = {3,5,2,5,5,6};

        System.out.println(isSorted(arr1,arr1.length));

        System.out.println(linearSearch(arr1, arr1.length, 9));

        System.out.println(linearSearch2(arr2, arr2.length, 5));

        System.out.println(linearSearch3(arr2, arr2.length, 5));
    }
    static boolean isSorted(int [] arr,int n)
    {
        if(n>=2 && arr[n-1]<arr[n-2])
        {
            return false;
        }
        else if(n==2)
        {
            return true; 
        }
        return isSorted(arr, n-1);
    }
    static int linearSearch(int [] arr , int n , int target)
    {
        if(n >=1 && arr[n-1]==target)
        {
            return n-1;
        }
        else if(n==1)
        {
            return -1;
        }
        return linearSearch(arr,n-1,target);
    }
    static ArrayList<Integer> linearSearch2(int [] arr , int n , int target)
    {
        ArrayList<Integer> inds = new ArrayList<>();
        findAllIndices(arr, inds , n , target);
        return inds;
    }
    static void findAllIndices(int [] arr ,ArrayList<Integer> inds ,int n ,int target)
    {
        if(n>=1 && arr[n-1]==target)
        {
            inds.add(n-1);
        }
        if(n==1)
        {
            return;
        }
        findAllIndices(arr, inds, n-1, target);
    }

    //Concept : returning the list without passing it in the argument
    static ArrayList<Integer> linearSearch3(int [] arr , int n , int target)
    {
        //here, a new ArrayList will be created for each function call..
        ArrayList<Integer> indices = new ArrayList<>();
        if(n>=1 && arr[n-1]==target)
        {
            indices.add(n-1);
        }
        if(n==1)
        {
            return indices;
        }

        //save the ArrayList returned in previous call in new ArrayList named Container,
        //(it happens when stack is empting)
        ArrayList<Integer> container = linearSearch3(arr, n-1, target);

        //as Conatiner values will be gone
        //so add it in the indices , before the values are deleted
        indices.addAll(container);

        //return the updated indices Array , 
        //it will be returned/added in the emptied container
        return indices;
        //Note: indices will keep getting updated 
        //      for each function call removed from call stack..
    }
}
