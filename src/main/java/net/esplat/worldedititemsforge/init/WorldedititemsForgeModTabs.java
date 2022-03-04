
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.esplat.worldedititemsforge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WorldedititemsForgeModTabs {
	public static CreativeModeTab TAB_WORLD_EDIT_MENU;

	public static void load() {
		TAB_WORLD_EDIT_MENU = new CreativeModeTab("tabworld_edit_menu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WorldedititemsForgeModItems.WORLD_EDIT_WAND);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
