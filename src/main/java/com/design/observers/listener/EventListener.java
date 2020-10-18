package com.design.observers.listener;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
