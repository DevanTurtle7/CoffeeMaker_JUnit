package coffeemaker;
import org.junit.*;
import org.junit.Assert.*;
import junit.framework.TestCase;
import coffeemaker.exceptions.InventoryException;
import coffeemaker.exceptions.RecipeException;

public class InventoryTest {
	public Inventory inventory;
	public Recipe recipe;
	
	@Before
	public void setup () throws RecipeException {
		inventory = new Inventory();
		recipe = new Recipe();
		recipe.setAmtCoffee("5");
		recipe.setAmtChocolate("2");
		recipe.setAmtSugar("3");
		recipe.setAmtMilk("4");
	}
	
	@Test
	public void getChocolateTest () {
		Assert.assertEquals(inventory.getChocolate(), 15);
	}
	
	@Test
	public void setChocolateTest() {
		inventory.setChocolate(7);
		Assert.assertEquals(inventory.getChocolate(), 7);
	}
	
	@Test
	public void setChocolateNegativeTest() {
		inventory.setChocolate(-5);
		Assert.assertEquals(inventory.getChocolate(), 15);
	}
	
	@Test
	public void addChocolateTest() {
		try {
			inventory.addChocolate("10");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getChocolate(), 25);
	}
	
	@Test
	public void addChocolateZeroTest() {
		try {
			inventory.addChocolate("0");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getChocolate(), 15);
	}
	
