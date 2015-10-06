import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by sym44 on 10/7/2015.
 */
public class WordPattern {

    public static void main(String[] args){
        String str = "dog cat fish dog";
        String pattern = "abba";

        System.out.print(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        String[] patternArray = new String[pattern.length()];

        if(strArray.length != patternArray.length)
            return false;

        for(int i = 0; i < pattern.length(); i ++)
            patternArray[i] = pattern.substring(i, i+1);
        HashMap<String, String> strMap = new HashMap<>();

        for(int i = 0; i < strArray.length; i++){
            // if the key and value both not in the hmap then add
            if((! strMap.containsValue(strArray[i])) && (! strMap
                .containsKey(patternArray[i]))){
                strMap.put(patternArray[i], strArray[i]);
            } else if(strMap.containsKey(patternArray[i]) && strMap.get
                (patternArray[i]).equals(strArray[i])){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
