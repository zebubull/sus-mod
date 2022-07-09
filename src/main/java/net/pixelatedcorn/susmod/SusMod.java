package net.pixelatedcorn.susmod;

import net.pixelatedcorn.susmod.block.*;
import net.fabricmc.api.ModInitializer;
import net.pixelatedcorn.susmod.item.ModItems;
import net.pixelatedcorn.susmod.recipes.ModRecipes;
import net.pixelatedcorn.susmod.sound.ModSounds;
import net.pixelatedcorn.susmod.worldgen.ModFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SusMod implements ModInitializer {
    public static final String MOD_ID;
    public static final Logger LOGGER;

    @Override
    public void onInitialize() {
        ModSounds.RegisterSounds();
        ModBlocks.RegisterBlocks();
        ModItems.RegisterItems();
        ModFeatures.RegisterFeatures();
        ModRecipes.RegisterRecipeTypes();

        LOGGER.info("Initialization complete.");
    }

    static {
        MOD_ID = "susmod";
        LOGGER = LoggerFactory.getLogger(MOD_ID);
    }
}