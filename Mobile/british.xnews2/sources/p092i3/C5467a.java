package p092i3;

import com.facebook.C3642m;
import com.facebook.internal.C3516l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import p087h3.C5410b;

/* renamed from: i3.a */
/* compiled from: AddressFilterManager */
public final class C5467a {

    /* renamed from: a */
    private static boolean f23835a = false;

    /* renamed from: b */
    private static boolean f23836b = false;

    /* renamed from: a */
    public static void m24475a() {
        f23835a = true;
        f23836b = C3516l.m11769g("FBSDKFeatureAddressDetectionSample", C3642m.m12280f(), false);
    }

    /* renamed from: b */
    public static void m24476b(Map<String, String> map) {
        if (f23835a && map.size() != 0) {
            try {
                ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : arrayList) {
                    String str2 = map.get(str);
                    if (m24477c(str2)) {
                        map.remove(str);
                        if (!f23836b) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    map.put("_onDeviceParams", jSONObject.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m24477c(String str) {
        float[] fArr = new float[30];
        Arrays.fill(fArr, 0.0f);
        String q = C5410b.m24351q("DATA_DETECTION_ADDRESS", fArr, str);
        return q != null && q.equals("SHOULD_FILTER");
    }
}
