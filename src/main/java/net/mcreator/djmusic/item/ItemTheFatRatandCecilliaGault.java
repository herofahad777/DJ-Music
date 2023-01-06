
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
public class ItemTheFatRatandCecilliaGault extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:the_fat_ratand_cecillia_gault")
	public static final Item block = null;
	public ItemTheFatRatandCecilliaGault(ElementsDjMusicMod instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:the_fat_ratand_cecillia_gault", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("the_fat_ratand_cecillia_gault", ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:thefatrat_and_cecillia_gault")));
			setUnlocalizedName("the_fat_ratand_cecillia_gault");
			setRegistryName("the_fat_ratand_cecillia_gault");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
