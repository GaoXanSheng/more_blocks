package yunmouren.top.more_blocks.Block.Fast;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yunmouren.top.more_blocks.CreateTabs.CreateTabLoader;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;

public class FastBlockGrass extends BlockBush {
    public FastBlockGrass(String name) {
        super(Material.VINE);
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreateTabLoader.CreativeTabs);
        this.setBlockUnbreakable();
        this.setResistance(4000);
        this.setSoundType(SoundType.STONE);
        this.setLightOpacity(0);
        BlockItems.blocks.add(this);
        BlockItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return true;
    }

    protected boolean canSustainBush(IBlockState state) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

}
