import java.time.*;
public class NBAPlayers
{
   private String pN;
   private int uN;
   private String Position;
   private LocalDate Birth;
   private String City;
   
   public NBAPlayers()
   {
      pN = "";
      uN = 0;
      Position = "";
      City = "";
      
   }
   public NBAPlayers(String pN , int uN , String Position , LocalDate Birth , String City)
   {
      this.pN = pN;
      this.uN = uN;
      this.Position = Position;
      this.Birth = Birth;
      this.City = City;
   }
   
   public String getpN() { return pN;}
   public int getuN() { return uN;}
   public String getPosition() { return Position;}
   public LocalDate getBirth() { return Birth;}
   public String getCity() { return City;}
   
   public void setpN(String bpN){ pN = bpN;}
   public void setuN(int buN) {uN = buN;}
   public void setPosition(String bPosition) { Position = bPosition;}
   public void setBirth(LocalDate bBirth) { Birth = bBirth;}
   public void setCity(String bCity) { City = bCity;}
   
   
   public void Age()
   {
      int Age = Period.between(Birth,LocalDate.now()).getYears();  
      System.out.println( "The Player's age is " + Age );
   }
    
   public String toString()
   {
      String result = "";
      result += "Player's Name:" + pN + "\n";
      result += "Player's Uniform Number:" + uN + "\n";
      result += "Player's Position:" + Position + "\n";
      result += "Player's Date of Birth:" + Birth + "\n";
      result += "Player's City of Birth:" + City + "\n";
      return result;
    }

   
}