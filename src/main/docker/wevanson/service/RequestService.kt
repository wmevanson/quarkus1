import org.wevanson.service

import io.smallrye.mutiny.Multi
import io.smallrye.mutiny.Uni

import javax.enterprise.context.ApplicationScoped
import java.time.Duration

@ApplicationScoped
open class RequestService {    

    fun requests(name: String) =
        Uni.createFrom().item(name)
                .onItem().apply(n -> String.format("I praying for 'm  %s", name))
}