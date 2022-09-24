package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9928u8 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f46792b;

    /* renamed from: c */
    final /* synthetic */ String f46793c = "_err";

    /* renamed from: d */
    final /* synthetic */ Bundle f46794d;

    /* renamed from: e */
    final /* synthetic */ C9938v8 f46795e;

    C9928u8(C9938v8 v8Var, String str, String str2, Bundle bundle) {
        this.f46795e = v8Var;
        this.f46792b = str;
        this.f46794d = bundle;
    }

    public final void run() {
        this.f46795e.f46818a.mo39294h((zzau) C4604n.m20098k(this.f46795e.f46818a.mo39293g0().mo19333w0(this.f46792b, this.f46793c, this.f46794d, TtmlNode.TEXT_EMPHASIS_AUTO, this.f46795e.f46818a.mo19274f().currentTimeMillis(), false, true)), this.f46792b);
    }
}
