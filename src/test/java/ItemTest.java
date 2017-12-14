import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
	
	@Test
	public void shouldBeAbleToCreateAShoppingItem() {
		Item underTest = new Item("", 0,0);
		assertNotNull(underTest);
	}
	
//	@Test
//	public void assertThatGetQuantityReturnsOne() {
//		ShoppingItem underTest = new ShoppingItem("",0,1);
//		int check = underTest.getQuantity();
//		assertEquals(1, check);

}
