package org.jammingdino.primitive_weapons.registry.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jammingdino.primitive_weapons.PrimitiveWeapons;

public class ModItemGroups {
    public static final ItemGroup PRIMITIVE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PrimitiveWeapons.MOD_ID, "primitive"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.primitive"))
                    .icon(() -> new ItemStack(ModItems.COAL_PICKAXE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.COAL_SHOVEL);
                        entries.add(ModItems.COAL_PICKAXE);
                        entries.add(ModItems.COAL_AXE);
                        entries.add(ModItems.COAL_HOE);
                        entries.add(ModItems.COAL_SWORD);

                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_SWORD);

                        entries.add(ModItems.BONE_STABBER);
                        entries.add(ModItems.SHARP_STICK);
                        entries.add(ModItems.CLUB);

                    }).build());

    public static void registerItemGroups() {
        PrimitiveWeapons.LOGGER.info("Registering Item Groups for " + PrimitiveWeapons.MOD_ID);
    }
}
