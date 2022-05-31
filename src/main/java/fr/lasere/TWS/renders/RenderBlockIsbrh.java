package fr.lasere.TWS.renders;

import com.sun.security.ntlm.Client;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.lasere.TWS.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class RenderBlockIsbrh implements ISimpleBlockRenderingHandler{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		renderer.setRenderBounds(0F, 0F, 0F, 0.5F, 0.7F, 0.5F);
		renderer.renderStandardBlock(block, x, y, z);
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return ClientProxy.renderIsbrh;
	}

}
