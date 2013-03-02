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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class alloysmelter extends Block {

	public alloysmelter(int par1, int par2) {
		super(par1, par2, Material.rock);
		setBlockName("alloy smelter");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
public int getBlockTextureFromSide(int i){
	switch(i){
	case 0:return 19;
	case 1:return 16;
	case 2:return 0;
	default:return 18;
	}
	
	}
	@Override
	public String getTextureFile () {
		return "/client/jex0/magnicraft/textures/blocks.png";
	}
}
