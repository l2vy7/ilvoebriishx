package p103k3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C3642m;
import com.facebook.internal.C3477d0;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k3.a */
/* compiled from: DeviceRequestsHelper */
public class C5628a {

    /* renamed from: a */
    private static final String f24170a = "k3.a";

    /* renamed from: b */
    private static HashMap<String, NsdManager.RegistrationListener> f24171b = new HashMap<>();

    /* renamed from: k3.a$a */
    /* compiled from: DeviceRequestsHelper */
    static class C5629a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f24172a;

        /* renamed from: b */
        final /* synthetic */ String f24173b;

        C5629a(String str, String str2) {
            this.f24172a = str;
            this.f24173b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C5628a.m24929a(this.f24173b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f24172a.equals(nsdServiceInfo.getServiceName())) {
                C5628a.m24929a(this.f24173b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static void m24929a(String str) {
        m24930b(str);
    }

    @TargetApi(16)
    /* renamed from: b */
    private static void m24930b(String str) {
        NsdManager.RegistrationListener registrationListener = f24171b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) C3642m.m12279e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                C3481f0.m11608S(f24170a, e);
            }
            f24171b.remove(str);
        }
    }

    /* renamed from: c */
    public static Bitmap m24931c(String str) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, 2);
        try {
            BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int height = encode.getHeight();
            int width = encode.getWidth();
            int[] iArr = new int[(height * width)];
            for (int i = 0; i < height; i++) {
                int i2 = i * width;
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[i2 + i3] = encode.get(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return createBitmap;
        } catch (WriterException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m24932d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: e */
    public static boolean m24933e() {
        C3520m j = C3522n.m11804j(C3642m.m12280f());
        return Build.VERSION.SDK_INT >= 16 && j != null && j.mo12007l().contains(C3477d0.Enabled);
    }

    /* renamed from: f */
    public static boolean m24934f(String str) {
        if (m24933e()) {
            return m24935g(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: g */
    private static boolean m24935g(String str) {
        if (f24171b.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, C3642m.m12293s().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        C5629a aVar = new C5629a(format, str);
        f24171b.put(str, aVar);
        ((NsdManager) C3642m.m12279e().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
        return true;
    }
}
