package org.example.mod;

import io.github.joemama.loader.api.CommonEntrypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements CommonEntrypoint {
    public static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.class);

    @Override
    public void onInit() {
        LOGGER.info("Example mod has been initialized");
    }
}
