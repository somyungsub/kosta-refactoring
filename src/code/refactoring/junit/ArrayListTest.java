package code.refactoring.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/*
 * 테스트 메서드 명 = 클래스명+Test+메서드명
 * Ex) AB 클래스 add -> ABTestAdd
 */
public class ArrayListTest {
	ArrayList<String> arrayList = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {
        for (int i=0; i<3; i++)
            arrayList.add("" + i);
	}

	@Test
    public void testAdd() {
        assertEquals(arrayList.size(), 3);
        arrayList.add(1, "Insert");
        assertEquals(arrayList.size(), 4);
        assertEquals(arrayList.get(1), "Insert");
    }
	
	@Test
    public void testSet() {
		arrayList.set(1, "Replace");
		assertEquals(arrayList.size(), 3);
		assertEquals(arrayList.get(1), "Replace");
    }
    
	@Test
    public void testRemove() {
		arrayList.remove(1);
		assertEquals(arrayList.size(), 2);
		compare(arrayList, new String[] {"0", "2"});
    }
	
	@Test
    public void testAddAll() {
        fail("Not yet implemented");
    }
    
    @SuppressWarnings("unused")
	private void compare(ArrayList<String> lst, String[] strs) {
        Object[] array = lst.toArray();
        assertTrue("Arrays not the same length", array.length == strs.length);
        for (int i = 0; i < array.length; i++)
          assertEquals(strs[i], (String) array[i]);
    }


}
