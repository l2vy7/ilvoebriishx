package com.appnext.ads.fullscreen;

import android.net.Uri;
import com.appnext.core.AppnextAd;
import com.appnext.core.SettingsManager;

/* renamed from: com.appnext.ads.fullscreen.j */
public interface C3031j {
    void closeClicked();

    long closeDelay();

    int getCaptionTextTime();

    SettingsManager getConfigManager();

    String getCtaText();

    String getLanguage();

    boolean getMute();

    AppnextAd getSelectedAd();

    Uri getSelectedVideoUri();

    int getTemplate(String str);

    void installClicked(AppnextAd appnextAd);

    boolean isInstalled();

    void privacyClicked();

    void report(String str, String str2);

    boolean showClose();

    void videoEnded();

    void videoStarted();
}
