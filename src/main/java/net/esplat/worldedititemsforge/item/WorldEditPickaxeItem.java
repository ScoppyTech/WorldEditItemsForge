
package net.esplat.worldedititemsforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.esplat.worldedititemsforge.init.WorldedititemsForgeModTabs;

public class WorldEditPickaxeItem extends PickaxeItem {
	public WorldEditPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4000f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(WorldedititemsForgeModTabs.TAB_WORLD_EDIT_MENU));
		setRegistryName("world_edit_pickaxe");
	}
}
