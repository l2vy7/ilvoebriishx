package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p42 implements sg0 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.gy2 m35960a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.gy2 r4 = com.google.android.gms.internal.ads.gy2.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.gy2 r4 = com.google.android.gms.internal.ads.gy2.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.gy2 r4 = com.google.android.gms.internal.ads.gy2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p42.m35960a(java.lang.String):com.google.android.gms.internal.ads.gy2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.iy2 m35961h(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.iy2 r4 = com.google.android.gms.internal.ads.iy2.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.iy2 r4 = com.google.android.gms.internal.ads.iy2.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.iy2 r4 = com.google.android.gms.internal.ads.iy2.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.iy2 r4 = com.google.android.gms.internal.ads.iy2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p42.m35961h(java.lang.String):com.google.android.gms.internal.ads.iy2");
    }

    /* renamed from: i */
    private static jy2 m35962i(String str) {
        if ("native".equals(str)) {
            return jy2.NATIVE;
        }
        if ("javascript".equals(str)) {
            return jy2.JAVASCRIPT;
        }
        return jy2.NONE;
    }

    /* renamed from: b */
    public final String mo34045b(Context context) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
            return null;
        }
        return "a.1.3.3-google_20200416";
    }

    /* renamed from: c */
    public final void mo34046c(C10487a aVar, View view) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() && yx2.m40101b()) {
            Object f3 = C10489b.m48194f3(aVar);
            if (f3 instanceof by2) {
                ((by2) f3).mo30824d(view);
            }
        }
    }

    /* renamed from: d */
    public final C10487a mo34047d(String str, WebView webView, String str2, String str3, String str4, ug0 ug0, tg0 tg0, String str5) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() || !yx2.m40101b()) {
            return null;
        }
        ky2 a = ky2.m34240a("Google", str);
        jy2 i = m35962i("javascript");
        gy2 a2 = m35960a(tg0.toString());
        jy2 jy2 = jy2.NONE;
        if (i == jy2) {
            co0.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (a2 == null) {
            co0.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(tg0)));
            return null;
        } else {
            jy2 i2 = m35962i(str4);
            if (a2 == gy2.VIDEO && i2 == jy2) {
                String valueOf = String.valueOf(str4);
                co0.zzj(valueOf.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid html session error; Video events owner unknown for video creative: "));
                return null;
            }
            return C10489b.m48195m6(by2.m30869a(cy2.m31167a(a2, m35961h(ug0.toString()), i, i2, true), dy2.m31646b(a, webView, str5, "")));
        }
    }

    /* renamed from: e */
    public final C10487a mo34048e(String str, WebView webView, String str2, String str3, String str4, String str5, ug0 ug0, tg0 tg0, String str6) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() || !yx2.m40101b()) {
            return null;
        }
        ky2 a = ky2.m34240a(str5, str);
        jy2 i = m35962i("javascript");
        jy2 i2 = m35962i(str4);
        gy2 a2 = m35960a(tg0.toString());
        jy2 jy2 = jy2.NONE;
        if (i == jy2) {
            co0.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (a2 == null) {
            co0.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(tg0)));
            return null;
        } else if (a2 == gy2.VIDEO && i2 == jy2) {
            String valueOf = String.valueOf(str4);
            co0.zzj(valueOf.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid js session error; Video events owner unknown for video creative: "));
            return null;
        } else {
            return C10489b.m48195m6(by2.m30869a(cy2.m31167a(a2, m35961h(ug0.toString()), i, i2, true), dy2.m31647c(a, webView, str6, "")));
        }
    }

    /* renamed from: f */
    public final boolean mo34049f(Context context) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue()) {
            co0.zzj("Omid flag is disabled");
            return false;
        } else if (yx2.m40101b()) {
            return true;
        } else {
            yx2.m40100a(context);
            return yx2.m40101b();
        }
    }

    /* renamed from: g */
    public final void mo34050g(C10487a aVar, View view) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() && yx2.m40101b()) {
            Object f3 = C10489b.m48194f3(aVar);
            if (f3 instanceof by2) {
                ((by2) f3).mo30822b(view, hy2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final void zze(C10487a aVar) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() && yx2.m40101b()) {
            Object f3 = C10489b.m48194f3(aVar);
            if (f3 instanceof by2) {
                ((by2) f3).mo30823c();
            }
        }
    }

    public final void zzh(C10487a aVar) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36843B3)).booleanValue() && yx2.m40101b()) {
            Object f3 = C10489b.m48194f3(aVar);
            if (f3 instanceof by2) {
                ((by2) f3).mo30825e();
            }
        }
    }
}
