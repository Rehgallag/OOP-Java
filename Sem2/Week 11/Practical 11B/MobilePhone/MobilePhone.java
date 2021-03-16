/////////////////////////////////
//        MobilePhone          //
////////////////////////////////
//    callCost : double       //
//    textCost : double       //
//    balance : double        //
//                           // 
///////////////////////////////
// MobilePhone()              //
// MobilePhine(double, double) //
//                            //
// getBalance(): double       //
// topUp(double): void        //
// getCallCost(): double     //
// getTextCost(): double     //
// makeCall(): void          //
// sendText(): void          //
//                           //
///////////////////////////////
public class MobilePhone
{
   //instance variables
   private double balance;
   private double callCost;
   private double textCost;
   
   //constructors
   public MobilePhone()
   {
      callCost = 0.2;
      textCost = 0.1;
   }
   
   public MobilePhone(double callCostIn, double textCostIn)
   {
      callCost = callCostIn;
      textCost = textCostIn;
      if(callCostIn < 0) //if less than 0
         callCost = 0.2; //set to default value
      if(textCostIn < 0)
         textCost = 0.1;
   }
   
   //method
   //return the balance
   public double getBalance() {
      return balance;
   }
   
   //tops up the balance by an amount
   public void topUp(double amount) {
      if(amount > 0) //validate the input amount
         balance += amount;
   }
   
   //returns the cost of a call
   public double getCallCost() {
      return callCost;
   }
   
   //returns the cost of a text
   public double getTextCost() {
      return textCost;
   }
   
   //method to make a call
   public void makeCall() {
      if(balance >= callCost)
         balance -= callCost;
   }
   
   //method to send a text
   public void sendText() {
      if(balance >= textCost)
         balance -= textCost;
   }
   
   public String toString()
   {
      return "Balance: " +balance +"; Call cost: " +callCost +"; Text cost: "+textCost;
   }
}//end class