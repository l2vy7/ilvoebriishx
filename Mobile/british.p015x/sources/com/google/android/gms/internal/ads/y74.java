package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class y74 {

    /* renamed from: a */
    private x74 f41727a;

    /* renamed from: b */
    private i84 f41728b;

    /* renamed from: a */
    public abstract z74 mo35588a(ix3[] ix3Arr, cm0 cm0, c54 c54, gi0 gi0) throws vk3;

    /* renamed from: b */
    public abstract void mo35589b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final i84 mo35884c() {
        i84 i84 = this.f41728b;
        Objects.requireNonNull(i84);
        return i84;
    }

    /* renamed from: d */
    public final void mo35885d(x74 x74, i84 i84) {
        this.f41727a = x74;
        this.f41728b = i84;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo35886e() {
        x74 x74 = this.f41727a;
        if (x74 != null) {
            x74.zzj();
        }
    }
}
