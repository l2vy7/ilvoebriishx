package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ru */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8134ru {

    /* renamed from: a */
    public static final C8134ru f38776a = new C8134ru();

    protected C8134ru() {
    }

    /* renamed from: a */
    public final zzbfd mo34626a(Context context, C4618oy oyVar) {
        List list;
        Context context2;
        zzbeu zzbeu;
        String str;
        C4618oy oyVar2 = oyVar;
        Date p = oyVar.mo18635p();
        long time = p != null ? p.getTime() : -1;
        String m = oyVar.mo18632m();
        int a = oyVar.mo18620a();
        Set<String> t = oyVar.mo18639t();
        if (!t.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(t));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean v = oyVar2.mo18641v(context2);
        Location d = oyVar.mo18623d();
        Bundle g = oyVar2.mo18626g(AdMobAdapter.class);
        AdInfo j = oyVar.mo18629j();
        if (j != null) {
            QueryInfo queryInfo = j.getQueryInfo();
            zzbeu = new zzbeu(oyVar.mo18629j().getAdString(), queryInfo != null ? queryInfo.zza().mo30580c() : "");
        } else {
            zzbeu = null;
        }
        String n = oyVar.mo18633n();
        SearchAdRequest k = oyVar.mo18630k();
        zzbkm zzbkm = k != null ? new zzbkm(k) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C8241uv.m38463b();
            str = vn0.m38853l(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean u = oyVar.mo18640u();
        RequestConfiguration c = C4632yy.m21230f().mo19013c();
        return new zzbfd(8, time, g, a, list, v, Math.max(oyVar.mo18622c(), c.getTagForChildDirectedTreatment()), false, n, zzbkm, d, m, oyVar.mo18627h(), oyVar.mo18625f(), Collections.unmodifiableList(new ArrayList(oyVar.mo18638s())), oyVar.mo18634o(), str, u, zzbeu, Math.max(-1, c.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(new String[]{null, c.getMaxAdContentRating()}), C8099qu.f38283b), oyVar.mo18636q(), oyVar.mo18621b(), oyVar.mo18631l());
    }
}
