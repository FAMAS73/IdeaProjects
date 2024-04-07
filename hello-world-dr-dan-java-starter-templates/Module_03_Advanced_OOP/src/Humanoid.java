import java.util.Random;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
//		High-Quality Video Tutorials: www.helloDrDan.com
//		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// Lesson Note:
// 		This class is consumed by Lesson_01_StarWarsUniverseClient_Basic_OOP & Lesson_02_StarWarsUniverseClient_Advanced_OOP.
//		This class encapsulates the Humanoid, which describes basic human properties; it also inherits methods/variables
// 		from the GalacticID class.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Humanoid {

    ///////////////////////////////////////////////////////////////
    // Instance variables
    ///////////////////////////////////////////////////////////////
    private String name;
    private String homeWorld;
    private String attack;
    private String defense;
    private Droid droid;

    ///////////////////////////////////////////////////////////////
    // Default Constructor
    //		Parameters:
    //			NONE
    ///////////////////////////////////////////////////////////////
    //when it comes into existence what it should be call
    public Humanoid(){
        name="No Name";
        homeWorld="Earth";
        attack= "Arm Swing";
        defense="Cry";
        droid=null;

    }
    ///////////////////////////////////////////////////////////////
    // Overloaded Constructor - take in parameter
    //		Parameters:
    //			pName - A String representing the humanoid's name
    //			pHomeWorld - A String representing the humanoid's homeworld
    //			pAttack - A String representing the humanoid's default attack
    //			pDefense - A String representing the humanoid's default defense
    //			pRobot - A Robot that the humanoid owns
    ///////////////////////////////////////////////////////////////
    public Humanoid(String pName, String pHomeWorld, String pAttack, String pDefense,Droid pDroid){
        name=pName;
        homeWorld=pHomeWorld;
        attack= pAttack;
        defense=pDefense;
        droid=pDroid;

    }
    public Humanoid(String pName, String pHomeWorld, String pAttack, String pDefense){
        name=pName;
        homeWorld=pHomeWorld;
        attack= pAttack;
        defense=pDefense;
        droid=null;

    }

    ///////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////
    public String getName(){

        return name;//can be changed to return anything or how to respond back within same parameter
    }
    public String getHomeWorld(){
        return homeWorld;
    }
    public String getAttack(){
        return attack;
    }
    public String getDefense(){
        return defense;
    }
    public Droid getDroid(){return droid;}
    ///////////////////////////////////////////////////////////////
    // Setters/set it to something or modify it
    ///////////////////////////////////////////////////////////////
    public void setName(String pName){
        name=pName.isBlank()?"No Name":pName;
    }
    public void setHomeWorld(String pHomeWorld){
        homeWorld=pHomeWorld;
    }
    public void setAttack(String pAttack){
        attack=pAttack;
    }
    public void setDefense(String pDefense){
        defense=pDefense;
    }
    public void setDroid(Droid pDroid){ droid=pDroid;}
    ///////////////////////////////////////////////////////////////
    // Override the toString method (from the object class)
    //		Parameters:
    //			NONE
    //		Returns:
    //			A String representing the object's (Humanoid's) properties
    ///////////////////////////////////////////////////////////////
        //System.out.println(drDan.toString());
            //Run: Humanoid@2f4d3709
    public String toString(){
        String droidStr=droid==null?"":String.format(" owns a droid (%s),",droid.getName());//IF DROID IS NULL PASS IN EMPTY STRING
        String ret=String.format("%s (%s), from %s,%s has an attack of %s and defense of %s.",name,getFormattedEmpireIdStr(),homeWorld,droidStr,attack,defense);
        return ret;
    }

    ///////////////////////////////////////////////////////////////
    // Override the equals method (from the object class)
    //		Parameters:
    //			An object to compare with THIS object
    //		Returns:
    //			A boolean that is true if this object's variables
    //			have the same values/properties as Object o
    ///////////////////////////////////////////////////////////////
    public boolean equals(Object o){
        //if object o is not a humanoid then not equal
        if(!(o instanceof Humanoid)){//test if o is not an instance of Humanoid then return false
            return false;
        }
        //we do have a humanoid ; if this object has properties that do not match with other humanoid's properties, then not equal
        Humanoid otherHumanoid= (Humanoid) o;
        if(!(name.equals(otherHumanoid.name))
                ||!(homeWorld.equals(otherHumanoid.homeWorld))
                ||!(attack.equals(otherHumanoid.attack))
                ||!(defense.equals(otherHumanoid.defense))
                ||!droid.equals(otherHumanoid.droid)){//if my name does not equal then it's not from the same properties
            return false;
        }
        //all properties are match
        return true;
    }
    ///////////////////////////////////////////////////////////////
    // This method describes the attack, generates a random outcome
    // and then describes the result (who won).
    //		Parameters:
    //			enemy - A Humanoid instance to fight
    //		Returns:
    //			A String representing a narrative/story of the fight
    ///////////////////////////////////////////////////////////////
    public String attack(Humanoid enemy) {
        //generate attacck
        String story = String.format("%s attacks %s with a %s attack", name, enemy.name, attack);
        //return story;
        //determine randomly who won
        Random randy = new Random();
        boolean iWin = randy.nextBoolean();
        //generate defense and winner story
        if (iWin) {
            story += String.format(" and it was too great for %s's %s defense.", enemy.name, enemy.defense);
        } else {
            story += String.format(" but it was not strong enough to overpower %s's %s defense.", enemy.name, enemy.defense);
        }
        // return "letsss get ready to rummble";
        //return story;
        String finalSummary = String.format("\tRESULT:%s %s\n", name, iWin ? "WINs" : "LOSES");
        finalSummary+=String.format("\tSUMMARY: %s",story);
        return finalSummary;
    }
        ///////////////////////////////////////////////////////////////
    // This method provides an implementation for the abstract
    // method it is overriding. It provides an empire id based
    // on the homeworld and galactic id
    //		Parameters:
    //			NONE
    //		Returns:
    //			A String representing a formatted empire id
    ///////////////////////////////////////////////////////////////
    private String getFormattedEmpireIdStr(){

        int hwLen=Math.min(homeWorld.length(),3);//account for 2-3
        Random random=new Random();
        String hw = homeWorld.substring(0,hwLen).toUpperCase();
        String eid=String.format("%s-%08d",hw, random.nextInt(100000000));//at least 8 digits
        return eid;
    }


}