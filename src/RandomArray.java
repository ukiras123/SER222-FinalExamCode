
public class RandomArray 
{
	static java.util.Random rng = new java.util.Random();
	/** Generate n random integers WITH duplicates.
	 */
	public static int[] randArray(int n, int low, int high)
	{
		int[] result = new int[n];
		for (int i = 0; i < n; ++i)
		{
			int r = low + (rng.nextInt(high - low + 1));
			result[i] = r;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		rng.setSeed(1234567);
		System.out.println(java.util.Arrays.toString(randArray(10,5,20)));
	}

}