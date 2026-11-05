package pancake.shack.features.students

import java.util.UUID
import kotlin.time.Clock
import kotlin.time.Instant

data class Student(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val classes: List<String>,
    val enrolledSince: Instant = Clock.System.now(),
    val updatedAt: Instant = Clock.System.now()
) {
    companion object {
        fun fromDto(dto: CreateStudentDto): Student =
            Student(name = dto.name, classes = dto.classes)
    }
}
