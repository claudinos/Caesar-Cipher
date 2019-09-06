import java.util.Scanner;

public class decrypt {


        public static void main(String...s){
            String message, encryptedMessage = "";
            int key;
            char output;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a message: ");
            message = sc.nextLine();

            System.out.println("Enter key: ");
            key = sc.nextInt();

            for(int i = 0; i < message.length(); ++i){
                output = message.charAt(i);

                if(output >= 'a' && output<= 'z'){
                    output = (char)(output + key);

                    if(output > 'z'){
                        output= (char)(output - 'z' + 'a' - 1);
                    }

                    encryptedMessage += output;
                }
                else if(output >= 'A' && output <= 'Z'){
                    output = (char)(output+ key);

                    if(output > 'Z'){
                        output = (char)(output - 'Z' + 'A' - 1);
                    }

                    encryptedMessage += output;
                }
                else {
                    encryptedMessage += output;
                }
            }

            System.out.println("Encrypted Message = " + encryptedMessage);
        }
    }

