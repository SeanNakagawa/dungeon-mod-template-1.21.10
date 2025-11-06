package net.sean.dungeonmod.item;

// import com.sun.jna.platform.unix.X11;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sean.dungeonmod.DungeonMod;
import net.sean.dungeonmod.item.custom.ChiselItem;

// import javax.xml.namespace.QName;

public class ModItems {
    private static Object TutorialMod;
    public static final Item COIN = registerItem("coin", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DungeonMod.MOD_ID,"coin")))));
    public static final Item COIN_STACK = registerItem("coin_stack", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DungeonMod.MOD_ID,"coin_stack")))));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DungeonMod.MOD_ID,"chisel")))));

    // add more of that guy above to add another item

    private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(DungeonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DungeonMod.LOGGER.info("Registering Mod Items for " + DungeonMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COIN);
            entries.add(COIN_STACK);

            entries.add(CHISEL);
        });
    }
}
