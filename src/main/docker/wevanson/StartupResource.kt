package org.wevanson

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import org.wevanson.service

@Path("/quarkus")
class StartupResource {

    @Inject
    lateinit var requestSerice: RequestSerice

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/request/{name}")
    fun requests(@PathParam name: String) = "HI ${requestService.requests()}"

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}