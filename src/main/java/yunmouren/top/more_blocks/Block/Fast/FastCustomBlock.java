package yunmouren.top.more_blocks.Block.Fast;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import yunmouren.top.more_blocks.Register.BlockList.BlockItems;


public class FastCustomBlock extends Block {
    /**
     * 快速自定义方块
     *
     * @param BlockType   Material 设置改方块的类型
     * @param BlockName   String   设置该方块在Forge中的注册名（必选）
     * @param Hardness    float 设置该方块的硬度（破坏该方块所需要的时间，在原版中 石头为1.5，泥土味0.5）
     * @param Unbreakable Boolean 设置该方块是否不可被破坏
     * @param Explosive   float 设置该方块的爆炸抗性（请保证该值高与Hardness值的5倍以上）
     * @param LightLevel  float 设置走在方块上发出的声音种类
     * @param Opacity     int 	设置该方块的发光等级（数值范围0~1，可以用你想要的发光值/16计算出应该设置的值）
     * @param CreativeTab CreativeTabs 设置该方块所在的创造模式物品栏列表
     * @param Sound       SoundType 走在方块上的声音
     *
     */
    FastCustomBlock(Material BlockType, String BlockName, float Hardness, Boolean Unbreakable, float Explosive, float LightLevel, int Opacity, CreativeTabs CreativeTab, SoundType Sound) {
        super(BlockType);
        this.setRegistryName(BlockName);
        this.setHardness(Hardness);
        if (Unbreakable) {
            this.setBlockUnbreakable();
        }
        this.setSoundType(Sound);
        this.setResistance(Explosive);
        this.setLightLevel(LightLevel);
        this.setLightOpacity(Opacity);
        this.setCreativeTab(CreativeTab);
        BlockItems.blocks.add(this);
        BlockItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

}
