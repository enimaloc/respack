package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Team implements Key {
    COLLISION_ALWAYS("team.collision.always"),
    COLLISION_NEVER("team.collision.never"),
    COLLISION_PUSHOTHERTEAMS("team.collision.pushOtherTeams"),
    COLLISION_PUSHOWNTEAM("team.collision.pushOwnTeam"),
    NOTFOUND("team.notFound"),
    VISIBILITY_ALWAYS("team.visibility.always"),
    VISIBILITY_HIDEFOROTHERTEAMS("team.visibility.hideForOtherTeams"),
    VISIBILITY_HIDEFOROWNTEAM("team.visibility.hideForOwnTeam"),
    VISIBILITY_NEVER("team.visibility.never");
    
    private final String key;
    
    Team(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
