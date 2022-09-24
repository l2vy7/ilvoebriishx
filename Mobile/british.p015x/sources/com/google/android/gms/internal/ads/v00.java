package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v00 {
    /* renamed from: a */
    public static final void m21082a(u00 u00, s00 s00) {
        if (s00.mo34643a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(s00.mo34644b())) {
            u00.mo18867d(s00.mo34643a(), s00.mo34644b(), s00.mo34645c(), s00.mo34646d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
