package de.tnf.ultimatetools.skripte;

import de.tnf.ultimatetools.UltimateTools;

public class Haltbarkeit
{
  public static void Registrieren()
  {
    int woodPaxeDurability = Config.woodPaxedurability;

    if (woodPaxeDurability > 120)
    {
      woodPaxeDurability = 120;
    }

    if (woodPaxeDurability < 60)
    {
      woodPaxeDurability = 60;
    }

    woodPaxeDurability -= 1;
    UltimateTools.woodPaxe.setMaxDamage(woodPaxeDurability);
    int stonePaxeDurability = Config.stonePaxedurability;

    if (stonePaxeDurability > 264)
    {
      stonePaxeDurability = 264;
    }

    if (stonePaxeDurability < 132)
    {
      stonePaxeDurability = 132;
    }

    stonePaxeDurability -= 1;
    UltimateTools.stonePaxe.setMaxDamage(stonePaxeDurability);
    int ironPaxeDurability = Config.ironPaxedurability;

    if (ironPaxeDurability > 502)
    {
      ironPaxeDurability = 502;
    }

    if (ironPaxeDurability < 251)
    {
      ironPaxeDurability = 251;
    }

    ironPaxeDurability -= 1;
    UltimateTools.ironPaxe.setMaxDamage(ironPaxeDurability);
    int goldPaxeDurability = Config.goldPaxedurability;

    if (goldPaxeDurability > 66)
    {
      goldPaxeDurability = 66;
    }

    if (goldPaxeDurability < 33)
    {
      goldPaxeDurability = 33;
    }

    goldPaxeDurability -= 1;
    UltimateTools.goldPaxe.setMaxDamage(goldPaxeDurability);
    int diamondPaxeDurability = Config.diamondPaxedurability;

    if (diamondPaxeDurability > 3124)
    {
      diamondPaxeDurability = 3124;
    }

    if (diamondPaxeDurability < 1562)
    {
      diamondPaxeDurability = 1562;
    }

    diamondPaxeDurability -= 1;
    UltimateTools.diamondPaxe.setMaxDamage(diamondPaxeDurability);
    int woodPovelDurability = Config.woodPoveldurability;

    if (woodPovelDurability > 120)
    {
      woodPovelDurability = 120;
    }

    if (woodPovelDurability < 60)
    {
      woodPovelDurability = 60;
    }

    woodPovelDurability -= 1;
    UltimateTools.woodPovel.setMaxDamage(woodPovelDurability);
    int stonePovelDurability = Config.stonePoveldurability;

    if (stonePovelDurability > 264)
    {
      stonePovelDurability = 264;
    }

    if (stonePovelDurability < 132)
    {
      stonePovelDurability = 132;
    }

    stonePovelDurability -= 1;
    UltimateTools.stonePovel.setMaxDamage(stonePovelDurability);
    int ironPovelDurability = Config.ironPoveldurability;

    if (ironPovelDurability > 502)
    {
      ironPovelDurability = 502;
    }

    if (ironPovelDurability < 251)
    {
      ironPovelDurability = 251;
    }

    ironPovelDurability -= 1;
    UltimateTools.ironPovel.setMaxDamage(ironPovelDurability);
    int goldPovelDurability = Config.goldPoveldurability;

    if (goldPovelDurability > 66)
    {
      goldPovelDurability = 66;
    }

    if (goldPovelDurability < 33)
    {
      goldPovelDurability = 33;
    }

    goldPovelDurability -= 1;
    UltimateTools.goldPovel.setMaxDamage(goldPovelDurability);
    int diamondPovelDurability = Config.diamondPoveldurability;

    if (diamondPovelDurability > 3124)
    {
      diamondPovelDurability = 3124;
    }

    if (diamondPovelDurability < 1562)
    {
      diamondPovelDurability = 1562;
    }

    diamondPovelDurability -= 1;
    UltimateTools.diamondPovel.setMaxDamage(diamondPovelDurability);
    int woodShaxtDurability = Config.woodShaxtdurability;

    if (woodShaxtDurability > 120)
    {
      woodShaxtDurability = 120;
    }

    if (woodShaxtDurability < 60)
    {
      woodShaxtDurability = 60;
    }

    woodShaxtDurability -= 1;
    UltimateTools.woodShaxt.setMaxDamage(woodShaxtDurability);
    int stoneShaxtDurability = Config.stoneShaxtdurability;

    if (stoneShaxtDurability > 264)
    {
      stoneShaxtDurability = 264;
    }

    if (stoneShaxtDurability < 132)
    {
      stoneShaxtDurability = 132;
    }

    stoneShaxtDurability -= 1;
    UltimateTools.stoneShaxt.setMaxDamage(stoneShaxtDurability);
    int ironShaxtDurability = Config.ironShaxtdurability;

    if (ironShaxtDurability > 502)
    {
      ironShaxtDurability = 502;
    }

    if (ironShaxtDurability < 251)
    {
      ironShaxtDurability = 251;
    }

    ironShaxtDurability -= 1;
    UltimateTools.ironShaxt.setMaxDamage(ironShaxtDurability);
    int goldShaxtDurability = Config.goldShaxtdurability;

    if (goldShaxtDurability > 66)
    {
      goldShaxtDurability = 66;
    }

    if (goldShaxtDurability < 33)
    {
      goldShaxtDurability = 33;
    }

    goldShaxtDurability -= 1;
    UltimateTools.goldShaxt.setMaxDamage(goldShaxtDurability);
    int diamondShaxtDurability = Config.diamondShaxtdurability;

    if (diamondShaxtDurability > 3124)
    {
      diamondShaxtDurability = 3124;
    }

    if (diamondShaxtDurability < 1562)
    {
      diamondShaxtDurability = 1562;
    }

    diamondShaxtDurability -= 1;
    UltimateTools.diamondShaxt.setMaxDamage(diamondShaxtDurability);
    int woodUltimateDurability = Config.woodUltimatedurability;

    if (woodUltimateDurability > 180)
    {
      woodUltimateDurability = 180;
    }

    if (woodUltimateDurability < 60)
    {
      woodUltimateDurability = 60;
    }

    woodUltimateDurability -= 1;
    UltimateTools.woodUltimate.setMaxDamage(woodUltimateDurability);
    int stoneUltimateDurability = Config.stoneUltimatedurability;

    if (stoneUltimateDurability > 396)
    {
      stoneUltimateDurability = 396;
    }

    if (stoneUltimateDurability < 132)
    {
      stoneUltimateDurability = 132;
    }

    stoneUltimateDurability -= 1;
    UltimateTools.stoneUltimate.setMaxDamage(stoneUltimateDurability);
    int ironUltimateDurability = Config.ironUltimatedurability;

    if (ironUltimateDurability > 753)
    {
      ironUltimateDurability = 753;
    }

    if (ironUltimateDurability < 251)
    {
      ironUltimateDurability = 251;
    }

    ironUltimateDurability -= 1;
    UltimateTools.ironUltimate.setMaxDamage(ironUltimateDurability);
    int goldUltimateDurability = Config.goldUltimatedurability;

    if (goldUltimateDurability > 99)
    {
      goldUltimateDurability = 99;
    }

    if (goldUltimateDurability < 33)
    {
      goldUltimateDurability = 33;
    }

    goldUltimateDurability -= 1;
    UltimateTools.goldUltimate.setMaxDamage(goldUltimateDurability);
    int diamondUltimateDurability = Config.diamondUltimatedurability;

    if (diamondUltimateDurability > 4686)
    {
      diamondUltimateDurability = 4686;
    }

    if (diamondUltimateDurability < 1562)
    {
      diamondUltimateDurability = 1562;
    }

    diamondUltimateDurability -= 1;
    UltimateTools.diamondUltimate.setMaxDamage(diamondUltimateDurability);
    int woodSowDurability = Config.woodSowdurability;

    if (woodSowDurability > 565)
    {
      woodSowDurability = 565;
    }

    if (woodSowDurability < 385)
    {
      woodSowDurability = 385;
    }

    woodSowDurability -= 1;
    UltimateTools.woodSow.setMaxDamage(woodSowDurability);
    int stoneSowDurability = Config.stoneSowdurability;

    if (stoneSowDurability > 781)
    {
      stoneSowDurability = 781;
    }

    if (stoneSowDurability < 385)
    {
      stoneSowDurability = 385;
    }

    stoneSowDurability -= 1;
    UltimateTools.stoneSow.setMaxDamage(stoneSowDurability);
    int ironSowDurability = Config.ironSowdurability;

    if (ironSowDurability > 1138)
    {
      ironSowDurability = 1138;
    }

    if (ironSowDurability < 385)
    {
      ironSowDurability = 385;
    }

    ironSowDurability -= 1;
    UltimateTools.ironSow.setMaxDamage(ironSowDurability);
    int goldSowDurability = Config.goldSowdurability;

    if (goldSowDurability > 484)
    {
      goldSowDurability = 484;
    }

    if (goldSowDurability < 385)
    {
      goldSowDurability = 385;
    }

    goldSowDurability -= 1;
    UltimateTools.goldSow.setMaxDamage(goldSowDurability);
    int diamondSowDurability = Config.diamondSowdurability;

    if (diamondSowDurability > 5071)
    {
      diamondSowDurability = 5071;
    }

    if (diamondSowDurability < 385)
    {
      diamondSowDurability = 385;
    }

    diamondSowDurability -= 1;
    UltimateTools.diamondSow.setMaxDamage(diamondSowDurability);
  }
}