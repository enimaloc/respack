package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Death implements Key {
    ;
    
    public enum Attack implements Key {
        ANVIL("death.attack.anvil"),
        ANVIL_PLAYER("death.attack.anvil.player"),
        ARROW("death.attack.arrow"),
        ARROW_ITEM("death.attack.arrow.item"),
        BADRESPAWNPOINT_LINK("death.attack.badRespawnPoint.link"),
        BADRESPAWNPOINT_MESSAGE("death.attack.badRespawnPoint.message"),
        CACTUS("death.attack.cactus"),
        CACTUS_PLAYER("death.attack.cactus.player"),
        CRAMMING("death.attack.cramming"),
        CRAMMING_PLAYER("death.attack.cramming.player"),
        DRAGONBREATH("death.attack.dragonBreath"),
        DRAGONBREATH_PLAYER("death.attack.dragonBreath.player"),
        DROWN("death.attack.drown"),
        DROWN_PLAYER("death.attack.drown.player"),
        DRYOUT("death.attack.dryout"),
        DRYOUT_PLAYER("death.attack.dryout.player"),
        EVEN_MORE_MAGIC("death.attack.even_more_magic"),
        EXPLOSION("death.attack.explosion"),
        EXPLOSION_PLAYER("death.attack.explosion.player"),
        EXPLOSION_PLAYER_ITEM("death.attack.explosion.player.item"),
        FALL("death.attack.fall"),
        FALL_PLAYER("death.attack.fall.player"),
        FALLINGBLOCK("death.attack.fallingBlock"),
        FALLINGBLOCK_PLAYER("death.attack.fallingBlock.player"),
        FALLINGSTALACTITE("death.attack.fallingStalactite"),
        FALLINGSTALACTITE_PLAYER("death.attack.fallingStalactite.player"),
        FIREBALL("death.attack.fireball"),
        FIREBALL_ITEM("death.attack.fireball.item"),
        FIREWORKS("death.attack.fireworks"),
        FIREWORKS_ITEM("death.attack.fireworks.item"),
        FIREWORKS_PLAYER("death.attack.fireworks.player"),
        FLYINTOWALL("death.attack.flyIntoWall"),
        FLYINTOWALL_PLAYER("death.attack.flyIntoWall.player"),
        FREEZE("death.attack.freeze"),
        FREEZE_PLAYER("death.attack.freeze.player"),
        GENERIC("death.attack.generic"),
        GENERICKILL("death.attack.genericKill"),
        GENERICKILL_PLAYER("death.attack.genericKill.player"),
        GENERIC_PLAYER("death.attack.generic.player"),
        HOTFLOOR("death.attack.hotFloor"),
        HOTFLOOR_PLAYER("death.attack.hotFloor.player"),
        INDIRECTMAGIC("death.attack.indirectMagic"),
        INDIRECTMAGIC_ITEM("death.attack.indirectMagic.item"),
        INFIRE("death.attack.inFire"),
        INFIRE_PLAYER("death.attack.inFire.player"),
        INWALL("death.attack.inWall"),
        INWALL_PLAYER("death.attack.inWall.player"),
        LAVA("death.attack.lava"),
        LAVA_PLAYER("death.attack.lava.player"),
        LIGHTNINGBOLT("death.attack.lightningBolt"),
        LIGHTNINGBOLT_PLAYER("death.attack.lightningBolt.player"),
        MAGIC("death.attack.magic"),
        MAGIC_PLAYER("death.attack.magic.player"),
        MESSAGE_TOO_LONG("death.attack.message_too_long"),
        MOB("death.attack.mob"),
        MOB_ITEM("death.attack.mob.item"),
        ONFIRE("death.attack.onFire"),
        ONFIRE_ITEM("death.attack.onFire.item"),
        ONFIRE_PLAYER("death.attack.onFire.player"),
        OUTSIDEBORDER("death.attack.outsideBorder"),
        OUTSIDEBORDER_PLAYER("death.attack.outsideBorder.player"),
        OUTOFWORLD("death.attack.outOfWorld"),
        OUTOFWORLD_PLAYER("death.attack.outOfWorld.player"),
        PLAYER("death.attack.player"),
        PLAYER_ITEM("death.attack.player.item"),
        SONIC_BOOM("death.attack.sonic_boom"),
        SONIC_BOOM_ITEM("death.attack.sonic_boom.item"),
        SONIC_BOOM_PLAYER("death.attack.sonic_boom.player"),
        STALAGMITE("death.attack.stalagmite"),
        STALAGMITE_PLAYER("death.attack.stalagmite.player"),
        STARVE("death.attack.starve"),
        STARVE_PLAYER("death.attack.starve.player"),
        STING("death.attack.sting"),
        STING_ITEM("death.attack.sting.item"),
        STING_PLAYER("death.attack.sting.player"),
        SWEETBERRYBUSH("death.attack.sweetBerryBush"),
        SWEETBERRYBUSH_PLAYER("death.attack.sweetBerryBush.player"),
        THORNS("death.attack.thorns"),
        THORNS_ITEM("death.attack.thorns.item"),
        THROWN("death.attack.thrown"),
        THROWN_ITEM("death.attack.thrown.item"),
        TRIDENT("death.attack.trident"),
        TRIDENT_ITEM("death.attack.trident.item"),
        WITHER("death.attack.wither"),
        WITHER_PLAYER("death.attack.wither.player"),
        WITHERSKULL("death.attack.witherSkull"),
        WITHERSKULL_ITEM("death.attack.witherSkull.item");
        
        private final String key;
        
        Attack(String key) {
            this.key = key;
        }
        
        @Override
        public String getKey() {
            return key;
        }
    }
    
    public enum Fell implements Key {
        ACCIDENT_GENERIC("death.fell.accident.generic"),
        ACCIDENT_LADDER("death.fell.accident.ladder"),
        ACCIDENT_OTHER_CLIMBABLE("death.fell.accident.other_climbable"),
        ACCIDENT_SCAFFOLDING("death.fell.accident.scaffolding"),
        ACCIDENT_TWISTING_VINES("death.fell.accident.twisting_vines"),
        ACCIDENT_VINES("death.fell.accident.vines"),
        ACCIDENT_WEEPING_VINES("death.fell.accident.weeping_vines"),
        ASSIST("death.fell.assist"),
        ASSIST_ITEM("death.fell.assist.item"),
        FINISH("death.fell.finish"),
        FINISH_ITEM("death.fell.finish.item"),
        KILLER("death.fell.killer");
        
        private final String key;
        
        Fell(String key) {
            this.key = key;
        }
        
        @Override
        public String getKey() {
            return key;
        }
    }
    
    private final String key;
    
    Death(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
