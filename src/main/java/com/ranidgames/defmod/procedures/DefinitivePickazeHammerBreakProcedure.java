package com.ranidgames.defmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import java.util.Map;

import com.ranidgames.defmod.DefinitiveContentModMod;

public class DefinitivePickazeHammerBreakProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency entity for procedure DefinitivePickazeHammerBreak!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency x for procedure DefinitivePickazeHammerBreak!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency y for procedure DefinitivePickazeHammerBreak!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency z for procedure DefinitivePickazeHammerBreak!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DefinitiveContentModMod.LOGGER.warn("Failed to load dependency world for procedure DefinitivePickazeHammerBreak!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.rotationPitch) > 40) || ((entity.rotationPitch) < (-40)))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
		} else if ((((entity.getHorizontalFacing()) == Direction.NORTH) || ((entity.getHorizontalFacing()) == Direction.SOUTH))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		} else if ((((entity.getHorizontalFacing()) == Direction.WEST) || ((entity.getHorizontalFacing()) == Direction.EAST))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		}
	}
}
