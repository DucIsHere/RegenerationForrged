package com.regenerationforrged;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegenerationForrged implements ModInitializer {
	public static final String MOD_ID = "regenerationforrged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ChunkManager.register();

		LOGGER.info("Hello Fabric world!");
	}
}
