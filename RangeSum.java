public class RangeSum{

    public static int sum(int[] nums,int i, int j){
            int sum=0;
            for(int k=i;k<j;k++){
                sum+=nums[k];
            }
            return sum;
        }
    public static void main(String args[]){
        int[] nums={2,3,4,5,6,7,8,9,1};
        System.out.println(sum(nums,2,5));
    }
    
}
