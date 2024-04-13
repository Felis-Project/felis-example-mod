package org.example.mod

import io.github.joemama.loader.api.CommonEntrypoint
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod : CommonEntrypoint {
    override fun onInit() {
        logger.info("Example mod has been initialized")
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(ExampleMod::class.java)
    }
}
