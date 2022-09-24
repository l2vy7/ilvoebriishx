package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.l6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7893l6 implements Comparator<byte[]> {
    C7893l6() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
