package com.appnext.ads.fullscreen;

import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.h */
public interface C3029h {
    void closeClicked();

    SettingsManager getConfigManager();

    String getCtaText();

    String getLanguage();

    ArrayList<AppnextAd> getPostRollAds();

    int getTemplate(String str);

    void installClicked(AppnextAd appnextAd);

    boolean isRewarded();

    void privacyClicked();

    void report(String str, String str2);
}
