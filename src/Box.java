public class Box<T> {
    private T someData;

    public Box(T someData1) {
        this.someData = someData1;
    }

    public T getSomeData() {
        return someData;
    }

    public static <T> Box getBox(T dat) {
        Box box = new Box(dat);
        return box;
    }

    public static int methodInt(int a1, int a2) {
        int b1 = (int) getBox(a1).getSomeData();
        int b2 = (int) getBox(a2).getSomeData();
        int result = b1 + b2;
        return result;
    }

    public static String methodStr(String a1, String a2) {
        String b1 = (String) getBox(a1).getSomeData();
        String b2 = (String) getBox(a2).getSomeData();
        String result = b1.concat(b2);
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "someData=" + someData +
                '}';
    }
}
