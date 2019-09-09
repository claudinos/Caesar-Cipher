public class decrypt {
    public  static String decry( String plainText,int key){
        String Text="";
        for (int i=0;i<plainText.toCharArray().length;i++){
            char alphabet=plainText.charAt(i);

            if (Character.isLetter(alphabet)){

                if (Character.isLowerCase(alphabet)){
                    char word=(char)(alphabet-key);

                    if (word<'a'){
                        Text=Text+(char)(alphabet+(26-key));
                    }
                    else {
                        Text=Text+word;
                    }
                }
                else if (Character.isUpperCase(alphabet)){
                    char word=(char)(alphabet-key);

                    if (word<'A'){
                        Text=Text+(char)(alphabet+(26-key));
                    }
                    else {
                        Text=Text+word;
                    }
                }
            }
            else {
                Text=Text+alphabet;
            }
        }
        return Text;
    }


}
