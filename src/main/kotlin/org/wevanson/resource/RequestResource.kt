package org.wevanson.resouce

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.inject.Inject
import org.wevanson.service.RequestService

@Path("/requests")
class RequestResource {

    @Inject
    lateinit var requestService: RequestService

    @GET
    @Path("/request/for/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(name: String) = "a request for ${requestService.request($name)}"
}