package p098j3;

import android.util.Patterns;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j3.a */
/* compiled from: FeatureExtractor */
final class C5512a {

    /* renamed from: a */
    private static Map<String, String> f23930a = null;

    /* renamed from: b */
    private static Map<String, String> f23931b = null;

    /* renamed from: c */
    private static Map<String, String> f23932c = null;

    /* renamed from: d */
    private static JSONObject f23933d = null;

    /* renamed from: e */
    private static boolean f23934e = false;

    /* renamed from: a */
    static float[] m24568a(JSONObject jSONObject, String str) {
        if (!f23934e) {
            return null;
        }
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        try {
            String lowerCase = str.toLowerCase();
            JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
            String optString = jSONObject.optString("screenname");
            JSONArray jSONArray = new JSONArray();
            m24577j(jSONObject2, jSONArray);
            m24580m(fArr, m24576i(jSONObject2));
            JSONObject b = m24569b(jSONObject2);
            if (b == null) {
                return null;
            }
            m24580m(fArr, m24575h(b, jSONArray, optString, jSONObject2.toString(), lowerCase));
            return fArr;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static JSONObject m24569b(JSONObject jSONObject) {
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject b = m24569b(optJSONArray.getJSONObject(i));
                if (b != null) {
                    return b;
                }
            }
            return null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    static String m24570c(String str, String str2, String str3) {
        return (str3 + " | " + str2 + ", " + str).toLowerCase();
    }

    /* renamed from: d */
    static void m24571d(File file) {
        try {
            f23933d = new JSONObject();
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            f23933d = new JSONObject(new String(bArr, C6540C.UTF8_NAME));
            HashMap hashMap = new HashMap();
            f23930a = hashMap;
            hashMap.put("ENGLISH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            f23930a.put("GERMAN", "2");
            f23930a.put("SPANISH", "3");
            f23930a.put("JAPANESE", "4");
            HashMap hashMap2 = new HashMap();
            f23931b = hashMap2;
            hashMap2.put("VIEW_CONTENT", SessionDescription.SUPPORTED_SDP_VERSION);
            f23931b.put("SEARCH", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            f23931b.put("ADD_TO_CART", "2");
            f23931b.put("ADD_TO_WISHLIST", "3");
            f23931b.put("INITIATE_CHECKOUT", "4");
            f23931b.put("ADD_PAYMENT_INFO", "5");
            f23931b.put("PURCHASE", "6");
            f23931b.put("LEAD", "7");
            f23931b.put("COMPLETE_REGISTRATION", "8");
            HashMap hashMap3 = new HashMap();
            f23932c = hashMap3;
            hashMap3.put("BUTTON_TEXT", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            f23932c.put("PAGE_TITLE", "2");
            f23932c.put("RESOLVED_DOCUMENT_LINK", "3");
            f23932c.put("BUTTON_ID", "4");
            f23934e = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private static boolean m24572e(JSONObject jSONObject) {
        return (jSONObject.optInt("classtypebitmask") & 32) > 0;
    }

    /* renamed from: f */
    static boolean m24573f() {
        return f23934e;
    }

    /* renamed from: g */
    private static boolean m24574g(String[] strArr, String[] strArr2) {
        for (String str : strArr) {
            for (String contains : strArr2) {
                if (contains.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private static float[] m24575h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr = new float[30];
        float f = 0.0f;
        Arrays.fill(fArr, 0.0f);
        int length = jSONArray.length();
        int i = 0;
        fArr[3] = (float) (length > 1 ? length - 1 : 0);
        while (i < jSONArray.length()) {
            try {
                if (m24572e(jSONArray.getJSONObject(i))) {
                    fArr[9] = fArr[9] + 1.0f;
                }
                i++;
            } catch (JSONException unused) {
            }
        }
        fArr[13] = -1.0f;
        fArr[14] = -1.0f;
        String str4 = str + '|' + str3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        m24581n(jSONObject, sb, sb2);
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        fArr[15] = m24579l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
        fArr[16] = m24579l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[17] = m24579l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
        fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
        fArr[19] = m24578k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
        fArr[20] = m24578k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
        fArr[21] = m24578k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
        fArr[22] = m24579l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
        fArr[24] = m24579l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[25] = m24578k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
        fArr[27] = m24578k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
        fArr[28] = m24579l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
        if (m24579l("ENGLISH", "LEAD", "PAGE_TITLE", str4)) {
            f = 1.0f;
        }
        fArr[29] = f;
        return fArr;
    }

    /* renamed from: i */
    private static float[] m24576i(JSONObject jSONObject) {
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        String lowerCase = jSONObject.optString("text").toLowerCase();
        String lowerCase2 = jSONObject.optString("hint").toLowerCase();
        String lowerCase3 = jSONObject.optString("classname").toLowerCase();
        int optInt = jSONObject.optInt("inputtype", -1);
        String[] strArr = {lowerCase, lowerCase2};
        if (m24574g(new String[]{"$", "amount", InAppPurchaseMetaData.KEY_PRICE, "total"}, strArr)) {
            double d = (double) fArr[0];
            Double.isNaN(d);
            fArr[0] = (float) (d + 1.0d);
        }
        if (m24574g(new String[]{"password", "pwd"}, strArr)) {
            double d2 = (double) fArr[1];
            Double.isNaN(d2);
            fArr[1] = (float) (d2 + 1.0d);
        }
        if (m24574g(new String[]{"tel", "phone"}, strArr)) {
            double d3 = (double) fArr[2];
            Double.isNaN(d3);
            fArr[2] = (float) (d3 + 1.0d);
        }
        if (m24574g(new String[]{"search"}, strArr)) {
            double d4 = (double) fArr[4];
            Double.isNaN(d4);
            fArr[4] = (float) (d4 + 1.0d);
        }
        if (optInt >= 0) {
            double d5 = (double) fArr[5];
            Double.isNaN(d5);
            fArr[5] = (float) (d5 + 1.0d);
        }
        if (optInt == 3 || optInt == 2) {
            double d6 = (double) fArr[6];
            Double.isNaN(d6);
            fArr[6] = (float) (d6 + 1.0d);
        }
        if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
            double d7 = (double) fArr[7];
            Double.isNaN(d7);
            fArr[7] = (float) (d7 + 1.0d);
        }
        if (lowerCase3.contains("checkbox")) {
            double d8 = (double) fArr[8];
            Double.isNaN(d8);
            fArr[8] = (float) (d8 + 1.0d);
        }
        if (m24574g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
            double d9 = (double) fArr[10];
            Double.isNaN(d9);
            fArr[10] = (float) (d9 + 1.0d);
        }
        if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
            double d10 = (double) fArr[12];
            Double.isNaN(d10);
            fArr[12] = (float) (d10 + 1.0d);
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                m24580m(fArr, m24576i(optJSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
        return fArr;
    }

    /* renamed from: j */
    private static boolean m24577j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m24577j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m24578k(String str, String str2) {
        return Pattern.compile(str).matcher(str2).find();
    }

    /* renamed from: l */
    private static boolean m24579l(String str, String str2, String str3, String str4) {
        return m24578k(f23933d.optJSONObject("rulesForLanguage").optJSONObject(f23930a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f23931b.get(str2)).optJSONObject("positiveRules").optString(f23932c.get(str3)), str4);
    }

    /* renamed from: m */
    private static void m24580m(float[] fArr, float[] fArr2) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] + fArr2[i];
        }
    }

    /* renamed from: n */
    private static void m24581n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        String lowerCase = jSONObject.optString("text", "").toLowerCase();
        String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
        if (!lowerCase.isEmpty()) {
            sb.append(lowerCase);
            sb.append(" ");
        }
        if (!lowerCase2.isEmpty()) {
            sb2.append(lowerCase2);
            sb2.append(" ");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                m24581n(jSONObject, sb, sb2);
            }
        }
    }
}
