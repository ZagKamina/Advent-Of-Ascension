package net.tslat.aoa3.item.totem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.misc.EntityLottoIdol;

public class BayonetteSRTotem extends TotemItem {
	public BayonetteSRTotem() {
		super("BayonetteSRTotem", "bayonette_sr_totem");
	}

	@Override
	protected void summonTotemEntity(World world, EntityPlayer player, BlockPos pos) {
		EntityLottoIdol idolEntity = new EntityLottoIdol(world, new ItemStack(WeaponRegister.sniperBayonetteSR), new ItemStack(ItemRegister.tokensRunandor));

		idolEntity.setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
		world.spawnEntity(idolEntity);
	}
}
