package com.aerelldev.mcku.inits;

import com.aerelldev.mcku.Mcku;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mcku.MODID);

    public static final RegistryObject<CreativeModeTab> KEMERDEKAAN_TAB = CREATIVE_MODE_TABS.register("kemerdekaan_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.BENDERA_INDONESIA.get()))
                    .title(Component.translatable("creativetab.kemerdekaan_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ItemInit.LAGU_17_AGUSTUS_DISC.get());
                        pOutput.accept(ItemInit.LAGU_INDONESIA_RAYA_DISC.get());
                        pOutput.accept(ItemInit.LAGU_MAJU_TAK_GENTAR_DISC.get());
                        pOutput.accept(ItemInit.RED_LEATHER.get());
                        pOutput.accept(ItemInit.WHITE_LEATHER.get());
                        pOutput.accept(ItemInit.BENDERA_INDONESIA.get());
                        pOutput.accept(ItemInit.BANDANA_INDONESIA.get());

                    }).build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
