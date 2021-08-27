
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.itemgroup.DCMToolsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class WalkerShovelItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:walker_shovel")
	public static final Item block = null;
	public WalkerShovelItem(DefinitiveContentModModElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 125200;
			}

			public float getEfficiency() {
				return 42f;
			}

			public float getAttackDamage() {
				return 18.6f;
			}

			public int getHarvestLevel() {
				return 30;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WalkerItem.block));
			}
		}, 1, -3f, new Item.Properties().group(DCMToolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("walker_shovel"));
	}
}
