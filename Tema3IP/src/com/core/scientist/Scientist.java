/**
 * 
 */
package com.core.scientist;

/**
 * @author Ilie Daniel
 * Created on 2/11/2014
 * 
 * This is the abstract scientist class
 */
public abstract class Scientist {
	
	/* The name of the scientist */
	String mName;
	
	/**
	 * This is the default constructor that initializes the scientist with the proposed name
	 * 
	 * @param name The name of the scientist
	 */
	public Scientist(String name) {
		this.mName=name;
	}
	
	/**
	 *  This method is implemented in the Scientist abstract class
	 *  
	 */
	public void greetEveryone() {
		
		if(this.getName()!=null)
			System.out.println("Hi, my name is "+this.getName() );
		else System.out.println("I can't teach because i don't have a name");
	}
	
	/**
     * This method must be overwritten by all the subclasses that inherit the Scientist class
     * </p>
     * A scientist must have over 1000 voters to win a prize
     * </p>
     *
     * @param votersNumber The number of voters for the scientist at the contest
     * @return <code>True</code> if the scientist won a prize,<code>False</code> if scientist hasn't won anything
     */
    public abstract boolean hadWonPrize(int votersNumber);

    /**
     * Sets the name of the scientists
     *
     * @param name The name of scientist
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Returns scientist's name
     *
     * @return String The name of the scientist
     */
    public String getName() {
        return this.mName;
    }
}
