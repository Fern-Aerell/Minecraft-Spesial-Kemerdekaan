package com.aerelldev.mcku.init;

import com.aerelldev.mcku.Mcku;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeModeTabInit {
    public static final ItemGroup KEMERDEKAAN_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mcku.MOD_ID, "kemerdekaan_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("creativetab.kemerdekaan_tab"))
                    .icon(() -> new ItemStack(ItemInit.BENDERA_INDONESIA)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.LAGU_17_AGUSTUS_DISC);
                        entries.add(ItemInit.LAGU_INDONESIA_RAYA_DISC);
                        entries.add(ItemInit.LAGU_MAJU_TAK_GENTAR_DISC);
                        entries.add(ItemInit.RED_LEATHER);
                        entries.add(ItemInit.WHITE_LEATHER);
                        entries.add(ItemInit.BENDERA_INDONESIA);
                        entries.add(ItemInit.BANDANA_INDONESIA);
                    }).build());

    public static void registerCreativeModeTab() {

    }
}
