
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.ranidgames.defmod.itemgroup.DCMToolsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class WalkerAxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:walker_axe")
	public static final Item block = null;
	public WalkerAxeItem(DefinitiveContentModModElements instance) {
		super(instance, 88);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 125200;
			}

			public float getEfficiency() {
				return 39.5f;
			}

			public float getAttackDamage() {
				return 101f;
			}

			public int getHarvestLevel() {
				return 30;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WalkerItem.block));
			}
		}, 1, -3f, new Item.Properties().group(DCMToolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("walker_axe"));
	}
}
