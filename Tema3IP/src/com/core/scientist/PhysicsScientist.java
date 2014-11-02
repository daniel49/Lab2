/**
 * 
 */
package com.core.scientist;

import com.core.interfaces.ITeacher;

/**
 * This is the class for scientists in the physics domain
 * 
 * @author Ilie Daniel
 * Created on 2/11/2014
 */
public class PhysicsScientist extends Scientist implements ITeacher {
	
	public PhysicsScientist(String name) {
		super(name);
	}
	
	@Override
	public void teach() {
		
		if(this.getName()==null) {
			System.out.println("Invalid scientist name. Cannot teach if the students dont know the professor's name");
			return;
		}
		
		System.out.println(this.getName()+" is teaching physics today");
	}
	
	@Override
	public void research() {
		
		System.out.println("Physicists are always researching!");
		
	}
	
	@Override
	public boolean hadWonPrize(int votersNumber) {
		
		if(votersNumber>1000)
			return true;
		else return false;
		
	}
}
