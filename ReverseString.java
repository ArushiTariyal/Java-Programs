public class ReverseString {
    public static String reverse(String word){
        StringBuilder newWord = new StringBuilder(word);
        return newWord.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(reverse("Java Program"));
    }
}
