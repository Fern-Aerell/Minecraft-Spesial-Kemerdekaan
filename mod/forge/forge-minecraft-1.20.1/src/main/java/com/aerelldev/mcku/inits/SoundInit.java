package com.aerelldev.mcku.inits;

import com.aerelldev.mcku.Mcku;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mcku.MODID);

    // LAGU KEMERDEKAAN
    public static final RegistryObject<SoundEvent> LAGU_17_AGUSTUS = registerSoundEvent("lagu_17_agustus");
    public static final RegistryObject<SoundEvent> LAGU_INDONESIA_RAYA = registerSoundEvent("lagu_indonesia_raya");
    public static final RegistryObject<SoundEvent> LAGU_MAJU_TAK_GENTAR = registerSoundEvent("lagu_maju_tak_gentar");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(Mcku.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
