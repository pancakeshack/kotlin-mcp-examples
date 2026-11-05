package pancake.shack.features.students

import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

class StudentsService {
    private val students: ConcurrentHashMap<UUID, Student> = ConcurrentHashMap()

    fun addStudent(studentDto: CreateStudentDto) {
        val student = Student.fromDto(studentDto)
        students[student.id] = student
    }

    fun getStudent(id: UUID): Student? = students[id]

    fun getStudentNames(): Map<UUID, String> = students
        .map { (key, value) ->
            key to value.name
        }
        .toMap()

    fun updateStudent(student: Student) {
        require(students.containsKey(student.id)) { "The student must already exist in the system." }
        students[student.id] = student
    }
}