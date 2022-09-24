package com.ironsource.mediationsdk.adunit.p279c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.C11483b;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.adunit.c.a */
public final class C11320a {

    /* renamed from: a */
    IronSource.AD_UNIT f50831a;

    /* renamed from: b */
    String f50832b;

    /* renamed from: c */
    List<NetworkSettings> f50833c;

    /* renamed from: d */
    C11483b f50834d;

    /* renamed from: e */
    int f50835e;

    /* renamed from: f */
    int f50836f;

    /* renamed from: g */
    int f50837g;

    /* renamed from: h */
    C11325a f50838h;

    /* renamed from: i */
    int f50839i;

    public C11320a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, C11483b bVar, int i, int i2, int i3, int i4, C11325a aVar) {
        this.f50831a = ad_unit;
        this.f50832b = str;
        this.f50833c = list;
        this.f50834d = bVar;
        this.f50835e = i;
        this.f50837g = i2;
        this.f50836f = i3;
        this.f50838h = aVar;
        this.f50839i = i4;
    }

    /* renamed from: a */
    public final NetworkSettings mo44114a(String str) {
        for (NetworkSettings next : this.f50833c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo44115a() {
        return this.f50834d.f51536e > 0;
    }
}
