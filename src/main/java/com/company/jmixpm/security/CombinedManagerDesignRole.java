package com.company.jmixpm.security;

import io.jmix.datatoolsui.role.ShowEntityInfoRole;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "CombinedManagerDesignRole", code = CombinedManagerDesignRole.CODE)
public interface CombinedManagerDesignRole extends ProjectManagementRole, UiMinimalRole, ShowEntityInfoRole {
    String CODE = "combined-manager-design-role";

    @MenuPolicy(menuIds = "entityInspector.browse")
    @ScreenPolicy(screenIds = {"entityInspector.browse", "entityInspector.edit"})
    void screens();
}