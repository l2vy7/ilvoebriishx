package com.ironsource.mediationsdk.config;

import com.adcolony.sdk.AdColonyAppOptions;
import java.util.Arrays;

public class ConfigFile {

    /* renamed from: e */
    private static ConfigFile f51046e;

    /* renamed from: a */
    private String f51047a;

    /* renamed from: b */
    private String f51048b;

    /* renamed from: c */
    private String f51049c;

    /* renamed from: d */
    private String[] f51050d = {AdColonyAppOptions.UNITY, "AdobeAir", "Xamarin", AdColonyAppOptions.CORONA, AdColonyAppOptions.ADMOB, "MoPub"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (f51046e == null) {
                f51046e = new ConfigFile();
            }
            configFile = f51046e;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.f51049c;
    }

    public String getPluginType() {
        return this.f51047a;
    }

    public String getPluginVersion() {
        return this.f51048b;
    }

    public void setPluginData(String str, String str2, String str3) {
        if (str != null) {
            if (!Arrays.asList(this.f51050d).contains(str)) {
                str = null;
            }
            this.f51047a = str;
        }
        if (str2 != null) {
            this.f51048b = str2;
        }
        if (str3 != null) {
            this.f51049c = str3;
        }
    }
}
