package My;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();

        homework.addHw("#3,4: a,b,c");
        homework.addHw("#4,3, b,c");

        Observer o1 = new Student("Ilya");
        Observer o2 = new Student("Anna");

        homework.addObserved(o1);
        homework.addObserved(o2);

        homework.addHw("#50-60 f,g,h");
        homework.removeHw("#50-60 f,g,h");
    }
}
