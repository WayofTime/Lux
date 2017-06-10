package WayofTime.lux.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.animation.ITimeValue;
import net.minecraftforge.common.model.animation.IAnimationStateMachine;

import com.google.common.collect.ImmutableMap;

public class CommonProxy
{
    public void preInit()
    {

        registerRenderers();
    }

    public void init()
    {

    }

    public void postInit()
    {

    }

    public void registerRenderers()
    {

    }

    public Object beamCont(World worldObj, double xi, double yi, double zi, double tx, double ty, double tz, int type, int color, boolean reverse, float endmod, Object input, int impact)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void tryHandleBlockModel(Block block, String name)
    {
        // NO-OP
    }

    public void tryHandleItemModel(Item item, String name)
    {
        // NO-OP
    }

    public IAnimationStateMachine load(ResourceLocation location, ImmutableMap<String, ITimeValue> parameters)
    {
        return null;
    }
}
