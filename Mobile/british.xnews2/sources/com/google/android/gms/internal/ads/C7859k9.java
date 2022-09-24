package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.k9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7859k9 {
    /* renamed from: a */
    public static String m33875a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* renamed from: b */
    public static byte[] m33876b(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
