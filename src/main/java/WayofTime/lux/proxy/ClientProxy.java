package WayofTime.lux.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.animation.ITimeValue;
import net.minecraftforge.common.model.animation.IAnimationStateMachine;
import WayofTime.lux.api.Constants;

import com.google.common.collect.ImmutableMap;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {
        super.preInit();

//        renderHelper = new InventoryRenderHelper(Constants.Mod.DOMAIN);
//        renderHelperV2 = new InventoryRenderHelperV2(Constants.Mod.DOMAIN);

        OBJLoader.INSTANCE.addDomain(Constants.Mod.MODID);

//        ModBlocks.initRenders();
//        ModItems.initRenders();

//        ClientRegistry.bindTileEntitySpecialRenderer(TileInversionPillar.class, new AnimationTESR<TileInversionPillar>()
//        {
//            @Override
//            public void handleEvents(TileInversionPillar chest, float time, Iterable<Event> pastEvents)
//            {
//                chest.handleEvents(time, pastEvents);
//            }
//        });

//        // Initialize key-binds during startup so they load correctly
//        for (KeyBindings key : KeyBindings.values())
//            key.getKey();
    }

    @Override
    public void registerRenderers()
    {

    }

    @Override
    public void init()
    {
        super.init();

    }

    @Override
    public void postInit()
    {

    }

    @Override
    public void tryHandleBlockModel(Block block, String name)
    {
//        if (block instanceof IVariantProvider)
//        {
//            IVariantProvider variantProvider = (IVariantProvider) block;
//            for (Pair<Integer, String> variant : variantProvider.getVariants())
//                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), variant.getLeft(), new ModelResourceLocation(new ResourceLocation(Constants.Mod.MODID, name), variant.getRight()));
//        }
    }

    @Override
    public void tryHandleItemModel(Item item, String name)
    {
//        if (item instanceof IMeshProvider)
//        {
//            IMeshProvider meshProvider = (IMeshProvider) item;
//            ModelLoader.setCustomMeshDefinition(item, meshProvider.getMeshDefinition());
//            ResourceLocation resourceLocation = meshProvider.getCustomLocation();
//            if (resourceLocation == null)
//                resourceLocation = new ResourceLocation(Constants.Mod.MODID, "item/" + name);
//            for (String variant : meshProvider.getVariants())
//                ModelLoader.registerItemVariants(item, new ModelResourceLocation(resourceLocation, variant));
//        } else if (item instanceof IVariantProvider)
//        {
//            IVariantProvider variantProvider = (IVariantProvider) item;
//            for (Pair<Integer, String> variant : variantProvider.getVariants())
//                ModelLoader.setCustomModelResourceLocation(item, variant.getLeft(), new ModelResourceLocation(new ResourceLocation(Constants.Mod.MODID, "item/" + name), variant.getRight()));
//        }
    }

    @Override
    public IAnimationStateMachine load(ResourceLocation location, ImmutableMap<String, ITimeValue> parameters)
    {
        return ModelLoaderRegistry.loadASM(location, parameters);
    }
}
