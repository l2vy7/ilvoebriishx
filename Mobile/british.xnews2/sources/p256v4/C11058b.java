package p256v4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: v4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11058b {
    /* renamed from: A */
    public static <T extends Parcelable> void m49510A(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int B = m49511B(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m49514E(parcel, parcelable, 0);
                }
            }
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: B */
    private static int m49511B(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: C */
    private static void m49512C(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: D */
    private static void m49513D(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: E */
    private static <T extends Parcelable> void m49514E(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m49515a(Parcel parcel) {
        return m49511B(parcel, 20293);
    }

    /* renamed from: b */
    public static void m49516b(Parcel parcel, int i) {
        m49512C(parcel, i);
    }

    /* renamed from: c */
    public static void m49517c(Parcel parcel, int i, boolean z) {
        m49513D(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m49518d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m49513D(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m49519e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int B = m49511B(parcel, i);
            parcel.writeBundle(bundle);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m49520f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeByteArray(bArr);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m49521g(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m49522h(Parcel parcel, int i, double d) {
        m49513D(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: i */
    public static void m49523i(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m49513D(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m49524j(Parcel parcel, int i, float f) {
        m49513D(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: k */
    public static void m49525k(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m49513D(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m49526l(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int B = m49511B(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m49527m(Parcel parcel, int i, int i2) {
        m49513D(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: n */
    public static void m49528n(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeIntArray(iArr);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m49529o(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int B = m49511B(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m49530p(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m49513D(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m49531q(Parcel parcel, int i, long j) {
        m49513D(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: r */
    public static void m49532r(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeLongArray(jArr);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m49533s(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m49513D(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m49534t(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int B = m49511B(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m49535u(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int B = m49511B(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static void m49536v(Parcel parcel, int i, short s) {
        m49513D(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: w */
    public static void m49537w(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int B = m49511B(parcel, i);
            parcel.writeString(str);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: x */
    public static void m49538x(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeStringArray(strArr);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: y */
    public static void m49539y(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int B = m49511B(parcel, i);
            parcel.writeStringList(list);
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }

    /* renamed from: z */
    public static <T extends Parcelable> void m49540z(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int B = m49511B(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m49514E(parcel, t, i2);
                }
            }
            m49512C(parcel, B);
        } else if (z) {
            m49513D(parcel, i, 0);
        }
    }
}
