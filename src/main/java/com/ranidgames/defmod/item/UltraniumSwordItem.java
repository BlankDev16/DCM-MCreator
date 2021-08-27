
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class UltraniumSwordItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ultranium_sword")
	public static final Item block = null;
	public UltraniumSwordItem(DefinitiveContentModModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10346;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 222f;
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
		}, 3, 1f, new Item.Properties().group(FantasysTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("ultranium_sword"));
	}
}
