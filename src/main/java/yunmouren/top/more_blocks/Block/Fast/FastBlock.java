package yunmouren.top.more_blocks.Block.Fast;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yunmouren.top.more_blocks.CreateTabs.CreateTabLoader;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;
import yunmouren.top.more_blocks.Tools.Illumination;

import static yunmouren.top.more_blocks.More_Blocks.MOD_ID;

public class FastBlock extends Block {
    public String name;
    public Item BlockItem;

    public FastBlock(String name) {

        super(Material.ROCK);
        this.name = name;
        this.setTranslationKey(name);
        this.setRegistryName(MOD_ID, name);
        this.setCreativeTab(CreateTabLoader.CreativeTabs);
        this.setBlockUnbreakable();
        this.setResistance(4000);
        this.setLightOpacity(0);
        this.setSoundType(SoundType.STONE);
        this.setLightOpacity(new Illumination().Illumination(15));
        BlockItems.blocks.add(this);
        BlockItems.items.add(new ItemBlock(this).setRegistryName(MOD_ID, name));

    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
