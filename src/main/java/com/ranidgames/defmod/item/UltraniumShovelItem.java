
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class UltraniumShovelItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ultranium_shovel")
	public static final Item block = null;
	public UltraniumShovelItem(DefinitiveContentModModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 10346;
			}

			public float getEfficiency() {
				return 90f;
			}

			public float getAttackDamage() {
				return 36f;
			}

			public int getHarvestLevel() {
				return 50;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(UltraniumIngotItem.block));
			}
		}, 1, -2.0999999999999999f, new Item.Properties().group(FantasysTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("ultranium_shovel"));
	}
}
