package WayofTime.lux;

import java.io.File;
import java.util.List;

import lombok.Getter;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import WayofTime.lux.annot.Handler;
import WayofTime.lux.api.Constants;

@Handler
public class ConfigHandler
{
    @Getter
    private static Configuration config;

    // Item/Block Disabling
    public static List<String> itemBlacklist;
    public static List<String> blockBlacklist;

    public static void init(File file)
    {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig()
    {
        boolean configVersionChanged = false;

        String category;

        category = "Version";
        Property prop = config.get(category, "Config Version", Constants.Mod.VERSION);
        if (!prop.getString().equals(Constants.Mod.VERSION))
        {
            configVersionChanged = true;
            prop.setValue(Constants.Mod.VERSION);
        }

        config.save();
    }

//    private static void buildBlacklist(String[] blacklisting, List<BlockStack> blockBlacklist)
//    {
//        blockBlacklist.clear();
//
//        for (String blockSet : blacklisting)
//        {
//            String[] blockData = blockSet.split(":");
//
//            Block block = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(blockData[0], blockData[1]));
//            int meta = 0;
//
//            if (blockData.length == 3)
//            {
//                // Check if it's an int, if so, parse it. If not, set meta to 0
//                // to avoid crashing.
//                if (Utils.isInteger(blockData[2]))
//                    meta = Integer.parseInt(blockData[2]);
//                else if (blockData[2].equals("*"))
//                    meta = OreDictionary.WILDCARD_VALUE;
//                else
//                    meta = 0;
//            }
//
//            blockBlacklist.add(new BlockStack(block, meta));
//        }
//    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent event)
    {
        if (event.getModID().equals(Constants.Mod.MODID))
        {
            syncConfig();
        }
    }
}
