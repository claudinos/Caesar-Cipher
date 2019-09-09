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

        System.out.println("Enter the word to be decrypted");
        Scanner hello=new Scanner(System.in);
        String clo=hello.nextLine();
        System.out.println("Enter a key you want to use");
        int key=hello.nextInt();
        String Worddecoded=decrypt.decry(clo,key);
        System.out.println( Worddecoded);

    }

}
