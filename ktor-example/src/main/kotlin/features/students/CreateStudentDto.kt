package pancake.shack.features.students

data class CreateStudentDto(
    val name: String,
    val classes: List<String>,
)
