public class BankTeller
{
   private String Name;
   private String tellerID;
   private CustomerAccount cA;
    
   
   public BankTeller()
   {
      Name = "";
      tellerID = "";
      cA = new CustomerAccount ();
   }
   public BankTeller(String Name , String tellerID)
   {
      this.Name = Name;
      this.tellerID = tellerID;
      cA = new CustomerAccount ();
      
   }
   
   public String getName() { return Name;}
   public String gettellerID() { return tellerID;}
   public CustomerAccount getcA() { return cA;}
   
   
   public void setName (String bName) { Name = bName;}
   public void settellerID ( String btellerID) { tellerID = btellerID;}
   public void setcA( CustomerAccount bcA) { cA = bcA;}
   
   
   public double getB()
   {
      return cA.getB();
   }
   public void desposit(CustomerAccount cA, double n)
   {
      
      cA.setB(cA.getB() + n);
      
      
      
   }
   public double withdrawal(CustomerAccount cA, double n)
   {
      cA.setB(cA.getB() - n);
   }
   
   
   
   public String toString()
   {
      String result = "";
      result += "BankTeller's Name " + Name + "\n";
      result += "BankTeller's ID " + tellerID + "\n";
      result += "Customer's information: " + cA + "\n";
      return result;
   }
}