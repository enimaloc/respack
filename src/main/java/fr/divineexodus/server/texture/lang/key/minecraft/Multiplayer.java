package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Multiplayer implements Key {
    APPLYINGPACK("multiplayer.applyingPack"),
    DISCONNECT_AUTHSERVERS_DOWN("multiplayer.disconnect.authservers_down"),
    DISCONNECT_BANNED("multiplayer.disconnect.banned"),
    DISCONNECT_BANNED_IP_EXPIRATION("multiplayer.disconnect.banned_ip.expiration"),
    DISCONNECT_BANNED_IP_REASON("multiplayer.disconnect.banned_ip.reason"),
    DISCONNECT_BANNED_EXPIRATION("multiplayer.disconnect.banned.expiration"),
    DISCONNECT_BANNED_REASON("multiplayer.disconnect.banned.reason"),
    DISCONNECT_CHAT_VALIDATION_FAILED("multiplayer.disconnect.chat_validation_failed"),
    DISCONNECT_DUPLICATE_LOGIN("multiplayer.disconnect.duplicate_login"),
    DISCONNECT_EXPIRED_PUBLIC_KEY("multiplayer.disconnect.expired_public_key"),
    DISCONNECT_FLYING("multiplayer.disconnect.flying"),
    DISCONNECT_GENERIC("multiplayer.disconnect.generic"),
    DISCONNECT_IDLING("multiplayer.disconnect.idling"),
    DISCONNECT_ILLEGAL_CHARACTERS("multiplayer.disconnect.illegal_characters"),
    DISCONNECT_INCOMPATIBLE("multiplayer.disconnect.incompatible"),
    DISCONNECT_INVALID_ENTITY_ATTACKED("multiplayer.disconnect.invalid_entity_attacked"),
    DISCONNECT_INVALID_PACKET("multiplayer.disconnect.invalid_packet"),
    DISCONNECT_INVALID_PLAYER_DATA("multiplayer.disconnect.invalid_player_data"),
    DISCONNECT_INVALID_PLAYER_MOVEMENT("multiplayer.disconnect.invalid_player_movement"),
    DISCONNECT_INVALID_PUBLIC_KEY_SIGNATURE("multiplayer.disconnect.invalid_public_key_signature"),
    DISCONNECT_INVALID_PUBLIC_KEY_SIGNATURE_NEW("multiplayer.disconnect.invalid_public_key_signature.new"),
    DISCONNECT_INVALID_VEHICLE_MOVEMENT("multiplayer.disconnect.invalid_vehicle_movement"),
    DISCONNECT_IP_BANNED("multiplayer.disconnect.ip_banned"),
    DISCONNECT_KICKED("multiplayer.disconnect.kicked"),
    DISCONNECT_MISSING_TAGS("multiplayer.disconnect.missing_tags"),
    DISCONNECT_NAME_TAKEN("multiplayer.disconnect.name_taken"),
    DISCONNECT_NOT_WHITELISTED("multiplayer.disconnect.not_whitelisted"),
    DISCONNECT_OUT_OF_ORDER_CHAT("multiplayer.disconnect.out_of_order_chat"),
    DISCONNECT_OUTDATED_CLIENT("multiplayer.disconnect.outdated_client"),
    DISCONNECT_OUTDATED_SERVER("multiplayer.disconnect.outdated_server"),
    DISCONNECT_SERVER_FULL("multiplayer.disconnect.server_full"),
    DISCONNECT_SERVER_SHUTDOWN("multiplayer.disconnect.server_shutdown"),
    DISCONNECT_SLOW_LOGIN("multiplayer.disconnect.slow_login"),
    DISCONNECT_TOO_MANY_PENDING_CHATS("multiplayer.disconnect.too_many_pending_chats"),
    DISCONNECT_UNEXPECTED_QUERY_RESPONSE("multiplayer.disconnect.unexpected_query_response"),
    DISCONNECT_UNSIGNED_CHAT("multiplayer.disconnect.unsigned_chat"),
    DISCONNECT_UNVERIFIED_USERNAME("multiplayer.disconnect.unverified_username"),
    DOWNLOADINGSTATS("multiplayer.downloadingStats"),
    DOWNLOADINGTERRAIN("multiplayer.downloadingTerrain"),
    LAN_SERVER_FOUND("multiplayer.lan.server_found"),
    MESSAGE_NOT_DELIVERED("multiplayer.message_not_delivered"),
    PLAYER_JOINED("multiplayer.player.joined"),
    PLAYER_JOINED_RENAMED("multiplayer.player.joined.renamed"),
    PLAYER_LEFT("multiplayer.player.left"),
    PLAYER_LIST_NARRATION("multiplayer.player.list.narration"),
    REQUIREDTEXTUREPROMPT_DISCONNECT("multiplayer.requiredTexturePrompt.disconnect"),
    REQUIREDTEXTUREPROMPT_LINE1("multiplayer.requiredTexturePrompt.line1"),
    REQUIREDTEXTUREPROMPT_LINE2("multiplayer.requiredTexturePrompt.line2"),
    SOCIALINTERACTIONS_NOT_AVAILABLE("multiplayer.socialInteractions.not_available"),
    STATUS_AND_MORE("multiplayer.status.and_more"),
    STATUS_CANCELLED("multiplayer.status.cancelled"),
    STATUS_CANNOT_CONNECT("multiplayer.status.cannot_connect"),
    STATUS_CANNOT_RESOLVE("multiplayer.status.cannot_resolve"),
    STATUS_FINISHED("multiplayer.status.finished"),
    STATUS_INCOMPATIBLE("multiplayer.status.incompatible"),
    STATUS_MOTD_NARRATION("multiplayer.status.motd.narration"),
    STATUS_NO_CONNECTION("multiplayer.status.no_connection"),
    STATUS_OLD("multiplayer.status.old"),
    STATUS_ONLINE("multiplayer.status.online"),
    STATUS_PING("multiplayer.status.ping"),
    STATUS_PING_NARRATION("multiplayer.status.ping.narration"),
    STATUS_PINGING("multiplayer.status.pinging"),
    STATUS_PLAYER_COUNT_NARRATION("multiplayer.status.player_count.narration"),
    STATUS_QUITTING("multiplayer.status.quitting"),
    STATUS_REQUEST_HANDLED("multiplayer.status.request_handled"),
    STATUS_UNKNOWN("multiplayer.status.unknown"),
    STATUS_UNREQUESTED("multiplayer.status.unrequested"),
    STATUS_VERSION_NARRATION("multiplayer.status.version.narration"),
    STOPSLEEPING("multiplayer.stopSleeping"),
    TEXTUREPROMPT_FAILURE_LINE1("multiplayer.texturePrompt.failure.line1"),
    TEXTUREPROMPT_FAILURE_LINE2("multiplayer.texturePrompt.failure.line2"),
    TEXTUREPROMPT_LINE1("multiplayer.texturePrompt.line1"),
    TEXTUREPROMPT_LINE2("multiplayer.texturePrompt.line2"),
    TEXTUREPROMPT_SERVERPROMPT("multiplayer.texturePrompt.serverPrompt"),
    TITLE("multiplayer.title"),
    UNSECURESERVER_TOAST("multiplayer.unsecureserver.toast"),
    UNSECURESERVER_TOAST_TITLE("multiplayer.unsecureserver.toast.title");
    
    private final String key;
    
    Multiplayer(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
