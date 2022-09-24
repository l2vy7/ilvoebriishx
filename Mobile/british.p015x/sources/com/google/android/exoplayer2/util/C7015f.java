package com.google.android.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.exoplayer2.util.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7015f implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f27677a;

    public /* synthetic */ C7015f(String str) {
        this.f27677a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.lambda$newSingleThreadExecutor$0(this.f27677a, runnable);
    }
}
