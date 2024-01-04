package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Disonnect implements Key {
    CLOSED("disconnect.closed"),
    DISCONNECTED("disconnect.disconnected"),
    ENDOFSTREAM("disconnect.endOfStream"),
    EXCEEDED_PACKET_RATE("disconnect.exceeded_packet_rate"),
    GENERICREASON("disconnect.genericReason"),
    IGNORING_STATUS_REQUEST("disconnect.ignoring_status_request"),
    KICKED("disconnect.kicked"),
    LOGINFAILED("disconnect.loginFailed"),
    LOGINFAILEDINFO("disconnect.loginFailedInfo"),
    LOGINFAILEDINFO_INSUFFICIENTPRIVILEGES("disconnect.loginFailedInfo.insufficientPrivileges"),
    LOGINFAILEDINFO_INVALIDSESSION("disconnect.loginFailedInfo.invalidSession"),
    LOGINFAILEDINFO_SERVERSUNAVAILABLE("disconnect.loginFailedInfo.serversUnavailable"),
    LOGINFAILEDINFO_USERBANNED("disconnect.loginFailedInfo.userBanned"),
    LOST("disconnect.lost"),
    OVERFLOW("disconnect.overflow"),
    QUITTING("disconnect.quitting"),
    SPAM("disconnect.spam"),
    TIMEOUT("disconnect.timeout"),
    UNKNOWNHOST("disconnect.unknownHost");

    private final String key;

    Disonnect(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
