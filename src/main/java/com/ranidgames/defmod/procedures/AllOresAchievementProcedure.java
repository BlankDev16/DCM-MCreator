package com.ranidgames.defmod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

import com.ranidgames.defmod.item.WalkerItem;
import com.ranidgames.defmod.item.VoidShardItem;
import com.ranidgames.defmod.item.VerumDustItem;
import com.ranidgames.defmod.item.UraniumShardItem;
import com.ranidgames.defmod.item.UnobtainiumPillarItem;
import com.ranidgames.defmod.item.UnobtainiumBaseItem;
import com.ranidgames.defmod.item.UltraniumIngotItem;
import com.ranidgames.defmod.item.TrueUnobtainiumItem;
import com.ranidgames.defmod.item.SuperatumIngotItem;
import com.ranidgames.defmod.item.SubnormaliIngotItem;
import com.ranidgames.defmod.item.StarbasedDustItem;
import com.ranidgames.defmod.item.SecundariumIngotItem;
import com.ranidgames.defmod.item.SecondiumItem;
import com.ranidgames.defmod.item.RerumItem;
import com.ranidgames.defmod.item.ProvectusIngotItem;
import com.ranidgames.defmod.item.PrimusIngotItem;
import com.ranidgames.defmod.item.PretiosaItem;
import com.ranidgames.defmod.item.PillusIngotItem;
import com.ranidgames.defmod.item.MaximumIngotItem;
import com.ranidgames.defmod.item.IntermediumIngotItem;
import com.ranidgames.defmod.item.GreenusIngotItem;
import com.ranidgames.defmod.item.FundousItem;
import com.ranidgames.defmod.item.FloratomicItem;
import com.ranidgames.defmod.item.DefinitiveDiamondItem;
import com.ranidgames.defmod.item.BloonusIngotItem;
import com.ranidgames.defmod.item.BasisIngotItem;
import com.ranidgames.defmod.item.AbnormisIngotItem;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class AllOresAchievementProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure AllOresAchievement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BasisIngotItem.block)) : false)) {
			if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PillusIngotItem.block)) : false)) {
				if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SecondiumItem.block)) : false)) {
					if (((entity instanceof PlayerEntity)
							? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(VerumDustItem.block))
							: false)) {
						if (((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UnobtainiumBaseItem.block))
								: false)) {
							if (((entity instanceof PlayerEntity)
									? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(UnobtainiumPillarItem.block))
									: false)) {
								if (((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(TrueUnobtainiumItem.block))
										: false)) {
									if (((entity instanceof PlayerEntity)
											? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GreenusIngotItem.block))
											: false)) {
										if (((entity instanceof PlayerEntity)
												? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BloonusIngotItem.block))
												: false)) {
											if (((entity instanceof PlayerEntity)
													? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PrimusIngotItem.block))
													: false)) {
												if (((entity instanceof PlayerEntity)
														? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SecundariumIngotItem.block))
														: false)) {
													if (((entity instanceof PlayerEntity)
															? ((PlayerEntity) entity).inventory
																	.hasItemStack(new ItemStack(IntermediumIngotItem.block))
															: false)) {
														if (((entity instanceof PlayerEntity)
																? ((PlayerEntity) entity).inventory
																		.hasItemStack(new ItemStack(ProvectusIngotItem.block))
																: false)) {
															if (((entity instanceof PlayerEntity)
																	? ((PlayerEntity) entity).inventory
																			.hasItemStack(new ItemStack(MaximumIngotItem.block))
																	: false)) {
																if (((entity instanceof PlayerEntity)
																		? ((PlayerEntity) entity).inventory
																				.hasItemStack(new ItemStack(SuperatumIngotItem.block))
																		: false)) {
																	if (((entity instanceof PlayerEntity)
																			? ((PlayerEntity) entity).inventory
																					.hasItemStack(new ItemStack(SubnormaliIngotItem.block))
																			: false)) {
																		if (((entity instanceof PlayerEntity)
																				? ((PlayerEntity) entity).inventory
																						.hasItemStack(new ItemStack(AbnormisIngotItem.block))
																				: false)) {
																			if (((entity instanceof PlayerEntity)
																					? ((PlayerEntity) entity).inventory
																							.hasItemStack(new ItemStack(RerumItem.block))
																					: false)) {
																				if (((entity instanceof PlayerEntity)
																						? ((PlayerEntity) entity).inventory
																								.hasItemStack(new ItemStack(PretiosaItem.block))
																						: false)) {
																					if (((entity instanceof PlayerEntity)
																							? ((PlayerEntity) entity).inventory.hasItemStack(
																									new ItemStack(DefinitiveDiamondItem.block))
																							: false)) {
																						if (((entity instanceof PlayerEntity)
																								? ((PlayerEntity) entity).inventory.hasItemStack(
																										new ItemStack(VoidShardItem.block))
																								: false)) {
																							if (((entity instanceof PlayerEntity)
																									? ((PlayerEntity) entity).inventory.hasItemStack(
																											new ItemStack(WalkerItem.block))
																									: false)) {
																								if (((entity instanceof PlayerEntity)
																										? ((PlayerEntity) entity).inventory
																												.hasItemStack(new ItemStack(
																														FundousItem.block))
																										: false)) {
																									if (((entity instanceof PlayerEntity)
																											? ((PlayerEntity) entity).inventory
																													.hasItemStack(new ItemStack(
																															StarbasedDustItem.block))
																											: false)) {
																										if (((entity instanceof PlayerEntity)
																												? ((PlayerEntity) entity).inventory
																														.hasItemStack(new ItemStack(
																																FloratomicItem.block))
																												: false)) {
																											if (((entity instanceof PlayerEntity)
																													? ((PlayerEntity) entity).inventory
																															.hasItemStack(
																																	new ItemStack(
																																			UraniumShardItem.block))
																													: false)) {
																												if (((entity instanceof PlayerEntity)
																														? ((PlayerEntity) entity).inventory
																																.hasItemStack(
																																		new ItemStack(
																																				UltraniumIngotItem.block))
																														: false)) {
																													if (entity instanceof PlayerEntity)
																														((PlayerEntity) entity)
																																.addExperienceLevel(
																																		(int) 1495);
																													if (entity instanceof ServerPlayerEntity) {
																														Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server)
																																.getAdvancementManager()
																																.getAdvancement(
																																		new ResourceLocation(
																																				"definitive_content_mod:all_ores_wtf"));
																														AdvancementProgress _ap = ((ServerPlayerEntity) entity)
																																.getAdvancements()
																																.getProgress(_adv);
																														if (!_ap.isDone()) {
																															Iterator _iterator = _ap
																																	.getRemaningCriteria()
																																	.iterator();
																															while (_iterator
																																	.hasNext()) {
																																String _criterion = (String) _iterator
																																		.next();
																																((ServerPlayerEntity) entity)
																																		.getAdvancements()
																																		.grantCriterion(
																																				_adv,
																																				_criterion);
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
