import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    private String section;
    private String name;
    private int marks;

    public Student(String section, String name, int marks) {
        this.section = section;
        this.name = name;
        this.marks = marks;
    }

    public String getSection() {
        return section;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public String toString(){
        return ""+getName();
    }
}

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();

        populate(list);
        Predicate<Student>p=s->s.getSection().equals("A");
        Function<Student,String>f=s1->{
            if(s1.getMarks()>80)
                return "A Grade";
            else if(s1.getMarks()>60)
                return "B grade";
            else if(s1.getMarks()>40)
                return "C grade";
            else
                return "D grade";
        };
        Consumer<Student>c=s2-> System.out.println(s2);

        for(Student s:list){
            if(p.test(s)){
                System.out.print(f.apply(s)+" ");
                c.accept(s);
            }
        }
    }

    private static void populate(ArrayList<Student> list) {
        list.add(new Student("A","Prakash",89));
        list.add(new Student("B","hari",45));
        list.add(new Student("C","Mani",76));
        list.add(new Student("A","Dinesh",34));
        list.add(new Student("A","Mukesh",67));
    }
}
