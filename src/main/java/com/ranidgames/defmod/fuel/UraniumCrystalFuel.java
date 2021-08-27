
package com.ranidgames.defmod.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import com.ranidgames.defmod.item.UraniumShardItem;

@Mod.EventBusSubscriber
public class UraniumCrystalFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UraniumShardItem.block)
			event.setBurnTime(6400);
	}
}
