import java.util.*;;
public class StringIndexOutOfBondException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int index=sc.nextInt();
        try{
            char ch=s.charAt(index);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
