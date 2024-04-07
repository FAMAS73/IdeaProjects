//OOP give you better code organization
public class Zoo {
    //main entry point for program to start
    public static void main(String[] args) {
      /*  //variable type is Animal
        Animal animal1=new Animal(12,"M",23);
        animal1.eat();//execute method from class

        Bird bird1=new Bird(3,"F",10);//point the variable(bird1) to object(Bird on ram)
        //then ask the object to do things
        //method from bird class
        bird1.fly();
        //bird1 can use method from animal class by using extends
        bird1.eat();
        bird1.sleep();*//*

        Chicken  chicken1=new Chicken(1,"m",7);
        //chicken1.fly();
        chicken1.eat();
        chicken1.sleep();*/
       /* Sparrow sparrow1=new Sparrow(1,"m",4);
        //sparrow1.fly();//eat and sleep can be called also
       //sparrow1.move();
        Fish fish1=new Fish(1,"m",2);
        //fish1.move();

        moveAnimal(fish1);

        moveAnimal(sparrow1);*/

        Flyable flyingBird=new Sparrow(1,"m",4);
        //flyingBird.fly();
        //Flyable flyingBird2=new Bird(1,"m",3);//bird cannot use flyable
    }
    /*public static void moveAnimal(Animal animal){
        animal.move();
    }*/
}
