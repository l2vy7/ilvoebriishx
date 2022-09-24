package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a02 implements a12 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Pattern f29483f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final az1 f29484a;

    /* renamed from: b */
    private final nb3 f29485b;

    /* renamed from: c */
    private final bs2 f29486c;

    /* renamed from: d */
    private final ScheduledExecutorService f29487d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final i32 f29488e;

    a02(bs2 bs2, az1 az1, nb3 nb3, ScheduledExecutorService scheduledExecutorService, i32 i32) {
        this.f29486c = bs2;
        this.f29484a = az1;
        this.f29485b = nb3;
        this.f29487d = scheduledExecutorService;
        this.f29488e = i32;
    }

    /* renamed from: a */
    public final mb3<ur2> mo30278a(zzcdq zzcdq) {
        mb3<ur2> n = bb3.m30654n(this.f29484a.mo30583b(zzcdq), new xz1(this), this.f29485b);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37003V3)).booleanValue()) {
            n = bb3.m30647g(bb3.m30655o(n, (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37011W3)).intValue(), TimeUnit.SECONDS, this.f29487d), TimeoutException.class, yz1.f42246a, po0.f37727f);
        }
        bb3.m30658r(n, new zz1(this), po0.f37727f);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo30279c(InputStream inputStream) throws Exception {
        return bb3.m30649i(new ur2(new rr2(this.f29486c), tr2.m38007a(new InputStreamReader(inputStream))));
    }
}
