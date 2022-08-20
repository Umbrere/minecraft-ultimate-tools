package de.tnf.ultimatetools.items.werkzeuge;

import java.util.Set;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Ultimate extends ItemTool
{
    public static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

    public Ultimate(ToolMaterial par2EnumToolMaterial)
    {
        super(3.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
    }

    public boolean func_150897_b(Block block)
    {
    	if ((block == Blocks.snow_layer) || (block == Blocks.snow))
    		{
    		return true;
    		}
        return block == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? (block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? (block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (block.getMaterial() == Material.rock ? true : (block.getMaterial() == Material.iron ? true : block.getMaterial() == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }
    
    public float func_150893_a(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock && block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.func_150893_a(stack, block) : this.efficiencyOnProperMaterial;
    }

}
