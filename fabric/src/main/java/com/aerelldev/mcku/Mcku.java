package com.aerelldev.mcku;

import com.aerelldev.mcku.init.CommandInit;
import com.aerelldev.mcku.init.CreativeModeTabInit;
import com.aerelldev.mcku.init.ItemInit;
import com.aerelldev.mcku.networking.MckuServerMessages;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mcku implements ModInitializer {
	public static final String MOD_ID = "mcku";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemInit.registerModItems();
		CreativeModeTabInit.registerCreativeModeTab();
		CommandInit.registerCommand();
		MckuServerMessages.registerC2SPackets();
	}
}