
package com.ranidgames.defmod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import com.ranidgames.defmod.item.RerumPickaxeItem;
import com.ranidgames.defmod.item.PretiosaPickaxeItem;
import com.ranidgames.defmod.item.DefinitivePickazeItem;
import com.ranidgames.defmod.item.BlackPickaxeItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class TreasureEnchantment extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:treasure")
	public static final Enchantment enchantment = null;
	public TreasureEnchantment(DefinitiveContentModModElements instance) {
		super(instance, 572);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("treasure"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 10;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == DefinitivePickazeItem.block)
				return true;
			if (stack.getItem() == BlackPickaxeItem.block)
				return true;
			if (stack.getItem() == PretiosaPickaxeItem.block)
				return true;
			if (stack.getItem() == RerumPickaxeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
