package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class d43 extends i43 {

    /* renamed from: h */
    final /* synthetic */ e43 f30632h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d43(e43 e43, k43 k43, CharSequence charSequence) {
        super(k43, charSequence);
        this.f30632h = e43;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo18407c(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo18408e(int i) {
        m33 m33 = this.f30632h.f31223a;
        CharSequence charSequence = this.f20382d;
        int length = charSequence.length();
        b43.m20205b(i, length, "index");
        while (i < length) {
            if (m33.mo32820a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
