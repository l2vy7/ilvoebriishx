package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arh */
/* compiled from: IMASDK */
public final class arh {
    /* renamed from: a */
    public static <TResult> aqs<TResult> m14594a(TResult tresult) {
        aqz aqz = new aqz();
        aqz.mo14235k(tresult);
        return aqz;
    }

    /* renamed from: b */
    public static <TResult> aqs<TResult> m14595b(Exception exc) {
        aqz aqz = new aqz();
        aqz.mo14237m(exc);
        return aqz;
    }

    /* renamed from: c */
    public static <TResult> TResult m14596c(aqs<TResult> aqs, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C4604n.m20096i();
        C4604n.m20099l(aqs, "Task must not be null");
        C4604n.m20099l(timeUnit, "TimeUnit must not be null");
        if (aqs.mo14218a()) {
            return m14607n(aqs);
        }
        are are = new are((byte[]) null);
        m14608o(aqs, are);
        if (are.mo14241a(j, timeUnit)) {
            return m14607n(aqs);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: d */
    public static aqs<List<aqs<?>>> m14597d(Collection<? extends aqs<?>> collection) {
        aqz aqz;
        if (collection == null || collection.isEmpty()) {
            return m14594a(Collections.emptyList());
        }
        if (collection.isEmpty()) {
            aqz = m14594a((Object) null);
        } else {
            for (aqs requireNonNull : collection) {
                Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
            }
            aqz aqz2 = new aqz();
            arg arg = new arg(collection.size(), aqz2);
            for (aqs o : collection) {
                m14608o(o, arg);
            }
            aqz = aqz2;
        }
        return aqz.mo14223f(new ard(collection));
    }

    /* renamed from: e */
    public static boolean m14598e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m14599f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: f */
    public static boolean m14599f(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: g */
    public static boolean m14600g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m14601h(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: h */
    public static boolean m14601h(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: i */
    public static String m14602i(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m14603j(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m14609p(xmlPullParser.getAttributeName(i)).equals("default_KID")) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m14604k(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return m14601h(xmlPullParser) && m14609p(xmlPullParser.getName()).equals("pssh");
    }

    /* renamed from: l */
    public static Uri m14605l(String str, String str2) {
        return Uri.parse(m14606m(str, str2));
    }

    /* renamed from: m */
    public static String m14606m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] r = m14611r(str2);
        if (r[0] != -1) {
            sb.append(str2);
            m14610q(sb, r[1], r[2]);
            return sb.toString();
        }
        int[] r2 = m14611r(str);
        if (r[3] == 0) {
            sb.append(str, 0, r2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (r[2] == 0) {
            sb.append(str, 0, r2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (r[1] != 0) {
            int i = r2[0] + 1;
            sb.append(str, 0, i);
            sb.append(str2);
            return m14610q(sb, r[1] + i, i + r[2]);
        } else if (str2.charAt(0) == '/') {
            sb.append(str, 0, r2[1]);
            sb.append(str2);
            int i2 = r2[1];
            return m14610q(sb, i2, r[2] + i2);
        } else {
            int i3 = r2[0];
            int i4 = r2[1];
            if (i3 + 2 >= i4 || i4 != r2[2]) {
                int lastIndexOf = str.lastIndexOf(47, r2[2] - 1);
                int i5 = lastIndexOf == -1 ? r2[1] : lastIndexOf + 1;
                sb.append(str, 0, i5);
                sb.append(str2);
                return m14610q(sb, r2[1], i5 + r[2]);
            }
            sb.append(str, 0, i4);
            sb.append('/');
            sb.append(str2);
            int i6 = r2[1];
            return m14610q(sb, i6, r[2] + i6 + 1);
        }
    }

    /* renamed from: n */
    private static <TResult> TResult m14607n(aqs<TResult> aqs) throws ExecutionException {
        if (aqs.mo14219b()) {
            return aqs.mo14221d();
        }
        if (aqs.mo14220c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(aqs.mo14222e());
    }

    /* renamed from: o */
    private static <T> void m14608o(aqs<T> aqs, arf<? super T> arf) {
        Executor executor = aqy.f15588b;
        aqs.mo14227j(executor, arf);
        aqs.mo14226i(executor, arf);
        aqs.mo14224g(executor, arf);
    }

    /* renamed from: p */
    private static String m14609p(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: q */
    private static String m14610q(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    /* renamed from: r */
    private static int[] m14611r(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
