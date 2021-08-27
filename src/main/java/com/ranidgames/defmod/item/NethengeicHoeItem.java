
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class NethengeicHoeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:nethengeic_hoe")
	public static final Item block = null;
	public NethengeicHoeItem(DefinitiveContentModModElements instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 5759;
			}

			public float getEfficiency() {
				return 23f;
			}

			public float getAttackDamage() {
				return 17f;
			}

			public int getHarvestLevel() {
				return 19;
			}

			public int getEnchantability() {
				return 132;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHER_STAR));
			}
		}, 0, -3f, new Item.Properties().group(FantasysTabItemGroup.tab)) {
		}.setRegistryName("nethengeic_hoe"));
	}
}