	@Test
	public void addChocolateFloatTest() {
		try {
			inventory.addChocolate("10.5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getChocolate(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addChocolateNonIntTest() {
		try {
			inventory.addChocolate("string");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getChocolate(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addChocolateNegativeTest() {
		try {
			inventory.addChocolate("-5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getChocolate(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}

	
	@Test
	public void getCoffeeTest () {
		Assert.assertEquals(inventory.getCoffee(), 15);
	}
	
	@Test
	public void setCoffeeTest() {
		inventory.setCoffee(7);
		Assert.assertEquals(inventory.getCoffee(), 7);
	}
	
	@Test
	public void setCoffeeNegativeTest() {
		inventory.setCoffee(-5);
		Assert.assertEquals(inventory.getCoffee(), 15);
	}
	
	@Test
	public void addCoffeeTest() {
		try {
			inventory.addCoffee("10");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getCoffee(), 25);
	}
	
	@Test
	public void addCoffeeZeroTest() {
		try {
			inventory.addCoffee("0");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getCoffee(), 15);
	}
	
	@Test
	public void addCoffeeFloatTest() {
		try {
			inventory.addCoffee("10.5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getCoffee(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addCoffeeNonIntTest() {
		try {
			inventory.addCoffee("string");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getCoffee(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addCoffeeNegativeTest() {
		try {
			inventory.addCoffee("-5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getCoffee(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void getMilkTest () {
		Assert.assertEquals(inventory.getMilk(), 15);
	}
	
	@Test
	public void setMilkTest () {
		inventory.setMilk(7);
		Assert.assertEquals(inventory.getMilk(), 7);
	}
	
	@Test
	public void setMilkNegativeTest() {
		inventory.setMilk(-5);
		Assert.assertEquals(inventory.getMilk(), 15);
	}
	
	@Test
	public void addMilkTest() {
		try {
			inventory.addMilk("10");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getMilk(), 25);
	}
	
	@Test
	public void addMilkZeroTest() {
		try {
			inventory.addMilk("0");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getMilk(), 15);
	}
	
	@Test
	public void addMilkFloatTest() {
		try {
			inventory.addMilk("10.5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getMilk(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addMilkNonIntTest() {
		try {
			inventory.addMilk("string");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getMilk(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addMilkNegativeTest() {
		try {
			inventory.addMilk("-5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getMilk(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void getSugarTest() {
		Assert.assertEquals(inventory.getSugar(), 15);
	}
	
	@Test
	public void setSugarTest() {
		inventory.setSugar(7);
		Assert.assertEquals(inventory.getSugar(), 7);
	}
	
	@Test
	public void setSugarNegativeTest() {
		inventory.setSugar(-5);
		Assert.assertEquals(inventory.getSugar(), 15);
	}
	
	@Test
	public void addSugarTest() {
		try {
			inventory.addSugar("10");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getSugar(), 25);
	}
	
	@Test
	public void addSugarZeroTest() {
		try {
			inventory.addSugar("0");
		} catch (InventoryException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertEquals(inventory.getSugar(), 15);
	}
	
	@Test
	public void addSugarFloatTest() {
		try {
			inventory.addSugar("10.5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getSugar(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addSugarNonIntTest() {
		try {
			inventory.addSugar("string");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getSugar(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void addSugarNegativeTest() {
		try {
			inventory.addSugar("-5");
		} catch (InventoryException ex) {
			Assert.assertEquals(inventory.getSugar(), 15);
			return;
		};
		Assert.fail("Should fail to parse string as int");
	}
	
	@Test
	public void enoughIngredientsCoffeeLessTest() {
		try {
			recipe.setAmtCoffee("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertFalse(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsCoffeeMoreTest() {
		try {
			recipe.setAmtCoffee("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		inventory.setCoffee(151);
		Assert.assertTrue(inventory.enoughIngredients(recipe));
	}

	
	@Test
	public void enoughIngredientsMilkLessTest() {
		try {
			recipe.setAmtMilk("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertFalse(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsMilkMoreTest() {
		try {
			recipe.setAmtMilk("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		inventory.setMilk(151);
		Assert.assertTrue(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsSugarLessTest() {
		try {
			recipe.setAmtSugar("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertFalse(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsSugarMoreTest() {
		try {
			recipe.setAmtSugar("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		inventory.setSugar(151);
		Assert.assertTrue(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsChocolateLessTest() {
		try {
			recipe.setAmtChocolate("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		Assert.assertFalse(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void enoughIngredientsChocolateMoreTest() {
		try {
			recipe.setAmtChocolate("150");
		} catch (RecipeException ex) {
			Assert.fail("Should parse int");
		};
		inventory.setChocolate(151);
		Assert.assertTrue(inventory.enoughIngredients(recipe));
	}
	
	@Test
	public void useIngredientsTest() {
		Assert.assertTrue(inventory.useIngredients(recipe));
	}
	
	@Test
	public void useIngredientsCoffeeTest() {
		inventory.useIngredients(recipe);
		Assert.assertEquals(10, inventory.getCoffee());
	}
	
	@Test
	public void useIngredientsLowCoffeeTest() {
		inventory.setCoffee(1);
		Assert.assertEquals(false, inventory.useIngredients(recipe));
	}
	
	@Test
	public void useIngredientsMilkTest() {
		inventory.useIngredients(recipe);
		Assert.assertEquals(11, inventory.getMilk());
	}
	
	@Test
	public void useIngredientsLowMilkTest() {
		inventory.setMilk(1);
		Assert.assertEquals(false, inventory.useIngredients(recipe));
	}
	
	@Test
	public void useIngredientsSugarTest() {
		inventory.useIngredients(recipe);
		Assert.assertEquals(12, inventory.getSugar());
	}
	
	@Test
	public void useIngredientsLowSugarTest() {
		inventory.setSugar(1);
		Assert.assertEquals(false, inventory.useIngredients(recipe));
	}
	
	@Test
	public void useIngredientsChocolateTest() {
		inventory.useIngredients(recipe);
		Assert.assertEquals(13, inventory.getChocolate());
	}
	
	@Test
	public void useIngredientsLowChocolateTest() {
		inventory.setChocolate(1);
		Assert.assertEquals(false, inventory.useIngredients(recipe));
	}
	
	@Test
	public void toStringTest() {
		String str = inventory.toString();
		String buf = "Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n";
		Assert.assertEquals(buf, str);
	}
	
	@After
	public void tearDown() throws Exception {
		inventory = null;
		recipe = null;
	}
	
	
	
}