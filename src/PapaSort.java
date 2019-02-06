import java.util.Arrays;

public abstract class PapaSort {
	
	private int [] myList; //data hiding
	private String whichSort;
	
	
	
	//Constructor
	public PapaSort(int[] l, String sortName)
	{
		myList = l;
		whichSort = sortName;
	}
	
	
	public void swap(int place1, int place2) 
	{
			int temp = myList[place2];
			myList[place2] = myList[place1];
			myList[place1] = temp;
		
	}
	
	public String toString() 
	{
		String s = "";
		s+= whichSort + ": ";
		s += Arrays.toString(myList);
		return s;
	}
	
	public int[] getList() 
	{
		return myList;
	}
	
	// additional interface to get numbers
	public int getElement(int whichE)
	{
		return myList[whichE];
	}
	
	public void setElement(int whichE, int val)
	{
		myList[whichE] = val;
	}
	
	public int getLength()
	{
		return myList.length;
	}
	
	public abstract void executeAlgorithm(); // no curly braces
	
	public String getSortName() 
	{
		return whichSort;
	}
	

}
