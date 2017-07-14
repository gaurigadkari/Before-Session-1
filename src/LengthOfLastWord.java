
public class LengthOfLastWord {
	public int lengthOfLastWord(final String a) {
	    boolean charFlag = false;
        int length = 0;
        for (int i=a.length()-1; i>=0; i--)
        {
            if (Character.isLetter(a.charAt(i)))
            {
                charFlag = true;
                length++;
            }
            else
            {
                if (charFlag == true)
                    return length;
            }
        }
        return length;
	}
}
