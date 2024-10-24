public class Punctuations {
    public static void main(String[] args) {
        String string ="'oh my!!!' mother :exclaimed.-'What are you doing?'";
        int count = 0;
        for(int i =0;i<string.length();i++)
        {
            if(string.charAt(i)== '!'|| string.charAt(i)=='.'|| string.charAt(i)==','|| 
            string.charAt(i)=='-'|| string.charAt(i)=='"'|| string.charAt(i)=='?'|| 
            string.charAt(i)==';'|| string.charAt(i)==':'|| string.charAt(i)=='/')
            {
                count+=1;
            }
        }
        System.out.println("the number of characters in the string is " + count);
    }
}
