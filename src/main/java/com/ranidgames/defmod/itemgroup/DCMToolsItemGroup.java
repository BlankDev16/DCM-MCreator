
package com.ranidgames.defmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.ranidgames.defmod.item.NetherDiscItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class DCMToolsItemGroup extends DefinitiveContentModModElements.ModElement {
	public DCMToolsItemGroup(DefinitiveContentModModElements instance) {
		super(instance, 788);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdcm_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NetherDiscItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
