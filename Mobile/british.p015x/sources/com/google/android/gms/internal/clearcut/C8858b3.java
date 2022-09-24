package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.b3 */
final class C8858b3 {

    /* renamed from: a */
    private final String f44400a;

    /* renamed from: b */
    private int f44401b = 0;

    C8858b3(String str) {
        this.f44400a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36838a() {
        return this.f44401b < this.f44400a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo36839b() {
        String str = this.f44400a;
        int i = this.f44401b;
        this.f44401b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f44400a;
            int i3 = this.f44401b;
            this.f44401b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
