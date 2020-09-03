import java.util.*;


public class WordsReverser {
    private String inputedStringText;

    public WordsReverser(String inputedStringText) {
        this.inputedStringText = inputedStringText;
    }

    public String getInputedStringText() {
        return inputedStringText;
    }

    public void setInputedStringText(String inputedStringText) {
        this.inputedStringText = inputedStringText;
    }

    public String reverseAllInputtedWords(){
        String resultStringOfWords = "";
        String[] splittedWordsList = inputedStringText.split(" ");


        for (int i = 0; i < splittedWordsList.length; i++) {
            resultStringOfWords += " " + (reverseWord(splittedWordsList[i]));
        }
        return resultStringOfWords;
    }

    private String reverseWord(String word){
        char[]charArray = word.toCharArray();
        int frontMarkerPosition = 0;
        int rearMarkerPosition = charArray.length-1;

        while(frontMarkerPosition < rearMarkerPosition) {
            if (Character.isLetter(charArray[frontMarkerPosition])) {
                if (Character.isLetter(charArray[rearMarkerPosition])) {
                    replaceCharacters(charArray, frontMarkerPosition, rearMarkerPosition);
                    rearMarkerPosition--;
                    frontMarkerPosition++;
                } else {
                    rearMarkerPosition--;
                }
            } else {
                frontMarkerPosition++;
            }
        }
        return new String(charArray);
    }

    private void replaceCharacters(char[] charArray, int frontPosition, int rearPosition){
        char tmpChar = charArray[frontPosition];
        charArray[frontPosition] = charArray[rearPosition];
        charArray[rearPosition] = tmpChar;
    }

}
