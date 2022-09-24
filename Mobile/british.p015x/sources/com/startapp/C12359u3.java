package com.startapp;

import android.app.Activity;
import com.google.android.exoplayer2.C6540C;
import com.startapp.C11963i7;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.startapp.u3 */
/* compiled from: Sta */
public class C12359u3 {

    /* renamed from: a */
    public final AdvertisingIdResolver f54808a;

    /* renamed from: b */
    public final C12034lb f54809b;

    /* renamed from: c */
    public final C12410w5 f54810c;

    /* renamed from: d */
    public final C11781a7 f54811d;

    /* renamed from: e */
    public final C12462z2<C12384v3> f54812e;

    public C12359u3(AdvertisingIdResolver advertisingIdResolver, C12034lb lbVar, C12410w5 w5Var, C11781a7 a7Var, C12462z2<C12384v3> z2Var) {
        this.f54808a = advertisingIdResolver;
        this.f54809b = lbVar;
        this.f54810c = w5Var;
        this.f54811d = a7Var;
        this.f54812e = z2Var;
    }

    /* renamed from: a */
    public final C11963i7.C11964a mo46647a(String str, C12403w0 w0Var, C12442y2<String, Void> y2Var) {
        Map<String, String> map;
        if (w0Var != null) {
            map = mo46649a();
            try {
                C12411w6 w6Var = new C12411w6();
                w0Var.mo45384a((C11924g8) w6Var);
                str = m53528a(str, w6Var.toString());
            } catch (SDKException e) {
                C5004d4.m22887a((Throwable) e);
                return null;
            }
        } else {
            map = null;
        }
        String str2 = this.f54809b.f53254a;
        boolean z = mo46650b().f54873a;
        long currentTimeMillis = System.currentTimeMillis();
        long a = C5015nb.m22900a();
        C11781a7 a7Var = this.f54811d;
        C11940h7 h7Var = a7Var != null ? new C11940h7(a7Var) : null;
        try {
            C11963i7.C11964a a2 = C11963i7.m52453a(str, map, str2, z);
            if (h7Var != null) {
                h7Var.mo45406a("GET", str, (SDKException) null);
            }
            a2.f53102d = currentTimeMillis;
            a2.f53103e = a;
            a2.f53104f = C5015nb.m22900a();
            return a2;
        } catch (SDKException e2) {
            if (h7Var != null) {
                h7Var.mo45406a("GET", str, e2);
            }
            if (y2Var != null) {
                y2Var.mo45478a(e2.getMessage());
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        return null;
    }

    /* renamed from: b */
    public final C12384v3 mo46650b() {
        C12384v3 call = this.f54812e.call();
        return call != null ? call : C12384v3.f54872c;
    }

    /* renamed from: a */
    public static String m53528a(String str, String str2) {
        if (!str.contains("?") || !str2.startsWith("?")) {
            return str + str2;
        }
        return str + "&" + str2.substring(1);
    }

    /* renamed from: a */
    public final String mo46648a(String str, C12403w0 w0Var, byte[] bArr, boolean z, C12442y2<String, Void> y2Var) {
        Map<String, String> map;
        if (bArr != null) {
            map = null;
        } else if (w0Var != null) {
            Map<String, String> a = mo46649a();
            try {
                C11987j5 j5Var = new C11987j5();
                w0Var.mo45384a((C11924g8) j5Var);
                byte[] bytes = j5Var.f53165a.toString().getBytes();
                if (mo46650b().f54873a) {
                    try {
                        Map<Activity, Integer> map2 = C5015nb.f22145a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        bytes = byteArrayOutputStream.toByteArray();
                        z = true;
                    } catch (IOException e) {
                        C5004d4.m22887a((Throwable) e);
                    }
                }
                Map<String, String> map3 = a;
                bArr = bytes;
                map = map3;
            } catch (SDKException e2) {
                C5004d4.m22887a((Throwable) e2);
                return null;
            }
        } else {
            map = null;
            bArr = null;
        }
        String str2 = this.f54809b.f53254a;
        C11781a7 a7Var = this.f54811d;
        C11940h7 h7Var = a7Var != null ? new C11940h7(a7Var) : null;
        try {
            String a2 = C11963i7.m52454a(str, bArr, map, str2, z);
            if (h7Var != null) {
                h7Var.mo45406a("POST", str, (SDKException) null);
            }
            return a2 != null ? a2 : "";
        } catch (SDKException e3) {
            if (h7Var != null) {
                h7Var.mo45406a("POST", str, e3);
            }
            if (y2Var != null) {
                y2Var.mo45478a(e3.getMessage());
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
        return null;
    }

    /* renamed from: a */
    public final Map<String, String> mo46649a() {
        HashMap hashMap = new HashMap();
        if (!mo46650b().f54874b) {
            String str = null;
            try {
                str = URLEncoder.encode(this.f54808a.mo46442a().f54121a, C6540C.UTF8_NAME);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
            hashMap.put("device-id", str);
        }
        hashMap.put("Accept-Language", ((C12387v5) this.f54810c.mo45342b()).f54888c);
        return hashMap;
    }
}
