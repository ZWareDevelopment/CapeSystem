package dev.zihasz.zware;

import dev.zihasz.zware.managers.CapeManager;
import dev.zihasz.zware.mixin.MixinLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(modid = ZWare.MOD_ID, name = ZWare.MOD_NAME, version = ZWare.MOD_VER)
public class ZWare {

    // Mod Info
    public static final String MOD_NAME = "ZWare.cc";
    public static final String MOD_ID = "zwaredotcc";
    public static final String MOD_VER = "v1.0.0";

    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_NAME);

    public static MixinLoader mixinLoader;
    public static CapeManager capeManager;

    // Mod Events
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        mixinLoader = new MixinLoader();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        capeManager = new CapeManager();
    }

}
