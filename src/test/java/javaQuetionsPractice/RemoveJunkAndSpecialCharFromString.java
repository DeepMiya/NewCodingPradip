package javaQuetionsPractice;

public class RemoveJunkAndSpecialCharFromString {
    public static void main(String[] args) {
        String sent = "He@ll#o! 123$%&* W^or(ld)";
        // Remove all special characters (keep only letters and digits)
        String cleaned = sent.replaceAll("\\W", ""); //[^a-zA-Z0-9]
        System.out.println(cleaned);
    }
}
