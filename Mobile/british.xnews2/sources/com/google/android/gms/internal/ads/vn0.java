package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.C7355d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class vn0 {

    /* renamed from: b */
    public static final Handler f40472b = new d33(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f40473c = AdView.class.getName();

    /* renamed from: d */
    private static final String f40474d = InterstitialAd.class.getName();

    /* renamed from: e */
    private static final String f40475e = AdManagerAdView.class.getName();

    /* renamed from: f */
    private static final String f40476f = AdManagerInterstitialAd.class.getName();

    /* renamed from: g */
    private static final String f40477g = SearchAdView.class.getName();

    /* renamed from: h */
    private static final String f40478h = AdLoader.class.getName();

    /* renamed from: a */
    private float f40479a = -1.0f;

    /* renamed from: a */
    public static int m38846a(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: c */
    public static AdSize m38847c(Context context, int i, int i2, int i3) {
        int a = m38846a(context, i3);
        if (a == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i, Math.max(Math.min(i > 655 ? Math.round((((float) i) / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? Math.round((((float) i) / 468.0f) * 60.0f) : i > 432 ? 68 : Math.round((((float) i) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) a) * 0.15f))), 50));
    }

    /* renamed from: d */
    public static String m38848d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: e */
    public static String m38849e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Throwable m38850f(Throwable th) {
        if (m20.f35361f.mo34648e().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m38851j(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: j */
    public static boolean m38851j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(m20.f35359d.mo34648e());
    }

    /* renamed from: k */
    public static final int m38852k(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: l */
    public static final String m38853l(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f40473c.equalsIgnoreCase(className) && !f40474d.equalsIgnoreCase(className) && !f40475e.equalsIgnoreCase(className) && !f40476f.equalsIgnoreCase(className) && !f40477g.equalsIgnoreCase(className) && !f40478h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: m */
    public static final boolean m38854m() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    /* renamed from: n */
    public static final boolean m38855n(Context context, int i) {
        return C7353b.m29920h().mo29709j(context, i) == 0;
    }

    /* renamed from: o */
    public static final boolean m38856o(Context context) {
        int j = C7353b.m29920h().mo29709j(context, C7355d.f29215a);
        return j == 0 || j == 2;
    }

    /* renamed from: p */
    public static final boolean m38857p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static final int m38858q(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: r */
    public static final void m38859r(Context context, String str, String str2, Bundle bundle, boolean z, un0 un0) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int b = C7353b.m29920h().mo29973b(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(b);
            sb.append(".214106000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        un0.zza(appendQueryParameter.toString());
    }

    /* renamed from: s */
    public static final int m38860s(Context context, int i) {
        return m38852k(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: t */
    public static final String m38861t(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m38854m()) {
            str = "emulator";
        }
        return m38849e(str);
    }

    /* renamed from: u */
    private static final void m38862u(ViewGroup viewGroup, zzbfi zzbfi, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int s = m38860s(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzbfi.f42969g - s, zzbfi.f42966d - s, 17));
            viewGroup.addView(frameLayout, zzbfi.f42969g, zzbfi.f42966d);
        }
    }

    /* renamed from: b */
    public final int mo35447b(Context context, int i) {
        if (this.f40479a < 0.0f) {
            synchronized (this) {
                if (this.f40479a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f40479a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f40479a);
    }

    /* renamed from: g */
    public final void mo35448g(ViewGroup viewGroup, zzbfi zzbfi, String str, String str2) {
        if (str2 != null) {
            co0.zzj(str2);
        }
        m38862u(viewGroup, zzbfi, str, -65536, -16777216);
    }

    /* renamed from: h */
    public final void mo35449h(ViewGroup viewGroup, zzbfi zzbfi, String str) {
        m38862u(viewGroup, zzbfi, "Ads by Google", -16777216, -1);
    }

    /* renamed from: i */
    public final void mo35450i(Context context, String str, String str2, Bundle bundle, boolean z) {
        m38859r(context, str, "gmob-apps", bundle, true, new tn0(this));
    }
}
