import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=25000;
        int amount;
        int choice;
        while(true){
            System.out.println("---ATM OPTIONS---");
            System.out.println("1.DEPOSITE\n");
            System.out.println("2.WITHDRAW\n");
            System.out.println("3.CHECK BALANCE\n");
            System.out.println("4.EXIT\n");
            System.out.println("ENTER YOUR CHOICE FROM ABOVE OPTIONS\n");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                     System.out.print("ENTER  amount TO DEPOSIT\n");
                     amount=sc.nextInt();
                     balance=balance+amount;
                     System.out.println("DEPOSIT SUCCESFULLY...");
                    break;

                case 2:
                     System.out.println("ENTER amount TO WITHDRAW FROM CURRENT BALANCE\n");
                     amount=sc.nextInt();
                     if(balance>=amount)
                        {
                        balance=balance-amount;
                        System.out.println("WITHDRAW SUCCESSFULLY COMPLETED!!");
                }
                else{
                    System.out.println("INSUFFICENT BALANCE!");
                }
                    break; 
                case 3:
                     System.out.println("YOUR CURRENT BALANCE IS :"+ balance);
                     break;
                case 4:
                    System.out.println("THANKS FOR VISITING.....");
                    System.exit(0);
                    break;
                default:System.out.println("INVALID CHOICE IS ENTERED !\n");
                System.out.println("PLEASE RE-ENTERE THE CHOICE/OPTION\n");
                break;
            }
            
            

        }
    }

}