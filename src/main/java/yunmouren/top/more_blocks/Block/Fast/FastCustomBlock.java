package yunmouren.top.more_blocks.Block.Fast;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import yunmouren.top.more_blocks.Proxy.IHasModel;

import static yunmouren.top.more_blocks.More_Blocks.proxy;

public class FastCustomBlock extends Block implements IHasModel {
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
     */
    FastCustomBlock(Material BlockType, String BlockName, float Hardness, Boolean Unbreakable, float Explosive, float LightLevel, int Opacity, CreativeTabs CreativeTab) {
        super(BlockType);
        this.setRegistryName(BlockName);
        this.setHardness(Hardness);
        if (Unbreakable) {
            this.setBlockUnbreakable();
        }
        this.setResistance(Explosive);
        this.setLightLevel(LightLevel);
        this.setLightOpacity(Opacity);
        this.setCreativeTab(CreativeTab);
    }

    @Override
    public void registerModel() {
        proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
