package com.ranidgames.defmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

import com.ranidgames.defmod.DefinitiveContentModModVariables;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class ClassBonusProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure ClassBonus!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.STRENGTH)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == (true)) && (((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.HASTE)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == (true)) && (((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.RESISTANCE)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == (true)) && ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.SPEED)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == (true)))))) {
			if (((((entity.getCapability(DefinitiveContentModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DefinitiveContentModModVariables.PlayerVariables())).ClassTeam)).equals("warrior"))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 3));
			} else if (((((entity.getCapability(DefinitiveContentModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DefinitiveContentModModVariables.PlayerVariables())).ClassTeam)).equals("miner"))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 3));
			} else if (((((entity.getCapability(DefinitiveContentModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DefinitiveContentModModVariables.PlayerVariables())).ClassTeam)).equals("defender"))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 3));
			} else if (((((entity.getCapability(DefinitiveContentModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DefinitiveContentModModVariables.PlayerVariables())).ClassTeam)).equals("hunter"))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 3));
			} else {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).clearActivePotions();
			}
		}
	}
}
