/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.JetPlane;

import net.minecraft.world.World;

public class JetCommon {

	public static int tileRender;
	public static int wireRender;

	/**
	 * Client side only register stuff...
	 */
	public void registerRenderers()
	{
		//unused server side. -- see ClientProxy for implementation
	}

	public void addArmorRenders() {}

	public World getClientWorld() {
		return null;
	}

	public void registerRenderInformation() {
		// TODO Auto-generated method stub

	}

	public void registerSounds() {
		// TODO Auto-generated method stub
	}

}
