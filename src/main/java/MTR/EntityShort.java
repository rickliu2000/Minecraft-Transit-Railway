package MTR;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class EntityShort extends EntityTrainBase {

	private static final DataParameter<Integer> MTR_ROUTE = EntityDataManager.<Integer>createKey(EntityTrainBase.class,
			DataSerializers.VARINT);

	public EntityShort(World world) {
		super(world);
		doorOpen = MTRSounds.lightrail1Dooropen;
		doorClose = MTRSounds.lightrail1Doorclose;
	}

	public EntityShort(World world, double x, double y, double z, boolean f, int h) {
		super(world, x, y, z, f, h);
		doorOpen = MTRSounds.lightrail1Dooropen;
		doorClose = MTRSounds.lightrail1Doorclose;
	}

	@Override
	protected void onStationRailPass(BlockPos pos, boolean powered) {
		super.onStationRailPass(pos, powered);
		// set route
		try {
			TileEntityRouteChangerEntity te = (TileEntityRouteChangerEntity) worldObj
					.getTileEntity(getPosition().down());
			setRoute(te.route - 2000);
			setRouteBehind();
		} catch (Exception e) {
		}
	}

	private void setRouteBehind() {
		try {
			EntityShort entityBack;
			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance().getServer();
			if (front)
				entityBack = (EntityShort) server.getEntityFromUuid(uuidWheel);
			else
				entityBack = (EntityShort) server.getEntityFromUuid(uuidConnected);
			entityBack.setRoute(getRoute());
			entityBack.setRouteBehind();
		} catch (Exception e) {
		}
	}

	private void setRoute(int route) {
		dataManager.set(MTR_ROUTE, route);
	}

	public int getRoute() {
		return dataManager.get(MTR_ROUTE);
	}

	@Override
	public int getTrainLength() {
		return 14;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		dataManager.register(MTR_ROUTE, new Integer(0)); // route number
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		setRoute(compound.getInteger("route"));
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("route", getRoute());
		return compound;
	}
}
