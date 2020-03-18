package springhw.beans;

public class Printer {
    private static Printer instance = null;

    private Printer() {

    }

    public static Printer getInstance() {
        if (instance == null)
            instance = new Printer();
        return instance;
    }

    public void print(Object object) {
        System.out.println(object);
    }
}
