public class mergeSort{

    public static void MergeSort(int[] arr, int si, int ei, int mid){
        int[] merged=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid & idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];   
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
            
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
            
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void Sort(int[] arr, int si,int ei){
        if(si<ei){
            int mid=si+(ei-si)/2;
            Sort(arr,si,mid);
            Sort(arr,mid+1,ei);

            MergeSort(arr,si,ei,mid);

        }


    }
    public static void main(String args[]){

        int[] arr={4,3,5,2,6,1,7};

        Sort(arr,0,arr.length-1);

        for(int n:arr){
            System.out.print(n+" ");
        }   
     }
    
}
