package com.amex.plugins

import io.ktor.server.application.*
import io.github.smiley4.ktorswaggerui.SwaggerUI

fun Application.configureSwagger() {
    install(SwaggerUI) {
        swagger {
            swaggerUrl = "swagger-ui"
            forwardRoot = true
        }
        info {
            title = "Banking API"
            version = "1.0"
            description = "Swagger for Sample API"
        }
    }
}