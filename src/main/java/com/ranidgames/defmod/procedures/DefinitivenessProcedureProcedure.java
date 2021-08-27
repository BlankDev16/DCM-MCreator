package com.ranidgames.defmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import com.ranidgames.defmod.item.UnobtainiumItem;
import com.ranidgames.defmod.item.UnanimousTogetherDiscItem;
import com.ranidgames.defmod.item.UltraCompressedFlintItem;
import com.ranidgames.defmod.item.SubnormaliIngotItem;
import com.ranidgames.defmod.item.RepetitiveMusicItem;
import com.ranidgames.defmod.item.MaximumIngotItem;
import com.ranidgames.defmod.item.GreenusIngotItem;
import com.ranidgames.defmod.item.DefinitiveSwordItem;
import com.ranidgames.defmod.item.DefinitiveDiamondItem;
import com.ranidgames.defmod.item.BloonusIngotItem;
import com.ranidgames.defmod.DefinitiveContentModModVariables;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class DefinitivenessProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double duration = event.getDuration();
				ItemStack itemstack = event.getItem();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("itemstack", itemstack);
				dependencies.put("duration", duration);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure DefinitivenessProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency world for procedure DefinitivenessProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness <= 100)) {
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UnobtainiumItem.block)) : false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 1);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GreenusIngotItem.block)) : false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 3);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BloonusIngotItem.block)) : false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 4);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(MaximumIngotItem.block)) : false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 7);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SubnormaliIngotItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 10);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RepetitiveMusicItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 11);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UltraCompressedFlintItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 16);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DefinitiveDiamondItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 22);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UnanimousTogetherDiscItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 41);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DefinitiveSwordItem.block))
					: false)) {
				DefinitiveContentModModVariables.WorldVariables
						.get(world).Definitiveness = (double) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness + 34);
				DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
			}
		} else {
			DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness = (double) 100;
			DefinitiveContentModModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
