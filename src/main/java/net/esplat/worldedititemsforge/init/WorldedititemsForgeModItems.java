
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.esplat.worldedititemsforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.esplat.worldedititemsforge.item.WorldEditWandItem;
import net.esplat.worldedititemsforge.item.WorldEditPickaxeItem;
import net.esplat.worldedititemsforge.item.WorldEditNavItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldedititemsForgeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item WORLD_EDIT_WAND = register(new WorldEditWandItem());
	public static final Item WORLD_EDIT_NAV = register(new WorldEditNavItem());
	public static final Item WORLD_EDIT_PICKAXE = register(new WorldEditPickaxeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
