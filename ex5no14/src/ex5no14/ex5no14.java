package ex5no14;

public class ex5no14 {  //  210p
	public static void main(String[] args) {
		String src = "ABCDE" ;
		
		for( int i = 0 ; i < src.length() ; i++ ) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") : " + ch);
		}
		
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr);
	}

}
