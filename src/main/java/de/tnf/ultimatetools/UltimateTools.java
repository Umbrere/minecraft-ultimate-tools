package de.tnf.ultimatetools;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.MinecraftForge;
import de.tnf.ultimatetools.items.waffen.Sow;
import de.tnf.ultimatetools.items.werkzeuge.*;
import de.tnf.ultimatetools.skripte.Config;
import de.tnf.ultimatetools.skripte.CraftingRezepte;
import de.tnf.ultimatetools.skripte.Haltbarkeit;
import de.tnf.ultimatetools.skripte.UpdateNote;
import de.tnf.ultimatetools.skripte.UpdateNoteDisplay;

@Mod(modid=UltimateTools.modid, name="UltimateTools", version=UltimateTools.Version)
public class UltimateTools
{
  public static final String modid = "tnfultimatetoolsforge";
  public static final String Version = "1.12.1.0";
  public static int notefication;

  public static final Item woodPaxe = new Paxe(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("woodPaxe").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_paxe_wood");
  public static final Item stonePaxe = new Paxe(ToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("stonePaxe").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_paxe_stone");
  public static final Item ironPaxe = new Paxe(ToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("ironPaxe").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_paxe_iron");
  public static final Item goldPaxe = new Paxe(ToolMaterial.GOLD).setMaxStackSize(1).setUnlocalizedName("goldPaxe").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_paxe_gold");
  public static final Item diamondPaxe = new Paxe(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("diamondPaxe").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_paxe_diamond");
  public static final Item woodPovel = new Povel(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("woodPovel").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_povel_wood");
  public static final Item stonePovel = new Povel(ToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("stonePovel").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_povel_stone");
  public static final Item ironPovel = new Povel(ToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("ironPovel").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_povel_iron");
  public static final Item goldPovel = new Povel(ToolMaterial.GOLD).setMaxStackSize(1).setUnlocalizedName("goldPovel").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_povel_gold");
  public static final Item diamondPovel = new Povel(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("diamondPovel").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_povel_diamond");
  public static final Item woodShaxt = new Shaxt(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("woodShaxt").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_shaxt_wood");
  public static final Item stoneShaxt = new Shaxt(ToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("stoneShaxt").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_shaxt_stone");
  public static final Item ironShaxt = new Shaxt(ToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("ironShaxt").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_shaxt_iron");
  public static final Item goldShaxt = new Shaxt(ToolMaterial.GOLD).setMaxStackSize(1).setUnlocalizedName("goldShaxt").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_shaxt_gold");
  public static final Item diamondShaxt = new Shaxt(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("diamondShaxt").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_shaxt_diamond");
  public static final Item woodUltimate = new Ultimate(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("woodUltimate").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_ultimate_wood");
  public static final Item stoneUltimate = new Ultimate(ToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("stoneUltimate").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_ultimate_stone");
  public static final Item ironUltimate = new Ultimate(ToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("ironUltimate").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_ultimate_iron");
  public static final Item goldUltimate = new Ultimate(ToolMaterial.GOLD).setMaxStackSize(1).setUnlocalizedName("goldUltimate").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_ultimate_gold");
  public static final Item diamondUltimate = new Ultimate(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("diamondUltimate").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_ultimate_diamond");
  public static final Item woodSow = new Sow(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("woodSow").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_sow_wood");
  public static final Item stoneSow = new Sow(ToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("stoneSow").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_sow_stone");
  public static final Item ironSow = new Sow(ToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("ironSow").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_sow_iron");
  public static final Item goldSow = new Sow(ToolMaterial.GOLD).setMaxStackSize(1).setUnlocalizedName("goldSow").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_sow_gold");
  public static final Item diamondSow = new Sow(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("diamondSow").setTextureName("ultimatetools" + ":" + "tnf_ultimatetools_sow_diamond");

  @Mod.Instance("UltumateTools")
  public static UltimateTools instance;
  public static File configFolder;
  
  public static UltimateTools getMod() {
	    return instance;}
  
  public File getConfigFolder() {
	    return this.configFolder;}


  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {

	  configFolder = new File(event.getSuggestedConfigurationFile().getPath().replace("TNFUltimateToolsForge", "UltimateTools"));

	  Config.Registrieren();
	  
	  UpdateNote un = new UpdateNote();
	  notefication=un.notefication();
	  
	    GameRegistry.registerItem(woodPaxe, "TNF_woodPaxe");
	    GameRegistry.registerItem(stonePaxe, "TNF_stonePaxe");
	    GameRegistry.registerItem(ironPaxe, "TNF_ironPaxe");
	    GameRegistry.registerItem(goldPaxe, "TNF_goldPaxe");
	    GameRegistry.registerItem(diamondPaxe, "TNF_diamondPaxe");
	    
	    GameRegistry.registerItem(woodPovel, "TNF_woodPovel");
	    GameRegistry.registerItem(stonePovel, "TNF_stonePovel");
	    GameRegistry.registerItem(ironPovel, "TNF_ironPovel");
	    GameRegistry.registerItem(goldPovel, "TNF_goldPovel");
	    GameRegistry.registerItem(diamondPovel, "TNF_diamondPovel");
	    
	    GameRegistry.registerItem(woodShaxt, "TNF_woodShaxt");
	    GameRegistry.registerItem(stoneShaxt, "TNF_stoneShaxt");
	    GameRegistry.registerItem(ironShaxt, "TNF_ironShaxt");
	    GameRegistry.registerItem(goldShaxt, "TNF_goldShaxt");
	    GameRegistry.registerItem(diamondShaxt, "TNF_diamondShaxt");
	    
	    GameRegistry.registerItem(woodUltimate, "TNF_woodUltimate");
	    GameRegistry.registerItem(stoneUltimate, "TNF_stoneUltimate");
	    GameRegistry.registerItem(ironUltimate, "TNF_ironUltimate");
	    GameRegistry.registerItem(goldUltimate, "TNF_goldUltimate");
	    GameRegistry.registerItem(diamondUltimate, "TNF_diamondUltimate");
	    
	    GameRegistry.registerItem(woodSow, "TNF_woodSow");
	    GameRegistry.registerItem(stoneSow, "TNF_stoneSow");
	    GameRegistry.registerItem(ironSow, "TNF_ironSow");
	    GameRegistry.registerItem(goldSow, "TNF_goldSow");
	    GameRegistry.registerItem(diamondSow, "TNF_diamondSow");  
  }
  
  @EventHandler
  public void load(FMLInitializationEvent event)
  {

	MinecraftForge.EVENT_BUS.register(new UpdateNoteDisplay());
	FMLCommonHandler.instance().bus().register(new UpdateNoteDisplay());
	 
    Haltbarkeit.Registrieren();

    CraftingRezepte.Registrieren();
    

  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
  }
}