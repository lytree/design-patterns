package com.design.builder.components;

import lombok.AllArgsConstructor;
import lombok.Data;

//GPS定位
@Data
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

}
