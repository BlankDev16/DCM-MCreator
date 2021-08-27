package com.ranidgames.defmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.ranidgames.defmod.DefinitiveContentModMod;

public class PowerEffectExpiresProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure PowerEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 20);
	}
}
