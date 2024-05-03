package net.jadenxgamer.netherexp;

import dev.architectury.platform.Platform;
import net.jadenxgamer.netherexp.registry.advancements.JNECriteriaTriggers;
import net.jadenxgamer.netherexp.registry.block.JNEBlockEntityType;
import net.jadenxgamer.netherexp.registry.block.JNEBlocks;
import net.jadenxgamer.netherexp.registry.effect.JNEMobEffects;
import net.jadenxgamer.netherexp.registry.enchantment.JNEEnchantments;
import net.jadenxgamer.netherexp.registry.entity.JNEEntityType;
import net.jadenxgamer.netherexp.registry.item.JNECreativeModeTabs;
import net.jadenxgamer.netherexp.registry.item.JNEItems;
import net.jadenxgamer.netherexp.registry.item.brewing.JNEPotions;
import net.jadenxgamer.netherexp.registry.misc_registry.JNESoundEvents;
import net.jadenxgamer.netherexp.registry.particle.JNEParticleTypes;

public class NetherExp {
    public static final String MOD_ID = "netherexp";

    public static void init() {
        JNECriteriaTriggers.init();
        JNECreativeModeTabs.init();
        JNESoundEvents.init();
        JNEParticleTypes.init();
        JNEEnchantments.init();
        JNEMobEffects.init();

        JNEEntityType.init();
        JNEBlocks.init();
        JNEBlockEntityType.init();
        JNEItems.init();
        JNEPotions.init();
    }

    public static boolean checkModCompatCinderscapes() {
        return Platform.isModLoaded("cinderscapes");
    }

    public static boolean checkModCompatGardensOfTheDead() {
        return Platform.isModLoaded("gardens_of_the_dead");
    }
}
