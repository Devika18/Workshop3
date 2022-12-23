public class ReverseString {
    public static void main(String[] args) {
        String str = "My name is Devika", nstr = "";
        char ch;
        System.out.println("Original String is: ");
        System.out.println("My name is Devika");

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);    //Extract each characters
            nstr = ch + nstr;     //Adds each character in front of existing string
        }
        System.out.println("\nReversed String is:\n"+ nstr);
    }
}
