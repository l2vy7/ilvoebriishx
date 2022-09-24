package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public interface nb3 extends ExecutorService {
    /* renamed from: b */
    <T> mb3<T> mo33675b(Callable<T> callable);

    /* renamed from: c */
    mb3<?> mo33676c(Runnable runnable);
}
