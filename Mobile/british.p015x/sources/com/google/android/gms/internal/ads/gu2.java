package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.o61;
import com.google.android.gms.internal.ads.v91;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gu2<R extends v91<AdT>, AdT extends o61> {

    /* renamed from: a */
    private final kt2 f32465a;

    /* renamed from: b */
    private final eu2<R, AdT> f32466b;

    /* renamed from: c */
    private final gt2 f32467c;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: d */
    public final ArrayDeque<fu2<R, AdT>> f32468d;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: e */
    public mu2<R, AdT> f32469e;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: f */
    public int f32470f = 1;

    public gu2(kt2 kt2, gt2 gt2, eu2<R, AdT> eu2) {
        this.f32465a = kt2;
        this.f32467c = gt2;
        this.f32466b = eu2;
        this.f32468d = new ArrayDeque<>();
        gt2.mo32287b(new bu2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m32707h() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36916K4)).booleanValue()) {
            if (!zzt.zzo().mo18583h().zzg().mo32726h()) {
                this.f32468d.clear();
                return;
            }
        }
        if (m32708i()) {
            while (!this.f32468d.isEmpty()) {
                fu2 pollFirst = this.f32468d.pollFirst();
                if (pollFirst == null || (pollFirst.zza() != null && this.f32465a.mo33178b(pollFirst.zza()))) {
                    mu2<R, AdT> mu2 = new mu2<>(this.f32465a, this.f32466b, pollFirst);
                    this.f32469e = mu2;
                    mu2.mo33596d(new cu2(this, pollFirst));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m32708i() {
        return this.f32469e == null;
    }

    /* renamed from: a */
    public final synchronized mb3<du2<R, AdT>> mo32291a(fu2<R, AdT> fu2) {
        this.f32470f = 2;
        if (m32708i()) {
            return null;
        }
        return this.f32469e.mo33593a(fu2);
    }

    /* renamed from: e */
    public final synchronized void mo32292e(fu2<R, AdT> fu2) {
        this.f32468d.add(fu2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo32293f() {
        synchronized (this) {
            this.f32470f = 1;
            m32707h();
        }
    }
}
