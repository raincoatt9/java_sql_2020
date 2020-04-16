package days.first;

import java.util.Scanner;


/**

Justas

*/
public class FirstTask
{
    public static void main(String[] args)
    {

       Scanner sc = new Scanner(System.in);
       String word;
       do{
           System.out.println("iveskite zodi arba pabaiga darbo baigimui");
           word = sc.nextLine();

           checkOrWordIsEven(word);
           System.out.println("A raidziu zodyje yra: " + countLetters(word,'a'));


       }while(!"pabaiga".equalsIgnoreCase(word));

    }
    private static void checkOrWordIsEven(String word)
    {
        if(word.length() % 2 == 0)
        {
            System.out.println(String.format("ivestas zodis %s yra lyginis", word));

        }
        else
        {
            System.out.println(String.format("ivestas zodis %s yra nelyginis", word));
        }
    }

    private static int countLetters(String word, char letter)
    {
        int count = 0;
        for (int i = 0; i < word.length(); i++)
        {
            {
                if (letter == word.charAt(i))
                count++;
            }
        }
        return count;
    }

}
