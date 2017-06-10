package WayofTime.lux;

import java.io.File;

import lombok.Getter;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLModIdMappingEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import WayofTime.lux.api.Constants;
import WayofTime.lux.proxy.CommonProxy;

@Mod(modid = Constants.Mod.MODID, name = Constants.Mod.NAME, version = Constants.Mod.VERSION, dependencies = Constants.Mod.DEPEND, guiFactory = "WayofTime.lux.client.gui.config.ConfigGuiFactory")
@Getter
public class Lux
{
    @SidedProxy(serverSide = "WayofTime.lux.proxy.CommonProxy", clientSide = "WayofTime.lux.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(Constants.Mod.MODID)
    public static Lux instance;

//    public static CreativeTabs tabBloodMagic = new CreativeTabs(Constants.Mod.MODID + ".creativeTab")
//    {
//        @Override
//        public ItemStack getTabIconItem()
//        {
//            return new ItemStack(ModItems.BLOOD_ORB);
//        }
//    };

    @Getter
    private static boolean isDev = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");

    static
    {
        FluidRegistry.enableUniversalBucket();
    }

//    private LogHelper logger = new LogHelper(Constants.Mod.MODID);
    private File configDir;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configDir = new File(event.getModConfigurationDirectory(), "Lux");
        ConfigHandler.init(new File(getConfigDir(), "Lux.cfg"));

//        ModBlocks.init();
//        ModItems.init();
//        ModPotions.init();
//        ModEntities.init();
//        ModCompatibility.registerModCompat();
//        ModCompatibility.loadCompat(ICompatibility.InitializationPhase.PRE_INIT);
//        ModTranquilityHandlers.init();
//        ModDungeons.init();

//        Utils.registerHandlers(event.getAsmData().getAll(Handler.class.getCanonicalName()));
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
//        BloodMagicPacketHandler.init();
//
//        ModRecipes.init();
//        ModRituals.initRituals();
//        ModRituals.initImperfectRituals();
//        MeteorConfigHandler.init(new File(configDir, "meteors"));
//        ModArmourTrackers.init();
//        ModCompatibility.loadCompat(ICompatibility.InitializationPhase.INIT);
//        NetworkRegistry.INSTANCE.registerGuiHandler(BloodMagic.instance, new GuiHandler());
//        ModCorruptionBlocks.init();

        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
//        ModCompatibility.loadCompat(ICompatibility.InitializationPhase.POST_INIT);

        proxy.postInit();
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event)
    {

    }

    @Mod.EventHandler
    public void modMapping(FMLModIdMappingEvent event)
    {
//        ModCompatibility.loadCompat(ICompatibility.InitializationPhase.MAPPING);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {

    }

    @Mod.EventHandler
    public void onIMCRecieved(FMLInterModComms.IMCEvent event)
    {
//        IMCHandler.handleIMC(event);
    }
}
