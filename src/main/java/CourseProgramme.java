//Angel Barquin 18101382
//Software Engineering 3 Assignment 1

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {
        private String courseName;
        private ArrayList<Module> modules = new ArrayList<>();
        private ArrayList<Student> students = new ArrayList<>();
        private DateTime startDate;
        private DateTime endDate;

        public CourseProgramme(String courseName, ArrayList modules, ArrayList students, DateTime startDate, DateTime endDate){
            this.courseName = courseName;
            this.modules = modules;
            this.students = students;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        //overloaded for first time programmes
        public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
            this.courseName = courseName;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public ArrayList<Module> getModules() {
            return modules;
        }

        public void setModules(ArrayList<Module> modules) {
            this.modules = modules;
        }

        public ArrayList<Student> getStudents() {
            return students;
        }

        public void setStudents(ArrayList<Student> students) {
            this.students = students;
        }

        public DateTime getStartDate() {
            return startDate;
        }

        public void setStartDate(DateTime startDate) {
            this.startDate = startDate;
        }

        public DateTime getEndDate() {
            return endDate;
        }

        public void setEndDate(DateTime endDate) {
            this.endDate = endDate;
        }

        public void addModuleToCourse(Module module){
            modules.add(module);
        }

        public void addStudentToCourse(Student student){
            students.add(student);
        }


}
