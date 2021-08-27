
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class SaharadPickaxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:saharad_pickaxe")
	public static final Item block = null;
	public SaharadPickaxeItem(DefinitiveContentModModElements instance) {
		super(instance, 1579);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3436;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 13;
			}

			public int getEnchantability() {
				return 91;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SaharadItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("saharad_pickaxe"));
	}
}
