package codelab02;

/**
 * Read the README.md for the assignment
 */
public class Main {

    public static char[] getAlphabet() {
        return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    }

    public static String[] replace3thElement(String[] strings) {
        strings[2] = "do";
        return strings;
    }
}
