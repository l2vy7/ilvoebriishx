package com.appnext.core;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.core.adswatched.C3169a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.core.d */
public abstract class C3180d {

    /* renamed from: aM */
    private Context f12298aM;

    /* renamed from: cH */
    protected final int f12299cH = 0;

    /* renamed from: cI */
    protected final int f12300cI = 1;

    /* renamed from: cJ */
    protected final int f12301cJ = 2;

    /* renamed from: cK */
    protected final int f12302cK = 3;
    /* access modifiers changed from: private */

    /* renamed from: cL */
    public final HashMap<C3175b, C3164a> f12303cL = new HashMap<>();

    /* renamed from: com.appnext.core.d$a */
    public interface C3185a {
        /* renamed from: a */
        <T> void mo10220a(T t);

        void error(String str);
    }

    /* renamed from: b */
    private void m10722b(Context context, C3148Ad ad, String str, C3185a aVar, boolean z) {
        try {
            final C3148Ad ad2 = ad;
            final Context context2 = context;
            final C3185a aVar2 = aVar;
            final String str2 = str;
            final boolean z2 = z;
            C3211o.m10825az().mo10821a(new Runnable() {
                /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                    java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                    	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                    	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                    	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
                    */
                /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0140 */
                public final void run() {
                    /*
                        r10 = this;
                        com.appnext.core.Ad r0 = r3     // Catch:{ all -> 0x000b }
                        android.content.Context r1 = r4     // Catch:{ all -> 0x000b }
                        java.lang.String r1 = com.appnext.core.C3198g.m10798i(r1)     // Catch:{ all -> 0x000b }
                        r0.setSessionId(r1)     // Catch:{ all -> 0x000b }
                    L_0x000b:
                        com.appnext.core.d r0 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        java.util.HashMap r0 = r0.f12303cL     // Catch:{ all -> 0x0199 }
                        monitor-enter(r0)     // Catch:{ all -> 0x0199 }
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0196 }
                        com.appnext.core.Ad r2 = r3     // Catch:{ all -> 0x0196 }
                        com.appnext.core.a r1 = r1.mo10779j(r2)     // Catch:{ all -> 0x0196 }
                        r2 = 1
                        if (r1 == 0) goto L_0x003e
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0196 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0196 }
                        com.appnext.core.a r1 = r1.mo10779j(r3)     // Catch:{ all -> 0x0196 }
                        int r1 = r1.mo10738an()     // Catch:{ all -> 0x0196 }
                        if (r1 != r2) goto L_0x003e
                        com.appnext.core.d$a r1 = r5     // Catch:{ all -> 0x0196 }
                        if (r1 == 0) goto L_0x003c
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0196 }
                        com.appnext.core.Ad r2 = r3     // Catch:{ all -> 0x0196 }
                        com.appnext.core.a r1 = r1.mo10779j(r2)     // Catch:{ all -> 0x0196 }
                        com.appnext.core.d$a r2 = r5     // Catch:{ all -> 0x0196 }
                        r1.mo10735a((com.appnext.core.C3180d.C3185a) r2)     // Catch:{ all -> 0x0196 }
                    L_0x003c:
                        monitor-exit(r0)     // Catch:{ all -> 0x0196 }
                        return
                    L_0x003e:
                        com.appnext.core.a r1 = new com.appnext.core.a     // Catch:{ all -> 0x0196 }
                        r1.<init>()     // Catch:{ all -> 0x0196 }
                        com.appnext.core.d$a r3 = r5     // Catch:{ all -> 0x0196 }
                        r1.mo10735a((com.appnext.core.C3180d.C3185a) r3)     // Catch:{ all -> 0x0196 }
                        java.lang.String r3 = r6     // Catch:{ all -> 0x0196 }
                        r1.setPlacementID(r3)     // Catch:{ all -> 0x0196 }
                        r1.mo10739b(r2)     // Catch:{ all -> 0x0196 }
                        com.appnext.core.d r2 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0196 }
                        java.util.HashMap r2 = r2.f12303cL     // Catch:{ all -> 0x0196 }
                        com.appnext.core.b r3 = new com.appnext.core.b     // Catch:{ all -> 0x0196 }
                        com.appnext.core.Ad r4 = r3     // Catch:{ all -> 0x0196 }
                        r3.<init>(r4)     // Catch:{ all -> 0x0196 }
                        r2.remove(r3)     // Catch:{ all -> 0x0196 }
                        com.appnext.core.d r2 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0196 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0196 }
                        r2.mo10771a((com.appnext.core.C3148Ad) r3, (com.appnext.core.C3164a) r1)     // Catch:{ all -> 0x0196 }
                        monitor-exit(r0)     // Catch:{ all -> 0x0196 }
                        java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0186 }
                        r0.<init>()     // Catch:{ all -> 0x0186 }
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0186 }
                        r1.<init>()     // Catch:{ all -> 0x0186 }
                        com.appnext.core.d r2 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0186 }
                        android.content.Context r3 = r4     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r4 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r5 = r6     // Catch:{ all -> 0x0186 }
                        java.lang.String r2 = com.appnext.core.C3180d.m10716a((com.appnext.core.C3180d) r2, (android.content.Context) r3, (com.appnext.core.C3148Ad) r4, (java.lang.String) r5, (java.util.ArrayList) r0)     // Catch:{ all -> 0x0186 }
                        r1.append(r2)     // Catch:{ all -> 0x0186 }
                        com.appnext.core.d r2 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0186 }
                        android.content.Context r3 = r4     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r4 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r5 = r6     // Catch:{ all -> 0x0186 }
                        java.lang.String r0 = r2.mo10233a((android.content.Context) r3, (com.appnext.core.C3148Ad) r4, (java.lang.String) r5, (java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>>) r0)     // Catch:{ all -> 0x0186 }
                        r1.append(r0)     // Catch:{ all -> 0x0186 }
                        java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0186 }
                        com.appnext.core.C3186e.m10748ap()     // Catch:{ all -> 0x0186 }
                        android.content.Context r2 = r4     // Catch:{ all -> 0x0186 }
                        java.lang.String r3 = r6     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r0 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r4 = r0.getAUID()     // Catch:{ all -> 0x0186 }
                        com.appnext.core.d r0 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r1 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r5 = "ads_caching_time_minutes"
                        long r5 = r0.m10713a((com.appnext.core.C3148Ad) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r0 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r8 = r0.getSpecificCategories()     // Catch:{ all -> 0x0186 }
                        com.appnext.core.Ad r0 = r3     // Catch:{ all -> 0x0186 }
                        java.lang.String r9 = r0.getCategories()     // Catch:{ all -> 0x0186 }
                        java.lang.String r0 = com.appnext.core.C3186e.m10747a(r2, r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x0186 }
                        boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0199 }
                        if (r1 != 0) goto L_0x017c
                        java.lang.String r1 = "{\"apps\":[]}"
                        boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0199 }
                        if (r1 != 0) goto L_0x017c
                        java.lang.String r1 = "{}"
                        boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0199 }
                        if (r1 != 0) goto L_0x017c
                        boolean r1 = com.appnext.core.C3180d.m10725q(r0)     // Catch:{ all -> 0x0199 }
                        if (r1 == 0) goto L_0x00d9
                        goto L_0x017c
                    L_0x00d9:
                        com.appnext.core.Ad r1 = r3     // Catch:{ all -> 0x0168 }
                        java.lang.String r1 = r1.getPostback()     // Catch:{ all -> 0x0168 }
                        boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0168 }
                        if (r1 != 0) goto L_0x00ff
                        java.lang.String r1 = "&q="
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0168 }
                        java.lang.String r3 = "&q="
                        r2.<init>(r3)     // Catch:{ all -> 0x0168 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0168 }
                        java.lang.String r3 = r3.getPostback()     // Catch:{ all -> 0x0168 }
                        r2.append(r3)     // Catch:{ all -> 0x0168 }
                        java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0168 }
                        java.lang.String r0 = r0.replaceAll(r1, r2)     // Catch:{ all -> 0x0168 }
                    L_0x00ff:
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0168 }
                        android.content.Context r2 = r4     // Catch:{ all -> 0x0168 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0168 }
                        r4 = 50
                        java.util.ArrayList r1 = r1.m10717a((android.content.Context) r2, (com.appnext.core.C3148Ad) r3, (java.lang.String) r0, 50)     // Catch:{ all -> 0x0168 }
                        com.appnext.core.d r2 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0168 }
                        android.content.Context r3 = r4     // Catch:{ all -> 0x0168 }
                        java.lang.String r4 = r6     // Catch:{ all -> 0x0168 }
                        com.appnext.core.Ad r5 = r3     // Catch:{ all -> 0x0168 }
                        java.lang.String r5 = r5.getAUID()     // Catch:{ all -> 0x0168 }
                        java.util.ArrayList r1 = com.appnext.core.C3180d.m10718a((android.content.Context) r3, (java.util.ArrayList<com.appnext.core.AppnextAd>) r1, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0168 }
                        if (r1 == 0) goto L_0x015e
                        boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0199 }
                        if (r2 == 0) goto L_0x0124
                        goto L_0x015e
                    L_0x0124:
                        com.appnext.core.d r0 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        com.appnext.core.Ad r2 = r3     // Catch:{ all -> 0x0199 }
                        com.appnext.core.a r0 = r0.mo10779j(r2)     // Catch:{ all -> 0x0199 }
                        r0.mo10740c(r1)     // Catch:{ all -> 0x0199 }
                        boolean r0 = r7     // Catch:{ all -> 0x0199 }
                        if (r0 == 0) goto L_0x0140
                        com.appnext.core.d r0 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0140 }
                        android.content.Context r1 = r4     // Catch:{ all -> 0x0140 }
                        com.appnext.core.Ad r2 = r3     // Catch:{ all -> 0x0140 }
                        com.appnext.core.a r3 = r0.mo10779j(r2)     // Catch:{ all -> 0x0140 }
                        r0.mo10234a((android.content.Context) r1, (com.appnext.core.C3148Ad) r2, (com.appnext.core.C3164a) r3)     // Catch:{ all -> 0x0140 }
                    L_0x0140:
                        com.appnext.core.d r0 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        com.appnext.core.Ad r1 = r3     // Catch:{ all -> 0x0199 }
                        com.appnext.core.a r0 = r0.mo10779j(r1)     // Catch:{ all -> 0x0199 }
                        r1 = 2
                        r0.mo10739b(r1)     // Catch:{ all -> 0x0199 }
                        android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0199 }
                        android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0199 }
                        r0.<init>(r1)     // Catch:{ all -> 0x0199 }
                        com.appnext.core.d$1$1 r1 = new com.appnext.core.d$1$1     // Catch:{ all -> 0x0199 }
                        r1.<init>()     // Catch:{ all -> 0x0199 }
                        r0.post(r1)     // Catch:{ all -> 0x0199 }
                        return
                    L_0x015e:
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        java.lang.String r2 = "No Ads"
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0199 }
                        r1.mo10772a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C3148Ad) r3)     // Catch:{ all -> 0x0199 }
                        return
                    L_0x0168:
                        r0 = move-exception
                        java.lang.String r1 = "AdsManager$updateAdList"
                        com.appnext.base.C3117a.m10553a(r1, r0)     // Catch:{ all -> 0x0199 }
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        java.lang.String r2 = "Internal error"
                        java.lang.String r0 = com.appnext.core.C3198g.m10779a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0199 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0199 }
                        r1.mo10772a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C3148Ad) r3)     // Catch:{ all -> 0x0199 }
                        return
                    L_0x017c:
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        java.lang.String r2 = "No Ads"
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0199 }
                        r1.mo10772a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C3148Ad) r3)     // Catch:{ all -> 0x0199 }
                        return
                    L_0x0186:
                        r0 = move-exception
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this     // Catch:{ all -> 0x0199 }
                        java.lang.String r2 = "No Ads"
                        java.lang.String r0 = com.appnext.core.C3198g.m10779a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0199 }
                        com.appnext.core.Ad r3 = r3     // Catch:{ all -> 0x0199 }
                        r4 = 0
                        r1.mo10773a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.core.C3148Ad) r3, (int) r4)     // Catch:{ all -> 0x0199 }
                        return
                    L_0x0196:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0199 }
                        throw r1     // Catch:{ all -> 0x0199 }
                    L_0x0199:
                        r0 = move-exception
                        java.lang.String r1 = "AdsManager$updateAdList"
                        com.appnext.base.C3117a.m10553a(r1, r0)
                        com.appnext.core.d r1 = com.appnext.core.C3180d.this
                        java.lang.String r0 = r0.getMessage()
                        com.appnext.core.Ad r2 = r3
                        r1.mo10775b(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3180d.C31811.run():void");
                }
            });
        } catch (Throwable unused) {
            mo10775b(AppnextError.INTERNAL_ERROR, ad);
        }
    }

    /* renamed from: c */
    public static String m10723c(AppnextAd appnextAd) {
        return appnextAd.getAdJSON();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: e */
    protected static int m10724e(Context context) {
        try {
            if (C3198g.m10792c(context, "android.permission.READ_CONTACTS") && C3198g.m10792c(context, "android.permission.GET_ACCOUNTS")) {
                return AccountManager.get(context).getAccountsByType("com.google").length > 0 ? 0 : 1;
            }
        } catch (Throwable unused) {
        }
        return 2;
    }

    public static C3201h parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) C3207k.m10814a((Class<?>) AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                appnextAd.setAdJSON(jSONObject.toString());
                if (jSONObject.has("sid")) {
                    appnextAd.setSession(jSONObject.getString("sid"));
                }
                if (TextUtils.isEmpty(appnextAd.getStoreRating())) {
                    appnextAd.setStoreRating(SessionDescription.SUPPORTED_SDP_VERSION);
                }
            }
            return appnextAd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    protected static boolean m10725q(String str) {
        try {
            return new JSONObject(str).has("rnd");
        } catch (Throwable unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10229a(Context context, C3201h hVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo10233a(Context context, C3148Ad ad, String str, ArrayList<Pair<String, String>> arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10234a(Context context, C3148Ad ad, C3164a aVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10235a(C3148Ad ad, String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> void mo10237a(String str, C3148Ad ad, T t);

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public final HashMap<C3175b, C3164a> mo10774ao() {
        return this.f12303cL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract SettingsManager mo10240c(C3148Ad ad);

    /* access modifiers changed from: protected */
    public final Context getContext() {
        return this.f12298aM;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo10777h(C3148Ad ad) {
        try {
            if (this.f12303cL == null || mo10779j(ad) == null || mo10779j(ad).mo10738an() != 2 || mo10779j(ad).getAds() == null) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo10778i(C3148Ad ad) {
        try {
            if (this.f12303cL == null || mo10779j(ad) == null || mo10779j(ad).getAds().size() != 0 || mo10779j(ad).mo10737am().longValue() + 60000 <= System.currentTimeMillis()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C3164a mo10779j(C3148Ad ad) {
        return this.f12303cL.get(new C3175b(ad));
    }

    /* renamed from: k */
    public final String mo10780k(C3148Ad ad) {
        return mo10779j(ad).mo10746u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10775b(String str, C3148Ad ad) {
        mo10772a(str, "", ad);
    }

    /* renamed from: a */
    public final void mo10769a(Context context, C3148Ad ad, String str, C3185a aVar) {
        mo10770a(context, ad, str, aVar, true);
    }

    /* renamed from: a */
    public final void mo10770a(Context context, C3148Ad ad, String str, C3185a aVar, boolean z) {
        try {
            this.f12298aM = context.getApplicationContext();
            if (C3198g.m10800k(context)) {
                m10722b(context, ad, str, aVar, z);
            } else if (aVar != null) {
                aVar.error(AppnextError.CONNECTION_ERROR);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AdsManager$getAdList", th);
            if (aVar != null) {
                aVar.error(AppnextError.NO_ADS);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo10238a(C3148Ad ad) {
        try {
            return mo10777h(ad) && mo10778i(ad);
        } catch (Throwable th) {
            C3117a.m10553a("AdsManager$isLoadedAndUpdated", th);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m10713a(C3148Ad ad, String str) {
        try {
            return Long.valueOf(mo10240c(ad).mo10732y(str)).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static ArrayList<AppnextAd> m10718a(Context context, ArrayList<AppnextAd> arrayList, String str, String str2) {
        if (arrayList == null) {
            try {
                return new ArrayList<>();
            } catch (Throwable unused) {
                return new ArrayList<>();
            }
        } else {
            List<String> B = C3169a.m10687o(context).mo10752B(str2);
            if (B != null) {
                if (!B.isEmpty()) {
                    arrayList.size();
                    ArrayList<AppnextAd> arrayList2 = new ArrayList<>();
                    ListIterator<AppnextAd> listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        AppnextAd next = listIterator.next();
                        if (!B.contains(next.getBannerID())) {
                            arrayList2.add(next);
                            listIterator.remove();
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C3169a.m10687o(context).mo10754l(str, str2);
                    }
                    arrayList2.addAll(arrayList);
                    arrayList.toString();
                    return arrayList2;
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r3.getRevenueType().equals("cpc") != false) goto L_0x008c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.appnext.core.AppnextAd> m10717a(android.content.Context r7, com.appnext.core.C3148Ad r8, java.lang.String r9, int r10) throws org.json.JSONException {
        /*
            r6 = this;
            com.appnext.core.a r0 = r6.mo10779j(r8)
            r0.mo10743o(r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r9)
            java.lang.String r9 = "apps"
            org.json.JSONArray r9 = r1.getJSONArray(r9)
            r1 = 0
        L_0x0018:
            int r2 = r9.length()
            if (r1 >= r2) goto L_0x00a3
            org.json.JSONObject r2 = r9.getJSONObject(r1)
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009f }
            com.appnext.core.h r2 = parseAd(r2)     // Catch:{ all -> 0x009f }
            com.appnext.core.AppnextAd r2 = (com.appnext.core.AppnextAd) r2     // Catch:{ all -> 0x009f }
            int r3 = r0.size()     // Catch:{ all -> 0x009f }
            r2.setAdID(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r8.getPlacementID()     // Catch:{ all -> 0x009f }
            r2.setPlacementID(r3)     // Catch:{ all -> 0x009f }
            int r3 = r6.mo10229a((android.content.Context) r7, (com.appnext.core.C3201h) r2)     // Catch:{ all -> 0x009f }
            if (r3 != 0) goto L_0x0091
            com.appnext.core.AppnextAd r3 = m10715a((java.util.ArrayList<com.appnext.core.AppnextAd>) r0, (com.appnext.core.AppnextAd) r2)     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x008d
            r0.remove(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r3.getRevenueType()     // Catch:{ all -> 0x009f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x009f }
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = r3.getRevenueType()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r2.getRevenueType()     // Catch:{ all -> 0x009f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = r3.getRevenueRate()     // Catch:{ all -> 0x009f }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r2.getRevenueRate()     // Catch:{ all -> 0x009f }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ all -> 0x009f }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x008d
            goto L_0x008c
        L_0x0076:
            java.lang.String r4 = r3.getRevenueType()     // Catch:{ all -> 0x009f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x009f }
            if (r4 != 0) goto L_0x008d
            java.lang.String r4 = r3.getRevenueType()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "cpc"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            r0.add(r2)     // Catch:{ all -> 0x009f }
            goto L_0x0098
        L_0x0091:
            r2.getBannerID()     // Catch:{ all -> 0x009f }
            r2 = 1
            if (r3 == r2) goto L_0x0098
            r2 = 2
        L_0x0098:
            int r2 = r0.size()     // Catch:{ all -> 0x009f }
            if (r2 != r10) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3180d.m10717a(android.content.Context, com.appnext.core.Ad, java.lang.String, int):java.util.ArrayList");
    }

    /* renamed from: a */
    private static AppnextAd m10715a(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (next.getAdPackage().equals(appnextAd.getAdPackage())) {
                    return next;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo10379a(ArrayList<AppnextAd> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().getAdJSON()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apps", jSONArray);
            return jSONObject.toString().replace(" ", "\\u2028").replace(" ", "\\u2029");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10772a(String str, String str2, C3148Ad ad) {
        mo10773a(str, str2, ad, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10773a(String str, String str2, C3148Ad ad, int i) {
        final C3148Ad ad2 = ad;
        final int i2 = i;
        final String str3 = str;
        final String str4 = str2;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C3164a j = C3180d.this.mo10779j(ad2);
                    if (j != null) {
                        if (j.getAds() == null) {
                            j.mo10740c(new ArrayList());
                        } else {
                            j.mo10740c(j.getAds());
                        }
                        j.mo10739b(i2);
                        j.mo10744p(str3);
                        C3180d dVar = C3180d.this;
                        C3148Ad ad = ad2;
                        dVar.mo10235a(ad, str3 + " " + str4, j.getPlacementID());
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("AdKey$notifyError", th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10771a(C3148Ad ad, C3164a aVar) {
        this.f12303cL.put(new C3175b(ad), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10236a(final String str, final C3148Ad ad) {
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                C3169a.m10687o(ad.getContext()).mo10753k(str, ad.getAUID());
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ String m10716a(C3180d dVar, Context context, C3148Ad ad, String str, ArrayList arrayList) {
        String str2;
        StringBuilder sb = new StringBuilder("https://global.appnext.com/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&s2s=1&type=json&id=");
        sb.append(str);
        sb.append("&cnt=50");
        sb.append("&tid=");
        sb.append(ad != null ? ad.getTID() : "301");
        sb.append("&vid=");
        sb.append(ad != null ? ad.getVID() : "2.6.5.473");
        sb.append("&cat=");
        String str3 = "";
        sb.append(ad != null ? ad.getCategories() : str3);
        sb.append("&lockcat=");
        sb.append(ad != null ? ad.getSpecificCategories() : str3);
        sb.append("&did=");
        sb.append(C3198g.m10787b(context, false));
        sb.append("&devn=");
        sb.append(C3198g.m10785au());
        sb.append("&dosv=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(C3198g.m10802v(C3198g.m10795g(context)));
        sb.append("&lang=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&dcc=");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            String simOperator = telephonyManager.getSimOperator();
            str2 = simOperator.substring(0, 3) + "_" + simOperator.substring(3);
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append("&dds=0");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&g=");
        sb.append(m10724e(context));
        sb.append("&opt=");
        sb.append(AdsIDHelper.isOptOut(context) ? 1 : 0);
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        if (!TextUtils.isEmpty(ad.getPackageName())) {
            str3 = "&sp=" + ad.getPackageName();
        }
        sb.append(str3);
        return sb.toString();
    }
}
