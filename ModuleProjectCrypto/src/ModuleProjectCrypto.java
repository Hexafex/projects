import java.util.Scanner;
public class ModuleProjectCrypto {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert text: ");
        text =input.nextLine();
        System.out.println(normalizeText(text));
        System.out.print("Input Shift value : ");
        int shiftValue = input.nextInt();
        String obifiedText = obify(text);
        String caesaredText = caesarify(obifiedText, shiftValue);
        System.out.print("How many letters per group?: ");
        int lettersPerGroup = input.nextInt();
        groupify(caesaredText, " ", lettersPerGroup);
        String result = groupify(caesaredText," ",lettersPerGroup);
        System.out.println(result);
    }

    //remove all puncts and upper case
    private static String normalizeText(String text2Normalize) {

        String noSpaces, normalizedText;

        //removes spaces and special characters
        noSpaces = text2Normalize.replaceAll("[^a-zA-Z]", "");
        //System.out.println("with no space and punctuations = " + noSpaces);

        //this turns all the characters to upper case
        normalizedText = noSpaces.toUpperCase();
        return normalizedText;//return data back out
    }

    //shifting of alphabets
    private static String caesarify(String text2Caesarify, int shiftValue) {
        int stringLength = text2Caesarify.length();
        String caesaredText="";
        StringBuffer rtnString = new StringBuffer();
        if(shiftValue>26){
            shiftValue%=26;
        }
        if (shiftValue<0){
            shiftValue%=26;
        }
        for (int i = 0; i < stringLength; i++) {

            //ascii value after shift
            char c = (char) (text2Caesarify.charAt(i) + shiftValue);

            //if ascii value bigger than Z's
            if (c > 'Z') {
                c = (char) (c - 26);
            }
            if(c<'A'){
                c= (char)(c + 26);
            }
            rtnString.append(c);
        }
        caesaredText = rtnString.toString();
        System.out.println(caesaredText);
        return caesaredText;
    }

    private static String obify(String text2Obify){
        int stringlength= text2Obify.length();
        StringBuffer rtnString= new StringBuffer();
        for (int i = 0; i < stringlength; i++) {

            char vowel =(text2Obify.charAt(i));

            if (vowel == 'A'||vowel == 'E'||vowel == 'I'||vowel == 'O'||vowel == 'U'||vowel == 'Y') {
                rtnString.append("OB");
            }
            rtnString.append(text2Obify.charAt(i));
            }

        return rtnString.toString();
    }
    //splitting the string up
    private static String groupify(String text2Group, String lettertoinsert, int lettersPerGroup) {
        int stringLength = text2Group.length();
        StringBuilder builder = new StringBuilder(stringLength + lettertoinsert.length() * (stringLength / lettersPerGroup));

        int currentIndexOftext2Group = 0;

        String toInsert = "";

        while (currentIndexOftext2Group < text2Group.length()) {
            //what to put in at the front
            builder.append(toInsert);
            //replacing what to insert with required
            toInsert = lettertoinsert;

            builder.append(text2Group.substring(currentIndexOftext2Group, Math.min(currentIndexOftext2Group + lettersPerGroup, text2Group.length())));
            currentIndexOftext2Group += lettersPerGroup;
        }
            if(stringLength%lettersPerGroup!=0){
            builder.append("x");
            }
            return builder.toString();

        }

    }
