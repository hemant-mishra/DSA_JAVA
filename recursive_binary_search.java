public class recursive_binary_search {
    public static int binarySearch(int[] arr, int target,int left, int right){
        if (left>right){
            return -1;
        }
        int mid=left+(right-left)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr, target, left,mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1,right);
        }
    }

    public static void main(String args[]){
        int[] arr={2,67,87,99,105,108};
        int index=binarySearch(arr,67,0,arr.length-1);
        System.out.println(index);
    }
    
}