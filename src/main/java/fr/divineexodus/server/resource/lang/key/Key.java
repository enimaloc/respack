package fr.divineexodus.server.resource.lang.key;

import fr.divineexodus.server.resource.lang.key.minecraft.*;
import fr.divineexodus.server.resource.lang.key.minecraft.Record;

import java.util.Arrays;
import java.util.stream.Stream;

public interface Key {
    Class<? extends Enum<? extends Key>>[] sub = Stream.concat(
            Arrays.stream(new Class[]{
                    Accessibility.class, AddServer.class, Advancements.class, AdvMode.class, Argument.class,
                    Attribute.class, Biome.class, Block.class, Book.class, Build.class, Chat.class, Clear.class, Color.class,
                    Commands.class, Compliance.class, Connect.class, Container.class, Controls.class, CreateWorld.class,
                    CreditsAndAttribution.class, Datapack.class, DatapackFailure.class, Death.class, DeathScreen.class,
                    Debug.class, Demo.class, Difficulty.class, Disonnect.class, Download.class, EditGamerule.class,
                    Effect.class, Enchantment.class, Entity.class, Event.class, FilledMap.class, FlatWorldPreset.class,
                    Gamemode.class, Gamemode.class, Generator.class, Gui.class, HangingSign.class, Instrument.class,
                    Inventory.class, Item.class, ItemGroup.class, JigsawBlock.class, Keyboard.class, Language.class,
                    LanServer.class, Lectern.class, MCO.class, Menu.class, Merchant.class, Mirror.class, Mount.class,
                    Multiplayer.class, MultiplayerWarning.class, Narrration.class, Narrator.class, OptimizeWorld.class,
                    Option.class, OutOfMemory.class, Pack.class, Painting.class, Parsing.class, Particle.class,
                    Permissions.class, Potion.class, Predicate.class, QuickPlay.class, Realms.class, Recipe.class,
                    Record.class, RecoverWorld.class, ResourcePack.class, Screenshot.class, SelectServer.class,
                    SelectWorld.class, Sign.class, Sleep.class, Slot.class, SoundCategory.class, SpectatorMenu.class,
                    StatType.class, Stat.class, Stats.class, StructureBlock.class, Subtitles.class, SymlinkWarning.class,
                    Team.class, Telemetry.class, TelemetryInfo.class, Title.class, Translation.class, TrimMaterial.class,
                    TrimPattern.class, Tutorial.class, Upgrade.class
            }),
            Arrays.stream(Commands.sub)
    ).toArray(Class[]::new);

    String getKey();

    static Key[] values() {
        return Arrays.stream(sub).flatMap(c -> Arrays.stream(c.getEnumConstants())).toArray(Key[]::new);
    }
}
