
package com.core.interfaces;
import com.core.exceptions.TeachException;

/**
 * @author Ilie Daniel
 * Created on 2/11/2014
 * This is the interface of all the scientists that have the possibility to teach
 */
public interface ITeacher {
	
	/**
	 * This is the teaching method
	 * 
	 * @throws TeachException
	 * @return This method returns void
	 */
	public void teach() throws TeachException;
	
	public void research() throws TeachException;
}
