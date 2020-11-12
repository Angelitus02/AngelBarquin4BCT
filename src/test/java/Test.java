//Angel Barquin 18101382
//Software Engineering 3 Assignment 1

import org.joda.time.DateTime;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Test {

    private Student student1;
    private Module module1;
    private CourseProgramme programme1;
    private DateTime dateTime1 = new DateTime(2020, 9, 30, 12, 00);
    private DateTime dateTime2 = new DateTime(2021, 6, 30, 12, 00);

    @Before
    public void setUp(){
         student1 = new Student("Angel Barquin", 26, "17/08/1994", 1234);
         module1 = new Module("Math", "MA101");
         programme1 = new CourseProgramme("BCT4", dateTime1, dateTime2);
    }

    //lists
    ArrayList<Module> moduleList = new ArrayList<>();
    ArrayList<CourseProgramme> programmeList = new ArrayList<>();
    ArrayList<Student> studentList = new ArrayList<>();

    @org.junit.Test
    public void testingStudent() {

        //assertEquals method, parameters: message of the error if it fails, expected result, method that yields result
        assertEquals("Wrong name", "Angel Barquin", student1.getName());
        assertEquals("Wrong age", 26, student1.getAge());
        assertEquals("Bad date of birth", "17/08/1994", student1.getDob());
        assertEquals("Invalid ID", 1234, student1.getId());
        assertEquals("Wrong username", "Angel Barquin26", student1.getUsername());

        //list.of() is for empty lists
        assertEquals("Modules aren't empty", List.of(), student1.getModules());
        assertEquals("Course Programme isn't empty", List.of(), student1.getProgrammes());

        //checking arrays
        student1.addModuleToStudent(module1);
        assertEquals("Module found is wrong", List.of(module1), student1.getModules());
        //create a method called has module to check if students have a module
        assertTrue("is false", student1.hasModule());

        //later realised I don't need an isEmpty() method bc there already is one.
        student1.addCourseToStudent(programme1);
        assertEquals("Programme is wrong", List.of(programme1), student1.getProgrammes());
        assertFalse("is false ", student1.getProgrammes().isEmpty());

    }

    @org.junit.Test
    public void testingModules() {

        assertEquals("module name wrong", "Math", module1.getModuleName());
        assertEquals("id wrong", "MA101", module1.getId());

        //testing setStudents() instead of addStudentToModule() since I already tested a similar one in Student
        studentList.add(student1);
        module1.setStudents(studentList);
        assertEquals("List of students is not right", studentList, module1.getStudents());

        programmeList.add(programme1);
        module1.setProgrammesAssociated(programmeList);
        assertEquals("List of programmes is not right", programmeList, module1.getProgrammesAssociated());
    }

    @org.junit.Test
    public void testingProgrammes() {

        assertEquals("Programme name bad", "BCT4", programme1.getCourseName());
        assertEquals("Programme start date bad", dateTime1, programme1.getStartDate());
        assertEquals("Programme end date bad", dateTime2, programme1.getEndDate());

        programme1.addModuleToCourse(module1);
        studentList.add(student1);
        programme1.addStudentToCourse(student1);
        assertEquals("Module list in programmes is bad", List.of(module1), programme1.getModules());
        assertEquals("Student list in programmes is bad", studentList, programme1.getStudents());
    }
}
