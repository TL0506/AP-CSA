public class Cat extends Pet {
    // inherited from pet
    // private String name;
	// private String type;
	// private Date birthday;
    private Date nextVaccineDate;

    public Cat(String name, Date birthday, Date nextVaccineDate) {
        super(name, "Cat", birthday);
        this.nextVaccineDate = nextVaccineDate;
    }


    public Date getNextVaccineDate() {
        return this.nextVaccineDate;
    }

    public boolean dueForVaccination(Date date) {
        return this.nextVaccineDate.equals(date);
    }

    public void vaccinate() {
        this.nextVaccineDate = new Date();
        this.nextVaccineDate.setYear(this.nextVaccineDate.getYear() + 1);
    }

    public String toString() {
        return this.getName() + ", a " + this.getType() + ", born on " + this.getBirthday() + ". They're due for vaccinations on " + this.getNextVaccineDate();
    }

    public static void main(String[] args) {
       // testing Cat(String, Date, Date)
      Cat mango = new Cat("Mango", new Date(2, 5, 2020), new Date(1,2,2023));
      Date test = new Date(2,2,2024);
      System.out.println(mango.getName());
      System.out.println(mango.getBirthday());
      System.out.println(mango.getNextVaccineDate());
      System.out.println(mango); // test toString
      // vaccination testing
      System.out.println(mango.dueForVaccination(test));
      
      mango.vaccinate();


    }
}