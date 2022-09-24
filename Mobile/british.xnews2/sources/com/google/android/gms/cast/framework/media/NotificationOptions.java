package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class NotificationOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<NotificationOptions> CREATOR = new C7119h();
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final List<String> f28615H = Arrays.asList(new String[]{MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING});
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final int[] f28616I = {0, 1};

    /* renamed from: A */
    private final int f28617A;

    /* renamed from: B */
    private final int f28618B;

    /* renamed from: C */
    private final int f28619C;

    /* renamed from: D */
    private final int f28620D;

    /* renamed from: E */
    private final int f28621E;

    /* renamed from: F */
    private final int f28622F;

    /* renamed from: G */
    private final C7134o0 f28623G;

    /* renamed from: b */
    private final List<String> f28624b;

    /* renamed from: c */
    private final int[] f28625c;

    /* renamed from: d */
    private final long f28626d;

    /* renamed from: e */
    private final String f28627e;

    /* renamed from: f */
    private final int f28628f;

    /* renamed from: g */
    private final int f28629g;

    /* renamed from: h */
    private final int f28630h;

    /* renamed from: i */
    private final int f28631i;

    /* renamed from: j */
    private final int f28632j;

    /* renamed from: k */
    private final int f28633k;

    /* renamed from: l */
    private final int f28634l;

    /* renamed from: m */
    private final int f28635m;

    /* renamed from: n */
    private final int f28636n;

    /* renamed from: o */
    private final int f28637o;

    /* renamed from: p */
    private final int f28638p;

    /* renamed from: q */
    private final int f28639q;

    /* renamed from: r */
    private final int f28640r;

    /* renamed from: s */
    private final int f28641s;

    /* renamed from: t */
    private final int f28642t;

    /* renamed from: u */
    private final int f28643u;

    /* renamed from: v */
    private final int f28644v;

    /* renamed from: w */
    private final int f28645w;

    /* renamed from: x */
    private final int f28646x;

    /* renamed from: y */
    private final int f28647y;

    /* renamed from: z */
    private final int f28648z;

    /* renamed from: com.google.android.gms.cast.framework.media.NotificationOptions$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    public static final class C7101a {

        /* renamed from: a */
        private String f28649a;

        /* renamed from: b */
        private List<String> f28650b = NotificationOptions.f28615H;

        /* renamed from: c */
        private C7112d f28651c;

        /* renamed from: d */
        private int[] f28652d = NotificationOptions.f28616I;

        /* renamed from: e */
        private int f28653e = m29316d("smallIconDrawableResId");

        /* renamed from: f */
        private int f28654f = m29316d("stopLiveStreamDrawableResId");

        /* renamed from: g */
        private int f28655g = m29316d("pauseDrawableResId");

        /* renamed from: h */
        private int f28656h = m29316d("playDrawableResId");

        /* renamed from: i */
        private int f28657i = m29316d("skipNextDrawableResId");

        /* renamed from: j */
        private int f28658j = m29316d("skipPrevDrawableResId");

        /* renamed from: k */
        private int f28659k = m29316d("forwardDrawableResId");

        /* renamed from: l */
        private int f28660l = m29316d("forward10DrawableResId");

        /* renamed from: m */
        private int f28661m = m29316d("forward30DrawableResId");

        /* renamed from: n */
        private int f28662n = m29316d("rewindDrawableResId");

        /* renamed from: o */
        private int f28663o = m29316d("rewind10DrawableResId");

        /* renamed from: p */
        private int f28664p = m29316d("rewind30DrawableResId");

        /* renamed from: q */
        private int f28665q = m29316d("disconnectDrawableResId");

        /* renamed from: r */
        private long f28666r = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;

        /* renamed from: d */
        private static int m29316d(String str) {
            Class<ResourceProvider> cls = ResourceProvider.class;
            try {
                int i = ResourceProvider.f28714b;
                Integer num = (Integer) cls.getMethod("findResourceByName", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* JADX WARNING: type inference failed for: r1v22, types: [com.google.android.gms.cast.framework.media.o0] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.cast.framework.media.NotificationOptions mo29521a() {
            /*
                r37 = this;
                r0 = r37
                com.google.android.gms.cast.framework.media.d r1 = r0.f28651c
                if (r1 != 0) goto L_0x0008
                r1 = 0
                goto L_0x000c
            L_0x0008:
                com.google.android.gms.cast.framework.media.o0 r1 = r1.mo29545a()
            L_0x000c:
                r35 = r1
                com.google.android.gms.cast.framework.media.NotificationOptions r1 = new com.google.android.gms.cast.framework.media.NotificationOptions
                r2 = r1
                java.util.List<java.lang.String> r3 = r0.f28650b
                int[] r4 = r0.f28652d
                long r5 = r0.f28666r
                java.lang.String r7 = r0.f28649a
                int r8 = r0.f28653e
                int r9 = r0.f28654f
                int r10 = r0.f28655g
                int r11 = r0.f28656h
                int r12 = r0.f28657i
                int r13 = r0.f28658j
                int r14 = r0.f28659k
                int r15 = r0.f28660l
                r36 = r1
                int r1 = r0.f28661m
                r16 = r1
                int r1 = r0.f28662n
                r17 = r1
                int r1 = r0.f28663o
                r18 = r1
                int r1 = r0.f28664p
                r19 = r1
                int r1 = r0.f28665q
                r20 = r1
                java.lang.String r1 = "notificationImageSizeDimenResId"
                int r21 = m29316d(r1)
                java.lang.String r1 = "castingToDeviceStringResId"
                int r22 = m29316d(r1)
                java.lang.String r1 = "stopLiveStreamStringResId"
                int r23 = m29316d(r1)
                java.lang.String r1 = "pauseStringResId"
                int r24 = m29316d(r1)
                java.lang.String r1 = "playStringResId"
                int r25 = m29316d(r1)
                java.lang.String r1 = "skipNextStringResId"
                int r26 = m29316d(r1)
                java.lang.String r1 = "skipPrevStringResId"
                int r27 = m29316d(r1)
                java.lang.String r1 = "forwardStringResId"
                int r28 = m29316d(r1)
                java.lang.String r1 = "forward10StringResId"
                int r29 = m29316d(r1)
                java.lang.String r1 = "forward30StringResId"
                int r30 = m29316d(r1)
                java.lang.String r1 = "rewindStringResId"
                int r31 = m29316d(r1)
                java.lang.String r1 = "rewind10StringResId"
                int r32 = m29316d(r1)
                java.lang.String r1 = "rewind30StringResId"
                int r33 = m29316d(r1)
                java.lang.String r1 = "disconnectStringResId"
                int r34 = m29316d(r1)
                r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
                return r36
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.NotificationOptions.C7101a.mo29521a():com.google.android.gms.cast.framework.media.NotificationOptions");
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7101a mo29522b(int i) {
            this.f28653e = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7101a mo29523c(@RecentlyNonNull String str) {
            this.f28649a = str;
            return this;
        }
    }

    public NotificationOptions(@RecentlyNonNull List<String> list, @RecentlyNonNull int[] iArr, long j, @RecentlyNonNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        C7134o0 o0Var;
        IBinder iBinder2 = iBinder;
        List<String> list2 = list;
        this.f28624b = new ArrayList(list);
        this.f28625c = Arrays.copyOf(iArr, iArr.length);
        this.f28626d = j;
        this.f28627e = str;
        this.f28628f = i;
        this.f28629g = i2;
        this.f28630h = i3;
        this.f28631i = i4;
        this.f28632j = i5;
        this.f28633k = i6;
        this.f28634l = i7;
        this.f28635m = i8;
        this.f28636n = i9;
        this.f28637o = i10;
        this.f28638p = i11;
        this.f28639q = i12;
        this.f28640r = i13;
        this.f28641s = i14;
        this.f28642t = i15;
        this.f28643u = i16;
        this.f28644v = i17;
        this.f28645w = i18;
        this.f28646x = i19;
        this.f28647y = i20;
        this.f28648z = i21;
        this.f28617A = i22;
        this.f28618B = i23;
        this.f28619C = i24;
        this.f28620D = i25;
        this.f28621E = i26;
        this.f28622F = i27;
        if (iBinder2 == null) {
            this.f28623G = null;
            return;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof C7134o0) {
            o0Var = (C7134o0) queryLocalInterface;
        } else {
            o0Var = new C7132n0(iBinder2);
        }
        this.f28623G = o0Var;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public List<String> mo29488C0() {
        return this.f28624b;
    }

    /* renamed from: D0 */
    public int mo29489D0() {
        return this.f28642t;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public int[] mo29490E0() {
        int[] iArr = this.f28625c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: F0 */
    public int mo29491F0() {
        return this.f28640r;
    }

    /* renamed from: G0 */
    public int mo29492G0() {
        return this.f28635m;
    }

    /* renamed from: H0 */
    public int mo29493H0() {
        return this.f28636n;
    }

    /* renamed from: I0 */
    public int mo29494I0() {
        return this.f28634l;
    }

    /* renamed from: J0 */
    public int mo29495J0() {
        return this.f28630h;
    }

    /* renamed from: K0 */
    public int mo29496K0() {
        return this.f28631i;
    }

    /* renamed from: L0 */
    public int mo29497L0() {
        return this.f28638p;
    }

    /* renamed from: M0 */
    public int mo29498M0() {
        return this.f28639q;
    }

    /* renamed from: N0 */
    public int mo29499N0() {
        return this.f28637o;
    }

    /* renamed from: O0 */
    public int mo29500O0() {
        return this.f28632j;
    }

    /* renamed from: P0 */
    public int mo29501P0() {
        return this.f28633k;
    }

    /* renamed from: Q0 */
    public long mo29502Q0() {
        return this.f28626d;
    }

    /* renamed from: R0 */
    public int mo29503R0() {
        return this.f28628f;
    }

    /* renamed from: S0 */
    public int mo29504S0() {
        return this.f28629g;
    }

    /* renamed from: T0 */
    public int mo29505T0() {
        return this.f28643u;
    }

    @RecentlyNonNull
    /* renamed from: U0 */
    public String mo29506U0() {
        return this.f28627e;
    }

    /* renamed from: V0 */
    public final int mo29507V0() {
        return this.f28644v;
    }

    /* renamed from: W0 */
    public final int mo29508W0() {
        return this.f28646x;
    }

    /* renamed from: X0 */
    public final int mo29509X0() {
        return this.f28647y;
    }

    /* renamed from: Y0 */
    public final int mo29510Y0() {
        return this.f28648z;
    }

    /* renamed from: Z0 */
    public final int mo29511Z0() {
        return this.f28617A;
    }

    /* renamed from: a1 */
    public final int mo29512a1() {
        return this.f28618B;
    }

    /* renamed from: b1 */
    public final int mo29513b1() {
        return this.f28619C;
    }

    /* renamed from: c1 */
    public final int mo29514c1() {
        return this.f28620D;
    }

    /* renamed from: d1 */
    public final int mo29515d1() {
        return this.f28621E;
    }

    /* renamed from: e1 */
    public final int mo29516e1() {
        return this.f28622F;
    }

    /* renamed from: f1 */
    public final C7134o0 mo29517f1() {
        return this.f28623G;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C11058b.m49515a(parcel);
        C11058b.m49539y(parcel, 2, mo29488C0(), false);
        C11058b.m49528n(parcel, 3, mo29490E0(), false);
        C11058b.m49531q(parcel, 4, mo29502Q0());
        C11058b.m49537w(parcel, 5, mo29506U0(), false);
        C11058b.m49527m(parcel, 6, mo29503R0());
        C11058b.m49527m(parcel, 7, mo29504S0());
        C11058b.m49527m(parcel, 8, mo29495J0());
        C11058b.m49527m(parcel, 9, mo29496K0());
        C11058b.m49527m(parcel, 10, mo29500O0());
        C11058b.m49527m(parcel, 11, mo29501P0());
        C11058b.m49527m(parcel, 12, mo29494I0());
        C11058b.m49527m(parcel, 13, mo29492G0());
        C11058b.m49527m(parcel, 14, mo29493H0());
        C11058b.m49527m(parcel, 15, mo29499N0());
        C11058b.m49527m(parcel, 16, mo29497L0());
        C11058b.m49527m(parcel, 17, mo29498M0());
        C11058b.m49527m(parcel, 18, mo29491F0());
        C11058b.m49527m(parcel, 19, this.f28641s);
        C11058b.m49527m(parcel, 20, mo29489D0());
        C11058b.m49527m(parcel, 21, mo29505T0());
        C11058b.m49527m(parcel, 22, this.f28644v);
        C11058b.m49527m(parcel, 23, this.f28645w);
        C11058b.m49527m(parcel, 24, this.f28646x);
        C11058b.m49527m(parcel, 25, this.f28647y);
        C11058b.m49527m(parcel, 26, this.f28648z);
        C11058b.m49527m(parcel, 27, this.f28617A);
        C11058b.m49527m(parcel, 28, this.f28618B);
        C11058b.m49527m(parcel, 29, this.f28619C);
        C11058b.m49527m(parcel, 30, this.f28620D);
        C11058b.m49527m(parcel, 31, this.f28621E);
        C11058b.m49527m(parcel, 32, this.f28622F);
        C7134o0 o0Var = this.f28623G;
        if (o0Var == null) {
            iBinder = null;
        } else {
            iBinder = o0Var.asBinder();
        }
        C11058b.m49526l(parcel, 33, iBinder, false);
        C11058b.m49516b(parcel, a);
    }

    public final int zza() {
        return this.f28641s;
    }

    public final int zzc() {
        return this.f28645w;
    }
}
