public class subsetsOfAString {

    public static void printAllSubsetHelper(String str, int i, String curr) {

        if (str.length() == i) {
            System.out.print(curr + " ");
            return;
        }

        printAllSubsetHelper(str, i + 1, curr + str.charAt(i));
        printAllSubsetHelper(str, i + 1, curr);

    }

    public static void printAllSubset(String str) {

        String curr = "";

        printAllSubsetHelper(str, 0, curr);

    }

    public static void main(String[] args) {

        printAllSubset("abc");

    }

}
