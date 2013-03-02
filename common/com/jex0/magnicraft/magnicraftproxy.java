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

import net.minecraftforge.client.MinecraftForgeClient;

public class magnicraftproxy
{
  public void registerRendererthings()
  {
	  MinecraftForgeClient.preloadTexture("/magnicraft-mod/resources/textures/blocks.png");
	  MinecraftForgeClient.preloadTexture("/magnicraft-mod/resources/textures/items.png");
  }
}