public class solution {
    private int[] prefixSum;

    public solution(int[] nums){
        for (int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
    this.prefixSum=nums;
    }

    public int sumRange(int left, int right){
        if(left==0){
            return prefixSum[right];
        }
        return prefixSum[right]-prefixSum[left-1];
    }
    public static void main(String args[]){
        int[] nums={2,3,4,5,6,7,8,9,1};
        solution sol=new solution(nums);
        System.out.println(sol.sumRange(3,5));
    } 
}
