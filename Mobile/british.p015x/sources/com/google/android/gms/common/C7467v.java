package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p252t4.C11019i;

/* renamed from: com.google.android.gms.common.v */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7467v extends C4605w {

    /* renamed from: e */
    private final Callable<String> f29448e;

    /* synthetic */ C7467v(Callable callable, C11019i iVar) {
        super(false, (String) null, (Throwable) null);
        this.f29448e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo18008a() {
        try {
            return this.f29448e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
