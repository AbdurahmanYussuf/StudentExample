//Commit #2
//Commit #3
package student;

public class Student {

    private String name;
    private int student_id;

    public Student(String name, int id) {
        this.name = name;
        this.student_id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.student_id;
    }

    public void setId(int id){
        this.student_id = id;
    }
}
