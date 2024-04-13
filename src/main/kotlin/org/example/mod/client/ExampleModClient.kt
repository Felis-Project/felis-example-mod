package org.example.mod.client

import io.github.joemama.loader.api.client.ClientEntrypoint
import io.github.joemama.loader.side.OnlyIn
import io.github.joemama.loader.side.Side
import org.example.mod.ExampleMod

@OnlyIn(Side.CLIENT)
class ExampleModClient : ClientEntrypoint {
    override fun onClientInit() {
        ExampleMod.logger.info("Client has been initialized")
    }
}
