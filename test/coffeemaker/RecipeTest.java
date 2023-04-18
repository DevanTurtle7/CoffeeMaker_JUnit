package coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	private Recipe recipe;
	private Recipe other;

	@Before
	public void setUp() throws Exception {
		recipe = new Recipe();
		recipe.setPrice("100");
		recipe.setAmtCoffee("50");
		recipe.setAmtMilk("10");
		recipe.setAmtSugar("45");
		recipe.setAmtChocolate("12");
		recipe.setName("My recipe");
		

		other = new Recipe();
		other.setPrice("41");
		other.setAmtCoffee("574");
		other.setAmtMilk("48");
		other.setAmtSugar("4");
		other.setAmtChocolate("856");
		other.setName("My other recipe");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetPrice() {
		assertEquals(100, recipe.getPrice());
	}
	
	@Test
	public void testGetAmtCoffee() {
		assertEquals(50, recipe.getAmtCoffee());
	}
	
	@Test
	public void testGetAmtMilk() {
		assertEquals(10, recipe.getAmtMilk());
	}
	
	@Test
	public void testGetAmtSugar() {
		assertEquals(45, recipe.getAmtSugar());
	}
	
	@Test
	public void testGetAmtChocolate() {
		assertEquals(12, recipe.getAmtChocolate());
	}
	
	@Test
	public void testGetName() {
		assertEquals("My recipe", recipe.getName());
	}
	
	@Test
	public void testToString() {
		String toString = recipe.toString();
		
		assertEquals("My recipe", toString);
	}
	
	@Test
	public void testSetPrice() {
		try {
			recipe.setPrice("321");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals(321, recipe.getPrice());
	}
	
	@Test
	public void testSetAmtCoffee() {
		try {
			recipe.setAmtCoffee("50");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals(50, recipe.getAmtCoffee());
	}
	
	@Test
	public void testSetAmtMilk() {
		try {
			recipe.setAmtMilk("21");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals(21, recipe.getAmtMilk());
	}
	
	@Test
	public void testSetAmtSugar() {
		try {
			recipe.setAmtSugar("13");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals(13, recipe.getAmtSugar());;
	}
	
	@Test
	public void testSetAmtChocolate() {
		try {
			recipe.setAmtChocolate("300");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals(300, recipe.getAmtChocolate());
	}
	
	@Test
	public void testSetName() {
		try {
			recipe.setName("New and improved recipe");
		} catch (Exception e) {
			fail("Caught exception");
		}
		
		assertEquals("New and improved recipe", recipe.getName());
	
	}
	
	@Test
	public void testSetPriceInvalid() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setPrice("$500");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtCoffeeInvalid() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtCoffee("abcdefg");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtMilkInvalid() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtMilk("Milk");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtSugarInvalid() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtSugar("Invalid!");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtChocolateInvalid() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtChocolate("String");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetPriceNegative() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setPrice("-4");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtCoffeeNegative() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtCoffee("-16");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtMilkNegative() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtMilk("-90");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtSugarNegative() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtSugar("-123");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtChocolateNegative() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtChocolate("-56");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetPriceFloat() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setPrice("5.3");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtCoffeeFloat() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtCoffee("3.0");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtMilkFloat() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtMilk("6.00");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtSugarFloat() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtSugar("3.2");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testSetAmtChocolateFloat() {
		boolean exceptionCaught = false;
		
		try {
			recipe.setAmtChocolate("6.7");
			fail("Did not catch exception");
		} catch (Exception e) {
			exceptionCaught = true;
		}
		
		assertTrue(exceptionCaught);
	}
	
	@Test
	public void testHashCode() {
		int hashCode = recipe.hashCode();
		
		assertEquals(387012225, hashCode);	
	}
	
	@Test
	public void testHashCodeUnique() {	
		assertNotEquals(recipe.hashCode(), other.hashCode());
	}
	
	@Test
	public void testEquals() {
		Recipe clone = new Recipe();
		
		try {
			clone.setPrice("100");
			clone.setAmtCoffee("50");
			clone.setAmtMilk("10");
			clone.setAmtSugar("45");
			clone.setAmtChocolate("12");
			clone.setName("My recipe");
			
			assertTrue(recipe.equals(clone));
		} catch (Exception e) {
			fail("Caught exception");
		}
	}
	
	@Test
	public void testEqualItself() {
		assertTrue(recipe.equals(recipe));
	}
	
	@Test
	public void testEqualNull() {
		assertFalse(recipe.equals(null));
	}
	
	@Test
	public void testEqualDifferentClass() {
		RecipeBook book = new RecipeBook();
		assertFalse(recipe.equals(book));
	}
	
	@Test
	public void testEqualsFalse() {
		assertFalse(recipe.equals(other));
	}
}
