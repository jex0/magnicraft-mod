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

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;

public class neodydiumore extends BlockOre {
	public neodydiumore(int id, int tex) {
		super(id, tex);
		
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setBlockName("neodiumore");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public String getTextureFile () {
		return "/client/jex0/magnicraft/textures/blocks.png";
	}
}