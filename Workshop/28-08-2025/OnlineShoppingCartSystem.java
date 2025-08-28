import java.util.*;
public class OnlineShoppingCartSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Below Mentioned Products are available on Store:");
        System.out.println("1. Phone -> 50,000");
        System.out.println("2. Laptop -> 80,000");
        System.out.println("3. Tablet -> 20,000");
        System.out.println("4. Headphone -> 5000");
        int n;
        int total=0;
        do{
            System.out.println("Enter number of items you want to purchase(minimum 1):");
            n=sc.nextInt();
        }while(n<1);
        for(int i=1;i<=n;i++){
            System.out.println("choose Product "+i+" 1-4 :");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                total=total+50000;
                break;

                case 2:
               total=total+80000;
               break;
                
               case 3:
               total=total+20000;
               break;

               case 4:
               total=total+5000;
               break;

               default:
               System.out.println("Invalid choice");
            }
        }
        if(total>=25000){
            if(total>25000 && total<50000){
                int discount=total-((5*total)/100);
                System.out.println("Your total bill is "+total+" after discount of 5% is "+discount);
            }
            else{
                int discount=total-(10*total)/100;
                System.out.println("Your total bill is "+total+" after discount of 10% is "+discount);
            }
        }
        else{
            System.out.println("Your total bill is "+total);
        }
    }
}
