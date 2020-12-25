public class Student {

//    our private data
    private long ID;
    private double GPA;


//      set ID and GPA (setter)
    public void setter(long id, double gpa) {
        this.ID = id;
        this.GPA = gpa;
    }

//    Accessor (id getter)
    public long get_id() {
        return ID;
    }

//      Accessor (gpa getter)
    public double get_gpa() {
        return GPA;
    }

    public void print() {
        System.out.println("The ID of the student is : "+ get_id());
        System.out.println("The GPA of the student is : "+ get_gpa());
    }
}
