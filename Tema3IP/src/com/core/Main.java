
package com.core;
import com.core.exceptions.TeachException;
import com.core.interfaces.ITeacher;
import com.core.scientist.BiologyScientist;
import com.core.scientist.PhysicsScientist;
import com.core.scientist.Scientist;

/**
 * @author Ilie Daniel
 * Created on 2/11/2014
 * </p>
 * This is the main class of the project.The program starts here.
 * </p>
 */
public class Main {

	/**
	 * The program starts in this function
	 * 
	 * @param args The parameters of the executable
	 */
	public static void main(String[] args) {
		
		ITeacher teachingScientist = new BiologyScientist("Margaret");
		Scientist physicsScientist = new PhysicsScientist("Einstein");
		BiologyScientist biologyScientst = new BiologyScientist(null);
		Scientist normalScientist = new BiologyScientist(null);
		
		try {
			teachingScientist.teach();
		} catch(TeachException e) {
			System.out.println("Exception while teaching "+ e.getMessage());
		}
		
		try {
	        ((ITeacher) physicsScientist).teach();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    try {
	    	((ITeacher)biologyScientst).teach();
        } catch (TeachException e) {
	        System.out.println("Exception while signing: " + e.hashCode());
	    }

	    biologyScientst.setName("Dr Eisenhower");
	    System.out.println("Is "+biologyScientst.getName()+" a phd ?\n" + (biologyScientst.hasPhd() ? "Yes!" : "No!"));

	    ((BiologyScientist) normalScientist).teach();

	        
	     // The implementation of setName from the MilitaryStudent class is called
	     normalScientist.setName("Dr John");
	     System.out.println("Is John a phd ?\n" + (((BiologyScientist) normalScientist).hasPhd() ? "Yes!" : "No!"));
	     ((BiologyScientist) normalScientist).greetEveryone();
	     ((BiologyScientist)normalScientist).research();
	     
	     BiologyScientist biologyScientist2 = new BiologyScientist("Bill","Asistant");
	     biologyScientist2.greetEveryone();
	}

}
