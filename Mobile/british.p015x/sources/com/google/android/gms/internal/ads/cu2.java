package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cu2 implements xa3<Void> {

    /* renamed from: a */
    final /* synthetic */ fu2 f30494a;

    /* renamed from: b */
    final /* synthetic */ gu2 f30495b;

    cu2(gu2 gu2, fu2 fu2) {
        this.f30495b = gu2;
        this.f30494a = fu2;
    }

    public final void zza(Throwable th) {
        synchronized (this.f30495b) {
            this.f30495b.f32469e = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f30495b) {
            this.f30495b.f32469e = null;
            this.f30495b.f32468d.addFirst(this.f30494a);
            if (this.f30495b.f32470f == 1) {
                this.f30495b.m32707h();
            }
        }
    }
}
