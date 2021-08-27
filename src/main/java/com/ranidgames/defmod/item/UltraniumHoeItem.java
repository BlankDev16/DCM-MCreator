
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class UltraniumHoeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ultranium_hoe")
	public static final Item block = null;
	public UltraniumHoeItem(DefinitiveContentModModElements instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 10346;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 68f;
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
		}, 0, -2.7f, new Item.Properties().group(FantasysTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("ultranium_hoe"));
	}
}
