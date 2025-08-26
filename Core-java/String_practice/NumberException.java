import java.util.*;
public class NumberException {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        try{
            int num=Integer.parseInt(s);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }
}
