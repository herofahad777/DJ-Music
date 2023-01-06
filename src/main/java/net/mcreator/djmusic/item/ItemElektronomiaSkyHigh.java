
package net.mcreator.djmusic.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.djmusic.creativetab.TabMusicdisc;
import net.mcreator.djmusic.ElementsDjMusicMod;

@ElementsDjMusicMod.ModElement.Tag
public class ItemElektronomiaSkyHigh extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:elektronomia_sky_high")
	public static final Item block = null;
	public ItemElektronomiaSkyHigh(ElementsDjMusicMod instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:elektronomia_sky_high", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("elektronomia_sky_high", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:elektronomia_sky_high")));
			setUnlocalizedName("elektronomia_sky_high");
			setRegistryName("elektronomia_sky_high");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
