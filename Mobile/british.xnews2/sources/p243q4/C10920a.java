package p243q4;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q4.a */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10920a {

    /* renamed from: a */
    private static final Pattern f49795a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b */
    private static final Random f49796b = new Random(SystemClock.elapsedRealtime());

    @RecentlyNullable
    /* renamed from: a */
    public static JSONObject m49138a(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static double m49139b(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    @RecentlyNullable
    /* renamed from: c */
    public static String m49140c(@RecentlyNonNull JSONObject jSONObject, @RecentlyNonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: d */
    public static long m49141d(double d) {
        return (long) (d * 1000.0d);
    }

    /* renamed from: e */
    public static void m49142e(@RecentlyNonNull String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: f */
    public static <T> boolean m49143f(@RecentlyNonNull T t, @RecentlyNonNull T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        return (t == null || t2 == null || !t.equals(t2)) ? false : true;
    }

    /* renamed from: g */
    public static long m49144g() {
        return f49796b.nextLong();
    }

    /* renamed from: h */
    public static int m49145h(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    @RecentlyNonNull
    /* renamed from: i */
    public static String m49146i(@RecentlyNonNull String str) {
        return str.length() != 0 ? "urn:x-cast:".concat(str) : new String("urn:x-cast:");
    }

    @RecentlyNonNull
    /* renamed from: j */
    public static String m49147j(@RecentlyNonNull String str) {
        if (f49795a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                sb.append(String.format("%%%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @RecentlyNonNull
    /* renamed from: k */
    public static String m49148k(@RecentlyNonNull Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    @RecentlyNonNull
    /* renamed from: l */
    public static int[] m49149l(@RecentlyNonNull Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    @RecentlyNonNull
    /* renamed from: m */
    public static List<Integer> m49150m(@RecentlyNonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    @RecentlyNullable
    /* renamed from: n */
    public static long[] m49151n(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            jArr[i] = jSONArray.getLong(i);
        }
        return jArr;
    }

    @RecentlyNullable
    /* renamed from: o */
    public static JSONObject m49152o(JSONObject jSONObject, @RecentlyNonNull String str) {
        if (jSONObject.has("customData")) {
            return jSONObject.optJSONObject("customData");
        }
        return null;
    }
}
