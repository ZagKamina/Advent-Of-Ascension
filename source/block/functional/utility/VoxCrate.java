package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.block.UnbreakableBlock;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityToxicLottoman;
import net.tslat.aoa3.utils.StringUtil;

public class VoxCrate extends UnbreakableBlock {
	public VoxCrate() {
		super("VoxCrate", "vox_crate", Material.WOOD);
		setSoundType(SoundType.WOOD);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && player.getHeldItem(hand).getItem() == ItemRegister.doomStone) {
			if (world.getEntitiesWithinAABB(EntityToxicLottoman.class, player.getEntityBoundingBox().grow(5)).size() == 0) {
				if (!player.capabilities.isCreativeMode)
					player.getHeldItem(hand).shrink(1);

				EntityToxicLottoman lottoman = new EntityToxicLottoman(world);

				lottoman.setLocationAndAngles(pos.getX(), pos.getY() + 3, pos.getZ(), 0, 0);
				world.spawnEntity(lottoman);
				player.sendMessage(StringUtil.getLocale("message.mob.voxLottoMan.spawn"));

				return true;
			}
		}

		return false;
	}
}
