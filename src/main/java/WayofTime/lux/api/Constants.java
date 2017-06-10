package WayofTime.lux.api;

import java.util.Locale;

import lombok.Getter;

public class Constants
{
    public static class NBT
    {

    }

    public static class Mod
    {
        public static final String MODID = "Lux";
        public static final String DOMAIN = MODID.toLowerCase(Locale.ENGLISH) + ":";
        public static final String NAME = "Lux Atramento";
        public static final String VERSION = "@VERSION@";
        public static final String DEPEND = "required-after:guideapi;";
    }

    public static final class Gui
    {
        public static final int TELEPOSER_GUI = 0;

    }

    public static class Compat
    {
        public static final String JEI_CATEGORY_ALTAR = Mod.MODID + ":altar";
        public static final String JEI_CATEGORY_BINDING = Mod.MODID + ":binding";
        public static final String JEI_CATEGORY_ALCHEMYARRAY = Mod.MODID + ":alchemyArray";
        public static final String JEI_CATEGORY_SOULFORGE = Mod.MODID + ":soulForge";
        public static final String JEI_CATEGORY_ALCHEMYTABLE = Mod.MODID + ":salchemyTable";
        public static final String JEI_CATEGORY_ARMOURDOWNGRADE = Mod.MODID + ":armourDowngrade";
    }

    public static class Misc
    {

    }

    public enum LuxItem
    {
        ACTIVATION_CRYSTAL("ItemActivationCrystal");

        @Getter
        private final String regName;

        LuxItem(String regName)
        {
            this.regName = regName;
        }

//        public Item getItem()
//        {
//            return LuxAPI.getItem(getRegName());
//        }
    }

    public enum LuxBlock
    {
        ALCHEMY_ARRAY("BlockAlchemyArray");

        @Getter
        private final String regName;

        LuxBlock(String regName)
        {
            this.regName = regName;
        }

//        public Block getBlock()
//        {
//            return LuxAPI.getBlock(getRegName());
//        }
    }
}
