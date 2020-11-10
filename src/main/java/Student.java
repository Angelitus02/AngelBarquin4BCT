//Angel Barquin 18101382
//Software Engineering 3 Assignment 1
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;
    private ArrayList<CourseProgramme> programmes = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();


    public Student(String name, int age, String dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    //overloaded with Module and Programmes
    public Student(String name, int age, String dob, int id, ArrayList<CourseProgramme> programmes, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.programmes = programmes;
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername(){
        return name + age;
    }

    public ArrayList<CourseProgramme> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(ArrayList<CourseProgramme> programmes) {
        this.programmes = programmes;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModuleToStudent(Module module){
        modules.add(module);
    }

    public void addCourseToStudent(CourseProgramme programme){
        programmes.add(programme);
    }

    public boolean hasModule(){
        if (!modules.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
