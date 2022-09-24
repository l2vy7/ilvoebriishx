package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class dp0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f30880a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f30881b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f30882c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final p63<String> f30883d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final p63<String> f30884e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final p63<String> f30885f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public p63<String> f30886g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f30887h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final t63<ck0, fr0> f30888i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final a73<Integer> f30889j;

    @Deprecated
    public dp0() {
        this.f30880a = Integer.MAX_VALUE;
        this.f30881b = Integer.MAX_VALUE;
        this.f30882c = true;
        this.f30883d = p63.m20814A();
        this.f30884e = p63.m20814A();
        this.f30885f = p63.m20814A();
        this.f30886g = p63.m20814A();
        this.f30887h = 0;
        this.f30888i = t63.m21028e();
        this.f30889j = a73.m20184x();
    }

    protected dp0(gs0 gs0) {
        this.f30880a = gs0.f32431i;
        this.f30881b = gs0.f32432j;
        this.f30882c = gs0.f32433k;
        this.f30883d = gs0.f32434l;
        this.f30884e = gs0.f32435m;
        this.f30885f = gs0.f32439q;
        this.f30886g = gs0.f32440r;
        this.f30887h = gs0.f32441s;
        this.f30888i = gs0.f32445w;
        this.f30889j = gs0.f32446x;
    }

    /* renamed from: d */
    public final dp0 mo31349d(Context context) {
        CaptioningManager captioningManager;
        int i = d13.f20195a;
        if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f30887h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f30886g = p63.m20815D(d13.m20310i(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public dp0 mo31350e(int i, int i2, boolean z) {
        this.f30880a = i;
        this.f30881b = i2;
        this.f30882c = true;
        return this;
    }
}
