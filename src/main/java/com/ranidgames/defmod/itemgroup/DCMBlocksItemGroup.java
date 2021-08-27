
package com.ranidgames.defmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.ranidgames.defmod.item.RepetitiveMusicItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class DCMBlocksItemGroup extends DefinitiveContentModModElements.ModElement {
	public DCMBlocksItemGroup(DefinitiveContentModModElements instance) {
		super(instance, 790);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdcm_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RepetitiveMusicItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
