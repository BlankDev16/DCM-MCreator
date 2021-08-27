
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class ThirstushSwordItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:thirstush_sword")
	public static final Item block = null;
	public ThirstushSwordItem(DefinitiveContentModModElements instance) {
		super(instance, 1770);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 802;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 32;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ThirstushDustItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("thirstush_sword"));
	}
}
