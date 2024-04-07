public class Chicken extends Bird{
    //Abstract
    //Chicken inherit Bird behaviour
    //Chicken cannot fly

    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    //overriding the method cause Chicken can't fly
    //overide=replace
    /*public void fly(){
        System.out.println("not able to fly...");

    }*/
    //chicken cannot  fly ,so it cannot call fly method or implements Flyable interface
}
