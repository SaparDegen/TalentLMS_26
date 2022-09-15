public class Main {
    public static void main(String[] args) {
        System.out.println(Box.getBox(7));
        System.out.println(Box.getBox("Hello Java"));

        System.out.println(Box.methodInt(7, 22));
        System.out.println(Box.methodStr("Hello Java", "7"));
    }
}