
package com.ranidgames.defmod.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import com.ranidgames.defmod.procedures.DefinitivenessProgressDisplayOverlayIngameProcedure;
import com.ranidgames.defmod.DefinitiveContentModModVariables;

import com.google.common.collect.ImmutableMap;

@Mod.EventBusSubscriber
public class DefinitivenessProgressOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (DefinitivenessProgressDisplayOverlayIngameProcedure.executeProcedure(ImmutableMap.of())) {
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"Definitiveness: " + (int) (DefinitiveContentModModVariables.WorldVariables.get(world).Definitiveness) + "", posX + -209,
						posY + -116, -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"Useless Amount: " + (DefinitiveContentModModVariables.WorldVariables.get(world).UselessDamage) + "", posX + -209,
						posY + -100, -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"Debug Mode: " + (DefinitiveContentModModVariables.DebugMode) + "", posX + -210, posY + -82, -1);
			}
		}
	}
}
