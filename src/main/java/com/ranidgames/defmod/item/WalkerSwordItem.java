
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.itemgroup.DCMSwordsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class WalkerSwordItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:walker_sword")
	public static final Item block = null;
	public WalkerSwordItem(DefinitiveContentModModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 125200;
			}

			public float getEfficiency() {
				return 41.5f;
			}

			public float getAttackDamage() {
				return 102f;
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
		}, 3, -2.2f, new Item.Properties().group(DCMSwordsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("walker_sword"));
	}
}
