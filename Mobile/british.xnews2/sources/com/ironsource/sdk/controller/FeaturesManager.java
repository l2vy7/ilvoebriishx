package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FeaturesManager {

    /* renamed from: c */
    private static volatile FeaturesManager f51905c;

    /* renamed from: a */
    private Map<String, ?> f51906a;

    /* renamed from: b */
    private ArrayList<String> f51907b = new C11547a();

    /* renamed from: com.ironsource.sdk.controller.FeaturesManager$a */
    class C11547a extends ArrayList<String> {
        C11547a() {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
        }
    }

    private FeaturesManager() {
        if (f51905c == null) {
            this.f51906a = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f51905c == null) {
            synchronized (FeaturesManager.class) {
                if (f51905c == null) {
                    f51905c = new FeaturesManager();
                }
            }
        }
        return f51905c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList<String> mo44666a() {
        return new ArrayList<>(this.f51907b);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f51906a.containsKey("debugMode")) {
                num = (Integer) this.f51906a.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f51906a = map;
        }
    }
}
