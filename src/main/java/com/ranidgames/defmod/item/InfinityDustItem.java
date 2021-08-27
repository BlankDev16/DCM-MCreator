
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.ranidgames.defmod.itemgroup.DCMOresItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class InfinityDustItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:infinity_dust")
	public static final Item block = null;
	public InfinityDustItem(DefinitiveContentModModElements instance) {
		super(instance, 1972);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DCMOresItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("infinity_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
