public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int space = s.lastIndexOf(' ');
        if (space == -1) {

            return s.length();
        } else {

            return s.substring(space+1).length();
        }
    }
    public static void main(String[] args) {
        String s = "fly me to the moon ";
        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word from the given string is:" +length);
    }
}
