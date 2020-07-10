package college

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class StudentDatabase {
    private val students = mutableListOf<Student>()
    @PostConstruct
    private fun init() {
        students.add(Student("2013001","Aanand Shekhar Roy"))
        students.add(Student("2013165","Rashi Karanpuria"))
    }
    fun getStudents()=students
    fun addStudent(student: Student): Boolean {
        students.add(student)
        return true
    }

    fun getStudentWithRollNumber(roll_number: String): Student?{
        var student=students.find {
            it.roll_number==roll_number
        }
        return student
    }

}