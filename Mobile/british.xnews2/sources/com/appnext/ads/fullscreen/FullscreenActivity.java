package com.appnext.ads.fullscreen;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import com.appnext.C2980R;
import com.appnext.ads.C2986a;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3187f;
import com.appnext.core.C3198g;
import com.appnext.core.C3211o;
import com.appnext.core.SettingsManager;
import com.appnext.core.adswatched.C3169a;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.p033a.C3167a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class FullscreenActivity extends AppnextActivity implements C3029h, C3030i, C3031j, C3187f.C3196a {
    private ArrayList<AppnextAd> ads;
    private boolean finished = false;

    /* renamed from: g */
    private SettingsManager f11968g;

    /* renamed from: h */
    private boolean f11969h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AppnextAd f11970i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AppnextAd f11971j;

    /* renamed from: k */
    private HashMap<String, Integer> f11972k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Video f11973l;

    /* renamed from: m */
    private int f11974m = 0;
    private Handler mHandler;

    /* renamed from: n */
    Runnable f11975n = new Runnable() {
        public final void run() {
            if (FullscreenActivity.this.userAction != null) {
                FullscreenActivity.this.userAction.mo10827d(FullscreenActivity.this.f11970i);
            }
            FullscreenActivity.this.report("impression_event", "S2");
        }
    };

    /* renamed from: o */
    Runnable f11976o = new Runnable() {
        public final void run() {
            FullscreenActivity fullscreenActivity = FullscreenActivity.this;
            fullscreenActivity.mo10107a(fullscreenActivity.f11970i, (C3187f.C3196a) null);
            FullscreenActivity.this.report("vta_event", "S2");
        }
    };
    private int type;

    public void closeClicked() {
        try {
            if (this.f11974m != 1 || isRewarded() || Integer.parseInt(getConfig().mo10732y("clickType_a")) <= new Random(System.nanoTime()).nextInt(100)) {
                m10352a();
                finish();
                return;
            }
            installClicked(getSelectedAd());
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$closeClicked", th);
        }
    }

    public long closeDelay() {
        try {
            if (m10356b() instanceof FullScreenVideo) {
                return ((FullScreenVideo) m10356b()).getCloseDelay();
            }
            return 0;
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$closeDelay", th);
            return 0;
        }
    }

    public void error(String str) {
        mo10635ar();
        report("error_resolve_timeout");
    }

    public int getCaptionTextTime() {
        try {
            return m10356b().getRollCaptionTime();
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$getCaptionTextTime", th);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final SettingsManager getConfig() {
        if (this.f11968g == null) {
            if (this.type == 1) {
                this.f11968g = C3002c.m10393h();
            } else {
                this.f11968g = C3012f.m10411o();
            }
        }
        return this.f11968g;
    }

    public SettingsManager getConfigManager() {
        return getConfig();
    }

    public String getCtaText() {
        try {
            String buttonText = new FullscreenAd(this.f11970i).getButtonText();
            String str = "existing";
            if (this.f11970i != null) {
                if (buttonText.equals("")) {
                    if (isInstalled()) {
                        return C3167a.m10684q(this).mo10749a(this.f11973l.getLanguage(), str, "Open");
                    }
                    return C3167a.m10684q(this).mo10749a(this.f11973l.getLanguage(), "new", "Install");
                }
            }
            C3167a q = C3167a.m10684q(this);
            String language = this.f11973l.getLanguage();
            if (!isInstalled()) {
                str = "new";
            }
            return q.mo10749a(language, str, buttonText);
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$getCtaText", th);
            return "";
        }
    }

    public String getLanguage() {
        return this.f11973l.getLanguage();
    }

    public boolean getMute() {
        return m10356b().getMute();
    }

    public ArrayList<AppnextAd> getPostRollAds() {
        return this.ads;
    }

    public ArrayList<AppnextAd> getPreRollAds() {
        if (this.ads == null) {
            this.ads = C3000b.m10379f().mo10241e(m10356b());
        }
        ArrayList<AppnextAd> arrayList = new ArrayList<>();
        AppnextAd a = mo10106a(this.ads, this.placementID, "");
        arrayList.add(a);
        AppnextAd a2 = mo10106a(this.ads, this.placementID, a.getBannerID());
        if (a2 != null && !a2.getBannerID().equals(arrayList.get(0).getBannerID())) {
            arrayList.add(a2);
        }
        return arrayList;
    }

    public AppnextAd getSelectedAd() {
        return this.f11970i;
    }

    public Uri getSelectedVideoUri() {
        String str;
        String videoUrl = C3000b.getVideoUrl(this.f11970i, m10356b().getVideoLength());
        String b = C3000b.m10377b(videoUrl);
        if (Video.getCacheVideo()) {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
        } else {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + m10356b().rnd + "/";
        }
        File file = new File(str + b);
        if (file.exists()) {
            Uri parse = Uri.parse(str + b);
            parse.getPath();
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        file.getAbsolutePath();
        return parse2;
    }

    public int getTemplate(String str) {
        if (this.f11972k == null) {
            this.f11972k = new HashMap<>();
        }
        if (!this.f11972k.containsKey(str)) {
            String a = C2986a.m10350a(getConfig().mo10732y(str));
            Resources resources = getResources();
            int identifier = resources.getIdentifier("apnxt_" + a, TtmlNode.TAG_LAYOUT, getPackageName());
            if (identifier == 0) {
                Resources resources2 = getResources();
                identifier = resources2.getIdentifier("apnxt_" + str.toLowerCase() + "t1", TtmlNode.TAG_LAYOUT, getPackageName());
            }
            this.f11972k.put(str, Integer.valueOf(identifier));
        }
        return this.f11972k.get(str).intValue();
    }

    public void installClicked(AppnextAd appnextAd) {
        if (this.f11974m == 1 && !isRewarded()) {
            mo10634a((ViewGroup) this.f12243dc, getResources().getDrawable(C2980R.C2981drawable.apnxt_loader));
        }
        mo10108b(appnextAd, this);
    }

    public boolean isInstalled() {
        try {
            return C3198g.m10789b((Context) this, this.f11970i.getAdPackage());
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isRewarded() {
        return m10356b() instanceof RewardedVideo;
    }

    public void onBackPressed() {
        if (m10356b().isBackButtonCanClose()) {
            m10352a();
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:67|(1:69)|70|(1:72)|73|(3:78|(1:80)|81)(1:77)|82|83|84|85|86|87) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01e9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "multi"
            if (r9 == 0) goto L_0x0016
            java.lang.String r1 = "templates"
            java.io.Serializable r1 = r9.getSerializable(r1)     // Catch:{ all -> 0x020c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x020c }
            r8.f11972k = r1     // Catch:{ all -> 0x020c }
            java.lang.String r1 = "state"
            int r1 = r9.getInt(r1)     // Catch:{ all -> 0x020c }
            r8.f11974m = r1     // Catch:{ all -> 0x020c }
        L_0x0016:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x020c }
            r2 = 17
            if (r1 < r2) goto L_0x003d
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x020c }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x020c }
            java.util.Locale r2 = new java.util.Locale     // Catch:{ all -> 0x020c }
            java.lang.String r3 = "en"
            r2.<init>(r3)     // Catch:{ all -> 0x020c }
            r1.setLayoutDirection(r2)     // Catch:{ all -> 0x020c }
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ all -> 0x020c }
            android.content.res.Resources r3 = r8.getResources()     // Catch:{ all -> 0x020c }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ all -> 0x020c }
            r2.updateConfiguration(r1, r3)     // Catch:{ all -> 0x020c }
        L_0x003d:
            super.onCreate(r9)     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r1 = com.appnext.ads.fullscreen.Video.currentAd     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "No Ads"
            if (r1 != 0) goto L_0x004d
            r8.onError(r2)     // Catch:{ all -> 0x020c }
            r8.finish()     // Catch:{ all -> 0x020c }
            return
        L_0x004d:
            boolean r1 = r1 instanceof com.appnext.ads.fullscreen.RewardedVideo     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x005d
            com.appnext.ads.fullscreen.RewardedVideo r1 = new com.appnext.ads.fullscreen.RewardedVideo     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r3 = com.appnext.ads.fullscreen.Video.currentAd     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.RewardedVideo r3 = (com.appnext.ads.fullscreen.RewardedVideo) r3     // Catch:{ all -> 0x020c }
            r1.<init>((android.content.Context) r8, (com.appnext.ads.fullscreen.RewardedVideo) r3)     // Catch:{ all -> 0x020c }
            r8.f11973l = r1     // Catch:{ all -> 0x020c }
            goto L_0x0068
        L_0x005d:
            com.appnext.ads.fullscreen.FullScreenVideo r1 = new com.appnext.ads.fullscreen.FullScreenVideo     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r3 = com.appnext.ads.fullscreen.Video.currentAd     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.FullScreenVideo r3 = (com.appnext.ads.fullscreen.FullScreenVideo) r3     // Catch:{ all -> 0x020c }
            r1.<init>((android.content.Context) r8, (com.appnext.ads.fullscreen.FullScreenVideo) r3)     // Catch:{ all -> 0x020c }
            r8.f11973l = r1     // Catch:{ all -> 0x020c }
        L_0x0068:
            com.appnext.ads.fullscreen.Video r1 = r8.m10356b()     // Catch:{ all -> 0x020c }
            java.lang.String r1 = r1.getOrientation()     // Catch:{ all -> 0x020c }
            r3 = -1
            int r4 = r1.hashCode()     // Catch:{ all -> 0x020c }
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r4) {
                case 729267099: goto L_0x009a;
                case 1430647483: goto L_0x0090;
                case 1673671211: goto L_0x0086;
                case 2129065206: goto L_0x007c;
                default: goto L_0x007b;
            }     // Catch:{ all -> 0x020c }
        L_0x007b:
            goto L_0x00a3
        L_0x007c:
            java.lang.String r4 = "not_set"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x00a3
            r3 = 0
            goto L_0x00a3
        L_0x0086:
            java.lang.String r4 = "automatic"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x00a3
            r3 = 1
            goto L_0x00a3
        L_0x0090:
            java.lang.String r4 = "landscape"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x00a3
            r3 = 2
            goto L_0x00a3
        L_0x009a:
            java.lang.String r4 = "portrait"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x00a3
            r3 = 3
        L_0x00a3:
            r1 = 7
            r4 = 6
            if (r3 == 0) goto L_0x00b6
            if (r3 == r7) goto L_0x00b6
            if (r3 == r6) goto L_0x00b2
            if (r3 == r5) goto L_0x00ae
            goto L_0x00c9
        L_0x00ae:
            r8.setRequestedOrientation(r1)     // Catch:{ all -> 0x020c }
            goto L_0x00c9
        L_0x00b2:
            r8.setRequestedOrientation(r4)     // Catch:{ all -> 0x020c }
            goto L_0x00c9
        L_0x00b6:
            android.content.res.Resources r3 = r8.getResources()     // Catch:{ all -> 0x020c }
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ all -> 0x020c }
            int r3 = r3.orientation     // Catch:{ all -> 0x020c }
            if (r3 != r6) goto L_0x00c6
            r8.setRequestedOrientation(r4)     // Catch:{ all -> 0x020c }
            goto L_0x00c9
        L_0x00c6:
            r8.setRequestedOrientation(r1)     // Catch:{ all -> 0x020c }
        L_0x00c9:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            r8.mHandler = r1     // Catch:{ all -> 0x020c }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ all -> 0x020c }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x020c }
            java.lang.String r3 = "id"
            java.lang.String r1 = r1.getString(r3)     // Catch:{ all -> 0x020c }
            r8.placementID = r1     // Catch:{ all -> 0x020c }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ all -> 0x020c }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x020c }
            java.lang.String r3 = "type"
            int r1 = r1.getInt(r3)     // Catch:{ all -> 0x020c }
            r8.type = r1     // Catch:{ all -> 0x020c }
            if (r1 != r7) goto L_0x00f9
            com.appnext.ads.fullscreen.c r1 = com.appnext.ads.fullscreen.C3002c.m10393h()     // Catch:{ all -> 0x020c }
            r8.f11968g = r1     // Catch:{ all -> 0x020c }
            goto L_0x00ff
        L_0x00f9:
            com.appnext.ads.fullscreen.f r1 = com.appnext.ads.fullscreen.C3012f.m10411o()     // Catch:{ all -> 0x020c }
            r8.f11968g = r1     // Catch:{ all -> 0x020c }
        L_0x00ff:
            com.appnext.core.SettingsManager r1 = r8.f11968g     // Catch:{ all -> 0x020c }
            java.lang.String r3 = "can_close"
            java.lang.String r1 = r1.mo10732y(r3)     // Catch:{ all -> 0x020c }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x020c }
            r8.f11969h = r1     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r1 = r8.m10356b()     // Catch:{ all -> 0x020c }
            boolean r1 = r1 instanceof com.appnext.ads.fullscreen.FullScreenVideo     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x0121
            com.appnext.ads.fullscreen.Video r1 = r8.m10356b()     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.FullScreenVideo r1 = (com.appnext.ads.fullscreen.FullScreenVideo) r1     // Catch:{ all -> 0x020c }
            boolean r1 = r1.isBackButtonCanClose()     // Catch:{ all -> 0x020c }
            r8.f11969h = r1     // Catch:{ all -> 0x020c }
        L_0x0121:
            java.lang.String r1 = ""
            if (r9 != 0) goto L_0x0145
            com.appnext.ads.fullscreen.b r3 = com.appnext.ads.fullscreen.C3000b.m10379f()     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r4 = r8.m10356b()     // Catch:{ all -> 0x020c }
            java.util.ArrayList r3 = r3.mo10241e(r4)     // Catch:{ all -> 0x020c }
            r8.ads = r3     // Catch:{ all -> 0x020c }
            if (r3 != 0) goto L_0x013c
            r8.onError(r2)     // Catch:{ all -> 0x020c }
            r8.finish()     // Catch:{ all -> 0x020c }
            return
        L_0x013c:
            java.lang.String r4 = r8.placementID     // Catch:{ all -> 0x020c }
            com.appnext.core.AppnextAd r3 = r8.mo10106a(r3, r4, r1)     // Catch:{ all -> 0x020c }
            r8.f11970i = r3     // Catch:{ all -> 0x020c }
            goto L_0x0159
        L_0x0145:
            java.lang.String r3 = "ads"
            java.io.Serializable r3 = r9.getSerializable(r3)     // Catch:{ all -> 0x020c }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x020c }
            r8.ads = r3     // Catch:{ all -> 0x020c }
            java.lang.String r3 = "currentAd"
            java.io.Serializable r3 = r9.getSerializable(r3)     // Catch:{ all -> 0x020c }
            com.appnext.core.AppnextAd r3 = (com.appnext.core.AppnextAd) r3     // Catch:{ all -> 0x020c }
            r8.f11970i = r3     // Catch:{ all -> 0x020c }
        L_0x0159:
            com.appnext.core.AppnextAd r3 = r8.f11970i     // Catch:{ all -> 0x020c }
            if (r3 != 0) goto L_0x0164
            r8.onError(r2)     // Catch:{ all -> 0x020c }
            r8.finish()     // Catch:{ all -> 0x020c }
            return
        L_0x0164:
            int r2 = com.appnext.C2980R.layout.apnxt_video_activity     // Catch:{ all -> 0x020c }
            r8.setContentView(r2)     // Catch:{ all -> 0x020c }
            if (r9 != 0) goto L_0x01ed
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x020c }
            r9.<init>()     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.Video r2 = r8.m10356b()     // Catch:{ all -> 0x020c }
            boolean r2 = r2 instanceof com.appnext.ads.fullscreen.RewardedVideo     // Catch:{ all -> 0x020c }
            if (r2 == 0) goto L_0x0182
            com.appnext.ads.fullscreen.Video r1 = r8.m10356b()     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.RewardedVideo r1 = (com.appnext.ads.fullscreen.RewardedVideo) r1     // Catch:{ all -> 0x020c }
            java.lang.String r1 = r1.getMode()     // Catch:{ all -> 0x020c }
        L_0x0182:
            java.lang.String r2 = "default"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x020c }
            if (r2 == 0) goto L_0x0194
            com.appnext.core.SettingsManager r1 = r8.getConfig()     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "default_mode"
            java.lang.String r1 = r1.mo10732y(r2)     // Catch:{ all -> 0x020c }
        L_0x0194:
            int r2 = r8.type     // Catch:{ all -> 0x020c }
            if (r2 != r6) goto L_0x01b6
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x020c }
            if (r1 == 0) goto L_0x01b6
            com.appnext.ads.fullscreen.e r1 = new com.appnext.ads.fullscreen.e     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "time"
            com.appnext.ads.fullscreen.Video r3 = r8.m10356b()     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.RewardedVideo r3 = (com.appnext.ads.fullscreen.RewardedVideo) r3     // Catch:{ all -> 0x020c }
            int r3 = r3.getMultiTimerLength()     // Catch:{ all -> 0x020c }
            r9.putInt(r2, r3)     // Catch:{ all -> 0x020c }
            r8.report(r0)     // Catch:{ all -> 0x020c }
            goto L_0x01d3
        L_0x01b6:
            int r0 = r8.type     // Catch:{ all -> 0x020c }
            if (r0 != r6) goto L_0x01bf
            java.lang.String r0 = "normal"
            r8.report(r0)     // Catch:{ all -> 0x020c }
        L_0x01bf:
            com.appnext.ads.fullscreen.g r1 = new com.appnext.ads.fullscreen.g     // Catch:{ all -> 0x020c }
            r1.<init>()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "showCta"
            com.appnext.ads.fullscreen.Video r2 = r8.m10356b()     // Catch:{ all -> 0x020c }
            boolean r2 = r2.isShowCta()     // Catch:{ all -> 0x020c }
            r9.putBoolean(r0, r2)     // Catch:{ all -> 0x020c }
            r8.f11974m = r7     // Catch:{ all -> 0x020c }
        L_0x01d3:
            r1.setArguments(r9)     // Catch:{ all -> 0x020c }
            android.app.FragmentManager r9 = r8.getFragmentManager()     // Catch:{ all -> 0x020c }
            android.app.FragmentTransaction r9 = r9.beginTransaction()     // Catch:{ all -> 0x020c }
            int r0 = com.appnext.C2980R.C2982id.f11954ll     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "fragment"
            r9.add(r0, r1, r2)     // Catch:{ all -> 0x020c }
            r9.commit()     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01f5
        L_0x01e9:
            r8.finish()     // Catch:{ all -> 0x020c }
            return
        L_0x01ed:
            java.lang.String r0 = "finished"
            boolean r9 = r9.getBoolean(r0, r7)     // Catch:{ all -> 0x020c }
            r8.finished = r9     // Catch:{ all -> 0x020c }
        L_0x01f5:
            int r9 = com.appnext.C2980R.C2982id.f11954ll     // Catch:{ all -> 0x020c }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ all -> 0x020c }
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9     // Catch:{ all -> 0x020c }
            r8.f12243dc = r9     // Catch:{ all -> 0x020c }
            com.appnext.core.q r9 = new com.appnext.core.q     // Catch:{ all -> 0x020c }
            com.appnext.ads.fullscreen.FullscreenActivity$1 r0 = new com.appnext.ads.fullscreen.FullscreenActivity$1     // Catch:{ all -> 0x020c }
            r0.<init>()     // Catch:{ all -> 0x020c }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x020c }
            r8.userAction = r9     // Catch:{ all -> 0x020c }
            return
        L_0x020c:
            r9 = move-exception
            java.lang.String r0 = "FullscreenActivity$onCreate"
            com.appnext.base.C3117a.m10553a(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.FullscreenActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C3198g.m10783a(new File(getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + m10356b().rnd + "/"));
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$onDestroy", th);
        }
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            this.mHandler = null;
            this.f11971j = null;
            this.f11970i = null;
        } catch (Throwable th2) {
            C3117a.m10553a("FullscreenActivity$onDestroy", th2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onError(String str) {
        OnAdError onAdErrorCallback;
        try {
            if (m10356b() != null && (onAdErrorCallback = m10356b().getOnAdErrorCallback()) != null) {
                onAdErrorCallback.adError(str);
            }
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$onError", th);
        }
    }

    public void onMarket(String str) {
        mo10635ar();
        this.finished = true;
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f11970i);
        this.ads.add(0, this.f11970i);
        C3003d dVar = new C3003d();
        this.f11974m = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C2980R.C2982id.f11954ll, dVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$onMarket", th);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacks(this.f11975n);
        this.mHandler.removeCallbacks(this.f11976o);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.finished = bundle.getBoolean("finished", true);
        this.type = bundle.getInt(SessionDescription.ATTR_TYPE);
        this.f11972k = (HashMap) bundle.getSerializable("templates");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                systemUiVisibility |= 4;
            }
            if (i >= 18) {
                systemUiVisibility |= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("finished", this.finished);
        bundle.putInt(SessionDescription.ATTR_TYPE, this.type);
        bundle.putSerializable("templates", this.f11972k);
        bundle.putSerializable("ads", this.ads);
        bundle.putInt("state", this.f11974m);
        bundle.putSerializable("currentAd", this.f11970i);
        super.onSaveInstanceState(bundle);
    }

    public void privacyClicked() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C3198g.m10793e(this.f11970i)));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$privacyClicked", th);
        }
    }

    public void report(String str, String str2) {
        m10354a(str, getResources().getResourceEntryName(getTemplate(str2)));
    }

    public boolean showClose() {
        return (m10356b() instanceof FullScreenVideo) && ((FullScreenVideo) m10356b()).isShowClose();
    }

    public void videoEnded() {
        this.f11974m = 2;
        this.finished = true;
        if (!(m10356b() == null || m10356b().getOnVideoEndedCallback() == null)) {
            m10356b().getOnVideoEndedCallback().videoEnded();
        }
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                RewardedServerSidePostback rewardedServerSidePostback;
                if ((FullscreenActivity.this.m10356b() instanceof RewardedVideo) && (rewardedServerSidePostback = ((RewardedVideo) FullscreenActivity.this.m10356b()).getRewardedServerSidePostback()) != null) {
                    HashMap<String, String> n = rewardedServerSidePostback.mo10170n();
                    n.put("placementId", FullscreenActivity.this.placementID);
                    try {
                        C3198g.m10776a(FullscreenActivity.this, "https://admin.appnext.com/adminService.asmx/SetRewards", n);
                    } catch (IOException unused) {
                    }
                }
            }
        });
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f11970i);
        this.ads.add(0, this.f11970i);
        C3003d dVar = new C3003d();
        this.f11974m = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C2980R.C2982id.f11954ll, dVar, "fragment");
        try {
            beginTransaction.commit();
            AppnextAd appnextAd = this.f11971j;
            if (appnextAd != null) {
                super.mo10108b(appnextAd, this);
                report("roll_store_opened");
                return;
            }
            report("roll_click_cta_none");
            if (Integer.parseInt(getConfig().mo10732y("clickType_b")) > new Random(System.nanoTime()).nextInt(100)) {
                installClicked(getSelectedAd());
            }
        } catch (Exception unused) {
            finish();
        }
    }

    public void videoSelected(AppnextAd appnextAd) {
        this.f11970i = appnextAd;
        C3013g gVar = new C3013g();
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showCta", m10356b().isShowCta());
        gVar.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(C2980R.C2982id.f11954ll, gVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$videoSelected", th);
            finish();
        }
    }

    public void videoStarted() {
        OnAdOpened onAdOpenedCallback;
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                try {
                    if (FullscreenActivity.this.f11970i != null && FullscreenActivity.this.f11973l != null) {
                        C3169a.m10687o(FullscreenActivity.this).mo10753k(FullscreenActivity.this.f11970i.getBannerID(), FullscreenActivity.this.f11973l.getAUID());
                    }
                } catch (Throwable unused) {
                }
            }
        });
        this.mHandler.postDelayed(this.f11975n, Long.parseLong(this.f11968g.mo10732y("postpone_impression_sec")) * 1000);
        if (Boolean.parseBoolean(this.f11968g.mo10732y("pview"))) {
            this.mHandler.postDelayed(this.f11976o, Long.parseLong(this.f11968g.mo10732y("postpone_vta_sec")) * 1000);
        }
        if (m10356b() != null && (onAdOpenedCallback = m10356b().getOnAdOpenedCallback()) != null) {
            onAdOpenedCallback.adOpened();
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            Resources resources = getResources();
            m10354a(str, resources.getResourceEntryName(getTemplate("S" + (this.f11974m + 1))));
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$report", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10108b(AppnextAd appnextAd, C3187f.C3196a aVar) {
        OnAdClicked onAdClickedCallback;
        if (appnextAd != null) {
            this.f11971j = appnextAd;
            Video b = m10356b();
            if (!(b == null || (onAdClickedCallback = b.getOnAdClickedCallback()) == null)) {
                onAdClickedCallback.adClicked();
            }
            if (this.finished || !(m10356b() instanceof RewardedVideo)) {
                super.mo10108b(appnextAd, aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10107a(AppnextAd appnextAd, C3187f.C3196a aVar) {
        super.mo10107a(appnextAd, (C3187f.C3196a) new C3187f.C3196a() {
            public final void error(String str) {
            }

            public final void onMarket(String str) {
            }
        });
    }

    /* renamed from: a */
    private void m10352a() {
        OnAdClosed onAdClosedCallback;
        try {
            C3000b.m10379f().mo10236a(this.f11970i.getBannerID(), (C3148Ad) m10356b());
            if (!(m10356b() == null || (onAdClosedCallback = m10356b().getOnAdClosedCallback()) == null)) {
                onAdClosedCallback.onAdClosed();
            }
            Video.currentAd = null;
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$onClose", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Video m10356b() {
        Video video = Video.currentAd;
        if (video != null) {
            return video;
        }
        return this.f11973l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10106a(ArrayList<AppnextAd> arrayList, String str, String str2) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (m10355a(next)) {
                    next.getBannerID();
                    if (!next.getBannerID().equals(str2)) {
                        return next;
                    }
                }
            }
            Iterator<AppnextAd> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AppnextAd next2 = it2.next();
                if (m10355a(next2)) {
                    next2.getBannerID();
                    return next2;
                }
            }
            return null;
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$getFirst", th);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m10355a(AppnextAd appnextAd) {
        try {
            return !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$hasHiResVideo", th);
            return false;
        }
    }

    /* renamed from: a */
    private void m10354a(String str, String str2) {
        try {
            String tid = m10356b().getTID();
            String vid = m10356b().getVID();
            String auid = m10356b().getAUID();
            String str3 = this.placementID;
            String sessionId = m10356b().getSessionId();
            AppnextAd appnextAd = this.f11970i;
            String bannerID = appnextAd != null ? appnextAd.getBannerID() : "";
            AppnextAd appnextAd2 = this.f11970i;
            C3198g.m10781a(this, tid, vid, auid, str3, sessionId, str, str2, bannerID, appnextAd2 != null ? appnextAd2.getCampaignID() : "");
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenActivity$sendReport", th);
        }
    }
}
