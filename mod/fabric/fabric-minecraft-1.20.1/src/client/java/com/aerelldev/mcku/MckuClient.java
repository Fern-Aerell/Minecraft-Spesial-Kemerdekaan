package com.aerelldev.mcku;

import com.aerelldev.mcku.networking.MckuClientMessages;
import net.fabricmc.api.ClientModInitializer;

public class MckuClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		MckuClientMessages.registerS2CPackets();
	}
}