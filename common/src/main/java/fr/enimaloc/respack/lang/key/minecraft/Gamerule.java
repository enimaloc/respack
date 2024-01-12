package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Gamerule implements Key {
    ANNOUNCEADVANCEMENTS("gamerule.announceAdvancements"),
    BLOCKEXPLOSIONDROPDECAY("gamerule.blockExplosionDropDecay"),
    BLOCKEXPLOSIONDROPDECAY_DESCRIPTION("gamerule.blockExplosionDropDecay.description"),
    CATEGORY_CHAT("gamerule.category.chat"),
    CATEGORY_DROPS("gamerule.category.drops"),
    CATEGORY_MISC("gamerule.category.misc"),
    CATEGORY_MOBS("gamerule.category.mobs"),
    CATEGORY_PLAYER("gamerule.category.player"),
    CATEGORY_SPAWNING("gamerule.category.spawning"),
    CATEGORY_UPDATES("gamerule.category.updates"),
    COMMANDBLOCKOUTPUT("gamerule.commandBlockOutput"),
    COMMANDMODIFICATIONBLOCKLIMIT("gamerule.commandModificationBlockLimit"),
    COMMANDMODIFICATIONBLOCKLIMIT_DESCRIPTION("gamerule.commandModificationBlockLimit.description"),
    DISABLEELYTRAMOVEMENTCHECK("gamerule.disableElytraMovementCheck"),
    DISABLERAIDS("gamerule.disableRaids"),
    DODAYLIGHTCYCLE("gamerule.doDaylightCycle"),
    DOENTITYDROPS("gamerule.doEntityDrops"),
    DOENTITYDROPS_DESCRIPTION("gamerule.doEntityDrops.description"),
    DOFIRETICK("gamerule.doFireTick"),
    DOIMMEDIATERESPAWN("gamerule.doImmediateRespawn"),
    DOINSOMNIA("gamerule.doInsomnia"),
    DOLIMITEDCRAFTING("gamerule.doLimitedCrafting"),
    DOLIMITEDCRAFTING_DESCRIPTION("gamerule.doLimitedCrafting.description"),
    DOMOBLOOT("gamerule.doMobLoot"),
    DOMOBLOOT_DESCRIPTION("gamerule.doMobLoot.description"),
    DOMOBSPAWNING("gamerule.doMobSpawning"),
    DOMOBSPAWNING_DESCRIPTION("gamerule.doMobSpawning.description"),
    DOPATROLSPAWNING("gamerule.doPatrolSpawning"),
    DOTILEDROPS("gamerule.doTileDrops"),
    DOTILEDROPS_DESCRIPTION("gamerule.doTileDrops.description"),
    DOTRADERSPAWNING("gamerule.doTraderSpawning"),
    DOVINESSPREAD("gamerule.doVinesSpread"),
    DOVINESSPREAD_DESCRIPTION("gamerule.doVinesSpread.description"),
    DOWARDENSPAWNING("gamerule.doWardenSpawning"),
    DOWEATHERCYCLE("gamerule.doWeatherCycle"),
    DROWNINGDAMAGE("gamerule.drowningDamage"),
    FALLDAMAGE("gamerule.fallDamage"),
    FIREDAMAGE("gamerule.fireDamage"),
    FORGIVEDEADPLAYERS("gamerule.forgiveDeadPlayers"),
    FORGIVEDEADPLAYERS_DESCRIPTION("gamerule.forgiveDeadPlayers.description"),
    FREEZEDAMAGE("gamerule.freezeDamage"),
    GLOBALSOUNDEVENTS("gamerule.globalSoundEvents"),
    GLOBALSOUNDEVENTS_DESCRIPTION("gamerule.globalSoundEvents.description"),
    KEEPINVENTORY("gamerule.keepInventory"),
    LAVASOURCECONVERSION("gamerule.lavaSourceConversion"),
    LAVASOURCECONVERSION_DESCRIPTION("gamerule.lavaSourceConversion.description"),
    LOGADMINCOMMANDS("gamerule.logAdminCommands"),
    MAXCOMMANDCHAINLENGTH("gamerule.maxCommandChainLength"),
    MAXCOMMANDCHAINLENGTH_DESCRIPTION("gamerule.maxCommandChainLength.description"),
    MAXENTITYCRAMMING("gamerule.maxEntityCramming"),
    MOBEXPLOSIONDROPDECAY("gamerule.mobExplosionDropDecay"),
    MOBEXPLOSIONDROPDECAY_DESCRIPTION("gamerule.mobExplosionDropDecay.description"),
    MOBGRIEFING("gamerule.mobGriefing"),
    NATURALREGENERATION("gamerule.naturalRegeneration"),
    PLAYERSSLEEPINGPERCENTAGE("gamerule.playersSleepingPercentage"),
    PLAYERSSLEEPINGPERCENTAGE_DESCRIPTION("gamerule.playersSleepingPercentage.description"),
    RANDOMTICKSPEED("gamerule.randomTickSpeed"),
    REDUCEDDEBUGINFO("gamerule.reducedDebugInfo"),
    REDUCEDDEBUGINFO_DESCRIPTION("gamerule.reducedDebugInfo.description"),
    SENDCOMMANDFEEDBACK("gamerule.sendCommandFeedback"),
    SHOWDEATHMESSAGES("gamerule.showDeathMessages"),
    SNOWACCUMULATIONHEIGHT("gamerule.snowAccumulationHeight"),
    SNOWACCUMULATIONHEIGHT_DESCRIPTION("gamerule.snowAccumulationHeight.description"),
    SPAWNRADIUS("gamerule.spawnRadius"),
    SPECTATORSGENERATECHUNKS("gamerule.spectatorsGenerateChunks"),
    TNTEXPLOSIONDROPDECAY("gamerule.tntExplosionDropDecay"),
    TNTEXPLOSIONDROPDECAY_DESCRIPTION("gamerule.tntExplosionDropDecay.description"),
    UNIVERSALANGER("gamerule.universalAnger"),
    UNIVERSALANGER_DESCRIPTION("gamerule.universalAnger.description"),
    WATERSOURCECONVERSION("gamerule.waterSourceConversion"),
    WATERSOURCECONVERSION_DESCRIPTION("gamerule.waterSourceConversion.description");
    
    private final String key;
    
    Gamerule(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
