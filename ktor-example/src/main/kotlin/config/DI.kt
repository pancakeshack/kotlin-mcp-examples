package pancake.shack.config

import io.ktor.server.application.*
import io.ktor.server.plugins.di.*
import pancake.shack.GreetingService

// The contents of the `install` function will be used for the project template
fun Application.configureDependencyInjection() {
    dependencies {
        provide { GreetingService { "Hello, World!" } }
    }
}
