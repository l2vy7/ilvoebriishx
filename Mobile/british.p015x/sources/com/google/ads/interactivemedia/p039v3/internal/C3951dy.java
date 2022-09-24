package com.google.ads.interactivemedia.p039v3.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dy */
/* compiled from: IMASDK */
final class C3951dy extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    final /* synthetic */ String f16956a;

    /* renamed from: b */
    final /* synthetic */ C3958ee f16957b;

    C3951dy(C3958ee eeVar, String str) {
        this.f16957b = eeVar;
        this.f16956a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f16956a));
        if (!(this.f16957b.f16970g instanceof Activity)) {
            intent.setFlags(268435456);
        }
        this.f16957b.f16970g.startActivity(intent);
        return null;
    }
}
