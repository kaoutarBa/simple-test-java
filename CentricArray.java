

public class CentricArray {

	public int isCentered(int[] L) {
		try {
			int midleIndex = (L.length - 1)/2;
			int midle = L[midleIndex];
			for(int i=0;i<L.length;i++) {
				if(L[i] <= midle && i != midleIndex) {
					return 0;
				}
			}
			return 1;
		}
		catch(Exception e) {
			return 0;
		}
	} 
	


public  static void main(String[] args) {
	CentricArray myArray = new CentricArray();
	int[] arrayToTest = {10};
	int result = myArray.isCentered(arrayToTest);
	
	System.out.println(result);
	
}}

