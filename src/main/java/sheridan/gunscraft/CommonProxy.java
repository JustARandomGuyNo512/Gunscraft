package sheridan.gunscraft;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import sheridan.gunscraft.items.ModItems;
import sheridan.gunscraft.items.attachments.AttachmentRegistry;
import sheridan.gunscraft.items.attachments.util.GunAttachmentSlot;
import sheridan.gunscraft.items.guns.IGenericGun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonProxy implements IProxy{
    @Override
    public void perInit() {

    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void setUpClient(FMLClientSetupEvent event) {

    }

    @Override
    public boolean shouldRenderCustom(ItemStack stack, IGenericGun gun, LivingEntity entity, boolean isMainHand) {
        return false;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return null;
    }

    @Override
    public void commonSetUp(FMLCommonSetupEvent event) {
        registerAttachmentSlot();
    }

    private void registerAttachmentSlot() {
        registerAttachmentM4a1();
        registerAttachmentAKM();
        registerAttachmentMp5();
    }

    private void registerAttachmentMp5() {
        Map<String, GunAttachmentSlot> slotMap = new HashMap<>();
        GunAttachmentSlot magSlot = new GunAttachmentSlot("mag", new HashSet<>(Arrays.asList(AttachmentRegistry.getIdByName("smg_expansion_mag"))));
        magSlot.setTrans(new float[][]{{0, 20.2f / 16f, 60 / 16f},{0,0,0},{1,1,1}});
        slotMap.put("mag", magSlot);

        ModItems.MP5.get().slotMap = slotMap;
    }

    private void registerAttachmentAKM() {
        Map<String, GunAttachmentSlot> slotMap = new HashMap<>();

        GunAttachmentSlot muzzleSlot = new GunAttachmentSlot("muzzle", new HashSet<>(Arrays.asList(999)));
        muzzleSlot.setTrans(new float[][]{{0,0,0},{0,0,0},{1,1,1}});
        slotMap.put("muzzle", muzzleSlot);

        GunAttachmentSlot magSlot = new GunAttachmentSlot("mag", new HashSet<>(Arrays.asList(AttachmentRegistry.getIdByName("assault_expansion_mag"))));
        magSlot.setTrans(new float[][]{{0, 22f / 16f, 136 / 16f},{0,0,0},{1,1,1}});
        slotMap.put("mag", magSlot);

        ModItems.AKM.get().slotMap = slotMap;
    }

    private void registerAttachmentM4a1() {
        Map<String, GunAttachmentSlot> slotMap = new HashMap<>();

        GunAttachmentSlot muzzleSlot = new GunAttachmentSlot("muzzle", new HashSet<>(Arrays.asList(999)));
        muzzleSlot.setTrans(new float[][]{{0,0,0},{0,0,0},{1,1,1}});
        slotMap.put("muzzle", muzzleSlot);

        GunAttachmentSlot magSlot = new GunAttachmentSlot("mag", new HashSet<>(Arrays.asList(AttachmentRegistry.getIdByName("assault_expansion_mag"))));
        magSlot.setTrans(new float[][]{{0, 39f / 16f, 85.5f / 16f},{0,0,0},{1,1,1}});
        slotMap.put("mag", magSlot);

        GunAttachmentSlot scopeSlot = new GunAttachmentSlot("scope", new HashSet<>(Arrays.asList(999)));
        scopeSlot.setTrans(new float[][]{{0, -7.8592f / 16f, 120 / 16f},{0,0,0}, {1,1,1}});
        slotMap.put("scope", scopeSlot);
        ModItems.M4A1.get().slotMap = slotMap;
    }

}
