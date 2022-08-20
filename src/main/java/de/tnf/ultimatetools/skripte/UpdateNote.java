package de.tnf.ultimatetools.skripte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import de.tnf.ultimatetools.UltimateTools;

public class UpdateNote 
{
	Boolean updatenote = Config.versioncheck;
	Boolean OK = true;
	
	public int notefication() 
	{
		if (this.updatenote)
		{
			String newVersion = UltimateTools.Version;
			URL fr = null;
			try
			{
				fr = new URL("https://dl.dropbox.com/u/33401127/Versionskontrolle/Minecraft/Mods/UltimateTools/Version.txt");
			}
			catch (MalformedURLException e)
			{
				this.OK = false;
			}
			if (this.OK)
			{
				try
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(fr.openStream()));
					newVersion = br.readLine();
					br.close();
				}
				catch (IOException e)
				{
					this.OK = false;
				}
				
				if (this.OK)
				{
					String[] versionArray = UltimateTools.Version.split("\\.");
					String[] newversionArray = newVersion.split("\\.");
					
			        if (!versionArray[0].equals(newversionArray[0]))
			        {
			        	return 4;
			        }
			        
			        if (!versionArray[1].equals(newversionArray[1]))
			        {
			        	return 3;
			        }
			        
			        if (!versionArray[2].equals(newversionArray[2]))
			        {
			        	return 2;
			        }
			        
			        if (!versionArray[3].equals(newversionArray[3]))
			        {
			        	return 1;
			        }
				}
			}
	     }
		return 0;
	}
}
