package encapsulation;

public class ATM {


    public  static  void main(){
        Bank b = new Bank();

        b.UpdatePiN(123456,1234,3333);
        b.WithdrawAmount(123456,3333,1000);

    }
}
