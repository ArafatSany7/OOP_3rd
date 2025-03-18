
interface person {

    public void setName(String name);

    public void setAge(int age);

}

class p1 implements person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name " + name + "age " + age);
    }
}

interface students extends person {

    public void setMark(int mark);

    public void setYear(int year);
}

class s1 implements students {

    private String name;
    private int age;
    public int mark;
    public int year;

    public void setMark(int mark) {
        this.mark = mark;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAllProperties(String name, int age, int mark, int year) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.year = year;
    }

    public void display() {
        System.out.println("Name " + name + "age " + age + "pass " + year + "mark " + mark);

    }
}

public class inter2 {

    public static void main(String[] args) {

        s1 student = new s1();
        student.setAllProperties("sany", 23, 76, 2025);
        student.display();
    }
}
