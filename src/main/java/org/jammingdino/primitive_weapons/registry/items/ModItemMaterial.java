package org.jammingdino.primitive_weapons.registry.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModItemMaterial implements ToolMaterial {
    COAL(1, 200, 4.0f, 1f, 12, () -> Ingredient.ofItems(Items.COAL)),
    COPPER(2, 350, 7.0f, 1f, 14, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BONE(2, 230, 5.5f, 1f, 4, () -> Ingredient.ofItems(Items.BONE)),
    WOOD(1, 49, 2.0f, 1f, 8, () -> Ingredient.ofItems(Items.OAK_LOG));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModItemMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }
    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
