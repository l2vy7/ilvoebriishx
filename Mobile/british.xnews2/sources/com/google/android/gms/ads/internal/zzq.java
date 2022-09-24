package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C7497ab;
import com.google.android.gms.internal.ads.co0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzq extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    final /* synthetic */ zzs f27966a;

    /* synthetic */ zzq(zzs zzs, zzp zzp) {
        this.f27966a = zzs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzs = this.f27966a;
            zzs.f19888i = (C7497ab) zzs.f19883d.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            co0.zzk("", e);
        } catch (TimeoutException e2) {
            co0.zzk("", e2);
        }
        return this.f27966a.zzp();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f27966a.f19886g != null && str != null) {
            this.f27966a.f19886g.loadUrl(str);
        }
    }
}
