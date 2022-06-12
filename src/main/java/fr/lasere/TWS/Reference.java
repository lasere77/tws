package fr.lasere.TWS;

import cpw.mods.fml.common.Mod.Instance;

public class Reference {
	public static final String  MOD_ID = "tws";
	public static final String  MOD_NAME = "TWS";
	public static final String  VERSION = "1.3.2";
	public static final String  CLIENT_PROXY = "fr.lasere.TWS.proxy.ClientProxy";
	public static final String  COMMON_PROXY = "fr.lasere.TWS.proxy.CommonProxy";
	
	@Instance(MOD_ID)
	public static TWS instance;
}
