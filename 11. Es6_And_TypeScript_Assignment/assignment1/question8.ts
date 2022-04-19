// Write a class Account with attributes id, name, balance. Add two sub classes SavingAccount 
// & CurrentAccount having specific attribute interest & cash_credit respectively. Create multiple
//  saving & current account objects. Write a functionality to find out total balance in the bank.

class Account{
   
  public  id;
  public name;
  public static  balance=0;

    constructor(id,name,balance){
        this.id=id;
        this.name=name;
    }
};
class SavingAccount extends Account{
   cash_credit(amount) {
       Account.balance=Account.balance+amount;
   }
   interest(rate){
       Account.balance=Account.balance+a
   }
}
// class CurrentAccount{

// }

let sa=new SavingAccount(1,"ram",0);
sa.cash_credit(200);
sa.cash_credit(400);
console.log(Account.balance);
