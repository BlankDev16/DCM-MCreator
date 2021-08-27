package com.ranidgames.defmod.procedures;

import java.util.Map;

import com.ranidgames.defmod.DefinitiveContentModModVariables;

public class DebugModeOnKeyPressedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		DefinitiveContentModModVariables.DebugMode = (boolean) (!DefinitiveContentModModVariables.DebugMode);
	}
}
