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

        System.out.println((char)bChar[1]);

        for (int i=0; i<300; i++)
            System.out.print(used[i]);
        for (int i=0; i<A.length(); i++)
            used[A.charAt(i)--];
        for (int i=0; i<300; i++)
        System.out.print(used[i]);
        for (int i=0; i<300; i++)
            if (used[i]>0) return false;
        return true;
        
    }
    public static void main(String[] args)
    {
        String stringa="ABCDEFG";
        String stringb="ACC";
        Solution_compare_string n=new Solution_compare_string();
        System.out.println(n.compareStrings(stringa,stringb));
    }
}

