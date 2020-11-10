//Angel Barquin 18101382
//Software Engineering 3 Assignment 1

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String id;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<CourseProgramme> programmesAssociated = new ArrayList<>();

    public Module(String moduleName, String id, ArrayList students, ArrayList programmesAssociated){
        this.moduleName = moduleName;
        this.id = id;
        this.students = students;
        this.programmesAssociated = programmesAssociated;
    }

    //overloaded module for first time creation modules.
    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getProgrammesAssociated() {
        return programmesAssociated;
    }

    public void setProgrammesAssociated(ArrayList<CourseProgramme> programmesAssociated) {
        this.programmesAssociated = programmesAssociated;
    }

    public void addStudentToModule(Student student){
        students.add(student);
    }

    public void associateCourseToModule(CourseProgramme programme){
        programmesAssociated.add(programme);
    }
}
