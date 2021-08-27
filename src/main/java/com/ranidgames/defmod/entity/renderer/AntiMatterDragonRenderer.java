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

import com.ranidgames.defmod.entity.AntiMatterDragonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AntiMatterDragonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AntiMatterDragonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelantimatter_dragon(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("definitive_content_mod:textures/void_enderdragon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelantimatter_dragon extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer left_wing;
		private final ModelRenderer left_wing_tip;
		private final ModelRenderer right_wing;
		private final ModelRenderer right_wing_tip;
		private final ModelRenderer spine;
		private final ModelRenderer head;
		private final ModelRenderer mirrored;
		private final ModelRenderer jaw;
		private final ModelRenderer front_left_leg;
		private final ModelRenderer front_left_shin;
		private final ModelRenderer front_left_foot;
		private final ModelRenderer back_left_leg;
		private final ModelRenderer back_left_shin;
		private final ModelRenderer back_left_foot;
		private final ModelRenderer front_right_leg;
		private final ModelRenderer front_right_shin;
		private final ModelRenderer front_right_foot;
		private final ModelRenderer back_right_leg;
		private final ModelRenderer back_right_shin;
		private final ModelRenderer back_right_foot;
		public Modelantimatter_dragon() {
			textureWidth = 256;
			textureHeight = 256;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 4.0F, 8.0F);
			body.setTextureOffset(0, 0).addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, 0.0F, false);
			body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(-12.0F, 1.0F, -6.0F);
			body.addChild(left_wing);
			left_wing.setTextureOffset(112, 88).addBox(24.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, true);
			left_wing.setTextureOffset(-56, 88).addBox(24.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, true);
			left_wing_tip = new ModelRenderer(this);
			left_wing_tip.setRotationPoint(-56.0F, 0.0F, 0.0F);
			left_wing.addChild(left_wing_tip);
			left_wing_tip.setTextureOffset(112, 136).addBox(136.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, true);
			left_wing_tip.setTextureOffset(-56, 144).addBox(136.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, true);
			right_wing = new ModelRenderer(this);
			right_wing.setRotationPoint(12.0F, 1.0F, -6.0F);
			body.addChild(right_wing);
			right_wing.setTextureOffset(-56, 88).addBox(-80.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
			right_wing.setTextureOffset(112, 88).addBox(-80.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, false);
			right_wing_tip = new ModelRenderer(this);
			right_wing_tip.setRotationPoint(56.0F, 0.0F, 0.0F);
			right_wing.addChild(right_wing_tip);
			right_wing_tip.setTextureOffset(-56, 144).addBox(-192.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
			right_wing_tip.setTextureOffset(112, 136).addBox(-192.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, false);
			spine = new ModelRenderer(this);
			spine.setRotationPoint(0.0F, 15.0F, -21.0F);
			body.addChild(spine);
			spine.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			spine.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -1.0F, -11.0F);
			spine.addChild(head);
			head.setTextureOffset(176, 44).addBox(-6.0F, -1.0F, -24.0F, 12.0F, 5.0F, 16.0F, 0.0F, false);
			head.setTextureOffset(112, 30).addBox(-8.0F, -8.0F, -10.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(3.0F, -12.0F, -4.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(112, 0).addBox(3.0F, -3.0F, -22.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			mirrored = new ModelRenderer(this);
			mirrored.setRotationPoint(0.0F, 6.0F, 24.0F);
			head.addChild(mirrored);
			mirrored.setTextureOffset(0, 0).addBox(-5.0F, -18.0F, -28.0F, 2.0F, 4.0F, 6.0F, 0.0F, true);
			mirrored.setTextureOffset(112, 0).addBox(-5.0F, -9.0F, -46.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, 4.0F, -8.0F);
			head.addChild(jaw);
			jaw.setTextureOffset(176, 65).addBox(-6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F, 0.0F, false);
			front_left_leg = new ModelRenderer(this);
			front_left_leg.setRotationPoint(-12.0F, 20.0F, 2.0F);
			setRotationAngle(front_left_leg, 1.1781F, 0.0F, 0.0F);
			front_left_leg.setTextureOffset(112, 104).addBox(20.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);
			front_left_shin = new ModelRenderer(this);
			front_left_shin.setRotationPoint(0.0F, 21.0F, 0.0F);
			front_left_leg.addChild(front_left_shin);
			setRotationAngle(front_left_shin, 0.0873F, 0.0F, 0.0F);
			front_left_shin.setTextureOffset(226, 138).addBox(21.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);
			front_left_foot = new ModelRenderer(this);
			front_left_foot.setRotationPoint(1.0F, 23.0F, 0.0F);
			front_left_shin.addChild(front_left_foot);
			setRotationAngle(front_left_foot, 0.2618F, 0.0F, 0.0F);
			front_left_foot.setTextureOffset(144, 104).addBox(19.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);
			back_left_leg = new ModelRenderer(this);
			back_left_leg.setRotationPoint(-16.0F, 16.0F, 42.0F);
			setRotationAngle(back_left_leg, 1.2217F, 0.0F, 0.0F);
			back_left_leg.setTextureOffset(0, 0).addBox(24.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);
			back_left_shin = new ModelRenderer(this);
			back_left_shin.setRotationPoint(0.0F, 30.0F, -6.0F);
			back_left_leg.addChild(back_left_shin);
			setRotationAngle(back_left_shin, 0.48F, 0.0F, 0.0F);
			back_left_shin.setTextureOffset(196, 0).addBox(26.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);
			back_left_foot = new ModelRenderer(this);
			back_left_foot.setRotationPoint(0.0F, 30.0F, 8.0F);
			back_left_shin.addChild(back_left_foot);
			setRotationAngle(back_left_foot, 0.3054F, 0.0F, 0.0F);
			back_left_foot.setTextureOffset(112, 0).addBox(23.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);
			front_right_leg = new ModelRenderer(this);
			front_right_leg.setRotationPoint(12.0F, 20.0F, 2.0F);
			setRotationAngle(front_right_leg, 1.1781F, 0.0F, 0.0F);
			front_right_leg.setTextureOffset(112, 104).addBox(-28.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);
			front_right_shin = new ModelRenderer(this);
			front_right_shin.setRotationPoint(0.0F, 21.0F, 0.0F);
			front_right_leg.addChild(front_right_shin);
			setRotationAngle(front_right_shin, 0.0873F, 0.0F, 0.0F);
			front_right_shin.setTextureOffset(226, 138).addBox(-27.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);
			front_right_foot = new ModelRenderer(this);
			front_right_foot.setRotationPoint(0.0F, 23.0F, 0.0F);
			front_right_shin.addChild(front_right_foot);
			setRotationAngle(front_right_foot, 0.2618F, 0.0F, 0.0F);
			front_right_foot.setTextureOffset(144, 104).addBox(-28.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);
			back_right_leg = new ModelRenderer(this);
			back_right_leg.setRotationPoint(16.0F, 16.0F, 42.0F);
			setRotationAngle(back_right_leg, 1.2217F, 0.0F, 0.0F);
			back_right_leg.setTextureOffset(0, 0).addBox(-40.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);
			back_right_shin = new ModelRenderer(this);
			back_right_shin.setRotationPoint(0.0F, 30.0F, -6.0F);
			back_right_leg.addChild(back_right_shin);
			setRotationAngle(back_right_shin, 0.48F, 0.0F, 0.0F);
			back_right_shin.setTextureOffset(196, 0).addBox(-38.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);
			back_right_foot = new ModelRenderer(this);
			back_right_foot.setRotationPoint(0.0F, 30.0F, 8.0F);
			back_right_shin.addChild(back_right_foot);
			setRotationAngle(back_right_foot, 0.3054F, 0.0F, 0.0F);
			back_right_foot.setTextureOffset(112, 0).addBox(-41.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.right_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
