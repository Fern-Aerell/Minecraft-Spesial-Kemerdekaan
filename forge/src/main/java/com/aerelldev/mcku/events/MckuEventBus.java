package com.aerelldev.mcku.events;

import com.aerelldev.mcku.Mcku;
import com.aerelldev.mcku.players.PlayerAnimator;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Mcku.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MckuEventBus {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(new ResourceLocation(Mcku.MODID, "animation"), 42, PlayerAnimator::registerPlayerAnimation);

    }
}
