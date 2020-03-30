package org.wevanson

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class StartupResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/quarkus")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}