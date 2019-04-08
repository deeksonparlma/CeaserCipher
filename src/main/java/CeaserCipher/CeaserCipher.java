package CeaserCipher;
public class CeaserCipher {
    public String encrypt(String plainText,int shift){
        if(shift>26){
            shift=shift%26;
        }
        else if(shift<0){
            shift=(shift%26)+26;
        }
        String cipherText="";
        int length=plainText.length();
        for(int i = 0;i<length;i++){
            char letter=plainText.charAt(i);
            if(Character.isLetter(letter)){
                if(Character.isLowerCase(letter)){
                    char find=(char)(letter+=shift);
                    if(find>'z'){
                        cipherText += (char)(find -(26 - shift));
                    }
                    else{
                        cipherText += letter;
                    }

                }
                else if(Character.isUpperCase(letter)){
                    char find=(char)(letter+=shift);
                    if(find>'Z'){
                        cipherText += (char)(find -(26 - shift));
                    }
                    else{
                        cipherText += letter;
                    }
                }
            }
            else{
                cipherText += letter ;
            }
        }
        return cipherText;
    }

    //decrypt//

    public String decrypt(String plainText,int shift){
        if(shift>26){
            shift=shift%26;
        }
        else if(shift<0){
            shift=(shift%26)+26;
        }
        String cipherText="";
        int length=plainText.length();
        for(int i = 0;i<length;i++){
            char letter=plainText.charAt(i);
            if(Character.isLetter(letter)){
                if(Character.isLowerCase(letter)){
                    char find=(char)(letter-=shift);
                    if(find<'a'){
                        cipherText += (char)(find +(26 - shift));
                    }
                    else{
                        cipherText += letter;
                    }

                }
                else if(Character.isUpperCase(letter)){
                    char find=(char)(letter-=shift);
                    if(find<'A'){
                        cipherText += (char)(find +(26 - shift));
                    }
                    else{
                        cipherText += letter;
                    }
                }
            }
            else{
                cipherText += letter ;
            }
        }
        return cipherText;
    }
}
