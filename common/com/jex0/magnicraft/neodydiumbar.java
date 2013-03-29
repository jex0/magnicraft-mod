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

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class neodydiumbar extends Item
{
  public neodydiumbar(int par1)
  {
    super(par1);
    this.maxStackSize = 64;
    setCreativeTab(CreativeTabs.tabMaterials);
  }
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.iconIndex = par1IconRegister.registerIcon(Magnicraft_core.ModId+":"+ this.getUnlocalizedName());
    }
}