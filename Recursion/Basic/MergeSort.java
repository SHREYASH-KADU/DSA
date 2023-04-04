import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {1,7,5,3};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Function to Divide the array into left and right part recursively..
    static int[] mergeSort(int [] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));
        return merge(left,right);
    }

    //Function to merge the left and right array
    //it will execute when mergeSort function call will start getting emptied from call stack
    //it will execute for each divided array,given length>=2
    //(when each mergeSort function is removed from call stack)
    static int[] merge(int[]left ,int[]right)
    {
        int [] ans = new int[left.length + right.length];
        int i = 0, j=0 , k=0;

        while( (i < left.length) && (j<right.length) )
        {
            if(left[i]>=right[j])
            {
                ans[k] = right[j];
                j++;
                k++;
            }
            else
            {
                ans[k] = left[i];
                i++;
                k++;
            }
        }
        while(i<left.length)
        {
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;
    }

    //without using copyOfRange Function..
    //i.e, without creating extra mini copies of the original array
    static void mergeSort(int [] arr , int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid = start + (end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }
    static void merge(int[]arr, int start, int mid, int end)
    {
        //to save left and right part in sorted manner
        int[] mergedArr = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int k = 0;
        
        while( left<=mid && right<=end)
        {
            if( arr[left]<=arr[right] ) 
            {
                mergedArr[k] = arr[left];
                k++;
                left++;
            }
            else
            {
                mergedArr[k] = arr[right];
                k++;
                right++;
            }
        }
        while(left<=mid)
        { 
            mergedArr[k] = arr[left];
            k++;
            left++;
        }
        while(right<=end)
        {
            mergedArr[k] = arr[right];
            k++;
            right++;
        }
        for (int i = start, j=0; i <= end && j < mergedArr.length; i++,j++) 
        {
            arr[i] = mergedArr[j];
        } 
    }
}
