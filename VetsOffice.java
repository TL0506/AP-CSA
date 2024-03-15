import java.util.ArrayList;

public class VetsOffice {
    private ArrayList<Pet> pets;

    public VetsOffice() {
        this.pets = new ArrayList<Pet>();
    }

    public void addPet(Pet p) {
        pets.add(p);
    }
    
    private int findPet(String name) {
        for (int i=0; i<pets.size(); i++) {
            if (name.equals(pets.get(i).getName())) return i;
        }

        return -1;
    }

    public Pet getPet(String name) {
        for (int i=0; i<pets.size(); i++) {
            if (name.equals(pets.get(i).getName())) return pets.get(i);
        }

        // no pet found return null
        return null;
    }

    public Pet removePet(String name) {
        for (int i=0; i<pets.size(); i++) {
            if (name.equals(pets.get(i).getName())) {
                Pet removedPet = pets.get(i);
                pets.remove(i);
                return removedPet;
            }
        }
   // no pet found return null

        return null;
    }

    public void listAll() {
        for (int i=0; i<pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }

    public void listAll(String type) {
        for (int i=0; i<pets.size(); i++) {
            if (pets.get(i).getType().equals(type)) {
                System.out.println(pets.get(i));
            }
        }
    }

   
    public void listCatOwnersToRemind() {
        Date today = new Date();

        for (int i=0; i<pets.size(); i++) {
            if (pets.get(i) instanceof Cat) {
                Cat catte = (Cat)pets.get(i);
                if (catte.dueForVaccination(today)) {
                    System.out.println(catte);
                }
            }
        }
    }

    public static void main(String[] args) {
        VetsOffice vo = new VetsOffice();
        
        vo.addPet(new Pet("Jerry", "Mouse", new Date(2, 1, 2003)));
        vo.addPet(new Cat("Tom", new Date(2, 23, 1230), new Date(2, 10, 1932)));
        vo.addPet(new Dog("ruby", new Date(4, 30, 1950)));
        vo.addPet(new Pet("goldy", "goldfish", new Date()));
        vo.addPet(new Cat("honey", new Date(), new Date()));

        //Testing getPet
        System.out.println(vo.getPet("Tom"));
        System.out.println(vo.getPet("Jerry"));
        System.out.println(vo.getPet("ruby"));
        System.out.println(vo.getPet("adhkja"));
        System.out.println(vo.getPet("goldy"));
        
        //Testing removePet
        System.out.println(vo.removePet("goldy"));
        System.out.println(vo.getPet("goldy"));

        //Testing listAll
        vo.listAll();
        //Testing listAll Dogs
        vo.listAll("Dog");

       //Testing listCatOwnersToRemind
        vo.listCatOwnersToRemind();
    }
}