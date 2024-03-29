package net.pixelatedcorn.susmod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.pixelatedcorn.susmod.block.ModScreens;
import net.pixelatedcorn.susmod.block.dwaynefurnace.DwayneScreen;

public class SusModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreens.DWAYNE_SCREEN_HANDLER, DwayneScreen::new);
    }
}
