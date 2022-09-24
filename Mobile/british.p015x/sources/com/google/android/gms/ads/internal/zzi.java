package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.C8184ta;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8291wa;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.C8399za;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.d23;
import com.google.android.gms.internal.ads.k03;
import com.google.android.gms.internal.ads.n13;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.vn0;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzi implements Runnable, C8291wa {

    /* renamed from: b */
    private final List<Object[]> f27948b = new Vector();

    /* renamed from: c */
    private final AtomicReference<C8291wa> f27949c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C8291wa> f27950d = new AtomicReference<>();

    /* renamed from: e */
    protected boolean f27951e;

    /* renamed from: f */
    private final boolean f27952f;

    /* renamed from: g */
    private final boolean f27953g;

    /* renamed from: h */
    private final Executor f27954h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final k03 f27955i;

    /* renamed from: j */
    private Context f27956j;

    /* renamed from: k */
    private final Context f27957k;

    /* renamed from: l */
    private zzcjf f27958l;

    /* renamed from: m */
    private final zzcjf f27959m;

    /* renamed from: n */
    private final boolean f27960n;

    /* renamed from: o */
    final CountDownLatch f27961o = new CountDownLatch(1);

    /* renamed from: p */
    private int f27962p;

    public zzi(Context context, zzcjf zzcjf) {
        this.f27956j = context;
        this.f27957k = context;
        this.f27958l = zzcjf;
        this.f27959m = zzcjf;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f27954h = newCachedThreadPool;
        boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36865E1)).booleanValue();
        this.f27960n = booleanValue;
        this.f27955i = k03.m33808a(context, newCachedThreadPool, booleanValue);
        this.f27952f = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36833A1)).booleanValue();
        this.f27953g = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36873F1)).booleanValue();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36857D1)).booleanValue()) {
            this.f27962p = 2;
        } else {
            this.f27962p = 1;
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37078e2)).booleanValue()) {
            this.f27951e = mo28645c();
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37033Z1)).booleanValue()) {
            po0.f37722a.execute(this);
            return;
        }
        C8241uv.m38463b();
        if (vn0.m38857p()) {
            po0.f37722a.execute(this);
        } else {
            run();
        }
    }

    /* renamed from: e */
    private final C8291wa m28858e() {
        if (mo28646d() == 2) {
            return this.f27950d.get();
        }
        return this.f27949c.get();
    }

    /* renamed from: f */
    private final void m28859f() {
        C8291wa e = m28858e();
        if (!this.f27948b.isEmpty() && e != null) {
            for (Object[] next : this.f27948b) {
                int length = next.length;
                if (length == 1) {
                    e.zzk((MotionEvent) next[0]);
                } else if (length == 3) {
                    e.zzl(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f27948b.clear();
        }
    }

    /* renamed from: g */
    private final void m28860g(boolean z) {
        this.f27949c.set(C8399za.m40250p(this.f27958l.f43036b, m28861h(this.f27956j), z, this.f27962p));
    }

    /* renamed from: h */
    private static final Context m28861h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28644b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C8184ta.m37736a(this.f27959m.f43036b, m28861h(this.f27957k), z, this.f27960n).mo34878h();
        } catch (NullPointerException e) {
            this.f27955i.mo33005c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo28645c() {
        Context context = this.f27956j;
        k03 k03 = this.f27955i;
        zzh zzh = new zzh(this);
        return new d23(this.f27956j, n13.m35018b(context, k03), zzh, ((Boolean) C8311wv.m39277c().mo18570b(p00.f36841B1)).booleanValue()).mo31091d(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo28646d() {
        if (!this.f27952f || this.f27951e) {
            return this.f27962p;
        }
        return 1;
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37078e2)).booleanValue()) {
                this.f27951e = mo28645c();
            }
            boolean z2 = this.f27958l.f43039e;
            z = false;
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36912K0)).booleanValue() && z2) {
                z = true;
            }
            if (mo28646d() == 1) {
                m28860g(z);
                if (this.f27962p == 2) {
                    this.f27954h.execute(new zzg(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                C8184ta a = C8184ta.m37736a(this.f27958l.f43036b, m28861h(this.f27956j), z, this.f27960n);
                this.f27950d.set(a);
                if (this.f27953g && !a.mo34879j()) {
                    this.f27962p = 1;
                    m28860g(z);
                }
            }
        } catch (NullPointerException e) {
            this.f27962p = 1;
            m28860g(z);
            this.f27955i.mo33005c(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.f27961o.countDown();
            this.f27956j = null;
            this.f27958l = null;
            throw th;
        }
        this.f27961o.countDown();
        this.f27956j = null;
        this.f27958l = null;
    }

    public final boolean zzd() {
        try {
            this.f27961o.await();
            return true;
        } catch (InterruptedException e) {
            co0.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        C8291wa e = m28858e();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37101g7)).booleanValue()) {
            zzt.zzp();
            zzt.zzN(view, 4, (MotionEvent) null);
        }
        if (e == null) {
            return "";
        }
        m28859f();
        return e.zzf(m28861h(context), str, view, activity);
    }

    public final String zzg(Context context) {
        C8291wa e;
        if (!zzd() || (e = m28858e()) == null) {
            return "";
        }
        m28859f();
        return e.zzg(m28861h(context));
    }

    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37092f7)).booleanValue()) {
            C8291wa e = m28858e();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37101g7)).booleanValue()) {
                zzt.zzp();
                zzt.zzN(view, 2, (MotionEvent) null);
            }
            return e != null ? e.zzh(context, view, (Activity) null) : "";
        } else if (!zzd()) {
            return "";
        } else {
            C8291wa e2 = m28858e();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37101g7)).booleanValue()) {
                zzt.zzp();
                zzt.zzN(view, 2, (MotionEvent) null);
            }
            if (e2 != null) {
                return e2.zzh(context, view, (Activity) null);
            }
            return "";
        }
    }

    public final void zzk(MotionEvent motionEvent) {
        C8291wa e = m28858e();
        if (e != null) {
            m28859f();
            e.zzk(motionEvent);
            return;
        }
        this.f27948b.add(new Object[]{motionEvent});
    }

    public final void zzl(int i, int i2, int i3) {
        C8291wa e = m28858e();
        if (e != null) {
            m28859f();
            e.zzl(i, i2, i3);
            return;
        }
        this.f27948b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void zzn(View view) {
        C8291wa e = m28858e();
        if (e != null) {
            e.zzn(view);
        }
    }
}
