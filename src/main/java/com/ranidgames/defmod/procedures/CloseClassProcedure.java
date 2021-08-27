package com.ranidgames.defmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.Map;
import java.util.HashMap;

import com.ranidgames.defmod.DefinitiveContentModModVariables;
import com.ranidgames.defmod.DefinitiveContentModMod;

public class CloseClassProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure CloseClass!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency guistate for procedure CloseClass!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			String _setval = (String) (new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:classteam");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText());
			entity.getCapability(DefinitiveContentModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ClassTeam = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
