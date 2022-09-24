package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.qj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8088qj implements C8229uj, C8193tj {

    /* renamed from: b */
    private final Uri f38144b;

    /* renamed from: c */
    private final C7578cl f38145c;

    /* renamed from: d */
    private final C8226ug f38146d;

    /* renamed from: e */
    private final int f38147e;

    /* renamed from: f */
    private final Handler f38148f;

    /* renamed from: g */
    private final C8052pj f38149g;

    /* renamed from: h */
    private final C8367ye f38150h = new C8367ye();

    /* renamed from: i */
    private final int f38151i;

    /* renamed from: j */
    private C8193tj f38152j;

    /* renamed from: k */
    private C7501af f38153k;

    /* renamed from: l */
    private boolean f38154l;

    public C8088qj(Uri uri, C7578cl clVar, C8226ug ugVar, int i, Handler handler, C8052pj pjVar, String str, int i2) {
        this.f38144b = uri;
        this.f38145c = clVar;
        this.f38146d = ugVar;
        this.f38147e = i;
        this.f38148f = handler;
        this.f38149g = pjVar;
        this.f38151i = i2;
    }

    /* renamed from: a */
    public final void mo34344a(C8158sj sjVar) {
        ((C8017oj) sjVar).mo33905A();
    }

    /* renamed from: b */
    public final C8158sj mo34345b(int i, C7724gl glVar) {
        C8195tl.m37898c(i == 0);
        return new C8017oj(this.f38144b, this.f38145c.zza(), this.f38146d.zza(), this.f38147e, this.f38148f, this.f38149g, this, glVar, (String) null, this.f38151i, (byte[]) null);
    }

    /* renamed from: c */
    public final void mo33873c(C7501af afVar, Object obj) {
        C8367ye yeVar = this.f38150h;
        boolean z = false;
        afVar.mo30366d(0, yeVar, false);
        if (yeVar.f41795c != C6540C.TIME_UNSET) {
            z = true;
        }
        if (!this.f38154l || z) {
            this.f38153k = afVar;
            this.f38154l = z;
            this.f38152j.mo33873c(afVar, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo34346d(C7680fe feVar, boolean z, C8193tj tjVar) {
        this.f38152j = tjVar;
        C7798ik ikVar = new C7798ik(C6540C.TIME_UNSET, false);
        this.f38153k = ikVar;
        tjVar.mo33873c(ikVar, (Object) null);
    }

    public final void zza() throws IOException {
    }

    public final void zzd() {
        this.f38152j = null;
    }
}
