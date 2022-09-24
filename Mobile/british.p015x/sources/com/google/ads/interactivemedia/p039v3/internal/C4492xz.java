package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xz */
final /* synthetic */ class C4492xz implements C4500yg {

    /* renamed from: a */
    static final C4500yg f19671a = new C4492xz();

    /* renamed from: b */
    static final C4500yg f19672b = new C4492xz((byte[]) null);

    /* renamed from: c */
    private final /* synthetic */ int f19673c = 0;

    private C4492xz() {
    }

    private C4492xz(byte[] bArr) {
    }

    /* renamed from: a */
    public final int mo16798a(Object obj) {
        if (this.f19673c != 0) {
            int i = C4501yh.f19680a;
            String str = ((C4486xt) obj).f19587a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return 1;
            }
            if (amm.f15298a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return 0;
            }
            return -1;
        }
        int i2 = C4501yh.f19680a;
        return ((C4486xt) obj).f19587a.startsWith("OMX.google") ? 1 : 0;
    }
}
