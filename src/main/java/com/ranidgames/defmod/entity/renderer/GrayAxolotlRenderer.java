package com.ranidgames.defmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.ranidgames.defmod.entity.GrayAxolotlEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GrayAxolotlRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GrayAxolotlEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("definitive_content_mod:textures/axolotl_blue.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer tail;
		private final ModelRenderer top_gills;
		private final ModelRenderer left_gills;
		private final ModelRenderer right_gills;
		private final ModelRenderer front_left_leg;
		private final ModelRenderer back_left_leg;
		private final ModelRenderer front_right_leg;
		private final ModelRenderer back_right_leg;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 18.0F, 0.0F);
			body.setTextureOffset(0, 11).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 4.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(2, 17).addBox(0.0F, -3.0F, -4.0F, 0.0F, 5.0F, 9.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 18.0F, -5.0F);
			head.setTextureOffset(0, 1).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 17.5F, 5.0F);
			tail.setTextureOffset(2, 19).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 12.0F, 0.0F, false);
			top_gills = new ModelRenderer(this);
			top_gills.setRotationPoint(0.0F, 15.0F, -6.0F);
			top_gills.setTextureOffset(3, 37).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, 0.0F, false);
			left_gills = new ModelRenderer(this);
			left_gills.setRotationPoint(4.0F, 16.5F, -6.0F);
			left_gills.setTextureOffset(11, 40).addBox(0.0F, -3.5F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			right_gills = new ModelRenderer(this);
			right_gills.setRotationPoint(-4.0F, 16.5F, -6.0F);
			right_gills.setTextureOffset(0, 40).addBox(-3.0F, -3.5F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			front_left_leg = new ModelRenderer(this);
			front_left_leg.setRotationPoint(4.0F, 19.0F, -4.0F);
			front_left_leg.setTextureOffset(2, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);
			back_left_leg = new ModelRenderer(this);
			back_left_leg.setRotationPoint(4.0F, 19.0F, 3.0F);
			back_left_leg.setTextureOffset(2, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);
			front_right_leg = new ModelRenderer(this);
			front_right_leg.setRotationPoint(-4.0F, 19.0F, -4.0F);
			front_right_leg.setTextureOffset(2, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);
			back_right_leg = new ModelRenderer(this);
			back_right_leg.setRotationPoint(-4.0F, 19.0F, 3.0F);
			back_right_leg.setTextureOffset(2, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			top_gills.render(matrixStack, buffer, packedLight, packedOverlay);
			left_gills.render(matrixStack, buffer, packedLight, packedOverlay);
			right_gills.render(matrixStack, buffer, packedLight, packedOverlay);
			front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.front_right_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.back_right_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.back_left_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.front_left_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
