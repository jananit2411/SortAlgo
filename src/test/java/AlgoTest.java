package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

/**
 * @author Janani Thiagarajan
 * Test cases for SortAlgos.java class
 * 
 */
public class AlgoTest {
	Item [] data = new Item[6];
	Item [] ans = new Item[6];

	@Before
	public void setUp() throws Exception {
		data[0]= new Item(1);
		data[1]= new Item(3);
		data[2]= new Item(0);
		data[3]= new Item(2);
		data[4]= new Item(8);
		data[5]= new Item(4);

		ans[0]= new Item(0);
		ans[1]= new Item(1);
		ans[2]= new Item(2);
		ans[3]= new Item(3);
		ans[4]= new Item(4);
		ans[5]= new Item(8);
	}

	@After
	public void tearDown() throws Exception {
		data=null;
		ans=null;
	}

	/**
	 * 
	 * Testing BubbleSort - Array of unsorted numbers
	 * 
	 * Test Sequence - 20 to 36
	 */
	@Test
	public void testBubbleSort() {
		SortAlgos.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	/**
	 * 
	 * Testing BubbleSort - Single element array
	 * 
	 * Test Sequence - 20-25 -> 27 ->36
	 */
	@Test
	public void testBubbleSortSingleElement() {
		Item[] myArray= new Item[1];
		Item[] expected=new Item[1];
		myArray[0]=new Item(45);
		expected[0]=new Item(45);
		SortAlgos.bubbleSort(myArray);		
		for(int i=0; i < myArray.length;i++) {
			assertTrue(myArray[i].key==expected[i].key);
		}
	}
	
	/**
	 * 
	 * Testing BubbleSort - Array of already sorted numbers
	 * 
	 * Test Sequence - 20 to 29 -> 34
	 */
	@Test
	public void testBubbleSortedArray() {
		Item[] myArray= new Item[3];
		Item[] expected=new Item[3];
		myArray[0]=new Item(15);
		myArray[1]=new Item(18);
		myArray[2]=new Item(20);
		expected[0]=new Item(15);
		expected[1]=new Item(18);
		expected[2]=new Item(20);
		SortAlgos.bubbleSort(myArray);		
		for(int i=0; i < myArray.length;i++) {
			assertTrue(myArray[i].key==expected[i].key);
		}
	}
	
	/**
	 * 
	 * Testing BubbleSort - Array of numbers with duplicates
	 * 
	 * Test Sequence - 20 to 28 -> 34
	 */
	@Test
	public void testBubbleSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing BubbleSort - Empty Array
	 * Test Sequence - 20 -> 21 -> 22-> 36
	 */
	@Test
	public void testBubbleSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.bubbleSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
		
	}
	
	/**
	 * 
	 * Testing SelectionSort - Array of Unsorted numbers
	 * 
	 */
	@Test
	public void testSelectionSort() {
		SortAlgos.selectionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing SelectionSort - Array of numbers with duplicates
	 */
	@Test
	public void testSelectionSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.insertionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing InsertionSort - Array of Unsorted numbers 
	 */
	@Test
	public void testInsertionSort() {
		SortAlgos.insertionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	/**
	 * 
	 * Testing InsertionSort - Array of numbers with duplicates
	 * 
	 */
	@Test
	public void testInsertionSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.insertionSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	/**
	 * 
	 * Testing MergeSort - Array of Unsorted numbers 
	 */
	@Test
	public void testMergeSort() {
		SortAlgos.mergeSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing MergeSort - Array of numbers with duplicates 
	 */
	@Test
	public void testMergeSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.mergeSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing QuickSort - Array of Unsorted numbers 
	 */
	@Test
	public void testQuickSort() {
		SortAlgos.quickSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	/**
	 * 
	 * Testing QuickSort - Array of numbers with duplicates 
	 */
	@Test
	public void testQuickSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.quickSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	@Test
	public void testQuickSortSpecialCase() {
		data[0]= new Item(4);
		data[1]= new Item(2);
		data[2]= new Item(9);
		data[3]= new Item(9);
		data[4]= new Item(8);
		data[5]= new Item(1);
	
		ans[0]= new Item(1);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(8);
		ans[4]= new Item(9);
		ans[5]= new Item(9);
		SortAlgos.bubbleSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing HeapSort - Array of Unsorted numbers 
	 */
	@Test
	public void testHeapSort() {
		SortAlgos.heapSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}

	/**
	 * 
	 * Testing HeapSort - Array of numbers with duplicates 
	 */
	@Test
	public void testHeapSortDuplicates() {
		data[0]= new Item(5);
		data[1]= new Item(2);
		data[2]= new Item(10);
		data[3]= new Item(2);
		data[4]= new Item(4);
		data[5]= new Item(5);
	
		ans[0]= new Item(2);
		ans[1]= new Item(2);
		ans[2]= new Item(4);
		ans[3]= new Item(5);
		ans[4]= new Item(5);
		ans[5]= new Item(10);
		SortAlgos.heapSort(data);		
		for(int i =0; i < data.length;i++) {
			assertTrue(data[i].key==ans[i].key);
		}
	}
	
	/**
	 * 
	 * Testing HeapSort - Empty array
	 */
	@Test
	public void testHeapSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.heapSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
	}

	/**
	 * 
	 * Testing MergeSort - Empty array
	 */
	@Test
	public void testMergeSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.mergeSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
	}

	/** 
	 * Testing InsertionSort - Empty array
	 */
	@Test
	public void testInsertionSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.insertionSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
	}

	/** 
	 * Testing SelectionSort - Empty array
	 */
	@Test
	public void testSelectionSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.selectionSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
	}
	
	/** 
	 * Testing QuickSort - Empty array 
	 */
	@Test
	public void testQuickSortEmpty() {
		Item[] d=null;
		try {
			SortAlgos.quickSort(d);
		}catch(Throwable exception) {
			assertEquals(NullPointerException.class, exception.getClass());
		}
	}
}