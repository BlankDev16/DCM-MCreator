
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
public class PretiosaAxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:pretiosa_axe")
	public static final Item block = null;
	public PretiosaAxeItem(DefinitiveContentModModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5419;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 79f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 126;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PretiosaItem.block));
			}
		}, 1, -3f, new Item.Properties().group(DCMToolsItemGroup.tab)) {
		}.setRegistryName("pretiosa_axe"));
	}
}
