package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9186i1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p006a5.C6484f;
import p193c5.C6520c;
import p256u5.C11039n;
import p256u5.C11040o;
import p256u5.C11041p;
import p256u5.C11042q;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4668d9 extends C9737c5 {

    /* renamed from: g */
    private static final String[] f21282g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f21283h = {"_err"};

    /* renamed from: i */
    public static final /* synthetic */ int f21284i = 0;

    /* renamed from: c */
    private SecureRandom f21285c;

    /* renamed from: d */
    private final AtomicLong f21286d = new AtomicLong(0);

    /* renamed from: e */
    private int f21287e;

    /* renamed from: f */
    private Integer f21288f = null;

    C4668d9(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: V */
    static boolean m21487V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: W */
    static boolean m21488W(String str) {
        C4604n.m20094g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    static boolean m21489X(Context context) {
        ActivityInfo receiverInfo;
        C4604n.m20098k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Y */
    static boolean m21490Y(Context context, boolean z) {
        C4604n.m20098k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m21498i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m21498i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: Z */
    static boolean m21491Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: a0 */
    public static boolean m21492a0(String str) {
        return !f21283h[0].equals(str);
    }

    /* renamed from: d0 */
    static final boolean m21493d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: e0 */
    static final boolean m21494e0(String str) {
        C4604n.m20098k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m21495f0(String str) {
        if ("_ldl".equals(str)) {
            this.f21269a.mo19392z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f21269a.mo19392z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f21269a.mo19392z();
            return 100;
        } else {
            this.f21269a.mo19392z();
            return 36;
        }
    }

    /* renamed from: g0 */
    private final Object m21496g0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo19322p(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u0 = mo19329u0((Bundle) parcelable);
                    if (!u0.isEmpty()) {
                        arrayList.add(u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: h0 */
    private static boolean m21497h0(String str, String[] strArr) {
        C4604n.m20098k(strArr);
        for (String Z : strArr) {
            if (m21491Z(str, Z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m21498i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: q0 */
    static long m21499q0(byte[] bArr) {
        C4604n.m20098k(bArr);
        int length = bArr.length;
        int i = 0;
        C4604n.m20101n(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: s */
    static MessageDigest m21500s() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: u */
    public static ArrayList m21501u(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzab zzab = (zzab) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzab.f46925b);
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, zzab.f46926c);
            bundle.putLong("creation_timestamp", zzab.f46928e);
            bundle.putString(MediationMetaData.KEY_NAME, zzab.f46927d.f46942c);
            C11039n.m49438b(bundle, C4604n.m20098k(zzab.f46927d.mo39366C0()));
            bundle.putBoolean("active", zzab.f46929f);
            String str = zzab.f46930g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzau zzau = zzab.f46931h;
            if (zzau != null) {
                bundle.putString("timed_out_event_name", zzau.f46937b);
                zzas zzas = zzau.f46938c;
                if (zzas != null) {
                    bundle.putBundle("timed_out_event_params", zzas.mo39355D0());
                }
            }
            bundle.putLong("trigger_timeout", zzab.f46932i);
            zzau zzau2 = zzab.f46933j;
            if (zzau2 != null) {
                bundle.putString("triggered_event_name", zzau2.f46937b);
                zzas zzas2 = zzau2.f46938c;
                if (zzas2 != null) {
                    bundle.putBundle("triggered_event_params", zzas2.mo39355D0());
                }
            }
            bundle.putLong("triggered_timestamp", zzab.f46927d.f46943d);
            bundle.putLong("time_to_live", zzab.f46934k);
            zzau zzau3 = zzab.f46935l;
            if (zzau3 != null) {
                bundle.putString("expired_event_name", zzau3.f46937b);
                zzas zzas3 = zzau3.f46938c;
                if (zzas3 != null) {
                    bundle.putBundle("expired_event_params", zzas3.mo39355D0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: x */
    public static void m21502x(C9844m6 m6Var, Bundle bundle, boolean z) {
        if (!(bundle == null || m6Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = m6Var.f46467a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = m6Var.f46468b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", m6Var.f46469c);
                return;
            }
            z = false;
        }
        if (bundle != null && m6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo19290A(C9741c9 c9Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m21493d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        c9Var.mo38887a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo19291B(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f21269a.mo19276j().mo19288x().mo38858c("Not putting event parameter. Invalid value type. name, type", this.f21269a.mo19363D().mo39321e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: C */
    public final void mo19292C(C9186i1 i1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: D */
    public final void mo19293D(C9186i1 i1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void mo19294E(C9186i1 i1Var, Bundle bundle) {
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo19295F(C9186i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo19296G(C9186i1 i1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo19297H(C9186i1 i1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo19298I(C9186i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.mo37383e(bundle);
        } catch (RemoteException e) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo19299J(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            this.f21269a.mo19392z();
            int i3 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    int m0 = !z ? mo19317m0(str6) : 0;
                    if (m0 == 0) {
                        m0 = mo19316l0(str6);
                    }
                    i = m0;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo19332w(bundle, i, str6, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo19309T(bundle2.get(str6))) {
                        this.f21269a.mo19276j().mo19288x().mo38859d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        str4 = str6;
                        i2 = 22;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo19304O(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo19332w(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m21488W(str4) && !m21497h0(str4, C11041p.f50005d) && (i3 = i3 + 1) > 0) {
                        this.f21269a.mo19276j().mo19283s().mo38858c("Item cannot contain custom parameters", this.f21269a.mo19363D().mo39320d(str5), this.f21269a.mo19363D().mo39318b(bundle2));
                        m21493d0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo19300K(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m21494e0(str)) {
                return true;
            }
            if (this.f21269a.mo19387p()) {
                this.f21269a.mo19276j().mo19283s().mo38857b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4667d3.m21474z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f21269a.mo19387p()) {
                this.f21269a.mo19276j().mo19283s().mo38856a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m21494e0(str2)) {
            return true;
        } else {
            this.f21269a.mo19276j().mo19283s().mo38857b("Invalid admob_app_id. Analytics disabled.", C4667d3.m21474z(str2));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo19301L(String str, int i, String str2) {
        if (str2 == null) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f21269a.mo19276j().mo19283s().mo38859d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo19302M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be null. Type", str);
            return false;
        }
        C4604n.m20098k(str2);
        String[] strArr3 = f21282g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f21269a.mo19276j().mo19283s().mo38858c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m21497h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m21497h0(str2, strArr2)) {
            return true;
        }
        this.f21269a.mo19276j().mo19283s().mo38858c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo19303N(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f21269a.mo19276j().mo19288x().mo38859d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19304O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo19272b()
            boolean r2 = r14.mo19309T(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            if (r22 == 0) goto L_0x00aa
            java.lang.String[] r2 = p256u5.C11041p.f50004c
            boolean r2 = m21497h0(r8, r2)
            if (r2 != 0) goto L_0x0022
            r0 = 20
            return r0
        L_0x0022:
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            com.google.android.gms.measurement.internal.t7 r2 = r2.mo19370L()
            r2.mo19272b()
            r2.mo39230d()
            boolean r6 = r2.mo39206B()
            if (r6 != 0) goto L_0x0035
            goto L_0x0047
        L_0x0035:
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d9 r2 = r2.mo19372N()
            int r2 = r2.mo19321o0()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L_0x0047
            r0 = 25
            return r0
        L_0x0047:
            com.google.android.gms.measurement.internal.h4 r2 = r7.f21269a
            r2.mo19392z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0055
            r6 = r0
            android.os.Parcelable[] r6 = (android.os.Parcelable[]) r6
            int r6 = r6.length
            goto L_0x0060
        L_0x0055:
            boolean r6 = r0 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
        L_0x0060:
            r9 = 200(0xc8, float:2.8E-43)
            if (r6 <= r9) goto L_0x00ad
            com.google.android.gms.measurement.internal.h4 r10 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r10 = r10.mo19276j()
            com.google.android.gms.measurement.internal.b3 r10 = r10.mo19288x()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r10.mo38859d(r11, r3, r8, r6)
            com.google.android.gms.measurement.internal.h4 r6 = r7.f21269a
            r6.mo19392z()
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r9) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r9)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r9) goto L_0x00a7
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r9)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x00a7:
            r9 = 17
            goto L_0x00ae
        L_0x00aa:
            r0 = 21
            return r0
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.f r1 = r1.mo19392z()
            com.google.android.gms.measurement.internal.r2 r2 = com.google.android.gms.measurement.internal.C9903s2.f46669T
            r10 = r15
            boolean r1 = r1.mo19337B(r15, r2)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = m21487V(r16)
            if (r1 != 0) goto L_0x00c9
        L_0x00c3:
            boolean r1 = m21487V(r17)
            if (r1 == 0) goto L_0x00d1
        L_0x00c9:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19392z()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d8
        L_0x00d1:
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            r1.mo19392z()
            r1 = 100
        L_0x00d8:
            boolean r1 = r14.mo19303N(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00df
            return r9
        L_0x00df:
            if (r22 == 0) goto L_0x0172
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo19299J(r1, r2, r3, r4, r5, r6)
            goto L_0x0171
        L_0x00f7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012f
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x0100:
            if (r13 >= r12) goto L_0x0171
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19288x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo38858c(r2, r0, r8)
            goto L_0x0172
        L_0x011c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo19299J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0100
        L_0x012f:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0172
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x013b:
            if (r13 >= r12) goto L_0x0171
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015e
            com.google.android.gms.measurement.internal.h4 r1 = r7.f21269a
            com.google.android.gms.measurement.internal.d3 r1 = r1.mo19276j()
            com.google.android.gms.measurement.internal.b3 r1 = r1.mo19288x()
            if (r0 == 0) goto L_0x0156
            java.lang.Class r0 = r0.getClass()
            goto L_0x0158
        L_0x0156:
            java.lang.String r0 = "null"
        L_0x0158:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo38858c(r2, r0, r8)
            goto L_0x0172
        L_0x015e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo19299J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013b
        L_0x0171:
            return r9
        L_0x0172:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4668d9.mo19304O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo19305P(String str, String str2) {
        if (str2 == null) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f21269a.mo19276j().mo19283s().mo38858c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f21269a.mo19276j().mo19283s().mo38858c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo19306Q(String str, String str2) {
        if (str2 == null) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f21269a.mo19276j().mo19283s().mo38857b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f21269a.mo19276j().mo19283s().mo38858c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f21269a.mo19276j().mo19283s().mo38858c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean mo19307R(String str) {
        mo19272b();
        if (C6520c.m28321a(this.f21269a.mo19277r()).mo24350a(str) == 0) {
            return true;
        }
        this.f21269a.mo19276j().mo19281p().mo38857b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo19308S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f21269a.mo19392z().mo19354u();
        this.f21269a.mo19275g();
        return u.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo19309T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo19310U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = C6520c.m28321a(context).mo24355f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Package name not found", e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo19311b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C4604n.m20098k(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] mo19312c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo19313d() {
        mo19272b();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f21269a.mo19276j().mo19287w().mo38856a("Utils falling back to Random for random id");
            }
        }
        this.f21286d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo19280h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int mo19314j0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo19303N("user property referrer", str, m21495f0(str), obj);
        } else {
            z = mo19303N("user property", str, m21495f0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int mo19315k0(String str) {
        if (!mo19305P("event", str)) {
            return 2;
        }
        if (!mo19302M("event", C11040o.f49998a, C11040o.f49999b, str)) {
            return 13;
        }
        this.f21269a.mo19392z();
        if (!mo19301L("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int mo19316l0(String str) {
        if (!mo19305P("event param", str)) {
            return 3;
        }
        if (!mo19302M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f21269a.mo19392z();
        if (!mo19301L("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo19317m0(String str) {
        if (!mo19306Q("event param", str)) {
            return 3;
        }
        if (!mo19302M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f21269a.mo19392z();
        if (!mo19301L("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Object mo19318n(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f21269a.mo19392z();
            return m21496g0(256, obj, true, true);
        }
        if (m21487V(str)) {
            this.f21269a.mo19392z();
        } else {
            this.f21269a.mo19392z();
            i = 100;
        }
        return m21496g0(i, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo19319n0(String str) {
        if (!mo19305P("user property", str)) {
            return 6;
        }
        if (!mo19302M("user property", C11042q.f50006a, (String[]) null, str)) {
            return 15;
        }
        this.f21269a.mo19392z();
        if (!mo19301L("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object mo19320o(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m21496g0(m21495f0(str), obj, true, false);
        }
        return m21496g0(m21495f0(str), obj, false, false);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int mo19321o0() {
        if (this.f21288f == null) {
            this.f21288f = Integer.valueOf(C7353b.m29920h().mo29973b(this.f21269a.mo19277r()) / 1000);
        }
        return this.f21288f.intValue();
    }

    /* renamed from: p */
    public final String mo19322p(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: p0 */
    public final int mo19323p0(int i) {
        return C7353b.m29920h().mo29709j(this.f21269a.mo19277r(), C7355d.f29215a);
    }

    /* renamed from: q */
    public final URL mo19324q(long j, String str, String str2, long j2) {
        try {
            C4604n.m20094g(str2);
            C4604n.m20094g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{55005L, Integer.valueOf(mo19321o0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f21269a.mo19392z().mo19355v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f21269a.mo19276j().mo19282q().mo38857b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final long mo19325r0() {
        long andIncrement;
        long j;
        if (this.f21286d.get() == 0) {
            synchronized (this.f21286d) {
                long nextLong = new Random(System.nanoTime() ^ this.f21269a.mo19274f().currentTimeMillis()).nextLong();
                int i = this.f21287e + 1;
                this.f21287e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f21286d) {
            this.f21286d.compareAndSet(-1, 1);
            andIncrement = this.f21286d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s0 */
    public final long mo19326s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: t */
    public final SecureRandom mo19327t() {
        mo19272b();
        if (this.f21285c == null) {
            this.f21285c = new SecureRandom();
        }
        return this.f21285c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo19328t0(android.net.Uri r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0138
            boolean r1 = r11.isHierarchical()     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r2 = "dclid"
            java.lang.String r3 = "gclid"
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "utm_campaign"
            java.lang.String r1 = r11.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r4 = "utm_source"
            java.lang.String r4 = r11.getQueryParameter(r4)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r5 = "utm_medium"
            java.lang.String r5 = r11.getQueryParameter(r5)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r6 = r11.getQueryParameter(r3)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            if (r12 == 0) goto L_0x0030
            java.lang.String r7 = "utm_id"
            java.lang.String r7 = r11.getQueryParameter(r7)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r8 = r11.getQueryParameter(r2)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            goto L_0x0038
        L_0x0030:
            r7 = r0
            goto L_0x0037
        L_0x0032:
            r1 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0037:
            r8 = r7
        L_0x0038:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 == 0) goto L_0x0060
            if (r12 == 0) goto L_0x005f
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            return r0
        L_0x0060:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L_0x0070
            java.lang.String r9 = "campaign"
            r0.putString(r9, r1)
        L_0x0070:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = "source"
            r0.putString(r1, r4)
        L_0x007b:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = "medium"
            r0.putString(r1, r5)
        L_0x0086:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x008f
            r0.putString(r3, r6)
        L_0x008f:
            java.lang.String r1 = "utm_term"
            java.lang.String r1 = r11.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00a0
            java.lang.String r3 = "term"
            r0.putString(r3, r1)
        L_0x00a0:
            java.lang.String r1 = "utm_content"
            java.lang.String r1 = r11.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00b1
            java.lang.String r3 = "content"
            r0.putString(r3, r1)
        L_0x00b1:
            java.lang.String r1 = "aclid"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00c0
            r0.putString(r1, r3)
        L_0x00c0:
            java.lang.String r1 = "cp1"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00cf
            r0.putString(r1, r3)
        L_0x00cf:
            java.lang.String r1 = "anid"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00de
            r0.putString(r1, r3)
        L_0x00de:
            if (r12 == 0) goto L_0x0127
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L_0x00eb
            java.lang.String r12 = "campaign_id"
            r0.putString(r12, r7)
        L_0x00eb:
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x00f4
            r0.putString(r2, r8)
        L_0x00f4:
            java.lang.String r12 = "utm_source_platform"
            java.lang.String r12 = r11.getQueryParameter(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0105
            java.lang.String r1 = "source_platform"
            r0.putString(r1, r12)
        L_0x0105:
            java.lang.String r12 = "utm_creative_format"
            java.lang.String r12 = r11.getQueryParameter(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0116
            java.lang.String r1 = "creative_format"
            r0.putString(r1, r12)
        L_0x0116:
            java.lang.String r12 = "utm_marketing_tactic"
            java.lang.String r11 = r11.getQueryParameter(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0127
            java.lang.String r12 = "marketing_tactic"
            r0.putString(r12, r11)
        L_0x0127:
            return r0
        L_0x0128:
            r11 = move-exception
            com.google.android.gms.measurement.internal.h4 r12 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo19276j()
            com.google.android.gms.measurement.internal.b3 r12 = r12.mo19287w()
            java.lang.String r1 = "Install referrer url isn't a hierarchical URI"
            r12.mo38857b(r1, r11)
        L_0x0138:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4668d9.mo19328t0(android.net.Uri, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle mo19329u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object n = mo19318n(str, bundle.get(str));
                if (n == null) {
                    this.f21269a.mo19276j().mo19288x().mo38857b("Param value can't be null", this.f21269a.mo19363D().mo39321e(str));
                } else {
                    mo19291B(bundle2, str, n);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo19330v(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f21269a.mo19276j().mo19287w().mo38857b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108 A[SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo19331v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = p256u5.C11040o.f50001d
            boolean r13 = m21497h0(r10, r0)
            if (r11 == 0) goto L_0x010d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.h4 r0 = r9.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            int r8 = r0.mo19346l()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0048
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r2 = 0
            goto L_0x0057
        L_0x0048:
            if (r25 != 0) goto L_0x004f
            int r0 = r9.mo19317m0(r7)
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.mo19316l0(r7)
        L_0x0056:
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x006d
            r0 = 3
            if (r2 != r0) goto L_0x005e
            r5 = r7
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo19332w(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0108
        L_0x006d:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo19304O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x0098
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo19332w(r1, r2, r3, r4, r5)
            goto L_0x00ba
        L_0x0098:
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bc
            r0 = 21
            if (r2 != r0) goto L_0x00aa
            r3 = r10
            goto L_0x00ab
        L_0x00aa:
            r3 = r6
        L_0x00ab:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo19332w(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0108
        L_0x00ba:
            r6 = r19
        L_0x00bc:
            boolean r0 = m21488W(r6)
            if (r0 == 0) goto L_0x0108
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            com.google.android.gms.measurement.internal.h4 r2 = r9.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19283s()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.h4 r3 = r9.f21269a
            com.google.android.gms.measurement.internal.y2 r3 = r3.mo19363D()
            java.lang.String r3 = r3.mo39320d(r10)
            com.google.android.gms.measurement.internal.h4 r4 = r9.f21269a
            com.google.android.gms.measurement.internal.y2 r4 = r4.mo19363D()
            java.lang.String r4 = r4.mo39318b(r11)
            r2.mo38858c(r1, r3, r4)
            r1 = 5
            m21493d0(r15, r1)
            r15.remove(r6)
        L_0x0106:
            r18 = r0
        L_0x0108:
            r8 = r14
            goto L_0x0030
        L_0x010b:
            r14 = r15
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4668d9.mo19331v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo19332w(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m21493d0(bundle, i)) {
            this.f21269a.mo19392z();
            bundle.putString("_ev", mo19322p(str, 40, true));
            if (obj != null) {
                C4604n.m20098k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final zzau mo19333w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo19315k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v0 = mo19331v0(str, str2, bundle3, C6484f.m28252b("_o"), true);
            if (z) {
                v0 = mo19329u0(v0);
            }
            C4604n.m20098k(v0);
            return new zzau(str2, new zzas(v0), str3, j);
        }
        this.f21269a.mo19276j().mo19282q().mo38857b("Invalid conditional property event name", this.f21269a.mo19363D().mo39322f(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo19334y(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f21269a.mo19372N().mo19291B(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo19335z(C9755e3 e3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(e3Var.f46229d.keySet())) {
            if (m21488W(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.f21269a.mo19276j().mo19283s().mo38858c(sb.toString(), this.f21269a.mo19363D().mo39320d(e3Var.f46226a), this.f21269a.mo19363D().mo39318b(e3Var.f46229d));
                m21493d0(e3Var.f46229d, 5);
                e3Var.f46229d.remove(str);
            }
        }
    }
}
