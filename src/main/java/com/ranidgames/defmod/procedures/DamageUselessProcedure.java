package com.ranidgames.defmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.ranidgames.defmod.item.UselessSwordItem;
import com.ranidgames.defmod.DefinitiveContentModModVariables;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class DamageUselessProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DamageUseless!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency world for procedure DamageUseless!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == UselessSwordItem.block)) {
			DefinitiveContentModModVariables.WorldVariables
					.get(world).UselessDamage = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).UselessDamage + 1);
			DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			(new ItemStack(UselessSwordItem.block)).setDamage((int) DefinitiveContentModModVariables.WorldVariables.get(world).UselessDamage);
		}
	}
}
