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

    @Before
    public void setUp(){
         student1 = new Student("Angel Barquin", 26, "17/08/1994", 1234);
         module1 = new Module("Math", "MA101");
    }
    //DateTime dateTime1 = new DateTime("2020/09/30");
    //DateTime dateTime2 = new DateTime("2021/06/30");
    //init module with no student or programmes

    //init student with no modules or programmes

    //init course programme with no students or modules
    //CourseProgramme programme1 = new CourseProgramme("BCT4", dateTime1, dateTime2);

    //lists
    ArrayList<Module> moduleList = new ArrayList<>();
    ArrayList<CourseProgramme> programmeList = new ArrayList<>();
    ArrayList<Student> studentList = new ArrayList<>();

    @org.junit.Test
    public void testingStudent() {

        //assertEquals method, parameters: message of the error if it fails, expected result, method that yields result
        assertEquals("Wrong username", "Angel Barquin26", student1.getUsername());
        assertEquals("Wrong name", "Angel Barquin", student1.getName());
        assertEquals("Bad date of birth", "17/08/1994", student1.getDob());
        assertEquals("Invalid ID", 1234, student1.getId());

        //list.of() is for empty lists
        assertEquals("Modules aren't empty", List.of(), student1.getModules());
        assertEquals("Course Programme isn't empty", List.of(), student1.getProgrammes());

        //checking arrays
        student1.addModuleToStudent(module1);
        assertEquals("Module found is wrong", List.of(module1), student1.getModules());
        assertTrue("is false", student1.hasModule());
    }

//    @org.junit.Test
//    public void testingModules() {
//
//
//    }



}
