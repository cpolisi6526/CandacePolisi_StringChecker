package candacepolisi;

public class Runner {

    public static void main(String[] args) {
        CodeWordChecker bread= new CodeWordChecker("bread");
        CodeWordChecker apple= new CodeWordChecker("apple",1,10);

        System.out.println(bread.isValid("breadbreadbreadbreadbread"));
        System.out.println(bread.isValid("ueguriduhiughiudghoi"));

        System.out.println(apple.isValid("111111appleappleappleapple"));
        System.out.println(apple.isValid("apple1111111111111111111"));
	// write your code here
    }
}
