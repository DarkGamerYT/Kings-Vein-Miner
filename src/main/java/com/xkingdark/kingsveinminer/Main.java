package com.xkingdark.kingsveinminer;

import com.xkingdark.kingsveinminer.helpers.Registry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String MOD_ID = "xkingdark";
    public static final Logger LOGGER = LoggerFactory.getLogger("King's Vein Miner");
    
    @Override
    public void onInitialize() {
        Registry.initialize();
    }
}