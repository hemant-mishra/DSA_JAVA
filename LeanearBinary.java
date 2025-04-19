public class LeanearBinary {
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
                int target= 24;
                int result=linear(nums,target);

                if (result !=-1){
                    System.out.println("item is found at position"+result);
                }
                else{
                    System.out.println("item is not found");
                }

                int result1=Binary(nums,target);

                if (result1 !=-1){
                    System.out.println("item is found at position"+result);
                }
                else{
                    System.out.println("item is not found");
                }
            }
                public static int linear(int[] nums,int target){
                    int steps=0;
                    for(int i=0;i<nums.length;i++){
                        steps++;
                        if (nums[i]==target){
                            System.out.println("item is found in steps :"+steps);
                            return i;
                        }
                }
                System.out.println("steps taken by linear search is :"+ steps);
                return -1;
            }

            public static int Binary(int[] nums,int target){
                int steps=0;
                int left=0;
                int right=nums.length-1;
                while(left<=right){
                    int mid=(left+right)/2;
                    steps++;
                    if (nums[mid]==target){
                        System.out.println("step taken to find target :"+steps);
                        return mid;
                    }
                    else if (nums[mid]<target){
                        left=mid+1;
                    }
                    else{
                        right=mid-1;
                    }
                }
                System.out.println("step taken by Binary search:"+steps);
                
                return -1;
            }
        }
