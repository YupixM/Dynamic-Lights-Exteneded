
package net.mcreator.dynamiclightsextra.item.extension;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireItemExtension {
	@Mod.EventBusSubscriber
	public static class Fuel {
		@SubscribeEvent
		public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
			ItemStack itemstack = event.getItemStack();
			if (itemstack.getItem() == Blocks.FIRE.asItem())

				event.setBurnTime(0);
		}
	}
}
