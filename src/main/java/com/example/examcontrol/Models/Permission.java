package com.example.examcontrol.Models;

//Разрешение к доступу
public enum Permission {
    READ("read"),
    All("all");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
