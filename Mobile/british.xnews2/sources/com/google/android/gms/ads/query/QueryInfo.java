package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.C7521az;
import com.google.android.gms.internal.ads.qh0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class QueryInfo {

    /* renamed from: a */
    private final C7521az f28127a;

    public QueryInfo(C7521az azVar) {
        this.f28127a = azVar;
    }

    public static void generate(@RecentlyNonNull Context context, @RecentlyNonNull AdFormat adFormat, AdRequest adRequest, @RecentlyNonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        new qh0(context, adFormat, adRequest == null ? null : adRequest.zza()).mo34343b(queryInfoGenerationCallback);
    }

    @RecentlyNonNull
    public String getQuery() {
        return this.f28127a.mo30579b();
    }

    @RecentlyNonNull
    public Bundle getQueryBundle() {
        return this.f28127a.mo30578a();
    }

    @RecentlyNonNull
    public String getRequestId() {
        return this.f28127a.mo30581d();
    }

    public final C7521az zza() {
        return this.f28127a;
    }
}
