import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int []spells = {5,1,3};
        int []potions = {1,2,3,4,5};
        int success = 7;
        Solution sol=new Solution();
        System.out.println(Arrays.toString(sol.successfulPairs(spells,potions,success)));
    }
}