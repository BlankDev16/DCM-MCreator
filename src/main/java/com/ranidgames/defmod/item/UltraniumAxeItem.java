
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class UltraniumAxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ultranium_axe")
	public static final Item block = null;
	public UltraniumAxeItem(DefinitiveContentModModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 198f;
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
		}, 1, -2.5f, new Item.Properties().group(FantasysTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("ultranium_axe"));
	}
}
