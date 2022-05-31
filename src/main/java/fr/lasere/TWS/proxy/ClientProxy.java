package fr.lasere.TWS.proxy;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.lasere.TWS.renders.RenderBlockIsbrh;

public class ClientProxy extends CommonProxy{
	
	
	public static int renderIsbrh;
	
	@Override
	public void registerRenders() {
		
		renderIsbrh = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler) new RenderBlockIsbrh());
		
	}
}
