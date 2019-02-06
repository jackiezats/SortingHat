
public class BubbleSort extends PapaSort {

	public BubbleSort(int[] l, String name)
	{
		super(l, name);
	}
	
	//This handles one case
	private boolean bubbleIt(int end)
	{
		
		boolean didSwap = false;
		for(int i = 0; i < end; i++)
		{
			int left = super.getElement(i);
			int right = super.getElement(i+1);
		
			
				if(left>right)
				{
					super.swap(i, i+1);
					didSwap = true;
				} 
		}
		return didSwap;
		
	}
	
	

	@Override
	public void executeAlgorithm() {
		
		boolean notDone = true;
		int bubbleEnd = super.getList().length-1;
		do {
			notDone = bubbleIt(bubbleEnd);
			if(notDone)
			{
				bubbleEnd -= 1;
				//System.out.println("We are not done with Bubble Sort");
			} else
			{
				//System.out.println("We are done with Bubble Sort");
			}
			
			//System.out.println(this + "\n") ;
		} while(notDone && bubbleEnd >= 1);
		
		
		
	}
}
