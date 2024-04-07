import java.util.ArrayList;

public class PetApp {
    public static void main(String[] args) {
        //set add remove size
        ArrayList<Pet> PetList = new ArrayList<Pet>();
        Pet p_print;
        Pet pet1 = new Pet("Tom", 10);
        Pet pet2 = new Pet("Jerry", 5);
        Pet pet3 = new Pet("Jackie", 14);
        PetList.add(pet1);
        PetList.add(pet2);
        //petList.add(pet3);
        p_print = PetList.get(0);
        showPetList(pet1);
        p_print = PetList.get(1);
        showPetList(p_print);

        PetList.set(1, pet3);
        p_print = PetList.get(0);
        showPetList(pet1);
        p_print = PetList.get(1);
        showPetList(p_print);
    }

    public static void showPetList(Pet Apet) {
        String pn;
        int pa;
        pn = Apet.getPetName();
        pa = Apet.getPetAge();
        System.out.println(pn + " " + pa);
    }
}