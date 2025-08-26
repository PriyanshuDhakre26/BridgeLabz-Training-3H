import java.util.*;
public class IllegalArgument{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int startindex=sc.nextInt();
        int endindex=sc.nextInt();
        try{
            if(startindex>endindex){
                throw new IllegalArgumentException();
            }
            System.out.println(s.substring(startindex,endindex));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
    }
}
