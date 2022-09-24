package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.u5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C8215u5<T> implements Comparable<C8215u5<T>> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7709g6 f39769b;

    /* renamed from: c */
    private final int f39770c;

    /* renamed from: d */
    private final String f39771d;

    /* renamed from: e */
    private final int f39772e;

    /* renamed from: f */
    private final Object f39773f;

    /* renamed from: g */
    private final C8358y5 f39774g;

    /* renamed from: h */
    private Integer f39775h;

    /* renamed from: i */
    private C8322x5 f39776i;

    /* renamed from: j */
    private boolean f39777j;

    /* renamed from: k */
    private C7597d5 f39778k;

    /* renamed from: l */
    private C8179t5 f39779l;

    /* renamed from: m */
    private final C7782i5 f39780m;

    public C8215u5(int i, String str, C8358y5 y5Var) {
        Uri parse;
        String host;
        this.f39769b = C7709g6.f32163c ? new C7709g6() : null;
        this.f39773f = new Object();
        int i2 = 0;
        this.f39777j = false;
        this.f39778k = null;
        this.f39770c = i;
        this.f39771d = str;
        this.f39774g = y5Var;
        this.f39780m = new C7782i5();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f39772e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7492a6<T> mo28553a(C8074q5 q5Var);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo28548c(T t);

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f39775h.intValue() - ((C8215u5) obj).f39775h.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35104d(String str) {
        C8322x5 x5Var = this.f39776i;
        if (x5Var != null) {
            x5Var.mo35719b(this);
        }
        if (C7709g6.f32163c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C8144s5(this, str, id));
                return;
            }
            this.f39769b.mo32017a(str, id);
            this.f39769b.mo32018b(toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo35105i() {
        C8179t5 t5Var;
        synchronized (this.f39773f) {
            t5Var = this.f39779l;
        }
        if (t5Var != null) {
            t5Var.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo35106j(C7492a6<?> a6Var) {
        C8179t5 t5Var;
        synchronized (this.f39773f) {
            t5Var = this.f39779l;
        }
        if (t5Var != null) {
            t5Var.mo32558a(this, a6Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo35107k(int i) {
        C8322x5 x5Var = this.f39776i;
        if (x5Var != null) {
            x5Var.mo35720c(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo35108l(C8179t5 t5Var) {
        synchronized (this.f39773f) {
            this.f39779l = t5Var;
        }
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(Integer.toHexString(this.f39772e));
        if (valueOf.length() != 0) {
            str = "0x".concat(valueOf);
        } else {
            str = new String("0x");
        }
        zzw();
        String str2 = this.f39771d;
        String valueOf2 = String.valueOf(this.f39775h);
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 7 + String.valueOf(str).length() + 6 + valueOf2.length());
        sb.append("[ ] ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        sb.append(" NORMAL ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final int zza() {
        return this.f39770c;
    }

    public final int zzb() {
        return this.f39780m.mo32554b();
    }

    public final int zzc() {
        return this.f39772e;
    }

    public final C7597d5 zzd() {
        return this.f39778k;
    }

    public final C8215u5<?> zze(C7597d5 d5Var) {
        this.f39778k = d5Var;
        return this;
    }

    public final C8215u5<?> zzf(C8322x5 x5Var) {
        this.f39776i = x5Var;
        return this;
    }

    public final C8215u5<?> zzg(int i) {
        this.f39775h = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        String str = this.f39771d;
        if (this.f39770c == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final String zzk() {
        return this.f39771d;
    }

    public Map<String, String> zzl() throws C7562c5 {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (C7709g6.f32163c) {
            this.f39769b.mo32017a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(C7635e6 e6Var) {
        C8358y5 y5Var;
        synchronized (this.f39773f) {
            y5Var = this.f39774g;
        }
        if (y5Var != null) {
            y5Var.zza(e6Var);
        }
    }

    public final void zzq() {
        synchronized (this.f39773f) {
            this.f39777j = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.f39773f) {
            z = this.f39777j;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.f39773f) {
        }
        return false;
    }

    public byte[] zzx() throws C7562c5 {
        return null;
    }

    public final C7782i5 zzy() {
        return this.f39780m;
    }
}
