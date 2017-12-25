package com.cms.bean;

public class User {
    private Integer id;

    private String user;

    private Integer password;

    private Integer roleId;
    
    private Role role;
    
    private String authority;
    

    public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", password=" + password + ", roleId=" + roleId + ", role=" + role
				+ ", authority=" + authority + "]";
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}