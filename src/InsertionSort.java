
public class InsertionSort extends PapaSort {

	public InsertionSort(int[] l, String sortName) {
		super(l, sortName);
		
	}

	@Override
	public void executeAlgorithm() {
		
		for (int i = 1; i < this.getLength(); i++)
		{
			int j = i;
			while(j>0 && this.getElement(j) < this.getElement(j-1))
			{
				swap(j, j-1);
				j--;
				//System.out.println(this);
			}
		}
		
	}

}
