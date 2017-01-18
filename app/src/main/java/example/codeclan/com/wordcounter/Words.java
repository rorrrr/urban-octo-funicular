package example.codeclan.com.wordcounter;

/**
 * Created by user on 17/01/2017.
 */
public class Words {

    public String words;

    public Words(String words){
        this.words = words;
    }

    public int countWords(){
        int wordCount = 0;
        boolean word = false;
        int lastCharacter = this.words.length() -1;

        for (int i = 0; i < this.words.length(); i++) {
            if (Character.isLetter(this.words.charAt(i)) && i != lastCharacter) {
                word = true;
            } else if (!Character.isLetter(this.words.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(this.words.charAt(i)) && i == lastCharacter) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
