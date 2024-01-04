package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Commands implements Key {
    CONTEXT_HERE("command.context.here"),
    CONTEXT_PARSE_ERROR("command.context.parse_error"),
    EXCEPTION("command.exception"),
    EXPECTED_SEPARATOR("command.expected.separator"),
    FAILED("command.failed"),
    UNKNOWN_ARGUMENT("command.unknown.argument"),
    UNKNOWN_COMMAND("command.unknown.command");

    public enum Advancement implements Key {
        ADVANCEMENTNOTFOUND("commands.advancement.advancementNotFound"),
        CRITERIONNOTFOUND("commands.advancement.criterionNotFound"),
        GRANT_CRITERION_TO_MANY_FAILURE("commands.advancement.grant.criterion.to.many.failure"),
        GRANT_CRITERION_TO_MANY_SUCCESS("commands.advancement.grant.criterion.to.many.success"),
        GRANT_CRITERION_TO_ONE_FAILURE("commands.advancement.grant.criterion.to.one.failure"),
        GRANT_CRITERION_TO_ONE_SUCCESS("commands.advancement.grant.criterion.to.one.success"),
        GRANT_MANY_TO_MANY_FAILURE("commands.advancement.grant.many.to.many.failure"),
        GRANT_MANY_TO_MANY_SUCCESS("commands.advancement.grant.many.to.many.success"),
        GRANT_MANY_TO_ONE_FAILURE("commands.advancement.grant.many.to.one.failure"),
        GRANT_MANY_TO_ONE_SUCCESS("commands.advancement.grant.many.to.one.success"),
        GRANT_ONE_TO_MANY_FAILURE("commands.advancement.grant.one.to.many.failure"),
        GRANT_ONE_TO_MANY_SUCCESS("commands.advancement.grant.one.to.many.success"),
        GRANT_ONE_TO_ONE_FAILURE("commands.advancement.grant.one.to.one.failure"),
        GRANT_ONE_TO_ONE_SUCCESS("commands.advancement.grant.one.to.one.success"),
        REVOKE_CRITERION_TO_MANY_FAILURE("commands.advancement.revoke.criterion.to.many.failure"),
        REVOKE_CRITERION_TO_MANY_SUCCESS("commands.advancement.revoke.criterion.to.many.success"),
        REVOKE_CRITERION_TO_ONE_FAILURE("commands.advancement.revoke.criterion.to.one.failure"),
        REVOKE_CRITERION_TO_ONE_SUCCESS("commands.advancement.revoke.criterion.to.one.success"),
        REVOKE_MANY_TO_MANY_FAILURE("commands.advancement.revoke.many.to.many.failure"),
        REVOKE_MANY_TO_MANY_SUCCESS("commands.advancement.revoke.many.to.many.success"),
        REVOKE_MANY_TO_ONE_FAILURE("commands.advancement.revoke.many.to.one.failure"),
        REVOKE_MANY_TO_ONE_SUCCESS("commands.advancement.revoke.many.to.one.success"),
        REVOKE_ONE_TO_MANY_FAILURE("commands.advancement.revoke.one.to.many.failure"),
        REVOKE_ONE_TO_MANY_SUCCESS("commands.advancement.revoke.one.to.many.success"),
        REVOKE_ONE_TO_ONE_FAILURE("commands.advancement.revoke.one.to.one.failure"),
        REVOKE_ONE_TO_ONE_SUCCESS("commands.advancement.revoke.one.to.one.success");

        private final String key;

        Advancement(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Attribute implements Key {
        BASE_VALUE_GET_SUCCESS("commands.attribute.base_value.get.success"),
        BASE_VALUE_SET_SUCCESS("commands.attribute.base_value.set.success"),
        FAILED_ENTITY("commands.attribute.failed.entity"),
        FAILED_MODIFIER_ALREADY_PRESENT("commands.attribute.failed.modifier_already_present"),
        FAILED_NO_ATTRIBUTE("commands.attribute.failed.no_attribute"),
        FAILED_NO_MODIFIER("commands.attribute.failed.no_modifier"),
        MODIFIER_ADD_SUCCESS("commands.attribute.modifier.add.success"),
        MODIFIER_REMOVE_SUCCESS("commands.attribute.modifier.remove.success"),
        MODIFIER_VALUE_GET_SUCCESS("commands.attribute.modifier.value.get.success"),
        VALUE_GET_SUCCESS("commands.attribute.value.get.success");

        private final String key;

        Attribute(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Ban implements Key {
        FAILED("commands.ban.failed"),
        SUCCESS("commands.ban.success");

        private final String key;

        Ban(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum BanIp implements Key {
        FAILED("commands.banip.failed"),
        INFO("commands.banip.info"),
        INVALID("commands.banip.invalid"),
        SUCCESS("commands.banip.success");

        private final String key;

        BanIp(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum BanList implements Key {
        ENTRY("commands.banlist.entry"),
        LIST("commands.banlist.list"),
        NONE("commands.banlist.none");

        private final String key;

        BanList(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Bossbar implements Key {
        CREATE_FAILED("commands.bossbar.create.failed"),
        CREATE_SUCCESS("commands.bossbar.create.success"),
        GET_MAX("commands.bossbar.get.max"),
        GET_PLAYERS_NONE("commands.bossbar.get.players.none"),
        GET_PLAYERS_SOME("commands.bossbar.get.players.some"),
        GET_VALUE("commands.bossbar.get.value"),
        GET_VISIBLE_HIDDEN("commands.bossbar.get.visible.hidden"),
        GET_VISIBLE_VISIBLE("commands.bossbar.get.visible.visible"),
        LIST_BARS_NONE("commands.bossbar.list.bars.none"),
        LIST_BARS_SOME("commands.bossbar.list.bars.some"),
        REMOVE_SUCCESS("commands.bossbar.remove.success"),
        SET_COLOR_SUCCESS("commands.bossbar.set.color.success"),
        SET_COLOR_UNCHANGED("commands.bossbar.set.color.unchanged"),
        SET_MAX_SUCCESS("commands.bossbar.set.max.success"),
        SET_MAX_UNCHANGED("commands.bossbar.set.max.unchanged"),
        SET_NAME_SUCCESS("commands.bossbar.set.name.success"),
        SET_NAME_UNCHANGED("commands.bossbar.set.name.unchanged"),
        SET_PLAYERS_SUCCESS_NONE("commands.bossbar.set.players.success.none"),
        SET_PLAYERS_SUCCESS_SOME("commands.bossbar.set.players.success.some"),
        SET_PLAYERS_UNCHANGED("commands.bossbar.set.players.unchanged"),
        SET_STYLE_SUCCESS("commands.bossbar.set.style.success"),
        SET_STYLE_UNCHANGED("commands.bossbar.set.style.unchanged"),
        SET_VALUE_SUCCESS("commands.bossbar.set.value.success"),
        SET_VALUE_UNCHANGED("commands.bossbar.set.value.unchanged"),
        SET_VISIBILITY_UNCHANGED_HIDDEN("commands.bossbar.set.visibility.unchanged.hidden"),
        SET_VISIBILITY_UNCHANGED_VISIBLE("commands.bossbar.set.visibility.unchanged.visible"),
        SET_VISIBLE_SUCCESS_HIDDEN("commands.bossbar.set.visible.success.hidden"),
        SET_VISIBLE_SUCCESS_VISIBLE("commands.bossbar.set.visible.success.visible"),
        UNKNOWN("commands.bossbar.unknown");

        private final String key;

        Bossbar(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Clear implements Key {
        SUCCESS_MULTIPLE("commands.clear.success.multiple"),
        SUCCESS_SINGLE("commands.clear.success.single"),
        TEST_MULTIPLE("commands.clear.test.multiple"),
        TEST_SINGLE("commands.clear.test.single");

        private final String key;

        Clear(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Clone implements Key {
        FAILED("commands.clone.failed"),
        OVERLAP("commands.clone.overlap"),
        SUCCESS("commands.clone.success"),
        TOOBIG("commands.clone.toobig");

        private final String key;

        Clone(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Damage implements Key {
        INVULNERABLE("commands.damage.invulnerable"),
        SUCCESS("commands.damage.success");

        private final String key;

        Damage(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Data implements Key {
        BLOCK_GET("commands.data.block.get"),
        BLOCK_INVALID("commands.data.block.invalid"),
        BLOCK_MODIFIED("commands.data.block.modified"),
        BLOCK_QUERY("commands.data.block.query"),
        ENTITY_GET("commands.data.entity.get"),
        ENTITY_INVALID("commands.data.entity.invalid"),
        ENTITY_MODIFIED("commands.data.entity.modified"),
        ENTITY_QUERY("commands.data.entity.query"),
        GET_INVALID("commands.data.get.invalid"),
        GET_MULTIPLE("commands.data.get.multiple"),
        GET_UNKNOWN("commands.data.get.unknown"),
        MERGE_FAILED("commands.data.merge.failed"),
        MODIFY_EXPECTED_LIST("commands.data.modify.expected_list"),
        MODIFY_EXPECTED_OBJECT("commands.data.modify.expected_object"),
        MODIFY_EXPECTED_VALUE("commands.data.modify.expected_value"),
        MODIFY_INVALID_INDEX("commands.data.modify.invalid_index"),
        MODIFY_INVALID_SUBSTRING("commands.data.modify.invalid_substring"),
        STORAGE_GET("commands.data.storage.get"),
        STORAGE_MODIFIED("commands.data.storage.modified"),
        STORAGE_QUERY("commands.data.storage.query");

        private final String key;

        Data(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Datapack implements Key {
        DISABLE_FAILED("commands.datapack.disable.failed"),
        ENABLE_FAILED("commands.datapack.enable.failed"),
        ENABLE_FAILED_NO_FLAGS("commands.datapack.enable.failed.no_flags"),
        LIST_AVAILABLE_NONE("commands.datapack.list.available.none"),
        LIST_AVAILABLE_SUCCESS("commands.datapack.list.available.success"),
        LIST_ENABLED_NONE("commands.datapack.list.enabled.none"),
        LIST_ENABLED_SUCCESS("commands.datapack.list.enabled.success"),
        MODIFY_DISABLE("commands.datapack.modify.disable"),
        MODIFY_ENABLE("commands.datapack.modify.enable"),
        UNKNOWN("commands.datapack.unknown");

        private final String key;

        Datapack(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Debug implements Key {
        ALREADYRUNNING("commands.debug.alreadyRunning"),
        FUNCTION_NORECURSION("commands.debug.function.noRecursion"),
        FUNCTION_SUCCESS_MULTIPLE("commands.debug.function.success.multiple"),
        FUNCTION_SUCCESS_SINGLE("commands.debug.function.success.single"),
        FUNCTION_TRACEFAILED("commands.debug.function.traceFailed"),
        NOTRUNNING("commands.debug.notRunning"),
        STARTED("commands.debug.started"),
        STOPPED("commands.debug.stopped");

        private final String key;

        Debug(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum DefaultGamemode implements Key {
        SUCCESS("commands.defaultgamemode.success");

        private final String key;

        DefaultGamemode(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Deop implements Key {
        FAILED("commands.deop.failed"),
        SUCCESS("commands.deop.success");

        private final String key;

        Deop(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }

    }

    public enum Difficulty implements Key {
        FAILURE("commands.difficulty.failure"),
        QUERY("commands.difficulty.query"),
        SUCCESS("commands.difficulty.success");

        private final String key;

        Difficulty(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Drop implements Key {
        NO_HELD_ITEMS("commands.drop.no_held_items"),
        NO_LOOT_TABLE("commands.drop.no_loot_table"),
        SUCCESS_MULTIPLE("commands.drop.success.multiple"),
        SUCCESS_MULTIPLE_WITH_TABLE("commands.drop.success.multiple_with_table"),
        SUCCESS_SINGLE("commands.drop.success.single"),
        SUCCESS_SINGLE_WITH_TABLE("commands.drop.success.single_with_table");

        private final String key;

        Drop(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Effect implements Key {
        CLEAR_EVERYTHING_FAILED("commands.effect.clear.everything.failed"),
        CLEAR_EVERYTHING_SUCCESS_MULTIPLE("commands.effect.clear.everything.success.multiple"),
        CLEAR_EVERYTHING_SUCCESS_SINGLE("commands.effect.clear.everything.success.single"),
        CLEAR_SPECIFIC_FAILED("commands.effect.clear.specific.failed"),
        CLEAR_SPECIFIC_SUCCESS_MULTIPLE("commands.effect.clear.specific.success.multiple"),
        CLEAR_SPECIFIC_SUCCESS_SINGLE("commands.effect.clear.specific.success.single"),
        GIVE_FAILED("commands.effect.give.failed"),
        GIVE_SUCCESS_MULTIPLE("commands.effect.give.success.multiple"),
        GIVE_SUCCESS_SINGLE("commands.effect.give.success.single");

        private final String key;

        Effect(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Enchant implements Key {
        FAILED("commands.enchant.failed"),
        FAILED_ENTITY("commands.enchant.failed.entity"),
        FAILED_INCOMPATIBLE("commands.enchant.failed.incompatible"),
        FAILED_ITEMLESS("commands.enchant.failed.itemless"),
        FAILED_LEVEL("commands.enchant.failed.level"),
        SUCCESS_MULTIPLE("commands.enchant.success.multiple"),
        SUCCESS_SINGLE("commands.enchant.success.single");

        private final String key;

        Enchant(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Execute implements Key {
        BLOCKS_TOOBIG("commands.execute.blocks.toobig"),
        CONDITIONAL_FAIL("commands.execute.conditional.fail"),
        CONDITIONAL_FAIL_COUNT("commands.execute.conditional.fail_count"),
        CONDITIONAL_PASS("commands.execute.conditional.pass"),
        CONDITIONAL_PASS_COUNT("commands.execute.conditional.pass_count");

        private final String key;

        Execute(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Experience implements Key {
        ADD_LEVELS_SUCCESS_MULTIPLE("commands.experience.add.levels.success.multiple"),
        ADD_LEVELS_SUCCESS_SINGLE("commands.experience.add.levels.success.single"),
        ADD_POINTS_SUCCESS_MULTIPLE("commands.experience.add.points.success.multiple"),
        ADD_POINTS_SUCCESS_SINGLE("commands.experience.add.points.success.single"),
        QUERY_LEVELS("commands.experience.query.levels"),
        QUERY_POINTS("commands.experience.query.points"),
        SET_LEVELS_SUCCESS_MULTIPLE("commands.experience.set.levels.success.multiple"),
        SET_LEVELS_SUCCESS_SINGLE("commands.experience.set.levels.success.single"),
        SET_POINTS_INVALID("commands.experience.set.points.invalid"),
        SET_POINTS_SUCCESS_MULTIPLE("commands.experience.set.points.success.multiple"),
        SET_POINTS_SUCCESS_SINGLE("commands.experience.set.points.success.single");

        private final String key;

        Experience(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Fill implements Key {
        FAILED("commands.fill.failed"),
        SUCCESS("commands.fill.success"),
        TOOBIG("commands.fill.toobig");

        private final String key;

        Fill(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum FillBiome implements Key {
        SUCCESS("commands.fillbiome.success"),
        SUCCESS_COUNT("commands.fillbiome.success.count"),
        TOOBIG("commands.fillbiome.toobig");

        private final String key;

        FillBiome(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum ForceLoad implements Key {
        ADDED_FAILURE("commands.forceload.added.failure"),
        ADDED_MULTIPLE("commands.forceload.added.multiple"),
        ADDED_NONE("commands.forceload.added.none"),
        ADDED_SINGLE("commands.forceload.added.single"),
        LIST_MULTIPLE("commands.forceload.list.multiple"),
        LIST_SINGLE("commands.forceload.list.single"),
        QUERY_FAILURE("commands.forceload.query.failure"),
        QUERY_SUCCESS("commands.forceload.query.success"),
        REMOVED_ALL("commands.forceload.removed.all"),
        REMOVED_FAILURE("commands.forceload.removed.failure"),
        REMOVED_MULTIPLE("commands.forceload.removed.multiple"),
        REMOVED_SINGLE("commands.forceload.removed.single"),
        TOOBIG("commands.forceload.toobig");

        private final String key;

        ForceLoad(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Function implements Key {
        SUCCESS_MULTIPLE("commands.function.success.multiple"),
        SUCCESS_MULTIPLE_RESULT("commands.function.success.multiple.result"),
        SUCCESS_SINGLE("commands.function.success.single"),
        SUCCESS_SINGLE_RESULT("commands.function.success.single.result");

        private final String key;

        Function(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Gamemode implements Key {
        SUCCESS_OTHER("commands.gamemode.success.other"),
        SUCCESS_SELF("commands.gamemode.success.self");

        private final String key;

        Gamemode(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Gamerule implements Key {
        QUERY("commands.gamerule.query"),
        SET("commands.gamerule.set");

        private final String key;

        Gamerule(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Give implements Key {
        FAILED_TOOMANYITEMS("commands.give.failed.toomanyitems"),
        SUCCESS_MULTIPLE("commands.give.success.multiple"),
        SUCCESS_SINGLE("commands.give.success.single");

        private final String key;

        Give(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Help implements Key {
        FAILED("commands.help.failed");

        private final String key;

        Help(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Item implements Key {
        BLOCK_SET_SUCCESS("commands.item.block.set.success"),
        ENTITY_SET_SUCCESS_MULTIPLE("commands.item.entity.set.success.multiple"),
        ENTITY_SET_SUCCESS_SINGLE("commands.item.entity.set.success.single"),
        SOURCE_NO_SUCH_SLOT("commands.item.source.no_such_slot"),
        SOURCE_NOT_A_CONTAINER("commands.item.source.not_a_container"),
        TARGET_NO_CHANGED_KNOWN_ITEM("commands.item.target.no_changed.known_item"),
        TARGET_NO_CHANGES("commands.item.target.no_changes"),
        TARGET_NO_SUCH_SLOT("commands.item.target.no_such_slot"),
        TARGET_NOT_A_CONTAINER("commands.item.target.not_a_container");

        private final String key;

        Item(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum JFR implements Key {
        DUMP_FAILED("commands.jfr.dump.failed"),
        START_FAILED("commands.jfr.start.failed"),
        STARTED("commands.jfr.started"),
        STOPPED("commands.jfr.stopped");

        private final String key;

        JFR(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Kick implements Key {
        OWNER_FAILED("commands.kick.owner.failed"),
        SINGLEPLAYER_FAILED("commands.kick.singleplayer.failed"),
        SUCCESS("commands.kick.success");

        private final String key;

        Kick(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Kill implements Key {
        SUCCESS_MULTIPLE("commands.kill.success.multiple"),
        SUCCESS_SINGLE("commands.kill.success.single");

        private final String key;

        Kill(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum List implements Key {
        NAMEANDID("commands.list.nameAndId"),
        PLAYERS("commands.list.players");

        private final String key;

        List(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Locate implements Key {
        BIOME_NOT_FOUND("commands.locate.biome.not_found"),
        BIOME_SUCCESS("commands.locate.biome.success"),
        POI_NOT_FOUND("commands.locate.poi.not_found"),
        POI_SUCCESS("commands.locate.poi.success"),
        STRUCTURE_INVALID("commands.locate.structure.invalid"),
        STRUCTURE_NOT_FOUND("commands.locate.structure.not_found"),
        STRUCTURE_SUCCESS("commands.locate.structure.success");

        private final String key;

        Locate(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Message implements Key {
        DISPLAY_INCOMING("commands.message.display.incoming"),
        DISPLAY_OUTGOING("commands.message.display.outgoing");

        private final String key;

        Message(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Op implements Key {
        FAILED("commands.op.failed"),
        SUCCESS("commands.op.success");

        private final String key;

        Op(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Pardon implements Key {
        FAILED("commands.pardon.failed"),
        SUCCESS("commands.pardon.success");

        private final String key;

        Pardon(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum PardonIp implements Key {
        FAILED("commands.pardonip.failed"),
        INVALID("commands.pardonip.invalid"),
        SUCCESS("commands.pardonip.success");

        private final String key;

        PardonIp(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Particle implements Key {
        FAILED("commands.particle.failed"),
        SUCCESS("commands.particle.success");

        private final String key;

        Particle(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Perf implements Key {
        ALREADYRUNNING("commands.perf.alreadyRunning"),
        NOTRUNNING("commands.perf.notRunning"),
        REPORTFAILED("commands.perf.reportFailed"),
        REPORTSAVED("commands.perf.reportSaved"),
        STARTED("commands.perf.started"),
        STOPPED("commands.perf.stopped");

        private final String key;

        Perf(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Place implements Key {
        FEATURE_FAILED("commands.place.feature.failed"),
        FEATURE_INVALID("commands.place.feature.invalid"),
        FEATURE_SUCCESS("commands.place.feature.success"),
        JIGSAW_FAILED("commands.place.jigsaw.failed"),
        JIGSAW_INVALID("commands.place.jigsaw.invalid"),
        JIGSAW_SUCCESS("commands.place.jigsaw.success"),
        STRUCTURE_FAILED("commands.place.structure.failed"),
        STRUCTURE_INVALID("commands.place.structure.invalid"),
        STRUCTURE_SUCCESS("commands.place.structure.success"),
        TEMPLATE_FAILED("commands.place.template.failed"),
        TEMPLATE_INVALID("commands.place.template.invalid"),
        TEMPLATE_SUCCESS("commands.place.template.success");

        private final String key;

        Place(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Playsound implements Key {
        FAILED("commands.playsound.failed"),
        SUCCESS_MULTIPLE("commands.playsound.success.multiple"),
        SUCCESS_SINGLE("commands.playsound.success.single");

        private final String key;

        Playsound(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Publish implements Key {
        ALREADYPUBLISHED("commands.publish.alreadyPublished"),
        FAILED("commands.publish.failed"),
        STARTED("commands.publish.started"),
        SUCCESS("commands.publish.success");

        private final String key;

        Publish(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }

    }

    public enum Random implements Key {
        ERROR_RANGE_TOO_LARGE("commands.random.error.range_too_large"),
        ERROR_RANGE_TOO_SMALL("commands.random.error.range_too_small"),
        RESET_ALL_SUCCESS("commands.random.reset.all.success"),
        RESET_SUCCESS("commands.random.reset.success"),
        ROLL("commands.random.roll"),
        SAMPLE_SUCCESS("commands.random.sample.success");

        private final String key;

        Random(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Recipe implements Key {
        GIVE_FAILED("commands.recipe.give.failed"),
        GIVE_SUCCESS_MULTIPLE("commands.recipe.give.success.multiple"),
        GIVE_SUCCESS_SINGLE("commands.recipe.give.success.single"),
        TAKE_FAILED("commands.recipe.take.failed"),
        TAKE_SUCCESS_MULTIPLE("commands.recipe.take.success.multiple"),
        TAKE_SUCCESS_SINGLE("commands.recipe.take.success.single");

        private final String key;

        Recipe(String key) {
            this.key = key;
        }
        @Override
        public String getKey() {
            return key;
        }

    }

    public enum Reload implements Key {
        FAILURE("commands.reload.failure"),
        SUCCESS("commands.reload.success");

        private final String key;

        Reload(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Ride implements Key {
        ALREADY_RIDING("commands.ride.already_riding"),
        DISMOUNT_SUCCESS("commands.ride.dismount.success"),
        MOUNT_FAILURE_CANT_RIDE_PLAYERS("commands.ride.mount.failure.cant_ride_players"),
        MOUNT_FAILURE_GENERIC("commands.ride.mount.failure.generic"),
        MOUNT_FAILURE_LOOP("commands.ride.mount.failure.loop"),
        MOUNT_FAILURE_WRONG_DIMENSION("commands.ride.mount.failure.wrong_dimension"),
        MOUNT_SUCCESS("commands.ride.mount.success"),
        NOT_RIDING("commands.ride.not_riding");

        private final String key;

        Ride(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Save implements Key {
        ALREADY_OFF("commands.save.alreadyOff"),
        ALREADY_ON("commands.save.alreadyOn"),
        DISABLED("commands.save.disabled"),
        ENABLED("commands.save.enabled"),
        FAILED("commands.save.failed"),
        SAVING("commands.save.saving"),
        SUCCESS("commands.save.success");

        private final String key;

        Save(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Schedule implements Key {
        CLEARED_FAILURE("commands.schedule.cleared.failure"),
        CLEARED_SUCCESS("commands.schedule.cleared.success"),
        CREATED_FUNCTION("commands.schedule.created.function"),
        CREATED_TAG("commands.schedule.created.tag"),
        SAME_TICK("commands.schedule.same_tick");

        private final String key;

        Schedule(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Scoreboard implements Key {
        OBJECTIVES_ADD_DUPLICATE("commands.scoreboard.objectives.add.duplicate"),
        OBJECTIVES_ADD_SUCCESS("commands.scoreboard.objectives.add.success"),
        OBJECTIVES_DISPLAY_ALREADYEMPTY("commands.scoreboard.objectives.display.alreadyEmpty"),
        OBJECTIVES_DISPLAY_ALREADYSET("commands.scoreboard.objectives.display.alreadySet"),
        OBJECTIVES_DISPLAY_CLEARED("commands.scoreboard.objectives.display.cleared"),
        OBJECTIVES_DISPLAY_SET("commands.scoreboard.objectives.display.set"),
        OBJECTIVES_LIST_EMPTY("commands.scoreboard.objectives.list.empty"),
        OBJECTIVES_LIST_SUCCESS("commands.scoreboard.objectives.list.success"),
        OBJECTIVES_MODIFY_DISPLAYNAME("commands.scoreboard.objectives.modify.displayname"),
        OBJECTIVES_MODIFY_RENDERTYPE("commands.scoreboard.objectives.modify.rendertype"),
        OBJECTIVES_REMOVE_SUCCESS("commands.scoreboard.objectives.remove.success"),
        PLAYERS_ADD_SUCCESS_MULTIPLE("commands.scoreboard.players.add.success.multiple"),
        PLAYERS_ADD_SUCCESS_SINGLE("commands.scoreboard.players.add.success.single"),
        PLAYERS_ENABLE_FAILED("commands.scoreboard.players.enable.failed"),
        PLAYERS_ENABLE_INVALID("commands.scoreboard.players.enable.invalid"),
        PLAYERS_ENABLE_SUCCESS_MULTIPLE("commands.scoreboard.players.enable.success.multiple"),
        PLAYERS_ENABLE_SUCCESS_SINGLE("commands.scoreboard.players.enable.success.single"),
        PLAYERS_GET_NULL("commands.scoreboard.players.get.null"),
        PLAYERS_GET_SUCCESS("commands.scoreboard.players.get.success"),
        PLAYERS_LIST_EMPTY("commands.scoreboard.players.list.empty"),
        PLAYERS_LIST_ENTITY_EMPTY("commands.scoreboard.players.list.entity.empty"),
        PLAYERS_LIST_ENTITY_ENTRY("commands.scoreboard.players.list.entity.entry"),
        PLAYERS_LIST_ENTITY_SUCCESS("commands.scoreboard.players.list.entity.success"),
        PLAYERS_LIST_SUCCESS("commands.scoreboard.players.list.success"),
        PLAYERS_OPERATION_SUCCESS_MULTIPLE("commands.scoreboard.players.operation.success.multiple"),
        PLAYERS_OPERATION_SUCCESS_SINGLE("commands.scoreboard.players.operation.success.single"),
        PLAYERS_REMOVE_SUCCESS_MULTIPLE("commands.scoreboard.players.remove.success.multiple"),
        PLAYERS_REMOVE_SUCCESS_SINGLE("commands.scoreboard.players.remove.success.single"),
        PLAYERS_RESET_ALL_MULTIPLE("commands.scoreboard.players.reset.all.multiple"),
        PLAYERS_RESET_ALL_SINGLE("commands.scoreboard.players.reset.all.single"),
        PLAYERS_RESET_SPECIFIC_MULTIPLE("commands.scoreboard.players.reset.specific.multiple"),
        PLAYERS_RESET_SPECIFIC_SINGLE("commands.scoreboard.players.reset.specific.single"),
        PLAYERS_SET_SUCCESS_MULTIPLE("commands.scoreboard.players.set.success.multiple"),
        PLAYERS_SET_SUCCESS_SINGLE("commands.scoreboard.players.set.success.single");

        private final String key;

        Scoreboard(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Seed implements Key {
        SUCCESS("commands.seed.success");

        private final String key;

        Seed(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum SetBlock implements Key {
        FAILED("commands.setblock.failed"),
        SUCCESS("commands.setblock.success");

        private final String key;

        SetBlock(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum SetIdleTimeout implements Key {
        SUCCESS("commands.setidletimeout.success");

        private final String key;

        SetIdleTimeout(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum SetWorldSpawn implements Key {
        SUCCESS("commands.setworldspawn.success");

        private final String key;

        SetWorldSpawn(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Spawnpoint implements Key {
        SUCCESS_MULTIPLE("commands.spawnpoint.success.multiple"),
        SUCCESS_SINGLE("commands.spawnpoint.success.single");

        private final String key;

        Spawnpoint(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Spectate implements Key {
        NOT_SPECTATOR("commands.spectate.not_spectator"),
        SELF("commands.spectate.self"),
        SUCCESS_STARTED("commands.spectate.success.started"),
        SUCCESS_STOPPED("commands.spectate.success.stopped");

        private final String key;

        Spectate(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Spreadplayers implements Key {
        FAILED_ENTITIES("commands.spreadplayers.failed.entities"),
        FAILED_INVALID_HEIGHT("commands.spreadplayers.failed.invalid.height"),
        FAILED_TEAMS("commands.spreadplayers.failed.teams"),
        SUCCESS_ENTITIES("commands.spreadplayers.success.entities"),
        SUCCESS_TEAMS("commands.spreadplayers.success.teams");

        private final String key;

        Spreadplayers(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Stop implements Key {
        STOPPING("commands.stop.stopping");

        private final String key;

        Stop(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum StopSound implements Key {
        SUCCESS_SOURCE_ANY("commands.stopsound.success.source.any"),
        SUCCESS_SOURCE_SOUND("commands.stopsound.success.source.sound"),
        SUCCESS_SOURCELESS_ANY("commands.stopsound.success.sourceless.any"),
        SUCCESS_SOURCELESS_SOUND("commands.stopsound.success.sourceless.sound");

        private final String key;

        StopSound(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Summon implements Key {
        FAILED("commands.summon.failed"),
        FAILED_UUID("commands.summon.failed.uuid"),
        INVALIDPOSITION("commands.summon.invalidPosition"),
        SUCCESS("commands.summon.success");

        private final String key;

        Summon(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Tag implements Key {
        ADD_FAILED("commands.tag.add.failed"),
        ADD_SUCCESS_MULTIPLE("commands.tag.add.success.multiple"),
        ADD_SUCCESS_SINGLE("commands.tag.add.success.single"),
        LIST_MULTIPLE_EMPTY("commands.tag.list.multiple.empty"),
        LIST_MULTIPLE_SUCCESS("commands.tag.list.multiple.success"),
        LIST_SINGLE_EMPTY("commands.tag.list.single.empty"),
        LIST_SINGLE_SUCCESS("commands.tag.list.single.success"),
        REMOVE_FAILED("commands.tag.remove.failed"),
        REMOVE_SUCCESS_MULTIPLE("commands.tag.remove.success.multiple"),
        REMOVE_SUCCESS_SINGLE("commands.tag.remove.success.single");

        private final String key;

        Tag(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Team implements Key {
        ADD_DUPLICATE("commands.team.add.duplicate"),
        ADD_SUCCESS("commands.team.add.success"),
        EMPTY_SUCCESS("commands.team.empty.success"),
        EMPTY_UNCHANGED("commands.team.empty.unchanged"),
        JOIN_SUCCESS_MULTIPLE("commands.team.join.success.multiple"),
        JOIN_SUCCESS_SINGLE("commands.team.join.success.single"),
        LEAVE_SUCCESS_MULTIPLE("commands.team.leave.success.multiple"),
        LEAVE_SUCCESS_SINGLE("commands.team.leave.success.single"),
        LIST_MEMBERS_EMPTY("commands.team.list.members.empty"),
        LIST_MEMBERS_SUCCESS("commands.team.list.members.success"),
        LIST_TEAMS_EMPTY("commands.team.list.teams.empty"),
        LIST_TEAMS_SUCCESS("commands.team.list.teams.success"),
        OPTION_COLLISIONRULE_SUCCESS("commands.team.option.collisionRule.success"),
        OPTION_COLLISIONRULE_UNCHANGED("commands.team.option.collisionRule.unchanged"),
        OPTION_COLOR_SUCCESS("commands.team.option.color.success"),
        OPTION_COLOR_UNCHANGED("commands.team.option.color.unchanged"),
        OPTION_DEATHMESSAGEVISIBILITY_SUCCESS("commands.team.option.deathMessageVisibility.success"),
        OPTION_DEATHMESSAGEVISIBILITY_UNCHANGED("commands.team.option.deathMessageVisibility.unchanged"),
        OPTION_FRIENDLYFIRE_ALREADYDISABLED("commands.team.option.friendlyfire.alreadyDisabled"),
        OPTION_FRIENDLYFIRE_ALREADYENABLED("commands.team.option.friendlyfire.alreadyEnabled"),
        OPTION_FRIENDLYFIRE_DISABLED("commands.team.option.friendlyfire.disabled"),
        OPTION_FRIENDLYFIRE_ENABLED("commands.team.option.friendlyfire.enabled"),
        OPTION_NAME_SUCCESS("commands.team.option.name.success"),
        OPTION_NAME_UNCHANGED("commands.team.option.name.unchanged"),
        OPTION_NAMETAGVISIBILITY_SUCCESS("commands.team.option.nametagVisibility.success"),
        OPTION_NAMETAGVISIBILITY_UNCHANGED("commands.team.option.nametagVisibility.unchanged"),
        OPTION_PREFIX_SUCCESS("commands.team.option.prefix.success"),
        OPTION_SEEFRIENDLYINVISIBLES_ALREADYDISABLED("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"),
        OPTION_SEEFRIENDLYINVISIBLES_ALREADYENABLED("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"),
        OPTION_SEEFRIENDLYINVISIBLES_DISABLED("commands.team.option.seeFriendlyInvisibles.disabled"),
        OPTION_SEEFRIENDLYINVISIBLES_ENABLED("commands.team.option.seeFriendlyInvisibles.enabled"),
        OPTION_SUFFIX_SUCCESS("commands.team.option.suffix.success"),
        REMOVE_SUCCESS("commands.team.remove.success");

        private final String key;

        Team(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum TeamMsg implements Key {
        FAILED_NOTEAM("commands.teammsg.failed.noteam");

        private final String key;

        TeamMsg(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Teleport implements Key {
        INVALID_POSITION("commands.teleport.invalidPosition"),
        SUCCESS_ENTITY_MULTIPLE("commands.teleport.success.entity.multiple"),
        SUCCESS_ENTITY_SINGLE("commands.teleport.success.entity.single"),
        SUCCESS_LOCATION_MULTIPLE("commands.teleport.success.location.multiple"),
        SUCCESS_LOCATION_SINGLE("commands.teleport.success.location.single");

        private final String key;

        Teleport(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Tick implements Key {
        QUERY_PERCENTILES("commands.tick.query.percentiles"),
        QUERY_RATE_RUNNING("commands.tick.query.rate.running"),
        QUERY_RATE_SPRINTING("commands.tick.query.rate.sprinting"),
        RATE_SUCCESS("commands.tick.rate.success"),
        SPRINT_REPORT("commands.tick.sprint.report"),
        SPRINT_STOP_FAIL("commands.tick.sprint.stop.fail"),
        SPRINT_STOP_SUCCESS("commands.tick.sprint.stop.success"),
        STATUS_FROZEN("commands.tick.status.frozen"),
        STATUS_LAGGING("commands.tick.status.lagging"),
        STATUS_RUNNING("commands.tick.status.running"),
        STATUS_SPRINTING("commands.tick.status.sprinting"),
        STEP_FAIL("commands.tick.step.fail"),
        STEP_STOP_FAIL("commands.tick.step.stop.fail"),
        STEP_STOP_SUCCESS("commands.tick.step.stop.success"),
        STEP_SUCCESS("commands.tick.step.success");

        private final String key;

        Tick(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Time implements Key {
        QUERY("commands.time.query"),
        SET("commands.time.set");

        private final String key;

        Time(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Title implements Key {
        CLEARED_MULTIPLE("commands.title.cleared.multiple"),
        CLEARED_SINGLE("commands.title.cleared.single"),
        RESET_MULTIPLE("commands.title.reset.multiple"),
        RESET_SINGLE("commands.title.reset.single"),
        SHOW_ACTIONBAR_MULTIPLE("commands.title.show.actionbar.multiple"),
        SHOW_ACTIONBAR_SINGLE("commands.title.show.actionbar.single"),
        SHOW_SUBTITLE_MULTIPLE("commands.title.show.subtitle.multiple"),
        SHOW_SUBTITLE_SINGLE("commands.title.show.subtitle.single"),
        SHOW_TITLE_MULTIPLE("commands.title.show.title.multiple"),
        SHOW_TITLE_SINGLE("commands.title.show.title.single"),
        TIMES_MULTIPLE("commands.title.times.multiple"),
        TIMES_SINGLE("commands.title.times.single");

        private final String key;

        Title(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Trigger implements Key {
        ADD_SUCCESS("commands.trigger.add.success"),
        FAILED_INVALID("commands.trigger.failed.invalid"),
        FAILED_UNPRIMED("commands.trigger.failed.unprimed"),
        SET_SUCCESS("commands.trigger.set.success"),
        SIMPLE_SUCCESS("commands.trigger.simple.success");

        private final String key;

        Trigger(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Weather implements Key {
        SET_CLEAR("commands.weather.set.clear"),
        SET_RAIN("commands.weather.set.rain"),
        SET_THUNDER("commands.weather.set.thunder");

        private final String key;

        Weather(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum Whitelist implements Key {
        ADD_FAILED("commands.whitelist.add.failed"),
        ADD_SUCCESS("commands.whitelist.add.success"),
        ALREADYOFF("commands.whitelist.alreadyOff"),
        ALREADYON("commands.whitelist.alreadyOn"),
        DISABLED("commands.whitelist.disabled"),
        ENABLED("commands.whitelist.enabled"),
        LIST("commands.whitelist.list"),
        NONE("commands.whitelist.none"),
        RELOADED("commands.whitelist.reloaded"),
        REMOVE_FAILED("commands.whitelist.remove.failed"),
        REMOVE_SUCCESS("commands.whitelist.remove.success");

        private final String key;

        Whitelist(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public enum WorldBorder implements Key {
        CENTER_FAILED("commands.worldborder.center.failed"),
        CENTER_SUCCESS("commands.worldborder.center.success"),
        DAMAGE_AMOUNT_FAILED("commands.worldborder.damage.amount.failed"),
        DAMAGE_AMOUNT_SUCCESS("commands.worldborder.damage.amount.success"),
        DAMAGE_BUFFER_FAILED("commands.worldborder.damage.buffer.failed"),
        DAMAGE_BUFFER_SUCCESS("commands.worldborder.damage.buffer.success"),
        GET("commands.worldborder.get"),
        SET_FAILED_BIG("commands.worldborder.set.failed.big"),
        SET_FAILED_FAR("commands.worldborder.set.failed.far"),
        SET_FAILED_NOCHANGE("commands.worldborder.set.failed.nochange"),
        SET_FAILED_SMALL("commands.worldborder.set.failed.small"),
        SET_GROW("commands.worldborder.set.grow"),
        SET_IMMEDIATE("commands.worldborder.set.immediate"),
        SET_SHRINK("commands.worldborder.set.shrink"),
        WARNING_DISTANCE_FAILED("commands.worldborder.warning.distance.failed"),
        WARNING_DISTANCE_SUCCESS("commands.worldborder.warning.distance.success"),
        WARNING_TIME_FAILED("commands.worldborder.warning.time.failed"),
        WARNING_TIME_SUCCESS("commands.worldborder.warning.time.success");

        private final String key;

        WorldBorder(String key) {
            this.key = key;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    public static final Class<? extends Enum<? extends Key>>[] sub = new Class[] {
            Advancements.class, Attribute.class, Ban.class, BanIp.class, BanList.class, Bossbar.class, Clear.class,
            Clone.class, Damage.class, Data.class, Datapack.class, Debug.class, DefaultGamemode.class,
            Deop.class, Difficulty.class, Drop.class, Effect.class, Enchant.class, Execute.class, Experience.class,
            Fill.class, FillBiome.class, ForceLoad.class, Function.class, Gamemode.class, Gamerule.class, Give.class,
            Help.class, Item.class, JFR.class, Kick.class, Kill.class, List.class, Locate.class, Message.class,
            Op.class, Pardon.class, PardonIp.class, Particle.class, Perf.class, Place.class, Playsound.class,
            Publish.class, Random.class, Recipe.class, Reload.class, Ride.class, Save.class, Schedule.class,
            Scoreboard.class, Seed.class, SetBlock.class, SetIdleTimeout.class, SetWorldSpawn.class, Spawnpoint.class,
            Spectate.class, Spreadplayers.class, Stop.class, StopSound.class, Summon.class, Tag.class, Team.class,
            TeamMsg.class, Teleport.class, Tick.class, Time.class, Title.class, Trigger.class, Weather.class,
            Whitelist.class, WorldBorder.class
    };

    private final String key;

    Commands(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
