package coffeemaker;

import static org.junit.Assert.*;
import coffeemaker.exceptions.InventoryException;
import coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;


public class RecipeBookTest extends TestCase {
	private RecipeBook recipeBook;
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	
	@Before
	public void setUp() throws Exception {
		recipeBook = new RecipeBook();
		recipe1 = new Recipe();
		recipe1.setName("Recipe1");
		recipe2 = new Recipe();
		recipe2.setName("Recipe2");
		recipe3 = new Recipe();
		recipe3.setName("Recipe3");
		recipe4 = new Recipe();
		recipe4.setName("Recipe4");
		recipe5 = new Recipe();
		recipe5.setName("Recipe5");
		super.setUp();
	}	

	@Test
	public void testGetRecipes() {
		int expectedRecipeLength = 4;
		assertEquals(recipeBook.getRecipes().length, expectedRecipeLength);
	}

	@Test
	public void testAddRecipeAlreadyExists1() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		
		assertEquals(recipeBook.addRecipe(recipe1), false);
	}
	@Test
	public void testAddRecipeAlreadyExists4() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		
		assertEquals(recipeBook.addRecipe(recipe4), false);
	}
	@Test
	public void testAddRecipe1() {
		assertEquals(recipeBook.addRecipe(recipe1), true);
	}
	@Test
	public void testAddRecipe4() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		assertEquals(recipeBook.addRecipe(recipe4), true);
	}
	@Test
	public void testAddRecipeListFull() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		
		assertEquals(recipeBook.addRecipe(recipe5), false);
	}
	
	@Test
	public void testAddRecipeFullListRecipeDeleted() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		recipeBook.deleteRecipe(0);
		
		assertEquals(recipeBook.addRecipe(recipe5), true);
	}

	@Test
	public void testDeleteRecipeDoesntExit1() {
		String noRecipie = null;
		assertEquals(recipeBook.deleteRecipe(0), noRecipie);
	}
	@Test
	public void testDeleteRecipeDoesntExit4() {
		assertEquals(recipeBook.deleteRecipe(3), null);
	}
	@Test
	public void testDeleteRecipe1() {
		recipeBook.addRecipe(recipe1);
		assertEquals(recipeBook.deleteRecipe(0), "Recipe1");
	}
	@Test
	public void testDeleteRecipe4() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		assertEquals(recipeBook.deleteRecipe(3), "Recipe4");
	}

	@Test
	public void testEditRecipeDoesntExist1() {
		assertEquals(recipeBook.editRecipe(0, recipe1), null);
	}
	@Test
	public void testEditRecipeDoesntExist4() {
		assertEquals(recipeBook.editRecipe(3, recipe4), null);
	}

	@Test
	public void testEditRecipe1() {
		recipeBook.addRecipe(recipe1);
		assertEquals(recipeBook.editRecipe(0, recipe1), "Recipe1");
	}
	@Test
	public void testEditRecipe4() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		assertEquals(recipeBook.editRecipe(3, recipe4), "Recipe4");
	}
	@Test
	public void testEditRecipeAddEdited() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.editRecipe(1, recipe3);
		assertEquals(recipeBook.deleteRecipe(1), "Recipe3");
	}

	@After
	public void tearDown() throws Exception {
		recipeBook.deleteRecipe(0);
		recipeBook.deleteRecipe(1);
		recipeBook.deleteRecipe(2);
		recipeBook.deleteRecipe(3);
		recipeBook = null;
		recipe1 = null;
		recipe2 = null;
		recipe3 = null;
		recipe4 = null;
		recipe5 = null;
		super.tearDown();
	}
}