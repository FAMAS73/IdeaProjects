import java.util.Objects;
import java.util.Random;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course © Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
//		High-Quality Video Tutorials: www.helloDrDan.com
//		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// Lesson Note:
// 		This class is consumed by Lesson_01_StarWarsUniverseClient_Basic_OOP & Lesson_02_StarWarsUniverseClient_Advanced_OOP.
//		This class encapsulates the Droid, which describes basic droid properties; it also inherits methods/variables
// 		from the GalacticID class.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Droid {

    ///////////////////////////////////////////////////////////////
    // Instance variables
    ///////////////////////////////////////////////////////////////
    private String name;
    private int mfgYear;
    private int mfgMonth;
    ///////////////////////////////////////////////////////////////
    // Default Constructor
    //		Parameters:
    //			NONE
    ///////////////////////////////////////////////////////////////

    public Droid() {
        name = "Basic Droid";
        mfgYear = 0;
        mfgMonth = 0;
    }

    ///////////////////////////////////////////////////////////////
    // Overloaded Constructor
    //		Parameters:
    //			pName - A String representing the droid's name
    //			mfgYear - An int representing the droid's manufacturing year
    //			mfgMonth - An int representing the droid's manufacturing year
    ///////////////////////////////////////////////////////////////

    public Droid(String pName, int pMfgYear, int pMfgMonth) {
       name = pName;
        mfgYear = pMfgYear;
        mfgMonth = pMfgMonth;
    }

    ///////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public int getMfgYear() {
        return mfgYear;
    }

    public int getMfgMonth() {
        return mfgMonth;
    }

    ///////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public void setMfgYear(int mfgYear) {
        this.mfgYear = mfgYear;
    }

    public void setMfgMonth(int mfgMonth) {
        this.mfgMonth = mfgMonth;
    }

    ///////////////////////////////////////////////////////////////
    // Override the toString method (from the object class)
    //		Parameters:
    //			NONE
    //		Returns:
    //			A String representing the object's (Droid's) properties
    ///////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        String ret = String.format("My human-supplied name is %s (%s): I was manufactured in %s/%s", name,getFormattedEmpireIdStr(),mfgMonth,mfgYear);
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

    @Override
    public boolean equals(Object o) {

        //if object o is not a humanoid then not equal
        if(!(o instanceof Droid)||o==null){//test if o is not an instance of Humanoid then return false
            return false;
        }
        //we do have a humanoid ; if this object has properties that do not match with other humanoid's properties, then not equal
        Droid otherDroid= (Droid) o;
        if(!(name.equals(otherDroid.name))||mfgMonth!=otherDroid.mfgMonth||mfgYear!=otherDroid.mfgYear){//if my name does not equal then it's not from the same properties
            return false;
        }
        //all properties are match
        return true;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mfgYear, mfgMonth);
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

        Random random=new Random();
        String eid=String.format("%s-%s-%08d",mfgYear,mfgMonth, random.nextInt(100000000));//at least 8 digits
        return eid;
    }
}
