package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8365yc extends C7827jd {

    /* renamed from: i */
    private List<Long> f41781i = null;

    public C8365yc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", d8Var, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31153V(-1);
        this.f33848e.mo31149R(-1);
        if (this.f41781i == null) {
            this.f41781i = (List) this.f33849f.invoke((Object) null, new Object[]{this.f33845b.mo36029b()});
        }
        List<Long> list = this.f41781i;
        if (list != null && list.size() == 2) {
            synchronized (this.f33848e) {
                this.f33848e.mo31153V(this.f41781i.get(0).longValue());
                this.f33848e.mo31149R(this.f41781i.get(1).longValue());
            }
        }
    }
}
