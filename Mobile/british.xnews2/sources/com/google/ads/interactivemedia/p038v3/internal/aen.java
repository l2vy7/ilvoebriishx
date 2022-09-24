package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.C6540C;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aen */
/* compiled from: IMASDK */
public final class aen implements Handler.Callback {

    /* renamed from: a */
    private final ael f14421a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4511yr f14422b = new C4511yr();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f14423c = amm.m14242l(this);

    /* renamed from: d */
    private final TreeMap<Long, Long> f14424d = new TreeMap<>();

    /* renamed from: e */
    private aep f14425e;

    /* renamed from: f */
    private long f14426f;

    /* renamed from: g */
    private boolean f14427g;

    /* renamed from: h */
    private boolean f14428h;

    /* renamed from: i */
    private boolean f14429i;

    /* renamed from: j */
    private final ajl f14430j;

    public aen(aep aep, ael ael, ajl ajl) {
        this.f14425e = aep;
        this.f14421a = ael;
        this.f14430j = ajl;
    }

    /* renamed from: i */
    private final void m13353i() {
        if (this.f14427g) {
            this.f14428h = true;
            this.f14427g = false;
            ((adw) this.f14421a).f14339a.mo13527y();
        }
    }

    /* renamed from: a */
    public final void mo13557a(aep aep) {
        this.f14428h = false;
        this.f14426f = C6540C.TIME_UNSET;
        this.f14425e = aep;
        Iterator<Map.Entry<Long, Long>> it = this.f14424d.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f14425e.f14444h) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final aem mo13558b() {
        return new aem(this, this.f14430j);
    }

    /* renamed from: c */
    public final void mo13559c() {
        this.f14429i = true;
        this.f14423c.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo13560d(long j) {
        aep aep = this.f14425e;
        boolean z = false;
        if (!aep.f14440d) {
            return false;
        }
        if (this.f14428h) {
            return true;
        }
        Map.Entry<Long, Long> ceilingEntry = this.f14424d.ceilingEntry(Long.valueOf(aep.f14444h));
        if (ceilingEntry != null && ceilingEntry.getValue().longValue() < j) {
            long longValue = ceilingEntry.getKey().longValue();
            this.f14426f = longValue;
            ((adw) this.f14421a).f14339a.mo13528z(longValue);
            z = true;
        }
        if (z) {
            m13353i();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo13561e(boolean z) {
        if (!this.f14425e.f14440d) {
            return false;
        }
        if (this.f14428h) {
            return true;
        }
        if (!z) {
            return false;
        }
        m13353i();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13562h() {
        this.f14427g = true;
    }

    public final boolean handleMessage(Message message) {
        if (this.f14429i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        aek aek = (aek) message.obj;
        long j = aek.f14414a;
        long j2 = aek.f14415b;
        TreeMap<Long, Long> treeMap = this.f14424d;
        Long valueOf = Long.valueOf(j2);
        Long l = treeMap.get(valueOf);
        if (l == null) {
            this.f14424d.put(valueOf, Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f14424d.put(valueOf, Long.valueOf(j));
        }
        return true;
    }
}
