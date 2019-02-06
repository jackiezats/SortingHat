import java.util.Arrays;

public class SelectionSort extends PapaSort{
	

	
	// Data is handled in the superclass PapaSort

	public SelectionSort(int[] l, String name)
	{
		super(l, name);
	}
	
	
	public void executeAlgorithm()
	{

		for(int j = 0; j<getList().length - 1; j++)
		{
			int biggest = getElement(0);
			int bigLoc = 0 ;
			

			for(int i = 0; i<getList().length - j; i++)
			{
				if(biggest<super.getElement(i))
				{
					biggest = super.getElement(i);
					bigLoc = i;
				}
			}
			swap(bigLoc, super.getList().length -1 -j);
		}


	}
	
}