package de.tnf.ultimatetools.skripte;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import de.tnf.ultimatetools.UltimateTools;
import net.minecraft.item.Item;

public class CraftingRezepte
{
  public static void Registrieren()
  {
    Boolean verfuegbar = Config.craftingavailable;

    if (verfuegbar.booleanValue() == true)
    {
      verfuegbar = Config.woodPaxeavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { " ", "B", "C", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { " ", "C", "B", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { "B", " ", "C", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { "B", "C", " ", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { "C", " ", "B", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPaxe, 1), new Object[] { "C", "B", " ", Character.valueOf('C'), Items.wooden_axe, Character.valueOf('B'), Items.wooden_pickaxe });
      }

      verfuegbar = Config.stonePaxeavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { " ", "B", "C", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { " ", "C", "B", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { "B", " ", "C", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { "B", "C", " ", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { "C", "A", "B", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePaxe, 1), new Object[] { "C", "B", " ", Character.valueOf('C'), Items.stone_axe, Character.valueOf('B'), Items.stone_pickaxe });
      }

      verfuegbar = Config.ironPaxeavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { " ", "B", "C", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { " ", "C", "B", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { "B", " ", "C", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { "B", "C", " ", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { "C", " ", "B", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPaxe, 1), new Object[] { "C", "B", " ", Character.valueOf('C'), Items.iron_axe, Character.valueOf('B'), Items.iron_pickaxe });
      }

      verfuegbar = Config.goldPaxeavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { " ", "B", "C", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { " ", "C", "B", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { "B", " ", "C", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { "B", "C", " ", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { "C", " ", "B", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPaxe, 1), new Object[] { "C", "B", " ", Character.valueOf('C'), Items.golden_axe, Character.valueOf('B'), Items.golden_pickaxe });
      }

      verfuegbar = Config.diamondPaxeavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { " ", "B", "C", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { " ", "C", "B", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { "B", " ", "C", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { "B", "C", " ", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { "C", " ", "B", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPaxe, 1), new Object[] { "C", "B", " ", Character.valueOf('C'), Items.diamond_axe, Character.valueOf('B'), Items.diamond_pickaxe });
      }

      verfuegbar = Config.woodPovelavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { "A", "B", " ", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { "A", " ", "B", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { "B", "A", " ", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { "B", " ", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { " ", "A", "B", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodPovel, 1), new Object[] { " ", "B", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe });
      }

      verfuegbar = Config.stonePovelavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { "A", "B", " ", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { "A", " ", "B", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { "B", "A", " ", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { "B", " ", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { " ", "A", "B", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stonePovel, 1), new Object[] { " ", "B", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe });
      }

      verfuegbar = Config.ironPovelavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { "A", "B", " ", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { "A", " ", "B", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { "B", "A", " ", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { "B", " ", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { " ", "A", "B", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironPovel, 1), new Object[] { " ", "B", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe });
      }

      verfuegbar = Config.goldPovelavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { "A", "B", " ", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { "A", " ", "B", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { "B", "A", " ", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { "B", " ", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { " ", "A", "B", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldPovel, 1), new Object[] { " ", "B", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe });
      }

      verfuegbar = Config.diamondPovelavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { "A", "B", " ", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { "A", " ", "B", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { "B", "A", " ", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { "B", " ", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { " ", "A", "B", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondPovel, 1), new Object[] { " ", "B", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe });
      }

      verfuegbar = Config.woodShaxtavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { "A", " ", "C", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { "A", "C", " ", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { " ", "A", "C", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { " ", "C", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { "C", "A", " ", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodShaxt, 1), new Object[] { "C", " ", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('C'), Items.wooden_axe });
      }

      verfuegbar = Config.stoneShaxtavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { "A", " ", "C", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { "A", "C", " ", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { " ", "A", "C", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { " ", "C", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { "C", "A", " ", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneShaxt, 1), new Object[] { "C", " ", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('C'), Items.stone_axe });
      }

      verfuegbar = Config.ironShaxtavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { "A", " ", "C", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { "A", "C", " ", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { " ", "A", "C", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { " ", "C", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { "C", "A", " ", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironShaxt, 1), new Object[] { "C", " ", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('C'), Items.iron_axe });
      }

      verfuegbar = Config.goldShaxtavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { "A", " ", "C", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { "A", "C", " ", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { " ", "A", "C", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { " ", "C", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { "C", "A", " ", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldShaxt, 1), new Object[] { "C", " ", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('C'), Items.golden_axe });
      }

      verfuegbar = Config.diamondShaxtavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { "A", " ", "C", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { "A", "C", " ", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { " ", "A", "C", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { " ", "C", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { "C", "A", " ", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondShaxt, 1), new Object[] { "C", " ", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('C'), Items.diamond_axe });
      }

      verfuegbar = Config.woodUltimateavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "A", "B", "C", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "A", "C", "B", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "B", "A", "C", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "B", "C", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "C", "A", "B", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodUltimate, 1), new Object[] { "C", "B", "A", Character.valueOf('A'), Items.wooden_shovel, Character.valueOf('B'), Items.wooden_pickaxe, Character.valueOf('C'), Items.wooden_axe });
      }

      verfuegbar = Config.stoneUltimateavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "A", "B", "C", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "A", "C", "B", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "B", "A", "C", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "B", "C", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "C", "A", "B", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneUltimate, 1), new Object[] { "C", "B", "A", Character.valueOf('A'), Items.stone_shovel, Character.valueOf('B'), Items.stone_pickaxe, Character.valueOf('C'), Items.stone_axe });
      }

      verfuegbar = Config.ironUltimateavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "A", "B", "C", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "A", "C", "B", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "B", "A", "C", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "B", "C", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "C", "A", "B", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironUltimate, 1), new Object[] { "C", "B", "A", Character.valueOf('A'), Items.iron_shovel, Character.valueOf('B'), Items.iron_pickaxe, Character.valueOf('C'), Items.iron_axe });
      }

      verfuegbar = Config.goldUltimateavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "A", "B", "C", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "A", "C", "B", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "B", "A", "C", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "B", "C", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "C", "A", "B", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldUltimate, 1), new Object[] { "C", "B", "A", Character.valueOf('A'), Items.golden_shovel, Character.valueOf('B'), Items.golden_pickaxe, Character.valueOf('C'), Items.golden_axe });
      }

      verfuegbar = Config.diamondUltimateavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "A", "B", "C", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "A", "C", "B", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "B", "A", "C", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "B", "C", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "C", "A", "B", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondUltimate, 1), new Object[] { "C", "B", "A", Character.valueOf('A'), Items.diamond_shovel, Character.valueOf('B'), Items.diamond_pickaxe, Character.valueOf('C'), Items.diamond_axe });
      }

      verfuegbar = Config.woodSowavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { "D", "E", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { "D", " ", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { "E", "D", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { "E", " ", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { " ", "D", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.woodSow, 1), new Object[] { " ", "E", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.wooden_sword });
      }

      verfuegbar = Config.stoneSowavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { "D", "E", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { "D", " ", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { "E", "D", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { "E", " ", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { " ", "D", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.stoneSow, 1), new Object[] { " ", "E", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.stone_sword });
      }

      verfuegbar = Config.ironSowavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { "D", "E", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { "D", " ", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { "E", "D", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { "E", " ", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { " ", "D", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.ironSow, 1), new Object[] { " ", "E", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.iron_sword });
      }

      verfuegbar = Config.goldSowavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { "D", "E", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { "D", " ", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { "E", "D", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { "E", " ", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { " ", "D", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.goldSow, 1), new Object[] { " ", "E", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.golden_sword });
      }

      verfuegbar = Config.diamondSowavailable;

      if (verfuegbar.booleanValue() == true)
      {
        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { "D", "E", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { "D", " ", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { "E", "D", " ", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { "E", " ", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { " ", "D", "E", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });

        GameRegistry.addRecipe(new ItemStack(UltimateTools.diamondSow, 1), new Object[] { " ", "E", "D", Character.valueOf('D'), Items.bow, Character.valueOf('E'), Items.diamond_sword });
      }
    }
  }
}