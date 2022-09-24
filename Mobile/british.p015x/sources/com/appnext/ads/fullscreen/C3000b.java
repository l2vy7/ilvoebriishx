package com.appnext.ads.fullscreen;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3164a;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.C3201h;
import com.appnext.core.SettingsManager;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.appnext.ads.fullscreen.b */
public final class C3000b extends C3180d {

    /* renamed from: q */
    private static C3000b f11998q;

    /* renamed from: r */
    private final int f11999r = 30;

    /* renamed from: s */
    private HashMap<C3148Ad, String> f12000s = new HashMap<>();

    private C3000b() {
    }

    /* renamed from: d */
    private boolean m10378d(C3148Ad ad) {
        try {
            if (Video.isStreamingModeEnabled()) {
                return true;
            }
            if (!this.f12000s.containsKey(ad)) {
                return false;
            }
            return new File(this.f12000s.get(ad)).exists();
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$isVideoLoaded", th);
            return false;
        }
    }

    /* renamed from: f */
    public static synchronized C3000b m10379f() {
        C3000b bVar;
        synchronized (C3000b.class) {
            if (f11998q == null) {
                f11998q = new C3000b();
            }
            bVar = f11998q;
        }
        return bVar;
    }

    protected static String getVideoUrl(AppnextAd appnextAd, String str) {
        String str2;
        if (str.equals("30")) {
            str2 = appnextAd.getVideoUrlHigh30Sec();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh();
            }
        } else {
            str2 = appnextAd.getVideoUrlHigh();
            if (str2.equals("")) {
                str2 = appnextAd.getVideoUrlHigh30Sec();
            }
        }
        appnextAd.getBannerID();
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10233a(Context context, C3148Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        Integer num;
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "700");
            sb.append("&vidmin=");
            sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
            sb.append("&vidmax=");
            if (ad == null) {
                num = "";
            } else {
                num = Integer.valueOf(ad.getMaxVideoLength());
            }
            sb.append(num);
            return sb.toString();
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$urlSuffix", th);
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo10239b(C3148Ad ad) {
        try {
            if (!mo10777h(ad) || mo10779j(ad).mo10737am().longValue() + 0 + DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS < System.currentTimeMillis() || !m10378d(ad)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$isReadyToShow", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SettingsManager mo10240c(C3148Ad ad) {
        return ad instanceof RewardedVideo ? C3012f.m10411o() : C3002c.m10393h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ArrayList<AppnextAd> mo10241e(C3148Ad ad) {
        return mo10779j(ad).getAds();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10229a(Context context, C3201h hVar) {
        int i;
        AppnextAd appnextAd = (AppnextAd) hVar;
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCampaignGoal().equals("new") || !C3198g.m10789b(context, fullscreenAd.getAdPackage())) {
            i = (!fullscreenAd.getCampaignGoal().equals("existing") || C3198g.m10789b(context, fullscreenAd.getAdPackage())) ? 0 : 2;
        } else {
            i = 1;
        }
        int a = m10375a(context, appnextAd);
        if (i == 0 && a == 0) {
            return 0;
        }
        return i != 0 ? i : a;
    }

    /* renamed from: b */
    protected static String m10377b(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$extractFileNameFromPath", th);
            return substring;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10238a(C3148Ad ad) {
        return super.mo10238a(ad) && m10378d(ad);
    }

    /* renamed from: a */
    private void m10376a(Context context, C3148Ad ad, AppnextAd appnextAd) throws Exception {
        String str;
        try {
            String videoUrl = getVideoUrl(appnextAd, ((Video) ad).getVideoLength());
            String b = m10377b(videoUrl);
            if (Video.getCacheVideo()) {
                str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
            } else {
                str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + ((Video) ad).rnd + "/";
            }
            File file = new File(str + b);
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                file.getPath();
                this.f12000s.put(ad, file.getAbsolutePath());
            } else if (!Video.isStreamingModeEnabled()) {
                new File(str).mkdirs();
                URL url = new URL(videoUrl);
                url.openConnection().connect();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
                FileOutputStream fileOutputStream = new FileOutputStream(str + b + ".tmp");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        File file2 = new File(str + b + ".tmp");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(b);
                        file2.renameTo(new File(sb.toString()));
                        file2.delete();
                        this.f12000s.put(ad, file.getAbsolutePath());
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$downloadAssets", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10235a(C3148Ad ad, String str, String str2) {
        if (ad != null) {
            C3198g.m10781a(getContext(), ad.getTID(), ad.getVID(), ad.getAUID(), str2, str, "caching_error", "sdk", "", "");
        } else {
            C3198g.m10781a(getContext(), "300", "2.6.5.473", "700", str2, str, "caching_error", "sdk", "", "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo10237a(String str, C3148Ad ad, T t) {
        C3198g.m10781a(getContext(), ad.getTID(), ad.getVID(), ad.getAUID(), str, ((Video) ad).getSessionId(), "cache_ready", "sdk", "", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10236a(String str, C3148Ad ad) {
        super.mo10236a(str, ad);
        if (this.f12000s.containsKey(ad)) {
            this.f12000s.remove(ad);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10230a(Context context, C3148Ad ad) {
        return mo10231a(context, ad, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo10231a(Context context, C3148Ad ad, String str) {
        ArrayList<?> ads;
        if (mo10779j(ad) == null || (ads = mo10779j(ad).getAds()) == null) {
            return null;
        }
        return mo10232a(context, ad, (ArrayList<AppnextAd>) ads, str);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appnext.core.AppnextAd mo10232a(android.content.Context r3, com.appnext.core.C3148Ad r4, java.util.ArrayList<com.appnext.core.AppnextAd> r5, java.lang.String r6) {
        /*
            r2 = this;
            java.lang.String r3 = ""
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x003d }
        L_0x0006:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x003d }
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.getVideoUrlHigh()     // Catch:{ all -> 0x003d }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = r0.getVideoUrlHigh30Sec()     // Catch:{ all -> 0x003d }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0006
            r0.getBannerID()     // Catch:{ all -> 0x003d }
            r4.getPlacementID()     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.getBannerID()     // Catch:{ all -> 0x003d }
            boolean r1 = r1.equals(r6)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x003d:
            r3 = move-exception
            java.lang.String r4 = "FullscreenAdsManager$getFirst"
            com.appnext.base.C3117a.m10553a(r4, r3)
        L_0x0043:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.C3000b.mo10232a(android.content.Context, com.appnext.core.Ad, java.util.ArrayList, java.lang.String):com.appnext.core.AppnextAd");
    }

    /* renamed from: a */
    private static int m10375a(Context context, AppnextAd appnextAd) {
        FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
        if (!fullscreenAd.getCptList().equals("") && !fullscreenAd.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(fullscreenAd.getCptList());
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (C3198g.m10789b(context, jSONArray.getString(i))) {
                        return 0;
                    }
                }
                return 3;
            } catch (Throwable th) {
                C3117a.m10553a("FullscreenAdsManager$checkCPT", th);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10234a(Context context, C3148Ad ad, C3164a aVar) throws Exception {
        AppnextAd a;
        int i;
        int i2;
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    Arrays.sort(listFiles, new Comparator<File>() {
                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                            return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                        }
                    });
                    if (Video.getCacheVideo()) {
                        if (ad instanceof FullScreenVideo) {
                            i2 = Integer.parseInt(C3002c.m10393h().mo10732y("num_saved_videos"));
                        } else {
                            i2 = Integer.parseInt(C3012f.m10411o().mo10732y("num_saved_videos"));
                        }
                        i = i2 - 1;
                    } else {
                        i = 0;
                    }
                    if (listFiles.length > i) {
                        for (int i3 = 0; i3 < listFiles.length - i; i3++) {
                            listFiles[i3].delete();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        AppnextAd appnextAd = null;
        try {
            AppnextAd a2 = mo10230a(context, ad);
            if (a2 != null) {
                m10376a(context, ad, a2);
                if (ad instanceof RewardedVideo) {
                    String mode = ((RewardedVideo) ad).getMode();
                    if (mode.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                        mode = C3012f.m10411o().mo10732y("default_mode");
                    }
                    if (mode.equals(RewardedVideo.VIDEO_MODE_MULTI) && (a = mo10231a(context, ad, a2.getBannerID())) != null) {
                        m10376a(context, ad, a);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new Exception("No video ads");
        } catch (Throwable th) {
            C3117a.m10553a("FullscreenAdsManager$customAdLoad", th);
            if (appnextAd != null) {
                mo10236a(appnextAd.getBannerID(), ad);
            }
        }
    }
}
