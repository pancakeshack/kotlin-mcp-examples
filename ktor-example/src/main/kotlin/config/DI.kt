package pancake.shack.config

import io.ktor.server.application.*
import io.ktor.server.plugins.di.*
import pancake.shack.features.students.StudentsService

fun Application.configureDependencyInjection() {
    dependencies {
        provide { StudentsService() }
    }
}
