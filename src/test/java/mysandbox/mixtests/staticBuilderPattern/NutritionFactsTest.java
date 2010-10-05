package mysandbox.mixtests.staticBuilderPattern;

import static org.junit.Assert.*;

import org.junit.Test;


public class NutritionFactsTest {
	
	@Test
	public void builderShouldGetAnInstance(){
		NutritionFacts nf = new NutritionFacts.Builder(2, 3).build();
		
		assertNotNull( nf );
	}

}
