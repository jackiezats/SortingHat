import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		
		
		int howMany = 100;
		int [] numbersGoodA = getIncreasingOrder(howMany); //good
		int [] numbersGoodB = getIncreasingOrder(howMany);
		int [] numbersGoodC = getIncreasingOrder(howMany);
		int [] numbersBadA = getDescendingOrder(howMany); //bad
		int [] numbersBadB = getDescendingOrder(howMany);
		int [] numbersBadC = getDescendingOrder(howMany);
		int [] numbers2 = getDescendingOrder(howMany);
		
		
		
		//System.out.println(Arrays.toString(numbers0));
		//System.out.println(Arrays.toString(numbers1));
		//int [ ] numbers2 = getRandom(howMany);
		
		
		//Running Sorts
		SelectionSort sSortBest = new SelectionSort(numbersGoodA, "Selection Sort Best");
		SelectionSort sSortWorst = new SelectionSort(numbersBadA, "Selection Sort Worst");
		BubbleSort bSortBest = new BubbleSort(numbersGoodB, "BubbleSort Best");
		BubbleSort bSortWorst = new BubbleSort(numbersBadB, "Bubble Sort Worst");
		InsertionSort iSortWorst = new InsertionSort(numbersBadC, "Insertion Sort Worst");
		InsertionSort iSortBest = new InsertionSort(numbersGoodC, "Insertion Sort Best");
		
		
		//System.out.println(sSort);
		//doTiming(sSortBest);
		//doTiming(sSortWorst);
		doTiming(bSortBest);
		//doTiming(bSortWorst);
		doTiming(iSortBest);
		//doTiming(iSortWorst);
		
		

	}
	
	//calling PapaSort s is polymorphism

	public static void doTiming(PapaSort s)
	{
		if(s.getLength() <= 100)
		{
			System.out.println("Before " + s);
		}
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		s.executeAlgorithm();
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		long theTime = end-start;
		long theTime2 = end2 - start2;
		
		if(s.getLength() <= 100)
		{
			System.out.println("It takes " + s.getSortName() + " sorting with " +
					s.getLength() + " elements " + theTime2 + " nano seconds to sort");
			System.out.println("After " + s);
			System.out.println();
					
		} else
		{
			
		System.out.println("It takes " + s.getSortName() + " sorting with " +
		s.getLength() + " elements " + (double)(theTime/1000) + " seconds to sort");
		System.out.println("After " + s);	
		System.out.println();
		
		}
	}

	public static int[ ] getRandom(int n)
	{
		int [] nList = new int[n];
		for (int i = 0; i<nList.length; i++)
		{
			nList[i] = (int)(Math.random() * 1000);
		}
		
		return nList;
	}
	
	public static int [] getIncreasingOrder(int n)
	{
		int [] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++) {
			nList[i] = i+1;
		}
		return nList;
	}
	
	public static int[] getDescendingOrder(int n)
	{
		int [] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++) {
			nList[i] = nList.length-i;
		}
		return nList;
	}
	
	}


