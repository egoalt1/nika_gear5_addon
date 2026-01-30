package com.rikka.nikaaddon.abilities;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;

public class Gear5LightningGrabAbility extends Ability {
    public Gear5LightningGrabAbility() {
        super("Gear 5: Lightning Grab", AbilityCategory.DEVIL_FRUIT);
        setCooldown(20);
        needsTransformation("gear_fifth");
    }

    @Override
    public void onUse(LivingEntity player) {
        LightningBolt bolt = new LightningBolt(player.level(), player.getX(), player.getY(), player.getZ(), false);
        player.level().addFreshEntity(bolt);
    }
}