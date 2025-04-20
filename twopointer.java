public class twopointer {
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9};
        int target=13;
        boolean found=false;
        int left=0;
        int right=array.length-1;

        while(left<right){
            int sum=array[left]+array[right];
            if (sum==target){
                System.out.println(left+","+right);
                right--;
                left++;
            }
            else if (sum<target){
                left++;
            }
            else{
                right++;
            }
        }

        if(!found){
            System.out.println("your target is not achieved in given array");
        }
        else{
            System.out.println("Target achieved");
        }
    }
    
}
