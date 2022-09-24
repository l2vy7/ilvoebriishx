package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yh2 implements zi2<zh2> {

    /* renamed from: a */
    private final nb3 f41866a;

    /* renamed from: b */
    private final ScheduledExecutorService f41867b;

    /* renamed from: c */
    private final ya2 f41868c;

    /* renamed from: d */
    private final Context f41869d;

    /* renamed from: e */
    private final bs2 f41870e;

    /* renamed from: f */
    private final ua2 f41871f;

    /* renamed from: g */
    private final it1 f41872g;

    /* renamed from: h */
    final String f41873h;

    public yh2(nb3 nb3, ScheduledExecutorService scheduledExecutorService, String str, ya2 ya2, Context context, bs2 bs2, ua2 ua2, it1 it1) {
        this.f41866a = nb3;
        this.f41867b = scheduledExecutorService;
        this.f41873h = str;
        this.f41868c = ya2;
        this.f41869d = context;
        this.f41870e = bs2;
        this.f41871f = ua2;
        this.f41872g = it1;
    }

    /* renamed from: a */
    public static /* synthetic */ mb3 m39933a(yh2 yh2) {
        String str;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37182p7)).booleanValue()) {
            str = yh2.f41870e.f30089f.toLowerCase(Locale.ROOT);
        } else {
            str = yh2.f41870e.f30089f;
        }
        Map<String, List<Bundle>> a = yh2.f41868c.mo35901a(yh2.f41873h, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((t63) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = yh2.f41870e.f30087d.f42952n;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(bb3.m30646f((sa3) bb3.m30655o(sa3.m37369D(bb3.m30652l(new wh2(yh2, str2, list, bundle), yh2.f41866a)), ((Long) C8311wv.m39277c().mo18570b(p00.f37068d1)).longValue(), TimeUnit.MILLISECONDS, yh2.f41867b), Throwable.class, new sh2(str2), yh2.f41866a));
        }
        for (Map.Entry value : ((t63) yh2.f41868c.mo35902b()).entrySet()) {
            cb2 cb2 = (cb2) value.getValue();
            String str3 = cb2.f30316a;
            Bundle bundle3 = yh2.f41870e.f30087d.f42952n;
            arrayList.add(bb3.m30646f((sa3) bb3.m30655o(sa3.m37369D(bb3.m30652l(new vh2(yh2, str3, cb2, bundle3 != null ? bundle3.getBundle(str3) : null), yh2.f41866a)), ((Long) C8311wv.m39277c().mo18570b(p00.f37068d1)).longValue(), TimeUnit.MILLISECONDS, yh2.f41867b), Throwable.class, new th2(str3), yh2.f41866a));
        }
        return bb3.m30643c(arrayList).mo30342a(new xh2(arrayList), yh2.f41866a);
    }

    /* renamed from: d */
    private final mb3<JSONObject> m39934d(String str, List<Bundle> list, Bundle bundle, boolean z, boolean z2) throws RemoteException {
        te0 te0;
        uo0 uo0 = new uo0();
        if (z2) {
            this.f41871f.mo18885b(str);
            te0 = this.f41871f.mo18884a(str);
        } else {
            try {
                te0 = this.f41872g.mo32763a(str);
            } catch (RemoteException e) {
                co0.zzh("Couldn't create RTB adapter : ", e);
                te0 = null;
            }
        }
        te0 te02 = te0;
        Objects.requireNonNull(te02);
        bb2 bb2 = new bb2(str, te02, uo0);
        if (z) {
            te02.mo31561u2(C10489b.m48195m6(this.f41869d), this.f41873h, bundle, list.get(0), this.f41870e.f30088e, bb2);
        } else {
            bb2.zzb();
        }
        return uo0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ mb3 mo35936b(String str, List list, Bundle bundle) throws Exception {
        return m39934d(str, list, bundle, true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo35937c(String str, cb2 cb2, Bundle bundle) throws Exception {
        return m39934d(str, Collections.singletonList(cb2.f30319d), bundle, cb2.f30317b, cb2.f30318c);
    }

    public final mb3<zh2> zzb() {
        return bb3.m30652l(new uh2(this), this.f41866a);
    }
}
