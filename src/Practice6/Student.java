package Practice6;

public class Student implements Comparable <Student>{
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", mark=" + mark + '}';
    }

    @Override
    public int compareTo(Student obj) {
        if (mark>obj.mark){
            return 1;
        }
        if(mark==obj.mark){
            return 0;
        }
        return -1;
    }
}
