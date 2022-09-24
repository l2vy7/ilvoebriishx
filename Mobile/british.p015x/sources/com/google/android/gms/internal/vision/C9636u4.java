package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.u4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9636u4 implements C9504e4 {

    /* renamed from: a */
    private final C9522g4 f45893a;

    /* renamed from: b */
    private final String f45894b;

    /* renamed from: c */
    private final Object[] f45895c;

    /* renamed from: d */
    private final int f45896d;

    C9636u4(C9522g4 g4Var, String str, Object[] objArr) {
        this.f45893a = g4Var;
        this.f45894b = str;
        this.f45895c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f45896d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f45896d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo38378a() {
        return (this.f45896d & 1) == 1 ? C9603q4.f45838a : C9603q4.f45839b;
    }

    /* renamed from: b */
    public final C9522g4 mo38379b() {
        return this.f45893a;
    }

    /* renamed from: c */
    public final boolean mo38380c() {
        return (this.f45896d & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo38602d() {
        return this.f45894b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo38603e() {
        return this.f45895c;
    }
}
