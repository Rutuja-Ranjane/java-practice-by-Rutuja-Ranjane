public class CharacterCount {
    public static void main(String[] args) {
        String string ="The best of both world";
        int count = 0;
        for(int i =0;i<string.length();i++)
        {
            if(string.charAt(i)!= ' ')
            {
                count+=1;
            }
        }
        System.out.println("the number of characters in the string is " + count);
    }
}
