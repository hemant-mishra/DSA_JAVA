public class ReverseString {
    public static void main(String args[]){
        String Name="Hemant";
        String reverse="";
        for (int i=0;i<Name.length();i++){
            reverse+=Name.charAt(Name.length()-i-1);
        }
        System.out.println(reverse);
    }
    
}
