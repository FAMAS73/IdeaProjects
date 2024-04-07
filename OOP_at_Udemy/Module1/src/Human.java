public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //provide a way to construct object
    /*public Human(){
        //create an object
        age=5;
        eyeColor="brown";
        heightInInches=72;
        name="Tom Zsabo";
    }*/

    public Human(String name, int age, int heightInInches, String eyeColor) {
        //this keyword
        //
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is "+name);
        System.out.println("sout+tab to println");
        System.out.println("I am "+heightInInches+" inches tall");
        System.out.println("I am "+age+" years old");
        System.out.println("My eye color is "+eyeColor);
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void walk(){
        System.out.println("walking...");
    }
    public void work(){
        System.out.println("working...");
    }
}
