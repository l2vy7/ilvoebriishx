package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.C7213i;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ms0 implements C7213i {

    /* renamed from: b */
    protected final Context f20548b;

    /* renamed from: c */
    protected final String f20549c;

    /* renamed from: d */
    protected final WeakReference<mq0> f20550d;

    public ms0(mq0 mq0) {
        Context context = mq0.getContext();
        this.f20548b = context;
        this.f20549c = zzt.zzp().zzd(context, mq0.zzp().f43036b);
        this.f20550d = new WeakReference<>(mq0);
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ void m20699f(ms0 ms0, String str, Map map) {
        mq0 mq0 = (mq0) ms0.f20550d.get();
        if (mq0 != null) {
            mq0.mo18321Z("onPrecacheEvent", map);
        }
    }

    /* renamed from: g */
    public abstract void mo18556g();

    /* renamed from: i */
    public final void mo18557i(String str, String str2, String str3, String str4) {
        vn0.f40472b.post(new ls0(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18558j(String str, String str2, int i) {
        vn0.f40472b.post(new js0(this, str, str2, i));
    }

    /* renamed from: k */
    public final void mo18559k(String str, String str2, long j) {
        vn0.f40472b.post(new ks0(this, str, str2, j));
    }

    /* renamed from: l */
    public final void mo18560l(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        vn0.f40472b.post(new is0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* renamed from: m */
    public final void mo18561m(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = vn0.f40472b;
        hs0 hs0 = r0;
        hs0 hs02 = new hs0(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(hs0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18562n(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18563o(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18564p(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo18565q(int i) {
    }

    public void release() {
    }

    /* renamed from: s */
    public abstract boolean mo18567s(String str);

    /* renamed from: t */
    public boolean mo18568t(String str, String[] strArr) {
        return mo18567s(str);
    }

    /* renamed from: u */
    public boolean mo18569u(String str, String[] strArr, ds0 ds0) {
        return mo18567s(str);
    }
}
