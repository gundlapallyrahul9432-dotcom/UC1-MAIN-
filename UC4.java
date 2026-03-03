public class OOPSStarPatternArray {
    public static void main(String[] args) {
        // Store each row as a string in an array
        String[] rows = new String[5];
        
        rows[0] = "*****     *****     *****     *****";
        rows[1] = "*   *     *   *     *   *    **   ";
        rows[2] = "*   *     *   *     *****     *****";
        rows[3] = "*   *     *   *     *              **";
        rows[4] = "*****     *****     *         *****";
        
        // Print using for loop
        for (int i = 0; i < rows.length; i++) {
            System.out.println(rows[i]);
        }
    }
}