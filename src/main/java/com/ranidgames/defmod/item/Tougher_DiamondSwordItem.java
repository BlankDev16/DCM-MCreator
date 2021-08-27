
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import com.ranidgames.defmod.itemgroup.DCMSwordsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class Tougher_DiamondSwordItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:tougher_diamond_sword")
	public static final Item block = null;
	public Tougher_DiamondSwordItem(DefinitiveContentModModElements instance) {
		super(instance, 872);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1894;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 14f;
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
		}, 3, -3f, new Item.Properties().group(DCMSwordsItemGroup.tab)) {
		}.setRegistryName("tougher_diamond_sword"));
	}
}
