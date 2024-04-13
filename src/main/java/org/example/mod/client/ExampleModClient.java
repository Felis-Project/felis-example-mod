package org.example.mod.client;

import io.github.joemama.loader.api.client.ClientEntrypoint;
import org.example.mod.ExampleMod;

public class ExampleModClient implements ClientEntrypoint {
    @Override
    public void onClientInit() {
        ExampleMod.LOGGER.info("Client has been initialized");
    }
}
