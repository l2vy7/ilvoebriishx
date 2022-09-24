package com.facebook.internal;

import com.facebook.C3642m;
import com.facebook.internal.C3516l;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.facebook.internal.k */
/* compiled from: FeatureManager */
public final class C3511k {

    /* renamed from: com.facebook.internal.k$a */
    /* compiled from: FeatureManager */
    static class C3512a implements C3516l.C3519c {

        /* renamed from: a */
        final /* synthetic */ C3514c f13135a;

        /* renamed from: b */
        final /* synthetic */ C3515d f13136b;

        C3512a(C3514c cVar, C3515d dVar) {
            this.f13135a = cVar;
            this.f13136b = dVar;
        }

        /* renamed from: a */
        public void mo11991a() {
            this.f13135a.mo11842a(C3511k.m11758d(this.f13136b));
        }
    }

    /* renamed from: com.facebook.internal.k$b */
    /* compiled from: FeatureManager */
    static /* synthetic */ class C3513b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13137a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.internal.k$d[] r0 = com.facebook.internal.C3511k.C3515d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13137a = r0
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Instrument     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.CrashReport     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.ErrorReport     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.AAM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.PIIFiltering     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Core     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.AppEvents     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Login     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Share     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13137a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C3511k.C3515d.Places     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3511k.C3513b.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.k$c */
    /* compiled from: FeatureManager */
    public interface C3514c {
        /* renamed from: a */
        void mo11842a(boolean z);
    }

    /* renamed from: com.facebook.internal.k$d */
    /* compiled from: FeatureManager */
    public enum C3515d {
        Unknown(-1),
        Core(0),
        AppEvents(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        PIIFiltering(66562),
        EventDeactivation(66816),
        Instrument(131072),
        CrashReport(131328),
        ErrorReport(131584),
        Login(16777216),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: b */
        private final int f13155b;

        private C3515d(int i) {
            this.f13155b = i;
        }

        /* renamed from: a */
        static C3515d m11761a(int i) {
            for (C3515d dVar : values()) {
                if (dVar.f13155b == i) {
                    return dVar;
                }
            }
            return Unknown;
        }

        /* renamed from: d */
        public C3515d mo11992d() {
            int i = this.f13155b;
            if ((i & 255) > 0) {
                return m11761a(i & -256);
            }
            if ((65280 & i) > 0) {
                return m11761a(i & -65536);
            }
            if ((16711680 & i) > 0) {
                return m11761a(i & -16777216);
            }
            return m11761a(0);
        }

        public String toString() {
            switch (C3513b.f13137a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "ErrorReport";
                case 5:
                    return "AAM";
                case 6:
                    return "PrivacyProtection";
                case 7:
                    return "SuggestedEvents";
                case 8:
                    return "PIIFiltering";
                case 9:
                    return "EventDeactivation";
                case 10:
                    return "CoreKit";
                case 11:
                    return "AppEvents";
                case 12:
                    return "CodelessEvents";
                case 13:
                    return "LoginKit";
                case 14:
                    return "ShareKit";
                case 15:
                    return "PlacesKit";
                default:
                    return C3791bd.UNKNOWN_CONTENT_TYPE;
            }
        }
    }

    /* renamed from: a */
    public static void m11755a(C3515d dVar, C3514c cVar) {
        C3516l.m11772j(new C3512a(cVar, dVar));
    }

    /* renamed from: b */
    private static boolean m11756b(C3515d dVar) {
        switch (C3513b.f13137a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    private static boolean m11757c(C3515d dVar) {
        return C3516l.m11769g("FBSDKFeature" + dVar.toString(), C3642m.m12280f(), m11756b(dVar));
    }

    /* renamed from: d */
    public static boolean m11758d(C3515d dVar) {
        if (C3515d.Unknown == dVar) {
            return false;
        }
        if (C3515d.Core == dVar) {
            return true;
        }
        C3515d d = dVar.mo11992d();
        if (d == dVar) {
            return m11757c(dVar);
        }
        if (!m11758d(d) || !m11757c(dVar)) {
            return false;
        }
        return true;
    }
}
