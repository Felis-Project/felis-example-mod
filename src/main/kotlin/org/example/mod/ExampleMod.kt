package org.example.mod

import io.github.joemama.loader.api.CommonEntrypoint
import io.github.joemama.loader.api.event.GameEvents
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod : CommonEntrypoint {
    val logger: Logger = LoggerFactory.getLogger(ExampleMod::class.java)

    override fun onInit() {
        GameEvents.Block.breakBlock.register { ctx ->
            this.logger.info("Thou shalt not break block")
            ctx.isCancelled = true
        }
        this.logger.info("Example mod has been initialized")
    }
}
