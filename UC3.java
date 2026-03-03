public class OOPSStarPatternString {
    public static void main(String[] args) {
        // Define each row of the pattern as an array of strings
        String[] row1 = {
            "*****     *****     *****     *****",
            "*   *     *   *     *   *    **    ",
            "*   *     *   *     *****   ** ",
            "*   *     *   *     *         *****",
            "*   *     *   *     *              **",
            "*****     *****     *         *****"
        };
        
        // Print using String.join() with newline as delimiter
        System.out.println(String.join("\n", row1));
    }
}