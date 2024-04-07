public class Pet {
    ///////////////
    private final String name;
    private final int age;

    ///////////////
    public Pet(String pname, int page) {
        name = pname;
        age = page;
    }

    ///////////////
    public String getPetName() {
        return name;
    }

    public int getPetAge() {
        return age;
    }
}
