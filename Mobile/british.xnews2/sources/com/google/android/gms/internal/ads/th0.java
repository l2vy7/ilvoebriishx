package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class th0 {
    /* access modifiers changed from: private */
    @Nonnull

    /* renamed from: a */
    public View f20844a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, WeakReference<View>> f20845b = new HashMap();

    /* renamed from: b */
    public final th0 mo18857b(View view) {
        this.f20844a = view;
        return this;
    }

    /* renamed from: c */
    public final th0 mo18858c(Map<String, View> map) {
        this.f20845b.clear();
        for (Map.Entry next : map.entrySet()) {
            View view = (View) next.getValue();
            if (view != null) {
                this.f20845b.put((String) next.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
