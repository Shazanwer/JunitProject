package junits;

public class StringFunctions {

	public static boolean isPalindrome(String str) {

		String newstr = str.toLowerCase();
		int begin = 0;
		int end = newstr.length() - 1;
		while (begin < end) {

			if (newstr.charAt(begin) != newstr.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}

	
}
