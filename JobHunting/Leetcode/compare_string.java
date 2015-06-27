public class Solution_compare_string {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int used[] = new int[300];
        char aChar[]=new char[A.length()];
        
        char bChar[]=new char[B.length()];
        
        for (int i=0; i<B.length(); i++)
            used[bChar[i]]++;
        for (int i=0; i<A.length(); i++)
            used[aChar[i]]--;
        for (int i=0; i<300; i++)
            if (used[i]>0) return false;
        return true;
        
    }
    public static void main()
    {
        String stringa="ABCDEFG";
        String stringb="ACC";
        System.out.println(new Solution_compare_string.compareStrings(stringa,stringb));
    }
}

