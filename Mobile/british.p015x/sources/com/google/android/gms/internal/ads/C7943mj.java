package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7943mj {

    /* renamed from: a */
    private final C8155sg[] f35529a;

    /* renamed from: b */
    private final C8190tg f35530b;

    /* renamed from: c */
    private C8155sg f35531c;

    public C7943mj(C8155sg[] sgVarArr, C8190tg tgVar) {
        this.f35529a = sgVarArr;
        this.f35530b = tgVar;
    }

    /* renamed from: a */
    public final void mo33550a() {
        if (this.f35531c != null) {
            this.f35531c = null;
        }
    }

    /* renamed from: b */
    public final C8155sg mo33551b(C8121rg rgVar, Uri uri) throws IOException, InterruptedException {
        C8155sg sgVar = this.f35531c;
        if (sgVar != null) {
            return sgVar;
        }
        C8155sg[] sgVarArr = this.f35529a;
        int length = sgVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C8155sg sgVar2 = sgVarArr[i];
            try {
                if (sgVar2.mo30928b(rgVar)) {
                    this.f35531c = sgVar2;
                    rgVar.mo34535e();
                    break;
                }
                rgVar.mo34535e();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                rgVar.mo34535e();
                throw th;
            }
        }
        C8155sg sgVar3 = this.f35531c;
        if (sgVar3 != null) {
            sgVar3.mo30929c(this.f35530b);
            return this.f35531c;
        }
        String k = C7836jm.m33649k(this.f35529a);
        StringBuilder sb = new StringBuilder(k.length() + 58);
        sb.append("None of the available extractors (");
        sb.append(k);
        sb.append(") could read the stream.");
        throw new C7907lk(sb.toString(), uri);
    }
}
