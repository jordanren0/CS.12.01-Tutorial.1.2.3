import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        char[] arr = word.toCharArray();
        for(int i = 0; i < word.length()-1; i++){
            if(arr[i] == 'A' && arr[i+1] != 'A'){
                char temp = 'A';
                arr[i] = temp;
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        return new String(arr);
    }
    public static List<String> scrambleOrRemove(List<String> wordList) {
        for(int i = 0; i < wordList.size(); i++){
            String string = Scramble.scrambleWord(wordList.get(i));
            if(string.equals(wordList.get(i))){
                wordList.remove(i);
                i--;
            }
            else{
                wordList.set(i, string);
            }
        }
        return wordList;
    }
}
