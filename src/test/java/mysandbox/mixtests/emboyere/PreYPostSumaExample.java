package mysandbox.mixtests.emboyere;

import static org.junit.Assert.*;

import org.junit.Test;

public class PreYPostSumaExample {

	@Test
	public void preResta(){
		int size = 5;
		
		String[] array = new String[]{"cero", "uno", "dos", "tres", "cuatro"};
		
		assertTrue(array.length == 5);
		
		size = 3;
		
		assertFalse(array[size--].equals("dos"));
		
		assertTrue(size == 2);
	}
	
	@Test
	public void preSuma(){
		
		int size = 5;
		
		String[] array = new String[]{"cero", "uno", "dos", "tres", "cuatro"};
		
		assertTrue(array.length == 5);
		
		size = 3;
				
		assertTrue(array[--size].equals("dos"));
		
		assertTrue(size == 2);
	}
	
	@Test
	public void preSumaAnidada(){
		
		int firstInt = 5;
		int secondInt = 2;
		
		int total = --firstInt + ++secondInt;
		
		assertTrue(total == 7);
	}
	

}
