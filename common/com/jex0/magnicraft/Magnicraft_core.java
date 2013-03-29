/*   jex0 is the author of this program which is a mod for minecraft ©mojang 
    Copyright © 2013  jex0

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.*/
package com.jex0.magnicraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid=Magnicraft_core.ModId, name="magnicraft", version="0.01")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Magnicraft_core
{
	public static final String ModId="MGC";
    public static BlockOre neodydiumore;
    public static Item neodydiumbar;
    public static Block alloysmelter;
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new MagnicraftWorldGen());
	}
	@SuppressWarnings("deprecation")
	@Init
	public void load(FMLInitializationEvent event) {
		alloysmelter = new alloysmelter(501);
		GameRegistry.registerBlock(alloysmelter);
		LanguageRegistry.addName(alloysmelter, "alloy smelter");
		MinecraftForge.setBlockHarvestLevel(alloysmelter, "pickaxe", 0);
		neodydiumore = new neodydiumore(500);
		GameRegistry.registerBlock(neodydiumore);
		LanguageRegistry.addName(neodydiumore, "Neodium Ore");
		MinecraftForge.setBlockHarvestLevel(neodydiumore, "pickaxe", 2);
	    neodydiumbar = new neodydiumbar(550)
	      .setUnlocalizedName("neodiumbar");
	    GameRegistry.addSmelting(Magnicraft_core.neodydiumore.blockID, new ItemStack(Magnicraft_core.neodydiumbar), 1.0F);
		LanguageRegistry.addName(neodydiumbar, "Neodium Bar");
		ItemStack furnace=new ItemStack(Block.furnaceIdle);
		ItemStack netherrack=new ItemStack(Block.netherrack);
		ItemStack ironbars=new ItemStack(Block.fenceIron);
		ItemStack craftingtable=new ItemStack(Block.workbench);
		GameRegistry.addRecipe(new ItemStack(Magnicraft_core.alloysmelter)," w ","xyx","zzz",'w',craftingtable,'x',furnace,'y',ironbars,'z',netherrack);
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	}
}
