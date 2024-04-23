package org.example.mod

import felis.kittens.core.CommonEntrypoint
import felis.kittens.core.event.GameEvents
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod : CommonEntrypoint {
    val logger: Logger = LoggerFactory.getLogger(ExampleMod::class.java)

    override fun onInit() {
        GameEvents.Block.broken.register { ctx ->
            this.logger.info("Thou shalt not break block")
            ctx.isCancelled = true
        }
        this.logger.info("Example mod has been initialized")
    }
}
