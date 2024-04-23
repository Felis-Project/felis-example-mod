package org.example.mod.mixin;

import net.minecraft.client.Minecraft;
import org.example.mod.ExampleMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    private void printHell(CallbackInfo ci) {
        ExampleMod.LOGGER.info("Hello from example mixin");
    }
}
