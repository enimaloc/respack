package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Narrration implements Key {
    BUTTON("narration.button"),
    BUTTON_USAGE_FOCUSED("narration.button.usage.focused"),
    BUTTON_USAGE_HOVERED("narration.button.usage.hovered"),
    CHECKBOX("narration.checkbox"),
    CHECKBOX_USAGE_FOCUSED("narration.checkbox.usage.focused"),
    CHECKBOX_USAGE_HOVERED("narration.checkbox.usage.hovered"),
    COMPONENT_LIST_USAGE("narration.component_list.usage"),
    CYCLE_BUTTON_USAGE_FOCUSED("narration.cycle_button.usage.focused"),
    CYCLE_BUTTON_USAGE_HOVERED("narration.cycle_button.usage.hovered"),
    EDIT_BOX("narration.edit_box"),
    RECIPE("narration.recipe"),
    RECIPE_USAGE("narration.recipe.usage"),
    RECIPE_USAGE_MORE("narration.recipe.usage.more"),
    SELECTION_USAGE("narration.selection.usage"),
    SLIDER_USAGE_FOCUSED("narration.slider.usage.focused"),
    SLIDER_USAGE_HOVERED("narration.slider.usage.hovered"),
    SUGGESTION("narration.suggestion"),
    SUGGESTION_TOOLTIP("narration.suggestion.tooltip"),
    TAB_NAVIGATION_USAGE("narration.tab_navigation.usage");
    
    private final String key;
    
    Narrration(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
