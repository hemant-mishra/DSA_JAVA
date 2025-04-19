class linearSearch{
    public static void main(String args[]){

        int[] nums=new int[6];

        for(int i=0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*100);
        }
        System.out.print("[");
        for(int n:nums){
           System.out.print(n+" ");
        }
        System.out.println("]");

        int target=42;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                System.out.println("Item found at position"+i);
            }
        }
        
    }
}