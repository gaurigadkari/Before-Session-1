
public class PalindromeString {

	public static int isPalindrome(String a) {
		a = a.toLowerCase();
		// a = a.replaceAll("[^a-zA-Z0-9\\s]", "");
		int size = a.length();
		boolean isPalindrome = false;
		boolean hasLetterOrDigit = false;
		for (int i = 0, j = size - 1; i < size && j > 0; i++, j--) {
			if (!(Character.isLetterOrDigit(a.charAt(i)))) {
				while (!(Character.isLetterOrDigit(a.charAt(i)))) {
					if (i < size - 1) {
						i++;
					} else {
						break;
					}
				}
			} else {
				hasLetterOrDigit = true;
			}
			if (!(Character.isLetterOrDigit(a.charAt(j)))) {
				while (!(Character.isLetterOrDigit(a.charAt(j)))) {
					if (j > 0) {
						j--;
					} else {
						break;
					}
				}
			} else {
				hasLetterOrDigit = true;
			}
			if (a.charAt(i) == a.charAt(j)) {
				isPalindrome = true;
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		if (!hasLetterOrDigit) {
			isPalindrome = true;
		}
		return isPalindrome ? 1 : 0;
	}
}
