class twoSum{
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9};
        int target=13;
        boolean found=false;
        for (int i=0; i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                int sum=array[i]+array[j];
                if(sum==target){
                    System.out.println(i+","+j);
                    found=true;
                    break;
                }
            }
            if(found==true){
    
                System.out.println("target achieved");
                break;
            }
        }

        // if(!found){
        //     System.out.print("your target is not found in the given array");
        // }
        // else{

        //     System.out.println("target achieved");
        // }
    }
}