package com.Taskmanagement.entity.item;

public abstract class ListItem {
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_TASK = 1;

    abstract public int getType();
}