package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Advancements implements Key {
    NOT_FOUND("advancement.advancementNotFound"),
    EMPTY("advancements.empty"),
    SAD_LABEL("advancements.sad_label"),
    TOAST_CHALLENGE("advancements.toast.challenge"),
    TOAST_GOAL("advancements.toast.goal"),
    TOAST_TASK("advancements.toast.task");

    private final String key;

    Advancements(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    enum Adventure implements Key {
        ADVENTURING_TIME_DESCRIPTION("advancement.adventure.adventuring_time.deescription"),
        ADVENTURING_TIME_TITLE("advancement.adventure.adventuring_time.title"),
        ARBALISTIC_DESCRIPTION("advancement.adventure.arbalistic.description"),
        ARBALISTIC_TITLE("advancement.adventure.arbalistic.title"),
        AVOID_VIBRATION_DESCRIPTION("advancement.adventure.avoid_vibration.description"),
        AVOID_VIBRATION_TITLE("avoid_vibration.title"),
        BULLSEYE_DESCRIPTION("bullseye.description"),
        BULLSEYE_TITLE("bullseye.title"),
        CRAFT_DECORATED_POT_USING_ONLY_SHERDS_DESCRIPTION("craft_decorated_pot_using_only_sherds.description"),
        CRAFT_DECORATED_POT_USING_ONLY_SHERDS_TITLE("craft_decorated_pot_using_only_sherds.title"),
        FALL_FROM_WORLD_HEIGHT_DESCRIPTION("fall_from_world_height.description"),
        FALL_FROM_WORLD_HEIGHT_TITLE("fall_from_world_height.title"),
        HERO_OF_THE_VILLAGE_DESCRIPTION("hero_of_the_village.description"),
        HERO_OF_THE_VILLAGE_TITLE("hero_of_the_village.title"),
        HONEY_BLOCK_SLIDE_DESCRIPTION("honey_block_slide.description"),
        HONEY_BLOCK_SLIDE_TITLE("honey_block_slide.title"),
        KILL_A_MOB_DESCRIPTION("kill_a_mob.description"),
        KILL_A_MOB_TITLE("kill_a_mob.title"),
        KILL_ALL_MOBS_DESCRIPTION("kill_all_mobs.description"),
        KILL_ALL_MOBS_TITLE("kill_all_mobs.title"),
        KILL_MOB_NEAR_SCULK_CATALYST_DESCRIPTION("kill_mob_near_sculk_catalyst.description"),
        KILL_MOB_NEAR_SCULK_CATALYST_TITLE("kill_mob_near_sculk_catalyst.title"),
        LIGHTNING_ROD_WITH_VILLAGER_NO_FIRE_DESCRIPTION("lightning_rod_with_villager_no_fire.description"),
        LIGHTNING_ROD_WITH_VILLAGER_NO_FIRE_TITLE("lightning_rod_with_villager_no_fire.title"),
        OL_BETSY_DESCRIPTION("ol_betsy.description"),
        OL_BETSY_TITLE("ol_betsy.title"),
        PLAY_JUKEBOX_IN_MEADOWS_DESCRIPTION("play_jukebox_in_meadows.description"),
        PLAY_JUKEBOX_IN_MEADOWS_TITLE("play_jukebox_in_meadows.title"),
        READ_POWER_FROM_CHISELED_BOOKSHELF_DESCRIPTION("read_power_from_chiseled_bookshelf.description"),
        READ_POWER_FROM_CHISELED_BOOKSHELF_TITLE("read_power_from_chiseled_bookshelf.title"),
        ROOT_DESCRIPTION("root.description"),
        ROOT_TITLE("root.title"),
        SALVAGE_SHERD_DESCRIPTION("salvage_sherd.description"),
        SALVAGE_SHERD_TITLE("salvage_sherd.title"),
        SHOOT_ARROW_DESCRIPTION("shoot_arrow.description"),
        SHOOT_ARROW_TITLE("shoot_arrow.title"),
        SLEEP_IN_BED_DESCRIPTION("sleep_in_bed.description"),
        SLEEP_IN_BED_TITLE("sleep_in_bed.title"),
        SNIPER_DUEL_DESCRIPTION("sniper_duel.description"),
        SNIPER_DUEL_TITLE("sniper_duel.title"),
        SPYGLASS_AT_DRAGON_DESCRIPTION("spyglass_at_dragon.description"),
        SPYGLASS_AT_DRAGON_TITLE("spyglass_at_dragon.title"),
        SPYGLASS_AT_GHAST_DESCRIPTION("spyglass_at_ghast.description"),
        SPYGLASS_AT_GHAST_TITLE("spyglass_at_ghast.title"),
        SPYGLASS_AT_PARROT_DESCRIPTION("spyglass_at_parrot.description"),
        SPYGLASS_AT_PARROT_TITLE("spyglass_at_parrot.title"),
        SUMMON_IRON_GOLEM_DESCRIPTION("summon_iron_golem.description"),
        SUMMON_IRON_GOLEM_TITLE("summon_iron_golem.title"),
        THROW_TRIDENT_DESCRIPTION("throw_trident.description"),
        THROW_TRIDENT_TITLE("throw_trident.title"),
        TOTEM_OF_UNDYING_DESCRIPTION("totem_of_undying.description"),
        TOTEM_OF_UNDYING_TITLE("totem_of_undying.title"),
        TRADE_AT_WORLD_HEIGHT_DESCRIPTION("trade_at_world_height.description"),
        TRADE_AT_WORLD_HEIGHT_TITLE("trade_at_world_height.title"),
        TRADE_DESCRIPTION("trade.description"),
        TRADE_TITLE("trade.title"),
        TRIM_WITH_ALL_EXCLUSIVE_ARMOR_PATTERNS_DESCRIPTION("trim_with_all_exclusive_armor_patterns.description"),
        TRIM_WITH_ALL_EXCLUSIVE_ARMOR_PATTERNS_TITLE("trim_with_all_exclusive_armor_patterns.title"),
        TRIM_WITH_ANY_ARMOR_PATTERN_DESCRIPTION("trim_with_any_armor_pattern.description"),
        TRIM_WITH_ANY_ARMOR_PATTERN_TITLE("trim_with_any_armor_pattern.title"),
        TWO_BIRDS_ONE_ARROW_DESCRIPTION("two_birds_one_arrow.description"),
        TWO_BIRDS_ONE_ARROW_TITLE("two_birds_one_arrow.title"),
        VERY_VERY_FRIGHTENING_DESCRIPTION("very_very_frightening.description"),
        VERY_VERY_FRIGHTENING_TITLE("very_very_frightening.title"),
        VOLUNTARY_EXILE_DESCRIPTION("voluntary_exile.description"),
        VOLUNTARY_EXILE_TITLE("voluntary_exile.title"),
        WALK_ON_POWDER_SNOW_WITH_LEATHER_BOOTS_DESCRIPTION("walk_on_powder_snow_with_leather_boots.description"),
        WALK_ON_POWDER_SNOW_WITH_LEATHER_BOOTS_TITLE("walk_on_powder_snow_with_leather_boots.title"),
        WHOS_THE_PILLAGER_NOW_DESCRIPTION("whos_the_pillager_now.description"),
        WHOS_THE_PILLAGER_NOW_TITLE("whos_the_pillager_now.title");

        private final String key;

        Adventure(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    enum End implements Key {
        DRAGON_BREATH_DESCRIPTION("dragon_breath.description"),
        DRAGON_BREATH_TITLE("dragon_breath.title"),
        DRAGON_EGG_DESCRIPTION("dragon_egg.description"),
        DRAGON_EGG_TITLE("dragon_egg.title"),
        ELYTRA_DESCRIPTION("elytra.description"),
        ELYTRA_TITLE("elytra.title"),
        ENTER_END_GATEWAY_DESCRIPTION("enter_end_gateway.description"),
        ENTER_END_GATEWAY_TITLE("enter_end_gateway.title"),
        FIND_END_CITY_DESCRIPTION("find_end_city.description"),
        FIND_END_CITY_TITLE("find_end_city.title"),
        KILL_DRAGON_DESCRIPTION("kill_dragon.description"),
        KILL_DRAGON_TITLE("kill_dragon.title"),
        LEVITATE_DESCRIPTION("levitate.description"),
        LEVITATE_TITLE("levitate.title"),
        RESPAWN_DRAGON_DESCRIPTION("respawn_dragon.description"),
        RESPAWN_DRAGON_TITLE("respawn_dragon.title"),
        ROOT_DESCRIPTION("root.description"),
        ROOT_TITLE("root.title");

        private final String key;

        End(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    enum Husbandry implements Key {
        ALLAY_DELIVER_CAKE_TO_NOTE_BLOCK_DESCRIPTION("allay_deliver_cake_to_note_block.description"),
        ALLAY_DELIVER_CAKE_TO_NOTE_BLOCK_TITLE("allay_deliver_cake_to_note_block.title"),
        ALLAY_DELIVER_ITEM_TO_PLAYER_DESCRIPTION("allay_deliver_item_to_player.description"),
        ALLAY_DELIVER_ITEM_TO_PLAYER_TITLE("allay_deliver_item_to_player.title"),
        AXOLOTL_IN_A_BUCKET_DESCRIPTION("axolotl_in_a_bucket.description"),
        AXOLOTL_IN_A_BUCKET_TITLE("axolotl_in_a_bucket.title"),
        BALANCED_DIET_DESCRIPTION("balanced_diet.description"),
        BALANCED_DIET_TITLE("balanced_diet.title"),
        BREED_ALL_ANIMALS_DESCRIPTION("breed_all_animals.description"),
        BREED_ALL_ANIMALS_TITLE("breed_all_animals.title"),
        BREED_AN_ANIMAL_DESCRIPTION("breed_an_animal.description"),
        BREED_AN_ANIMAL_TITLE("breed_an_animal.title"),
        COMPLETE_CATALOGUE_DESCRIPTION("complete_catalogue.description"),
        COMPLETE_CATALOGUE_TITLE("complete_catalogue.title"),
        FEED_SNIFFLET_DESCRIPTION("feed_snifflet.description"),
        FEED_SNIFFLET_TITLE("feed_snifflet.title"),
        FISHY_BUSINESS_DESCRIPTION("fishy_business.description"),
        FISHY_BUSINESS_TITLE("fishy_business.title"),
        FROGLIGHTS_DESCRIPTION("froglights.description"),
        FROGLIGHTS_TITLE("froglights.title"),
        KILL_AXOLOTL_TARGET_DESCRIPTION("kill_axolotl_target.description"),
        KILL_AXOLOTL_TARGET_TITLE("kill_axolotl_target.title"),
        LEASH_ALL_FROG_VARIANTS_DESCRIPTION("leash_all_frog_variants.description"),
        LEASH_ALL_FROG_VARIANTS_TITLE("leash_all_frog_variants.title"),
        MAKE_A_SIGN_GLOW_DESCRIPTION("make_a_sign_glow.description"),
        MAKE_A_SIGN_GLOW_TITLE("make_a_sign_glow.title"),
        NETHERITE_HOE_DESCRIPTION("netherite_hoe.description"),
        NETHERITE_HOE_TITLE("netherite_hoe.title"),
        OBTAIN_SNIFFER_EGG_DESCRIPTION("obtain_sniffer_egg.description"),
        OBTAIN_SNIFFER_EGG_TITLE("obtain_sniffer_egg.title"),
        PLANT_ANY_SNIFFER_SEED_DESCRIPTION("plant_any_sniffer_seed.description"),
        PLANT_ANY_SNIFFER_SEED_TITLE("plant_any_sniffer_seed.title"),
        PLANT_SEED_DESCRIPTION("plant_seed.description"),
        PLANT_SEED_TITLE("plant_seed.title"),
        RIDE_A_BOAT_WITH_A_GOAT_DESCRIPTION("ride_a_boat_with_a_goat.description"),
        RIDE_A_BOAT_WITH_A_GOAT_TITLE("ride_a_boat_with_a_goat.title"),
        ROOT_DESCRIPTION("root.description"),
        ROOT_TITLE("root.title"),
        SAFELY_HARVEST_HONEY_DESCRIPTION("safely_harvest_honey.description"),
        SAFELY_HARVEST_HONEY_TITLE("safely_harvest_honey.title"),
        SILK_TOUCH_NEST_DESCRIPTION("silk_touch_nest.description"),
        SILK_TOUCH_NEST_TITLE("silk_touch_nest.title"),
        TACTICAL_FISHING_DESCRIPTION("tactical_fishing.description"),
        TACTICAL_FISHING_TITLE("tactical_fishing.title"),
        TADPOLE_IN_A_BUCKET_DESCRIPTION("tadpole_in_a_bucket.description"),
        TADPOLE_IN_A_BUCKET_TITLE("tadpole_in_a_bucket.title"),
        TAME_AN_ANIMAL_DESCRIPTION("tame_an_animal.description"),
        TAME_AN_ANIMAL_TITLE("tame_an_animal.title"),
        WAX_OFF_DESCRIPTION("wax_off.description"),
        WAX_OFF_TITLE("wax_off.title"),
        WAX_ON_DESCRIPTION("wax_on.description"),
        WAX_ON_TITLE("wax_on.title");

        private final String key;

        Husbandry(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    enum Story implements Key {
        CURE_ZOMBIE_VILLAGER_DESCRIPTION("cure_zombie_villager.description"),
        CURE_ZOMBIE_VILLAGER_TITLE("cure_zombie_villager.title"),
        DEFLECT_ARROW_DESCRIPTION("deflect_arrow.description"),
        DEFLECT_ARROW_TITLE("deflect_arrow.title"),
        ENCHANT_ITEM_DESCRIPTION("enchant_item.description"),
        ENCHANT_ITEM_TITLE("enchant_item.title"),
        ENTER_THE_END_DESCRIPTION("enter_the_end.description"),
        ENTER_THE_END_TITLE("enter_the_end.title"),
        ENTER_THE_NETHER_DESCRIPTION("enter_the_nether.description"),
        ENTER_THE_NETHER_TITLE("enter_the_nether.title"),
        FOLLOW_ENDER_EYE_DESCRIPTION("follow_ender_eye.description"),
        FOLLOW_ENDER_EYE_TITLE("follow_ender_eye.title"),
        FORM_OBSIDIAN_DESCRIPTION("form_obsidian.description"),
        FORM_OBSIDIAN_TITLE("form_obsidian.title"),
        IRON_TOOLS_DESCRIPTION("iron_tools.description"),
        IRON_TOOLS_TITLE("iron_tools.title"),
        LAVA_BUCKET_DESCRIPTION("lava_bucket.description"),
        LAVA_BUCKET_TITLE("lava_bucket.title"),
        MINE_DIAMOND_DESCRIPTION("mine_diamond.description"),
        MINE_DIAMOND_TITLE("mine_diamond.title"),
        MINE_STONE_DESCRIPTION("mine_stone.description"),
        MINE_STONE_TITLE("mine_stone.title"),
        OBTAIN_ARMOR_DESCRIPTION("obtain_armor.description"),
        OBTAIN_ARMOR_TITLE("obtain_armor.title"),
        ROOT_DESCRIPTION("root.description"),
        ROOT_TITLE("root.title"),
        SHINY_GEAR_DESCRIPTION("shiny_gear.description"),
        SHINY_GEAR_TITLE("shiny_gear.title"),
        SMELT_IRON_DESCRIPTION("smelt_iron.description"),
        SMELT_IRON_TITLE("smelt_iron.title"),
        UPGRADE_TOOLS_DESCRIPTION("upgrade_tools.description"),
        UPGRADE_TOOLS_TITLE("upgrade_tools.title");

        private final String key;

        Story(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }
}
