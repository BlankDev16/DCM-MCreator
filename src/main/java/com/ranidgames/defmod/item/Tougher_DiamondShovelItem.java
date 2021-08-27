
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import com.ranidgames.defmod.itemgroup.DCMToolsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class Tougher_DiamondShovelItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:tougher_diamond_shovel")
	public static final Item block = null;
	public Tougher_DiamondShovelItem(DefinitiveContentModModElements instance) {
		super(instance, 873);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1894;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 36;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIAMOND_BLOCK));
			}
		}, 1, -3f, new Item.Properties().group(DCMToolsItemGroup.tab)) {
		}.setRegistryName("tougher_diamond_shovel"));
	}
}
