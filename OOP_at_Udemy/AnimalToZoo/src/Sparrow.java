public class Sparrow extends Bird implements Flyable{
    //Sparrow inherit behaviour from Bird class
    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
//chicken cannot fly but Sparrow can
    //it can call fly method
    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
