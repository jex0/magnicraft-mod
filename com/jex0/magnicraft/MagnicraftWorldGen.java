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
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import com.jex0.magnicraft.Magnicraft_core;

public class MagnicraftWorldGen implements IWorldGenerator { 
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, 
	IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	switch(world.provider.dimensionId){
	case 0:generateSurface(random,chunkX*16,chunkZ*16,world);
	}
	}

	public void generateSurface(Random random, int x, int z, World w){
	for(int ii=0;ii<5;ii++){ 
	int posX = x + random.nextInt(16); 
	int posY = random.nextInt(40); 
	int posZ = z + random.nextInt(16); 
	new WorldGenMinable(Magnicraft_core.neodydiumore.blockID,0,random.nextInt(9)).generate(w, random, posX, posY, posZ);
	}
	}
	};
