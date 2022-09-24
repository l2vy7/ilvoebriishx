package com.appnext.ads.fullscreen;

import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.i */
public interface C3030i {
    void closeClicked();

    SettingsManager getConfigManager();

    ArrayList<AppnextAd> getPreRollAds();

    int getTemplate(String str);

    void privacyClicked();

    void report(String str, String str2);

    void videoSelected(AppnextAd appnextAd);
}
