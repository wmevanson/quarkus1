package org.wevanson.service

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
    fun greeting(name: String) =
        "this is $name"
}