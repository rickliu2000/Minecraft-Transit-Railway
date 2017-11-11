package MTR.items;

import java.util.List;

import MTR.EntityPepperlandShuttle;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPepperlandShuttle extends ItemSpawnTrain<EntityPepperlandShuttle> {

	private static final String[] name = { "ItemPepperlandShuttle11",};
	private static final String name2 = "ItemPepperlandShuttle1";

	public ItemPepperlandShuttle () {
		super(name, name2);
		setHasSubtypes(true);
	}

	@Override
	protected EntityPepperlandShuttle createTrain(World worldIn, double x, double y, double z, boolean f, int h) {
		return new EntityPepperlandShuttle(worldIn, x, y, z, f, h);
	}

	@Override
	protected int getCars(ItemStack stack) {
		return stack.getMetadata() == 0 ? 1 : 2;
	}

	@Override
	protected int[] getTrainOrder(ItemStack stack) {
		int[] order1 = { 1 };
		int[] order2 = { 1, 1 };
		switch (stack.getMetadata()) {
		case 0:
			return order1;
		case 1:
		default:
			return order2;
		}
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(String.valueOf(stack.getMetadata() + 1) + " " + I18n.format("gui.car", new Object[0]));
		list.add(I18n.format("gui.jkb", new Object[0]));
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
		for (int var4 = 0; var4 < 2; ++var4)
			subItems.add(new ItemStack(itemIn, 1, var4));
	}
}
