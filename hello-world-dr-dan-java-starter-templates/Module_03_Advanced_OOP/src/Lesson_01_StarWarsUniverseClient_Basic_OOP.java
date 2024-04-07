import java.util.ArrayList;
import java.util.Random;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
//		1) Basic object-oriented functionality
//			a) Class creation from scratch
//				i) Instance variables
//					a) Primitive data types
//					b) Object (custom class) data types
//				ii) Access modifiers
//				iii) Constructors (default, overloaded)
//				iv) Getters/Setters
//				v) Overriding methods
//					a) toString() method
//					b) equals() method
//				vi) Custom/Class methods
//			b) Class creation using from Eclipse helpers
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Lesson_01_StarWarsUniverseClient_Basic_OOP {

    ///////////////////////////////////////////////////////////////
    // MAIN - Entry point where code will begin execution for file
    ///////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Simple welcome statements printed to screen
        System.out.println("Program Objective: Learn basic object oriented programming concepts.");
        System.out.println("===========================================================================");

        // Create a number of humanoids(object)
        Humanoid luca=new Humanoid("Luca Skyscraper","Tatooine", "Rock-Paper-Scissors","Force Projection");
        Humanoid babyYoda=new Humanoid("Baby Yoda", "Dagobah","Force Choke","Cuteness");
        Humanoid mace=new Humanoid("Mace Windu","Xi","Purple Saber Slash", "Run!!");
        Humanoid kenobe=new Humanoid("Kenobe Bryant","Lala Land","Slam Dunk Yo' Head", "Smack Down Block", new Droid("C-3PO",3045,6));


        // Create a new droid and add it to
        Droid r2d2=new Droid("R2-D2", 3088,1);
        babyYoda.setDroid(r2d2);
        /* Droid gDroid =new Droid();
        System.out.println(r2d2);
        System.out.println(gDroid);*/


        // Add each person to an ArrayList to be processed
        ArrayList<Humanoid> empireDMV=new ArrayList<Humanoid>();
        empireDMV.add(luca);
        empireDMV.add(babyYoda);
        empireDMV.add(mace);
        empireDMV.add(kenobe);
        // Processes everyone in the empire DMV line
        System.out.println("Welcome to the empire DMV");
        for(int i=0;i<empireDMV.size();i++){//loop through array
            Humanoid unhappyCustomer=empireDMV.get(i);
            processDmvCustomer(unhappyCustomer, (i+1));
            System.out.println();

        }
        // Pick two random customers from the line
        Random randy=new Random();
        Humanoid unhappyCust1=empireDMV.get(randy.nextInt(empireDMV.size()));//0-empireDMV size
        Humanoid unhappyCust2=empireDMV.get(randy.nextInt(empireDMV.size()));//0-empireDMV size
        while (unhappyCust1==unhappyCust2){
            unhappyCust2=empireDMV.get(randy.nextInt(empireDMV.size()));//0-empireDMV size
        }
        // Customers are so unhappy with their DMV experience, they get into a fight
        System.out.printf("%s is so disgruntled by his/her DMV experience that he/she decides to fight %s:\n",unhappyCust1.getName(),unhappyCust2.getName());
        System.out.println(unhappyCust1.attack(unhappyCust2));
    }



    ///////////////////////////////////////////////////////////////
    // This method describes an interaction between the DMV and the
    // humanoid passed into the method. All interactions are printed
    // to the console.
    //		Parameters:
    //			h - A Humanoid to be processed
    //			placeInLine - The humanoid's (h's) place in line
    //		Returns:
    //			void (nothing)
    ///////////////////////////////////////////////////////////////
    private static void processDmvCustomer(Humanoid h, int placeInLine) {
        //print initial interaction between dmv and humanoid
        System.out.printf("\tCustomer %s Interaction:\n", placeInLine);
        System.out.printf("\t\tDMV: Please identify yourself...\n");
        System.out.printf("\t\t%s: %s\n",h.getName(),h);
        System.out.println("\t\tDMV: Please identify the droid you wish to register to drive your landspeeder.");
        //print end of interaction based on if humanoid has a droid
        if(h.getDroid()!=null){
            System.out.printf("\t\t\t%s: %s, please identify yourself.\n",h.getDroid(),h.getDroid().getName());
            System.out.printf("\t\t\t\t%s: %s\n",h.getDroid().getName(),h.getDroid());
            System.out.printf("\t\tDMV: Registration for %s DENIED due to insufficient documentation.",h.getDroid().getName());
        }else{//no droid
            System.out.printf("\t\t\t%s: what?!? I need a droid to be here?!?\n",h.getName());
            System.out.println("\t\tDMV: Goodbye.");
        }
    }
}
   /* // Create a number of humanoids
    //declare new object with variable name
    Humanoid gp1 = new Humanoid();
    Humanoid gp2 = new Humanoid();
        System.out.printf("%s has an attack of %s\n",gp1.getName(), gp1.getAttack());

                Humanoid drDan = new Humanoid("Dr. Dan", "Planet Earth", "Keyboard Smack Down", "Keyboard Shield");
                System.out.printf("%s has an attack of %s\n",drDan.getName(),drDan.getAttack());
                //drDan.getName()="Dan";//change name or modify something
                drDan.setName("Dan");
                System.out.printf("%s has an attack of %s\n",drDan.getName(),drDan.getAttack());

        *//*System.out.println(genericPerson1.toString());
        System.out.println(drDan.toString());*//*
                //System.out.println(drDan);
                System.out.println("Before name change");
                System.out.println(gp1);
                System.out.println(gp2);
                System.out.println("genericPerson1 == genericPerson2 ==> "+(gp1==gp2));//same properties but difference object return false
                System.out.println("genericPerson1.equals(genericPerson2) ==> "+(gp1.equals(gp2)));

                System.out.println("After name change");
                gp1.setName("Johny");
                System.out.println(gp1);
                System.out.println(gp2);
                System.out.println("genericPerson1 == genericPerson2 ==> "+(gp1==gp2));//same properties but difference object return false
                System.out.println("genericPerson1.equals(genericPerson2) ==> "+(gp1.equals(gp2)));

                String s1 = new String("dan");
                String s2 = new String("dan");
                System.out.println("s1 == s2 ==> "+(s1==s2));//these are not equal of the same object
                System.out.println("s1.equals(s2) ==> "+s1.equals(s2));//these are equal properties*/
