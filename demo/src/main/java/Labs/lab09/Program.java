package Labs.lab09;

public class Program {
    public static void main(String[] args) {
        //new Game();

        /*
        String text = "Steven";
        System.out.println(text.charAt(2));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        for (char letter : text.toCharArray()) {
            System.out.print(letter + "\t");
        }
        System.out.println();

        System.out.println(text.startsWith("s"));
        System.out.println(text.endsWith("n"));

        System.out.println(text.indexOf("S"));
        System.out.println(text.indexOf("a"));

        String fullname = text + " Mullin";
        System.out.println(fullname);
        */

        StringBuilder sb = new StringBuilder("Bruce Springsteen ");

        sb.append("is the artist ever");

        System.out.println(sb.toString());

        sb.insert(25, "BEST ");
        System.out.println(sb.toString());

        sb.replace(30, 36, "Rockstar");
        System.out.println(sb.toString());
    }
}

