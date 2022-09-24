package com.startapp;

import android.app.Activity;
import com.startapp.C11963i7;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.startapp.l */
/* compiled from: Sta */
public class C12021l {

    /* renamed from: m */
    public static Pattern f53226m;

    /* renamed from: a */
    public final String f53227a;

    /* renamed from: b */
    public final C11963i7.C11964a f53228b;

    /* renamed from: c */
    public final boolean f53229c;

    /* renamed from: d */
    public final boolean f53230d;

    /* renamed from: e */
    public boolean f53231e;

    /* renamed from: f */
    public boolean f53232f;

    /* renamed from: g */
    public long f53233g;

    /* renamed from: h */
    public long f53234h;

    /* renamed from: i */
    public long f53235i;

    /* renamed from: j */
    public long f53236j;

    /* renamed from: k */
    public int f53237k;

    /* renamed from: l */
    public boolean f53238l;

    public C12021l(String str, C11963i7.C11964a aVar, boolean z, boolean z2) {
        this.f53227a = str;
        this.f53228b = aVar;
        this.f53229c = z;
        this.f53230d = z2;
    }

    /* renamed from: a */
    public static void m52547a(StringBuilder sb, String str, String str2, boolean z) {
        if (str != null) {
            sb.append(str);
            sb.append('=');
        }
        if (z) {
            sb.append('(');
            sb.append(str2);
            sb.append(')');
        } else {
            sb.append(str2);
        }
        sb.append(", ");
    }

    /* renamed from: a */
    public static void m52546a(StringBuilder sb) {
        if (sb.length() >= 2 && sb.substring(sb.length() - 2, sb.length()).equals(", ")) {
            sb.delete(sb.length() - 2, sb.length());
        }
    }

    /* renamed from: a */
    public static String m52545a(long j) {
        boolean z = true;
        String format = String.format(Locale.ENGLISH, "%.3f", new Object[]{Float.valueOf(((float) j) / 1000000.0f)});
        Map<Activity, Integer> map = C5015nb.f22145a;
        int length = format.length() - 1;
        int i = 0;
        while (length >= 0) {
            char charAt = format.charAt(length);
            if (charAt == '0') {
                if (z) {
                    i++;
                }
            } else if (charAt == '.') {
                if (!z) {
                    length = format.length() - i;
                }
                return format.substring(0, length);
            } else {
                z = false;
            }
            length--;
        }
        return format;
    }
}
