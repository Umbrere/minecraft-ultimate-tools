package de.tnf.ultimatetools.items.werkzeuge;

import java.util.Set;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Shaxt extends ItemTool
{
    public static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

    public Shaxt(ToolMaterial par2EnumToolMaterial)
    {
        super(2.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
    }
    
    public boolean func_150897_b(Block block)
    {
        return block == Blocks.snow_layer ? true : block == Blocks.snow;
    }
    
    public float func_150893_a(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.func_150893_a(stack, block) : this.efficiencyOnProperMaterial;
    }

}
