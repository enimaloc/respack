package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Chat implements Key {
    SCREEN_MESSAGE("chat_screen.message"),
    SCREEN_TITLE("chat_screen.title"),
    SCREEN_USAGE("chat_screen.usage"),
    CANNOTSEND("chat.cannotSend"),
    COORDINATES("chat.coordinates"),
    COORDINATES_TOOLTIP("chat.coordinates.tooltip"),
    COPY("chat.copy"),
    COPY_CLICK("chat.copy.click"),
    DELETED_MARKER("chat.deleted_marker"),
    DISABLED_CHAIN_BROKEN("chat.disabled.chain_broken"),
    DISABLED_EXPIREDPROFILEKEY("chat.disabled.expiredProfileKey"),
    DISABLED_LAUNCHER("chat.disabled.launcher"),
    DISABLED_MISSINGPROFILEKEY("chat.disabled.missingProfileKey"),
    DISABLED_OPTIONS("chat.disabled.options"),
    DISABLED_PROFILE("chat.disabled.profile"),
    DISABLED_PROFILE_MOREINFO("chat.disabled.profile.moreInfo"),
    EDITBOX("chat.editBox"),
    FILTERED("chat.filtered"),
    FILTERED_FULL("chat.filtered_full"),
    LINK_CONFIRM("chat.link.confirm"),
    LINK_CONFIRMTRUSTED("chat.link.confirmTrusted"),
    LINK_OPEN("chat.link.open"),
    LINK_WARNING("chat.link.warning"),
    QUEUE("chat.queue"),
    SQUARE_BRACKETS("chat.square_brackets"),
    TAG_MODIFIED("chat.tag.modified"),
    TAG_NOT_SECURE("chat.tag.not_secure"),
    TAG_SYSTEM("chat.tag.system"),
    TAG_SYSTEM_SINGLE_PLAYER("chat.tag.system_single_player"),
    TYPE_ADMIN("chat.type.admin"),
    TYPE_ADVANCEMENT_CHALLENGE("chat.type.advancement.challenge"),
    TYPE_ADVANCEMENT_GOAL("chat.type.advancement.goal"),
    TYPE_ADVANCEMENT_TASK("chat.type.advancement.task"),
    TYPE_ANNOUNCEMENT("chat.type.announcement"),
    TYPE_EMOTE("chat.type.emote"),
    TYPE_TEAM_HOVER("chat.type.team.hover"),
    TYPE_TEAM_SENT("chat.type.team.sent"),
    TYPE_TEAM_TEXT("chat.type.team.text"),
    TYPE_TEXT("chat.type.text"),
    TYPE_TEXT_NARRATE("chat.type.text.narrate");

    private final String key;

    Chat(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
