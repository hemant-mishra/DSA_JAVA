public class productExcept {
    public static void main(String args[]){
        int[] arr={2,1,3,4};
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];

        // for (int i=0;i<arr.length;i++){
        //     int product=1;
        //     for(int j=0;j<arr.length;j++){
        //         if(j==i){
        //             continue;
        //         }
        //         else{
        //             product *=arr[j];
        //         }
        //     }
        //     arr1[i]=product;
        // }

        // for(int n:arr1){
        //     System.out.print(n+" ");
        // }

        left[0]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        System.out.println();
        for(int n:left){
            System.out.print(n+" ");
        }
        System.out.println();
        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        System.out.println();
        for(int m:right){
            System.out.print(m+" ");
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=right[i]*left[i];
        }
        System.out.println();
        for(int s:arr){
            System.out.print(s+" ");
        }

    }
    
}
