
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class RepetitiveMusicItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:repetitive_music")
	public static final Item block = null;
	public RepetitiveMusicItem(DefinitiveContentModModElements instance) {
		super(instance, 189);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DefinitiveContentModModElements.sounds.get(new ResourceLocation("definitive_content_mod:music_disc_repetitive")),
					new Item.Properties().group(FantasysTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("repetitive_music");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
