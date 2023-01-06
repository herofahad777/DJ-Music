
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
public class ItemTheFatRatandAnjulieClosetothesun extends ElementsDjMusicMod.ModElement {
	@GameRegistry.ObjectHolder("dj_music:the_fat_ratand_anjulie_closetothesun")
	public static final Item block = null;
	public ItemTheFatRatandAnjulieClosetothesun(ElementsDjMusicMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dj_music:the_fat_ratand_anjulie_closetothesun", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("the_fat_ratand_anjulie_closetothesun",
					ElementsDjMusicMod.sounds.get(new ResourceLocation("dj_music:thefatrat_and_anjulie_close_to_the_sun")));
			setUnlocalizedName("the_fat_ratand_anjulie_closetothesun");
			setRegistryName("the_fat_ratand_anjulie_closetothesun");
			setCreativeTab(TabMusicdisc.tab);
		}
	}
}
