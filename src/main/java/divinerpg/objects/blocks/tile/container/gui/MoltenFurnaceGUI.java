package divinerpg.objects.blocks.tile.container.gui;

import divinerpg.api.Reference;
import divinerpg.objects.blocks.tile.entity.TileEntityModFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class MoltenFurnaceGUI extends ModFurnaceGUI {
    private static final ResourceLocation TEXTURES = new ResourceLocation(
            Reference.MODID + ":textures/gui/molten_furnace.png");

    public MoltenFurnaceGUI(InventoryPlayer player, TileEntityModFurnace tileEntity) {
        super(player, tileEntity);
    }

    public ResourceLocation getTexture() {
        return TEXTURES;
    }
}