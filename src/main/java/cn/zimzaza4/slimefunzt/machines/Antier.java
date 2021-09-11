package cn.zimzaza4.slimefunzt.machines;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Collection;

/**
 * A block that becomes bedrock when powered, for decoration of course
 *
 * @author Mooy1
 */

public final class Antier extends SlimefunItem implements EnergyNetComponent {


    private final int energy;
    private final Material before;
    private final double damage;
    private final int lon;
    private final Color color;
    private final Material after;
    private final float size;

    public Antier(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, int energy,
                  float damage, int lon, Color color, Material before, Material after, float size) {
        super(category, item, type, recipe);
        this.energy = energy;
        this.damage = damage;
        this.lon = lon;
        this.color = color;
        this.after = after;
        this.before = before;
        this.size = size;
        addItemHandler(new BlockTicker() {
            @Override
            public boolean isSynchronized() {
                return true;
            }

            @Override
            public void tick(Block block, SlimefunItem item, Config data) {
                if ((InfinityExpansion.slimefunTickCount() %8) == 0) {
                    return;
                }
                Location l = block.getLocation();
                if (getCharge(l) < energy) {
                    if (block.getType() != before) {
                        block.setType(before);
                    }
                } else {
                    if (block.getType() != after) {
                        block.setType(after);
                    }
                    Location loc = block.getLocation();

                    for (int i = 0; i < lon; i++) {
                        Location a = loc;

                        a.add(0, 0.4, 0);
                        Particle.DustOptions d = new Particle.DustOptions(color, size);

                        a.getWorld().spawnParticle(Particle.REDSTONE, a.getBlockX() + 0.5, a.getBlockY(), a.getBlockZ() + 0.5,
                                1, d);
                        Collection<Entity> p = a.getWorld().getNearbyEntities(a, 0.5, 1, 0.5);

                        for (Entity num : p) {

                            if (num instanceof LivingEntity) {
                                LivingEntity nu = (LivingEntity) num;
                                nu.damage(damage);
                            }
                        }
                    }
                }
                removeCharge(l, energy);
            }
        });
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return energy * 2;
    }
}

   /* @Override
    protected void tick(@Nonnull Block block, @Nonnull Config config) {
        if ((InfinityExpansion.inst().getGlobalTick() & 3) == 0 || block.getType() == Material.AIR) {
            return;
        }
        Location l = block.getLocation();
        if (getCharge(l) < energy) {
            if (block.getType() != before) {
                block.setType(before);
            }
        } else {
            if (block.getType() != after) {
                block.setType(after);
            }
            Location loc = block.getLocation();

            for (int i = 0; i < lon; i++) {
                Location a = loc;

                a.add(0, 0.4, 0);
                Particle.DustOptions d = new Particle.DustOptions(color, size);

                a.getWorld().spawnParticle(Particle.REDSTONE, a.getBlockX() + 0.5, a.getBlockY(), a.getBlockZ() + 0.5,
                        1, d);
                Collection<Entity> p = a.getWorld().getNearbyEntities(a, 0.5, 1, 0.5);

                for (Entity num : p) {

                    if (num instanceof LivingEntity) {
                        LivingEntity nu = (LivingEntity) num;
                        nu.damage(damage);
                    }
                }
            }
        }
        removeCharge(l, energy);
    }

    @Override
    protected boolean synchronised() {
        return true;
    }

    @NotNull
    @Override
    public String getId() {
        return null;
    }
}*/