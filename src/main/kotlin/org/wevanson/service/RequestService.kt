package org.wevanson.service

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class RequestService {

    fun request(name: String): String {
        println("what I'm seeing: $name")
        return "Pray for $name"
    } 
}