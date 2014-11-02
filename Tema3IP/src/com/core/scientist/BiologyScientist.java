/**
 * 
 */
package com.core.scientist;
import com.core.interfaces.ITeacher;

/**
 * This is the class for scientists in the biology domain
 * 
 * @author Ilie Daniel
 * Created on 2/11/2014
 */
public class BiologyScientist extends Scientist implements ITeacher {
	
	private boolean hasPhd = false;
	
	public BiologyScientist(String name) {
		super(name);
		checkIfPhd();
	}
	
	public BiologyScientist(String name,String professorGrade) {
		
		super(professorGrade+" "+name);
		checkIfPhd();
	}
	
	@Override
	public void teach() {
		
		if(this.getName()==null) {
			System.out.println("Invalid scientist name. Cannot teach if the students dont know the professor's name");
			return;
		}
		
		System.out.println(this.getName()+" is teaching biology today...boring");
	}
	
	
	/**
	 * It's easier to get a prize in biology than in physics
	 */
	@Override
	public boolean hadWonPrize(int votersNumber) {
		
		if(votersNumber>500)
			return true;
		else return false;
		
	}
	
	@Override
	public void research() {
		
		if (hasPhd()==true)
			System.out.println("I have a phd, i can research");
		else System.out.println("I can't research because i don't have a phd");
		
	}
	
	@Override
	public void setName(String name) {
		
		super.setName(name);
		checkIfPhd();
	}
	
	
	public boolean hasPhd() {
		return hasPhd;
	}
	
	private void checkIfPhd() {
		
		hasPhd = getName() != null && getName().startsWith("Dr");
	}
}
