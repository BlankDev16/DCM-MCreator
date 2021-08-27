
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
public class OntchHoeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ontch_hoe")
	public static final Item block = null;
	public OntchHoeItem(DefinitiveContentModModElements instance) {
		super(instance, 1625);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2789;
			}

			public float getEfficiency() {
				return 17f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 11;
			}

			public int getEnchantability() {
				return 78;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OntchDustItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ontch_hoe"));
	}
}
