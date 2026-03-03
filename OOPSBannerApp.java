 dev
public class OOPSBanner {
public static void main(String[]args) {
System.out.println(" *****    *****    *****    ***** ");
System.out.println("*     *  *     *  *     *  *     *");
System.out.println("*     *  *     *  *     *  *      ");
System.out.println("*     *  *     *  ******    *****  ");
System.out.println("*     *  *     *  *              *");
System.out.println("*     *  *     *  *        *     *");
System.out.println(" *****    *****   *         ***** ");
}
=======
public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "  *****  ", "  *****  ", "  *****  ", "  *****  "),
            String.join("", " *     * ", " *     * ", "  *    * ", " *       "),
			String.join("", " *     * ", " *     * ", "  *    * ", " *       "),
            String.join("", " *     * ", " *     * ", "  *****  ", "  *****  "),
            String.join("", " *     * ", " *     * ", "  *      ", "       * "),
			String.join("", " *     * ", " *     * ", "  *      ", "       * "),
            String.join("", "  *****  ", "  *****  ", "  *      ", "  *****  ")
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}