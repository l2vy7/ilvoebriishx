package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e62 implements a52<m41, te0, p62> {

    /* renamed from: a */
    private final Context f31238a;

    /* renamed from: b */
    private final k51 f31239b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f31240c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public cd0 f31241d;

    public e62(Context context, k51 k51) {
        this.f31238a = context;
        this.f31239b = k51;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        View view;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() || !ir2.f33473e0) {
            view = this.f31240c;
        } else {
            try {
                view = (View) C10489b.m48194f3(this.f31241d.zze());
                boolean zzf = this.f31241d.zzf();
                if (view == null) {
                    throw new gs2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) bb3.m30654n(bb3.m30649i(null), new b62(this, view, ir2), po0.f37726e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new gs2(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new gs2(e2);
            }
        }
        n41 a = this.f31239b.mo33031a(new e71(ur2, ir2, u42.f39762a), new u41(view, (xt0) null, new a62(u42), ir2.f33496v.get(0)));
        a.mo33628i().mo30383E0(view);
        ((p62) u42.f39764c).mo34075o6(a.mo32805f());
        return a.mo33627h();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<te0, p62> u42) throws gs2 {
        try {
            ((te0) u42.f39763b).mo31560j(ir2.f33460W);
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() || !ir2.f33473e0) {
                ((te0) u42.f39763b).mo31552L0(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f31238a), new d62(this, u42, (c62) null), (zc0) u42.f39764c, ur2.f39936a.f38765a.f30088e);
            } else {
                ((te0) u42.f39763b).mo31562z1(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f31238a), new d62(this, u42, (c62) null), (zc0) u42.f39764c, ur2.f39936a.f38765a.f30088e);
            }
        } catch (RemoteException e) {
            throw new gs2(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo31483c(View view, ir2 ir2, Object obj) throws Exception {
        return bb3.m30649i(d61.m31252a(this.f31238a, view, ir2));
    }
}
