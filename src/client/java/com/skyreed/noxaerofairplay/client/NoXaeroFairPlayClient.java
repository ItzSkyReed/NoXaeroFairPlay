package com.skyreed.noxaerofairplay.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoXaeroFairPlayClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("noxaerofairplay");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing NoXaeroFairPlay");
    }
}