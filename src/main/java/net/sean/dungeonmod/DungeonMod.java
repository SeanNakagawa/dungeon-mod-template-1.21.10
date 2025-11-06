package net.sean.dungeonmod;

import net.fabricmc.api.ModInitializer;

import net.sean.dungeonmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonMod implements ModInitializer {
	public static final String MOD_ID = "dungeon-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}