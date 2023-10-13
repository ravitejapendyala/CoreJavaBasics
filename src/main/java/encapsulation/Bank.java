package encapsulation;

public class Bank {

    public int accountNum = 123456;
    public int accountpin = 1234;
    public double balance = 100000;

    public void WithdrawAmount(int accNo,int pinNo,int amount){


        if(accNo==accountNum&&pinNo==accountpin){

            if(amount<balance){

                balance = balance-amount;
                System.out.println("Amount withdrawal : "+amount);
            }
            else{
                System.out.println("Insufficient blanace : ");
            }
        }
        else{
            System.out.println("Invalid credentials !!!! ");
        }
    }

    public  void UpdatePiN(int accNu,int oldPin,int newPin){

        if(accNu==accountNum&&oldPin==accountpin){

            accountpin = newPin;
            System.out.println("Pin changed successfully !!!! ");
        }
        else{

            System.out.println("Invalid credentials !!!! ");
        }
    }
}
