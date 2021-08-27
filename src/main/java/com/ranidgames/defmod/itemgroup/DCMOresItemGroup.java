
package com.ranidgames.defmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.ranidgames.defmod.item.IDWIWSFYItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class DCMOresItemGroup extends DefinitiveContentModModElements.ModElement {
	public DCMOresItemGroup(DefinitiveContentModModElements instance) {
		super(instance, 791);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdcm_ores") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IDWIWSFYItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
