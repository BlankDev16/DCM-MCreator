package com.ranidgames.defmod.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorld;

import java.util.Map;
import java.util.Collections;

import com.ranidgames.defmod.DefinitiveContentModModVariables;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class CheckForHelperProcedure {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void init(FMLClientSetupEvent event) {
			executeProcedure(Collections.emptyMap());
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency world for procedure CheckForHelper!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((net.minecraftforge.fml.ModList.get().isLoaded("dcm_helper"))) {
			DefinitiveContentModModVariables.IsHelper = (boolean) (true);
		}
	}
}
