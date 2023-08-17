package com.aerelldev.mcku;

import com.aerelldev.mcku.inits.CreativeModeTabInit;
import com.aerelldev.mcku.inits.ItemInit;
import com.aerelldev.mcku.inits.SoundInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Mcku.MODID)
public class Mcku
{
    public static final String MODID = "mcku";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mcku()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SoundInit.register(bus);
        ItemInit.register(bus);
        CreativeModeTabInit.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
