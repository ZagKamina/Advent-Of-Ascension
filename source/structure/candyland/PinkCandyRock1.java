package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class PinkCandyRock1 extends AoAStructure { //StructureSize: 4x8x4
	private static final IBlockState pinkRockCandy = BlockRegister.rockCandyPink.getDefaultState();

	public PinkCandyRock1() {
		super("PinkCandyRock1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 0, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 0, 2, pinkRockCandy);
		addBlock(world, basePos, 1, 0, 3, pinkRockCandy);
		addBlock(world, basePos, 2, 0, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 0, 2, pinkRockCandy);
		addBlock(world, basePos, 1, 1, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 1, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 1, 0, pinkRockCandy);
		addBlock(world, basePos, 2, 1, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 1, 2, pinkRockCandy);
		addBlock(world, basePos, 3, 1, 2, pinkRockCandy);
		addBlock(world, basePos, 0, 2, 2, pinkRockCandy);
		addBlock(world, basePos, 1, 2, 0, pinkRockCandy);
		addBlock(world, basePos, 1, 2, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 2, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 2, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 2, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 2, 3, pinkRockCandy);
		addBlock(world, basePos, 0, 3, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 3, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 3, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 3, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 3, 2, pinkRockCandy);
		addBlock(world, basePos, 3, 3, 1, pinkRockCandy);
		addBlock(world, basePos, 0, 4, 2, pinkRockCandy);
		addBlock(world, basePos, 1, 4, 0, pinkRockCandy);
		addBlock(world, basePos, 1, 4, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 4, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 4, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 4, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 4, 3, pinkRockCandy);
		addBlock(world, basePos, 1, 5, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 5, 2, pinkRockCandy);
		addBlock(world, basePos, 1, 5, 3, pinkRockCandy);
		addBlock(world, basePos, 2, 5, 0, pinkRockCandy);
		addBlock(world, basePos, 2, 5, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 5, 2, pinkRockCandy);
		addBlock(world, basePos, 3, 5, 2, pinkRockCandy);
		addBlock(world, basePos, 0, 6, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 6, 1, pinkRockCandy);
		addBlock(world, basePos, 1, 6, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 6, 1, pinkRockCandy);
		addBlock(world, basePos, 2, 6, 2, pinkRockCandy);
		addBlock(world, basePos, 2, 7, 2, pinkRockCandy);
	}
}
