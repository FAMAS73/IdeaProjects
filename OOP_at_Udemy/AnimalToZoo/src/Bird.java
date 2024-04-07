public class Bird extends Animal{
    //define a similar constructor as animal class
    //some birds cannot fly
    //so we use interface Flyable
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("flapping wings...");
    }


   /* public void fly(){
        System.out.println("Flying...");
    }*/
}
