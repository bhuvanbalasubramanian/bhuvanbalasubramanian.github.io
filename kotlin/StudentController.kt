package college

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class StudentController {
    @Autowired
    private lateinit var database: StudentDatabase
    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun students() = database.getStudents()

    @GetMapping("/student/{roll_number}")
    fun studentWithRollNumber( @PathVariable("roll_number")  roll_number:String) =
        database.getStudentWithRollNumber(roll_number)

    @RequestMapping("/add", method = arrayOf(RequestMethod.POST))
    fun addStudent(@RequestBody student: Student) =
            if (database.addStudent(student)) student
            else throw Exception("Something went wrong")

}