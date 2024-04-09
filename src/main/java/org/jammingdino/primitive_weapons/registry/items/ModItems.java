package org.jammingdino.primitive_weapons.registry.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jammingdino.primitive_weapons.PrimitiveWeapons;

public class ModItems {
    public static final Item COAL_PICKAXE = registerItem("coal_pickaxe", new PickaxeItem(ModItemMaterial.COAL, 1, -2.8f, new FabricItemSettings()));
    public static final Item COAL_AXE = registerItem("coal_axe", new AxeItem(ModItemMaterial.COAL, 7, -3.2f, new FabricItemSettings()));
    public static final Item COAL_SHOVEL = registerItem("coal_shovel", new ShovelItem(ModItemMaterial.COAL, 2, -3f, new FabricItemSettings()));
    public static final Item COAL_HOE = registerItem("coal_hoe", new HoeItem(ModItemMaterial.COAL, -1, -1.5f, new FabricItemSettings()));
    public static final Item COAL_SWORD = registerItem("coal_sword", new SwordItem(ModItemMaterial.COAL, 4, -2.6f, new FabricItemSettings()));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModItemMaterial.COPPER, 2, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModItemMaterial.COPPER, 8, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModItemMaterial.COPPER, 3, -3f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModItemMaterial.COPPER, -1, -0.5f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModItemMaterial.COPPER, 5, -2.6f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COAL_PICKAXE);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PrimitiveWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PrimitiveWeapons.LOGGER.info("Registering Mod Items for " + PrimitiveWeapons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
