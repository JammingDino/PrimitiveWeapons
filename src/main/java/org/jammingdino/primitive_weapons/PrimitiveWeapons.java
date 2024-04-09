package org.jammingdino.primitive_weapons;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.jammingdino.primitive_weapons.registry.items.ModItemGroups;
import org.jammingdino.primitive_weapons.registry.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimitiveWeapons implements ModInitializer {
    public static final String MOD_ID = "primitiveweapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
    public static Identifier id(String value) {
        return new Identifier(MOD_ID, value);
    }
}
