package org.example.mod.client

import felis.kittens.core.client.ClientEntrypoint
import felis.side.OnlyIn
import felis.side.Side
import org.example.mod.ExampleMod

@OnlyIn(Side.CLIENT)
object ExampleModClient : ClientEntrypoint {
    override fun onClientInit() {
        ExampleMod.logger.info("Client has been initialized")
    }
}
