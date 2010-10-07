package mysandbox.mixtests.emboyere;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class HashMapTest {

	@SuppressWarnings("unchecked")
	@Test
	public void objectCreation(){
		Map hashMap = new HashMap();
		
		int i = 1;
		
		hashMap.put( 1, "valor1" );
		
		Integer i2 = new Integer( 2 );
		
		hashMap.put( i2, "valor2" );
		
		assertEquals( hashMap.get(i2), "valor2" );
		
		ArrayList<String> alStrings = new ArrayList<String>();
		
		//-- ArrayList as key
		alStrings.add("valor para clave");
		hashMap.put( alStrings, "valor3" );
		assertEquals("valor3", hashMap.get(alStrings)); //works!!	
		
		//-- ArrayList as key 2
		alStrings.add("valor 2 para clave");
		hashMap.put(alStrings, "valor4");
		assertEquals("valor4", hashMap.get(alStrings));
		
		//-- How get "valor3" again?
		alStrings.remove(1);
		assertEquals("valor3", hashMap.get(alStrings));
		
				
	}
}
