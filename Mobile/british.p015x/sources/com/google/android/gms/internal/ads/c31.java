package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c31 implements uu3<Set<yh1<zzo>>> {

    /* renamed from: a */
    private final iv3<u21> f30230a;

    /* renamed from: b */
    private final iv3<Executor> f30231b;

    /* renamed from: c */
    private final iv3<JSONObject> f30232c;

    public c31(iv3<u21> iv3, iv3<Executor> iv32, iv3<JSONObject> iv33) {
        this.f30230a = iv3;
        this.f30231b = iv32;
        this.f30232c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        u21 zzb = this.f30230a.zzb();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        if (this.f30232c.zzb() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new yh1(zzb, nb3));
        }
        cv3.m31156b(set);
        return set;
    }
}
