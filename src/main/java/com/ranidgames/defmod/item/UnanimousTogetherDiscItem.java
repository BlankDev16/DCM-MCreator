
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import com.ranidgames.defmod.itemgroup.DMCMiscItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class UnanimousTogetherDiscItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:unanimous_together_disc")
	public static final Item block = null;
	public UnanimousTogetherDiscItem(DefinitiveContentModModElements instance) {
		super(instance, 192);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DefinitiveContentModModElements.sounds.get(new ResourceLocation("definitive_content_mod:unanimous_together")),
					new Item.Properties().group(DMCMiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("unanimous_together_disc");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\"Oh"));
			list.add(new StringTextComponent("is this the disc"));
			list.add(new StringTextComponent("we wrote when we were"));
			list.add(new StringTextComponent("4 years old?\""));
		}
	}
}
