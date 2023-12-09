package com.amex.plugins

import com.amex.dao.IndiviualSubSystems
import com.amex.dtos.ResponseWrapper
import com.amex.models.Indiviual
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
var dao=IndiviualSubSystems()
fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        route("/customers") {
        get {
            var indiviualList = dao.getAllIndiviual()
            call.response.status(HttpStatusCode.OK)
            call.respond(indiviualList)
        }
        post {
            var indiviual = call.receive<Indiviual>()
            if(dao.addIndiviual(indiviual)) {
                call.response.status(HttpStatusCode.OK)
                call.respond((indiviual))
            }
            else {
                call.response.status(HttpStatusCode.BadRequest)
                call.respond(("Object not added.."))
            }
//            call.respondText { "Adding Customers..." }
        }
            put {
                var indiviual = call.receive<Indiviual>()
                var indi  = dao.updateIndiviual(indiviual)
                call.response.status(HttpStatusCode.OK)
                call.respond(indi)
            }
            delete {
               var accNo = call.receive<String>()
                var indList= dao.getAllIndiviual()

               var data =  indList.filter{it -> it._accountNo == accNo.toLong()}

                if(data.size >0 ) {
                    data.first()
                    dao.deleteIndiviual(accNo.toLong())
                    call.response.status(HttpStatusCode.OK)
                    call.respond("Object Deleted")

                }  else {
                    call.response.status(HttpStatusCode.BadRequest)
                    call.respond("Object Not Found..")
                }
                }
        }
    }
}
