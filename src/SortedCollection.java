import java.util.Arrays;

public class SortedCollection {
private int[] array;

public SortedCollection()
{
	
}
public void add(int item)
{
	int index; 
	if (array == null)
	{
	 array = new int[1];
	 array[0]=item;
	 return;
	}
	index = binarySearchPosition(item);
	int[] arrayNew = new int[array.length+1];
	
	System.arraycopy(array, 0, arrayNew, 0, index);
	arrayNew[index]=item;
	System.arraycopy(array, index, arrayNew, index+1, array.length-index);
	array = arrayNew;
}
private int binarySearchPosition(int item)
{
	if (item <= array[0])
	{
		return 0;
	} else 
		if (item >= array[array.length-1])
		{
			return array.length;
		}
			
	int left=0,right=array.length-1;
	int position = (right - left)/2;
	while ((right - left) != 1)
	{
		if (item < array[position])
		{
			right = position;
		}
		else
			if (item > array[position])
			{
				left = position;
			}
			else  
				if (array[position] == item)
				{
					return position;
				}
		position = left + (right - left)/2;
	}
	return right;
}
public int get(int index)
{
	if (index >=array.length)
		throw new IllegalArgumentException();
	return array[index];
}
public int getSize()
{
	return array.length;
}
public String toString()
{
	StringBuilder sb = new StringBuilder();
	sb.append("Contents of the collection: ");
	for (int item:array)
		sb.append(String.format("%d ", item));
	return sb.toString();
}
}
