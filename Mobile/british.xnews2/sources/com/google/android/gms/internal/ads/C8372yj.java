package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8372yj implements C8229uj {

    /* renamed from: b */
    private final C8229uj[] f41894b;

    /* renamed from: c */
    private final ArrayList<C8229uj> f41895c;

    /* renamed from: d */
    private final C8403ze f41896d = new C8403ze();

    /* renamed from: e */
    private C8193tj f41897e;

    /* renamed from: f */
    private C7501af f41898f;

    /* renamed from: g */
    private int f41899g = -1;

    /* renamed from: h */
    private C8336xj f41900h;

    public C8372yj(C8229uj... ujVarArr) {
        this.f41894b = ujVarArr;
        this.f41895c = new ArrayList<>(Arrays.asList(ujVarArr));
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m39941c(C8372yj yjVar, int i, C7501af afVar, Object obj) {
        C8336xj xjVar;
        if (yjVar.f41900h == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                afVar.mo30369g(i2, yjVar.f41896d, false);
            }
            int i3 = yjVar.f41899g;
            if (i3 == -1) {
                yjVar.f41899g = 1;
            } else if (i3 != 1) {
                xjVar = new C8336xj(1);
                yjVar.f41900h = xjVar;
            }
            xjVar = null;
            yjVar.f41900h = xjVar;
        }
        if (yjVar.f41900h == null) {
            yjVar.f41895c.remove(yjVar.f41894b[i]);
            if (i == 0) {
                yjVar.f41898f = afVar;
            }
            if (yjVar.f41895c.isEmpty()) {
                yjVar.f41897e.mo33873c(yjVar.f41898f, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo34344a(C8158sj sjVar) {
        C8266vj vjVar = (C8266vj) sjVar;
        int i = 0;
        while (true) {
            C8229uj[] ujVarArr = this.f41894b;
            if (i < ujVarArr.length) {
                ujVarArr[i].mo34344a(vjVar.f40435b[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final C8158sj mo34345b(int i, C7724gl glVar) {
        int length = this.f41894b.length;
        C8158sj[] sjVarArr = new C8158sj[length];
        for (int i2 = 0; i2 < length; i2++) {
            sjVarArr[i2] = this.f41894b[i2].mo34345b(i, glVar);
        }
        return new C8266vj(sjVarArr);
    }

    /* renamed from: d */
    public final void mo34346d(C7680fe feVar, boolean z, C8193tj tjVar) {
        this.f41897e = tjVar;
        int i = 0;
        while (true) {
            C8229uj[] ujVarArr = this.f41894b;
            if (i < ujVarArr.length) {
                ujVarArr[i].mo34346d(feVar, false, new C8300wj(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void zza() throws IOException {
        C8336xj xjVar = this.f41900h;
        if (xjVar == null) {
            for (C8229uj zza : this.f41894b) {
                zza.zza();
            }
            return;
        }
        throw xjVar;
    }

    public final void zzd() {
        for (C8229uj zzd : this.f41894b) {
            zzd.zzd();
        }
    }
}
