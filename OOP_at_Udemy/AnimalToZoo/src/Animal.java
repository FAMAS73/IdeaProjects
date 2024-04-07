public abstract class Animal {
    int age;
    String gender;
    int weightInLbs;
    //inheritance is one class inherit behaviour from another class
    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public abstract void move();

}
