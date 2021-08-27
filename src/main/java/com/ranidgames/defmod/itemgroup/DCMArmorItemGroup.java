
package com.ranidgames.defmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.ranidgames.defmod.item.ThisIsJustAFalloutItem;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class DCMArmorItemGroup extends DefinitiveContentModModElements.ModElement {
	public DCMArmorItemGroup(DefinitiveContentModModElements instance) {
		super(instance, 787);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdcm_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ThisIsJustAFalloutItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
