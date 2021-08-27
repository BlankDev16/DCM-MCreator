
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class CobaltiteHoeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:cobaltite_hoe")
	public static final Item block = null;
	public CobaltiteHoeItem(DefinitiveContentModModElements instance) {
		super(instance, 1289);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1387;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 48;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CobaltiteIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("cobaltite_hoe"));
	}
}
