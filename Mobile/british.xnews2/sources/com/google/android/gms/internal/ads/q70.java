package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.dv0;
import com.google.android.gms.internal.ads.gi1;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.iv0;
import com.google.android.gms.internal.ads.ot0;
import com.google.android.gms.internal.ads.t90;
import com.google.android.gms.internal.ads.vu0;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.zu0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001a0.C0038l;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q70<T extends C7659eu & ot0 & xt0 & t90 & vu0 & zu0 & dv0 & gi1 & gv0 & iv0> implements e70<T> {

    /* renamed from: a */
    private final zzb f37914a;

    /* renamed from: b */
    private final nv1 f37915b;

    /* renamed from: c */
    private final nw2 f37916c;

    /* renamed from: d */
    private final io0 f37917d;

    /* renamed from: e */
    private final pf0 f37918e;

    /* renamed from: f */
    private final f42 f37919f;

    /* renamed from: g */
    private zzu f37920g = null;

    public q70(zzb zzb, pf0 pf0, f42 f42, nv1 nv1, nw2 nw2) {
        this.f37914a = zzb;
        this.f37918e = pf0;
        this.f37919f = f42;
        this.f37915b = nv1;
        this.f37916c = nw2;
        this.f37917d = new io0((String) null);
    }

    /* renamed from: b */
    public static int m36351b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzt.zzq().zzg();
        }
        return -1;
    }

    /* renamed from: c */
    static Uri m36352c(Context context, C7497ab abVar, Uri uri, View view, Activity activity) {
        if (abVar == null) {
            return uri;
        }
        try {
            if (abVar.mo30333e(uri)) {
                return abVar.mo30329a(uri, context, view, activity);
            }
            return uri;
        } catch (C7533bb unused) {
            return uri;
        } catch (Exception e) {
            zzt.zzo().mo18592s(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* renamed from: d */
    static Uri m36353d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            co0.zzh(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m36354f(Map<String, String> map) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("custom_close"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m36356h(T r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.m36357i(r3)
            r4 = r0
            com.google.android.gms.internal.ads.xt0 r4 = (com.google.android.gms.internal.ads.xt0) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.ab r6 = r4.zzK()
            android.view.View r7 = r4.mo18790t()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0133
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = m36352c(r5, r6, r9, r7, r11)
            android.net.Uri r9 = m36353d(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.p00.f37043a3
            com.google.android.gms.internal.ads.n00 r14 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r2 = r14.mo18570b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r11 = r2.build()
            goto L_0x00a9
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a9
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            android.net.Uri r11 = r2.build()
        L_0x00a9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.p70.m36024a(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.p70.m36024a(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c4
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzu(r5, r9)
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzu(r5, r11)
        L_0x00c4:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p70.m36027d(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cf
            android.content.Intent r11 = com.google.android.gms.internal.ads.p70.m36025b(r9, r3, r5, r6, r7)
            goto L_0x0133
        L_0x00cf:
            if (r11 == 0) goto L_0x00e1
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p70.m36026c(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00e1
            android.content.Intent r11 = com.google.android.gms.internal.ads.p70.m36025b(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.p70.m36026c(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0133
        L_0x00e1:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x00e8
            goto L_0x0132
        L_0x00e8:
            if (r12 == 0) goto L_0x0124
            if (r8 == 0) goto L_0x0124
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0124
            int r8 = r2.size()
            r11 = 0
        L_0x00f7:
            if (r11 >= r8) goto L_0x0124
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0103:
            int r15 = r11 + 1
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0122
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0103
            android.content.Intent r11 = com.google.android.gms.internal.ads.p70.m36025b(r9, r12, r5, r6, r7)
            goto L_0x0133
        L_0x0122:
            r11 = r15
            goto L_0x00f7
        L_0x0124:
            if (r10 == 0) goto L_0x0132
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.p70.m36025b(r9, r2, r5, r6, r7)
            goto L_0x0133
        L_0x0132:
            r11 = r9
        L_0x0133:
            if (r20 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.f42 r2 = r1.f37919f
            if (r2 == 0) goto L_0x0151
            if (r11 == 0) goto L_0x0151
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.m36358j(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            return
        L_0x0151:
            com.google.android.gms.internal.ads.dv0 r0 = (com.google.android.gms.internal.ads.dv0) r0     // Catch:{ ActivityNotFoundException -> 0x0160 }
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x0160 }
            com.google.android.gms.ads.internal.overlay.zzu r3 = r1.f37920g     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            r3 = r22
            r0.mo18757j0(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0160 }
            return
        L_0x0160:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.co0.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q70.m36356h(com.google.android.gms.internal.ads.eu, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    /* renamed from: i */
    private final void m36357i(boolean z) {
        pf0 pf0 = this.f37918e;
        if (pf0 != null) {
            pf0.mo34116h(z);
        }
    }

    /* renamed from: j */
    private final boolean m36358j(T t, Context context, String str, String str2) {
        String str3 = str2;
        zzt.zzp();
        boolean zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(context);
        zzt.zzp();
        zzbv zzE = com.google.android.gms.ads.internal.util.zzt.zzE(context);
        nv1 nv1 = this.f37915b;
        if (nv1 != null) {
            n42.m35044o6(context, nv1, this.f37916c, this.f37919f, str2, "offline_open");
        }
        xt0 xt0 = (xt0) t;
        boolean z = xt0.mo18765m().mo34013i() && xt0.zzk() == null;
        if (zzJ) {
            this.f37919f.mo31750k(this.f37917d, str3);
            return false;
        }
        zzt.zzp();
        if (C0038l.m149d(context).mo103a() && zzE != null && !z) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37118i6)).booleanValue()) {
                if (xt0.mo18765m().mo34013i()) {
                    n42.m35046q6(xt0.zzk(), (zzl) null, zzE, this.f37919f, this.f37915b, this.f37916c, str2, str);
                } else {
                    ((dv0) t).mo18753h0(zzE, this.f37919f, this.f37915b, this.f37916c, str2, str, zzt.zzq().zzg());
                }
                nv1 nv12 = this.f37915b;
                if (nv12 != null) {
                    n42.m35044o6(context, nv12, this.f37916c, this.f37919f, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.f37919f.mo31746e(str3);
        if (this.f37915b != null) {
            HashMap hashMap = new HashMap();
            zzt.zzp();
            if (!C0038l.m149d(context).mo103a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzE == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37118i6)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            n42.m35045p6(context, this.f37915b, this.f37916c, this.f37919f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m36359k(int i) {
        if (this.f37915b != null) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
                nw2 nw2 = this.f37916c;
                mw2 b = mw2.m34936b("cct_action");
                b.mo33603a("cct_open_status", n10.m35014a(i));
                nw2.mo31048a(b);
                return;
            }
            mv1 a = this.f37915b.mo33772a();
            a.mo33597b("action", "cct_action");
            a.mo33597b("cct_open_status", n10.m35014a(i));
            a.mo33601f();
        }
    }

    /* renamed from: e */
    public final void mo18854a(T t, Map<String, String> map) {
        String str;
        boolean z;
        Object obj;
        HashMap hashMap;
        T t2 = t;
        Map<String, String> map2 = map;
        xt0 xt0 = (xt0) t2;
        String c = mm0.m34822c(map2.get("u"), xt0.getContext(), true);
        String str2 = map2.get("a");
        if (str2 == null) {
            co0.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb = this.f37914a;
        if (zzb == null || zzb.zzc()) {
            ir2 b = xt0.mo18740b();
            lr2 p = xt0.mo18780p();
            boolean z2 = false;
            if (b == null || p == null) {
                str = "";
                z = false;
            } else {
                z = b.f33477g0;
                str = p.f35215b;
            }
            boolean z3 = !((Boolean) C8311wv.m39277c().mo18570b(p00.f37137k7)).booleanValue() || !map2.containsKey("sc") || !map2.get("sc").equals(SessionDescription.SUPPORTED_SDP_VERSION);
            if ("expand".equalsIgnoreCase(str2)) {
                if (xt0.mo18732S()) {
                    co0.zzj("Cannot expand WebView that is already expanded.");
                    return;
                }
                m36357i(false);
                ((dv0) t2).mo18781p0(m36354f(map), m36351b(map), z3);
            } else if ("webapp".equalsIgnoreCase(str2)) {
                m36357i(false);
                if (c != null) {
                    ((dv0) t2).mo18730Q(m36354f(map), m36351b(map), c, z3);
                } else {
                    ((dv0) t2).mo18800z0(m36354f(map), m36351b(map), map2.get("html"), map2.get("baseurl"), z3);
                }
            } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = xt0.getContext();
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37061c3)).booleanValue()) {
                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37115i3)).booleanValue()) {
                        zze.zza("User opt out chrome custom tab.");
                    } else {
                        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37097g3)).booleanValue()) {
                            z2 = true;
                        } else {
                            String str3 = (String) C8311wv.m39277c().mo18570b(p00.f37106h3);
                            if (!str3.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                Iterator<String> it = k43.m33841c(m33.m34676b(';')).mo33028d(str3).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().equals(packageName)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                }
                boolean g = o10.m20748g(xt0.getContext());
                if (z2) {
                    if (!g) {
                        m36359k(4);
                    } else {
                        m36357i(true);
                        if (TextUtils.isEmpty(c)) {
                            co0.zzj("Cannot open browser with null or empty url");
                            m36359k(7);
                            return;
                        }
                        Uri d = m36353d(m36352c(xt0.getContext(), xt0.zzK(), Uri.parse(c), xt0.mo18790t(), xt0.zzk()));
                        if (!z || this.f37919f == null || !m36358j(t2, xt0.getContext(), d.toString(), str)) {
                            this.f37920g = new n70(this);
                            ((dv0) t2).mo18757j0(new zzc((String) null, d.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, C10489b.m48195m6(this.f37920g).asBinder(), true), z3);
                            return;
                        }
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                m36356h(t, map, z, str, z3);
            } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map2.get("system_browser"))) {
                m36356h(t, map, z, str, z3);
            } else if ("open_app".equalsIgnoreCase(str2)) {
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37037Z5)).booleanValue()) {
                    m36357i(true);
                    String str4 = map2.get(TtmlNode.TAG_P);
                    if (str4 == null) {
                        co0.zzj("Package name missing from open app action.");
                    } else if (!z || this.f37919f == null || !m36358j(t2, xt0.getContext(), str4, str)) {
                        PackageManager packageManager = xt0.getContext().getPackageManager();
                        if (packageManager == null) {
                            co0.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            ((dv0) t2).mo18757j0(new zzc(launchIntentForPackage, this.f37920g), z3);
                        }
                    }
                }
            } else {
                m36357i(true);
                String str5 = map2.get("intent_url");
                Intent intent = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        intent = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e) {
                        URISyntaxException uRISyntaxException = e;
                        String valueOf = String.valueOf(str5);
                        co0.zzh(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                    }
                }
                Intent intent2 = intent;
                if (!(intent2 == null || intent2.getData() == null)) {
                    Uri data = intent2.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri d2 = m36353d(m36352c(xt0.getContext(), xt0.zzK(), data, xt0.mo18790t(), xt0.zzk()));
                        if (!TextUtils.isEmpty(intent2.getType())) {
                            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37046a6)).booleanValue()) {
                                intent2.setDataAndType(d2, intent2.getType());
                            }
                        }
                        intent2.setData(d2);
                    }
                }
                boolean z4 = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37154m6)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
                HashMap hashMap2 = new HashMap();
                if (z4) {
                    hashMap = hashMap2;
                    obj = TtmlNode.TAG_P;
                    o70 o70 = r1;
                    o70 o702 = new o70(this, z3, t, hashMap2, map);
                    this.f37920g = o70;
                    z3 = false;
                } else {
                    hashMap = hashMap2;
                    obj = TtmlNode.TAG_P;
                }
                if (intent2 == null) {
                    HashMap hashMap3 = hashMap;
                    if (!TextUtils.isEmpty(c)) {
                        c = m36353d(m36352c(xt0.getContext(), xt0.zzK(), Uri.parse(c), xt0.mo18790t(), xt0.zzk())).toString();
                    }
                    if (!z || this.f37919f == null || !m36358j(t2, xt0.getContext(), c, str)) {
                        ((dv0) t2).mo18757j0(new zzc(map2.get("i"), c, map2.get("m"), map2.get(obj), map2.get("c"), map2.get("f"), map2.get("e"), this.f37920g), z3);
                    } else if (z4) {
                        hashMap3.put(map2.get("event_id"), Boolean.TRUE);
                        ((t90) t2).mo18321Z("openIntentAsync", hashMap3);
                    }
                } else if (!z || this.f37919f == null || !m36358j(t2, xt0.getContext(), intent2.getData().toString(), str)) {
                    ((dv0) t2).mo18757j0(new zzc(intent2, this.f37920g), z3);
                } else if (z4) {
                    HashMap hashMap4 = hashMap;
                    hashMap4.put(map2.get("event_id"), Boolean.TRUE);
                    ((t90) t2).mo18321Z("openIntentAsync", hashMap4);
                }
            }
        } else {
            this.f37914a.zzb(c);
        }
    }
}
