public class Earth {
    public static void main(String[] args) {
        //define a variable from Human
        /*Human tom;//this is a variable
        //create a new object
        tom = new Human();//the actual object
        //give tom values
        tom.age=5;
        tom.eyeColor="brown";
        tom.heightInInches=72;
        tom.name="Tom Zsabo";
        //what to do with tom
        //make tom speak
        tom.speak();

        //Create a new variable and assign an object
        Human joe=new Human();

        joe.name="Joe Green";
        joe.age=36;
        joe.eyeColor="Green";
        joe.heightInInches=68;

        joe.speak();*/

        Human human1= new Human("Tom",25,76,"blue");
        Human human2= new Human("Joe",28,68,"green");


        human1.speak();
        human2.speak();

    }
}
