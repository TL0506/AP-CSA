public class Dog extends Pet {
    // inherited from pet
    // private String name;
	// private String type;
	// private Date birthday;
    private String breed;

    public Dog(String name, Date birthday, String breed) {
        super(name, "Dog", birthday);
        this.breed = breed;
    }

    public Dog(String name, Date birthday) {
        super(name, "Dog", birthday);
        this.breed = "unknown";
    }

    // just bred different
    public String getBreed() {
        return this.breed;
    }
    // a totally different breed, a class ahead of the others
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return this.getName() + ", a " + this.getBreed()+ " " + this.getType()+ " (" + this.getBirthday()+ ")";
    }

    public static void main(String[] args) {
    
        // testing Dog(String, Date)
        Dog cookie = new Dog("Cookie", new Date(2, 5, 2024));

        System.out.println(cookie.getBreed());
        cookie.setBreed("terrier"); 
        System.out.println(cookie.getBreed());

        System.out.println(cookie.getName());
        System.out.println(cookie.getBirthday());
        System.out.println(cookie.getType());
        System.out.println(cookie); // test toString

        System.out.println("\n\n\n"); 
        
        
        // testing Dog(String, Date, String)
        Dog cow = new Dog("cow", new Date(2, 2, 2000), "Unicorn");
        System.out.println(cow.getBreed());
        cow.setBreed("shiba inu");
        System.out.println(cow.getBreed());
       
        System.out.println(cow.getName());
        System.out.println(cow.getBirthday());
        System.out.println(cow.getType());
        System.out.println(cow);
    }
}