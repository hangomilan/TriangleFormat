package triangleFormat;

public class Triangle {

	static void triangleString(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {

			for (int k = 0; k < inputString.length() - i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print(inputString.charAt(i));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
/*
 output:
      
	 m
    iii
   lllll
  aaaaaaa
 nnnnnnnnn
*/
		
		triangleString("milan");
		
	}

}
