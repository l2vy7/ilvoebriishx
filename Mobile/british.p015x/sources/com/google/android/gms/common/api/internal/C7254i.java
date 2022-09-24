package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C7254i {
    /* renamed from: b */
    void mo29868b(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: f */
    <T extends LifecycleCallback> T mo29869f(String str, Class<T> cls);

    /* renamed from: h */
    Activity mo29870h();

    void startActivityForResult(Intent intent, int i);
}
