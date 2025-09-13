import java.util.*;
public class gcd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String arr[]=s.split(" ");
        int sum=0;
         for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length();j++){
                if(Character.isLetter(arr[i].charAt(j))){
                    count++;
                }
            }
            if(count>=sum){
                sum=count;
            }
         }
         System.out.println(sum+" ");
    }
}
