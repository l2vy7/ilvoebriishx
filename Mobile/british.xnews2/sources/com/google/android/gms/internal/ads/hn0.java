package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hn0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6483e f32761a;

    /* renamed from: b */
    private final rn0 f32762b;
    @GuardedBy("lock")

    /* renamed from: c */
    private final LinkedList<gn0> f32763c;

    /* renamed from: d */
    private final Object f32764d = new Object();

    /* renamed from: e */
    private final String f32765e;

    /* renamed from: f */
    private final String f32766f;
    @GuardedBy("lock")

    /* renamed from: g */
    private long f32767g = -1;
    @GuardedBy("lock")

    /* renamed from: h */
    private long f32768h = -1;
    @GuardedBy("lock")

    /* renamed from: i */
    private long f32769i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    private long f32770j = -1;
    @GuardedBy("lock")

    /* renamed from: k */
    private long f32771k = -1;

    hn0(C6483e eVar, rn0 rn0, String str, String str2) {
        this.f32761a = eVar;
        this.f32762b = rn0;
        this.f32765e = str;
        this.f32766f = str2;
        this.f32763c = new LinkedList<>();
    }

    /* renamed from: a */
    public final Bundle mo32401a() {
        Bundle bundle;
        synchronized (this.f32764d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f32765e);
            bundle.putString("slotid", this.f32766f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f32770j);
            bundle.putLong("tresponse", this.f32771k);
            bundle.putLong("timp", this.f32767g);
            bundle.putLong("tload", this.f32768h);
            bundle.putLong("pcc", this.f32769i);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f32763c.iterator();
            while (it.hasNext()) {
                arrayList.add(((gn0) it.next()).mo32169b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String mo32402c() {
        return this.f32765e;
    }

    /* renamed from: d */
    public final void mo32403d() {
        synchronized (this.f32764d) {
            if (this.f32771k != -1) {
                gn0 gn0 = new gn0(this);
                gn0.mo32171d();
                this.f32763c.add(gn0);
                this.f32769i++;
                this.f32762b.mo34567c();
                this.f32762b.mo34566b(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo32404e() {
        synchronized (this.f32764d) {
            if (this.f32771k != -1 && !this.f32763c.isEmpty()) {
                gn0 last = this.f32763c.getLast();
                if (last.mo32168a() == -1) {
                    last.mo32170c();
                    this.f32762b.mo34566b(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo32405f() {
        synchronized (this.f32764d) {
            if (this.f32771k != -1 && this.f32767g == -1) {
                this.f32767g = this.f32761a.elapsedRealtime();
                this.f32762b.mo34566b(this);
            }
            this.f32762b.mo34568d();
        }
    }

    /* renamed from: g */
    public final void mo32406g() {
        synchronized (this.f32764d) {
            this.f32762b.mo34569e();
        }
    }

    /* renamed from: h */
    public final void mo32407h(boolean z) {
        synchronized (this.f32764d) {
            if (this.f32771k != -1) {
                this.f32768h = this.f32761a.elapsedRealtime();
            }
        }
    }

    /* renamed from: i */
    public final void mo32408i() {
        synchronized (this.f32764d) {
            this.f32762b.mo34570f();
        }
    }

    /* renamed from: j */
    public final void mo32409j(zzbfd zzbfd) {
        synchronized (this.f32764d) {
            long elapsedRealtime = this.f32761a.elapsedRealtime();
            this.f32770j = elapsedRealtime;
            this.f32762b.mo34571g(zzbfd, elapsedRealtime);
        }
    }

    /* renamed from: k */
    public final void mo32410k(long j) {
        synchronized (this.f32764d) {
            this.f32771k = j;
            if (j != -1) {
                this.f32762b.mo34566b(this);
            }
        }
    }
}
