package com.rikka.nikaaddon.abilities;

import net.minecraft.world.entity.LivingEntity;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;

public class Gear5GigantPunchAbility extends Ability {
    public Gear5GigantPunchAbility() {
        super("Gear 5: Gigant Punch", AbilityCategory.DEVIL_FRUIT);
        setCooldown(8);
        needsTransformation("gear_fifth");
    }

    @Override
    public void onUse(LivingEntity player) {
        player.swing(player.getUsedItemHand());
    }
}