
package com.ranidgames.defmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.ranidgames.defmod.item.DefinitiveBlogGunItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class DMCMiscItemGroup extends DefinitiveContentModModElements.ModElement {
	public DMCMiscItemGroup(DefinitiveContentModModElements instance) {
		super(instance, 792);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdmc_misc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DefinitiveBlogGunItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
