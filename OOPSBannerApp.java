public class OOPSBannerApp {

    public static void main(String[] args) {

        // String array to store banner lines
        String[] banner = {

            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "      *"),
            String.join(" ", "*     *", "*     *", "*      ", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}