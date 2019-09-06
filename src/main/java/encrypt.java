import java.util.Scanner;

public class encrypt {
    public static void main(String[] args)

    {

        char alphabets [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',

                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',

                'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.println("Enter the word you want to ENCRYPT");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        int key = 5;



        char array [] = word.toUpperCase().toCharArray();



        for (int i = 0; i < array.length; i++)

        {

            for (int j = 0; j < alphabets.length; j++)

            {

                array[i] = alphabets[(i + key) % 26];

            }

        }



        String cipher = String.valueOf(array);

        System.out.println("Encrypted Message" + cipher);
        System.out.println(array);
    }

}
