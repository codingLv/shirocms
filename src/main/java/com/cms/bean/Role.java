package com.cms.bean;

public class Role {
    private Integer roleId;

    private String roleName;

    private String authority;
    
    

    @Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", authority=" + authority + "]";
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }
}