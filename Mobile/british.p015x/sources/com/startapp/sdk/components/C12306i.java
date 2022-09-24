package com.startapp.sdk.components;

import com.startapp.C12462z2;
import com.startapp.sdk.components.ComponentLocator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.startapp.sdk.components.i */
/* compiled from: Sta */
public class C12306i implements C12462z2<Integer> {

    /* renamed from: a */
    public final /* synthetic */ ThreadPoolExecutor f54697a;

    public C12306i(ComponentLocator.C5099m mVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f54697a = threadPoolExecutor;
    }

    public Object call() {
        return Integer.valueOf(this.f54697a.getMaximumPoolSize() - this.f54697a.getActiveCount());
    }
}
