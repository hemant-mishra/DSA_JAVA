public class ProductSub {
    public static void main(String args[]){
        int[] arr={2,1,-3,0,4,-1,2,1,-5,4};
        int[] left =new int[arr.length];
        int[] right=new int[arr.length];

        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]*left[i-1]==0){
                left[i]=1;
            }
            else{
            left[i]=arr[i]*left[i-1];
            }
        }
        for(int n : left){
            System.out.print(n+" ");
        }
        System.out.println();
        
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]*right[i+1]==0){
                right[i]=1;
            }
            else{
            right[i]=arr[i]*right[i+1];
            }
        }
        for(int m : right){
            System.out.print(m+" ");
        }
        System.out.println();

        int max_product=arr[0];
        for(int i=0;i<arr.length;i++){
            max_product=Math.max(max_product,Math.max(left[i],right[i]));
        }

        System.out.println(max_product);
    }
    
}
