import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int hey;
        System.out.println("Enter the word to be encrypted");
        Scanner cipher=new Scanner(System.in);
        String caesar=cipher.nextLine();
        System.out.println("Enter a key you want to use");
        hey=cipher.nextInt();
        String Wordencoded= encrypt.encry( caesar,hey);
        System.out.println(Wordencoded);
        System.out.println("-----------------------");
        System.out.println("The initial word is :");
        System.out.println(caesar);
        String Worddecoded=decrypt.decry(caesar,hey);
        System.out.println(Worddecoded);

    }

}
