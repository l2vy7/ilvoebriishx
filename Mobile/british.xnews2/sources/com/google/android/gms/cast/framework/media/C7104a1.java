package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.cast.framework.media.a1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7104a1 extends LruCache<Integer, MediaQueueItem> {

    /* renamed from: a */
    final /* synthetic */ C7105b f28669a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7104a1(C7105b bVar, int i) {
        super(i);
        this.f28669a = bVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj2;
        MediaQueueItem mediaQueueItem2 = (MediaQueueItem) obj3;
        if (z) {
            C4604n.m20098k(this.f28669a.f28676g);
            this.f28669a.f28676g.add(num);
        }
    }
}
