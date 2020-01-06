package TheFirstOne;

public class Square_Magic_2D_Array {

	public static void main(String[] args) {
		
		// Our 2D array is considered "magic" if the following are true: 
		// The array is square (N rows and N columns).
		// The sums of each row, the sums of each column, and the sums of each diagonal are all equal.
		// Complete the isMagic method so that it will determine whether a given array is magic.
		// TheThirdOne:	int[][] a = {
		//							{1,1,1},
		//							{1,1,1},
		//							{1,1,1}
		//						}
		//						System.out.println(isMagic(a)); // true
		// 			int[][] b = {
		//							{1,1,2},
		//							{3,2,3},
		//							{1,4,1}
		//						}
		//						System.out.println(isMagic(a)); // false
		
		System.out.println(isMagic(new int[][] {{1,1,1},{1,1,1},{1,1,1}}));
		System.out.println(isMagic(new int[][] {{1,2,1},{3,1,4},{1,1,5}}));
	}
	
	public static boolean isMagic(int[][] array) {
		
		int rowNum = array.length;
		int rowSum = 0;
		int colSum = 0;
		int dioSum = 0;
		int y = 0, z = 0, zz = 0;
		 
		  for(int i = 0; i < array.length; i++){
		    
		    if(array[i].length != rowNum)
		    return false;
		  
		    for(int j = 0; j < array[i].length; j++)
				  rowSum += array[i][j];
			  
		    for(int x = 0; x < array.length; x++)
				  colSum += array[x][y];
		    y++;
		    
		    for(; z < array.length; z++, zz++)
				  dioSum += array[z][zz];
		    z = 0;
		    zz = 0;
		    if((!(rowSum == colSum) && !(rowSum == dioSum)))
		        return false; 
		  }
		    return true;
		
	}

}
