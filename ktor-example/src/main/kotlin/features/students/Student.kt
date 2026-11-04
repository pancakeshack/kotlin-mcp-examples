package pancake.shack.features.students

import java.util.UUID
import kotlin.time.Clock
import kotlin.time.Instant

data class Student(
    val id: UUID,
    val name: String,
    val classes: List<String>,
    val enrolledSince: Instant = Clock.System.now(),
    val updatedAt: Instant = Clock.System.now()
)
