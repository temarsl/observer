package My;

import java.util.List;

public class Student implements Observer{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> hw) {
        System.out.println(name + ", произошло обновление дз: ");
        System.out.println(hw);
        System.out.println();
    }
}
