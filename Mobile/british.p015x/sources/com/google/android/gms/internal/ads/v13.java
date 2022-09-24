package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v13 implements n03 {

    /* renamed from: a */
    private final Object f40236a;

    /* renamed from: b */
    private final w13 f40237b;

    /* renamed from: c */
    private final g23 f40238c;

    /* renamed from: d */
    private final k03 f40239d;

    v13(Object obj, w13 w13, g23 g23, k03 k03) {
        this.f40236a = obj;
        this.f40237b = w13;
        this.f40238c = g23;
        this.f40239d = k03;
    }

    /* renamed from: i */
    private static String m38641i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C7748h9 E = C7786i9.m33121E();
        E.mo32370C(5);
        E.mo32371y(eo3.m31873L(bArr));
        return Base64.encodeToString(((C7786i9) E.mo32424p()).mo33365g(), 11);
    }

    /* renamed from: j */
    private final synchronized byte[] m38642j(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f40239d.mo33005c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f40236a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f40236a, new Object[]{null, map2});
    }

    /* renamed from: a */
    public final synchronized String mo33620a(Context context, String str) {
        Map<String, Object> zzb;
        zzb = this.f40238c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", (Object) null);
        return m38641i(m38642j((Map<String, String>) null, zzb));
    }

    /* renamed from: b */
    public final synchronized void mo33621b(String str, MotionEvent motionEvent) throws e23 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f40236a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f40236a, new Object[]{hashMap});
            this.f40239d.mo33006d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new e23((int) IronSourceConstants.IS_INSTANCE_OPENED, (Throwable) e);
        }
    }

    /* renamed from: c */
    public final synchronized String mo33622c(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zza;
        zza = this.f40238c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", (Object) null);
        zza.put("view", view);
        zza.put("act", activity);
        return m38641i(m38642j((Map<String, String>) null, zza));
    }

    /* renamed from: d */
    public final synchronized String mo33623d(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzc;
        zzc = this.f40238c.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", (Object) null);
        zzc.put("view", view);
        zzc.put("act", (Object) null);
        return m38641i(m38642j((Map<String, String>) null, zzc));
    }

    /* renamed from: e */
    public final synchronized int mo35345e() throws e23 {
        try {
        } catch (Exception e) {
            throw new e23(2006, (Throwable) e);
        }
        return ((Integer) this.f40236a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f40236a, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final w13 mo35346f() {
        return this.f40237b;
    }

    /* renamed from: g */
    public final synchronized void mo35347g() throws e23 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f40236a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f40236a, new Object[0]);
            this.f40239d.mo33006d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new e23(2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo35348h() throws e23 {
        try {
        } catch (Exception e) {
            throw new e23(2001, (Throwable) e);
        }
        return ((Boolean) this.f40236a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f40236a, new Object[0])).booleanValue();
    }
}
