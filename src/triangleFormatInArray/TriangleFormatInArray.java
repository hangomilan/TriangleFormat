package triangleFormatInArray;

import java.util.Arrays;

public class TriangleFormatInArray {

	public static final String TEXT = "Hello";

	static char[][] toTriangleArray(String text) {
		
		String reversedText = new StringBuilder(new String(text)).reverse().toString();
		char[][] triangleArray = new char[(reversedText.length() * 2) - 1][reversedText.length()];
		int modifiedLenght = triangleArray[triangleArray.length / 2].length - 1;

		for (int i = 0; i < triangleArray.length; i++) {
			for (int j = 0; j < reversedText.length(); j++) {
				triangleArray[i][j] = reversedText.charAt(j);
			}
		}
		
		for (int i = triangleArray.length / 2 + 1; i < triangleArray.length; i++) {
			triangleArray[i] = Arrays.copyOf(triangleArray[i], modifiedLenght);
			modifiedLenght--;
		}
		
		modifiedLenght = 1;		
		for (int i = 0; i < triangleArray.length / 2 + 1; i++) {
			triangleArray[i] = Arrays.copyOf(triangleArray[i], modifiedLenght);
			modifiedLenght++;
		}
		return triangleArray;
	}

	public static void main(String[] args) {
		char[][] caTriangle = toTriangleArray(TEXT);
		for (char[] cs : caTriangle) {
			System.out.println(Arrays.toString(cs));
		}
		
	/* output:
        [o]
        [o, l]
        [o, l, l]
        [o, l, l, e]
        [o, l, l, e, H]
        [o, l, l, e]
        [o, l, l]
        [o, l]
        [o]
     */
	}
}
