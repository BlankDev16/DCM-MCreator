
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
public class StarbasedSwordItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:starbased_sword")
	public static final Item block = null;
	public StarbasedSwordItem(DefinitiveContentModModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5588;
			}

			public float getEfficiency() {
				return 23f;
			}

			public float getAttackDamage() {
				return 53f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 129;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StarbasedDustItem.block));
			}
		}, 3, -3f, new Item.Properties().group(FantasysTabItemGroup.tab)) {
		}.setRegistryName("starbased_sword"));
	}
}
