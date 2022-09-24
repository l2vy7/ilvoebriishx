package p247r4;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import p244q4.C10922b;

/* renamed from: r4.b */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10964b {

    /* renamed from: a */
    private static final C10922b f49913a = new C10922b("MetadataUtils");

    /* renamed from: b */
    private static final String[] f49914b;

    /* renamed from: c */
    private static final String f49915c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f49914b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        f49915c = valueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(valueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    /* renamed from: a */
    public static void m49299a(List<WebImage> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: b */
    public static JSONArray m49300b(List<WebImage> list) {
        Objects.requireNonNull(list);
        JSONArray jSONArray = new JSONArray();
        for (WebImage F0 : list) {
            jSONArray.put(F0.mo30000F0());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static Calendar m49301c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f49913a.mo43190a("Input string is empty or null", new Object[0]);
            return null;
        }
        String d = m49302d(str);
        if (TextUtils.isEmpty(d)) {
            f49913a.mo43190a("Invalid date format", new Object[0]);
            return null;
        }
        String e = m49303e(str);
        if (!TextUtils.isEmpty(e)) {
            String valueOf = String.valueOf(d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(e).length());
            sb.append(valueOf);
            sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            sb.append(e);
            d = sb.toString();
            str2 = e.length() == 6 ? "yyyyMMdd'T'HHmmss" : f49915c;
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(d));
            return instance;
        } catch (ParseException e2) {
            f49913a.mo43193d(e2, "Error parsing string", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    private static String m49302d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                f49913a.mo43193d(e, "Error extracting the date", new Object[0]);
                return null;
            }
        } else {
            f49913a.mo43190a("Input string is empty or null", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    private static String m49303e(String str) {
        if (TextUtils.isEmpty(str)) {
            f49913a.mo43190a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            f49913a.mo43190a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                String[] strArr = f49914b;
                if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt == 'Z' && substring.length() == f49914b[0].length() + 6) {
                return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
            } else {
                return null;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            f49913a.mo43193d(e, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
