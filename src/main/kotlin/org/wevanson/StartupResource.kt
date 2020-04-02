package org.wevanson

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.jboss.resteasy.annotations.jaxrs.PathParam
import org.wevanson.service.GreetingService

@Path("/quarkus1")
class StartupResource {

    @Inject
    lateinit var greetingService: GreetingService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/name/{person}")
    fun getName(@PathParam person: String): String {
        println("name sent: $person")
        val greet = greetingService.greeting($person)
        return "Hello $greet"
    } 

    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}