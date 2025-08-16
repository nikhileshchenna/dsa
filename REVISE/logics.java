package REVISE;
import java.util.*;
public class logics {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      char op = sc.next().charAt(0);
     public int calci(){
      switch(op){

        case '+':
        return a+b;
        
        case '-':
        return a-b;

        case '*':
        return a*b;

        case '%':
        return a%b;

      }
      return 0;
    }
}
