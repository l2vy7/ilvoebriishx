package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.C7046R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.d33;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.ij0;
import com.google.android.gms.internal.ads.ir2;
import com.google.android.gms.internal.ads.jv3;
import com.google.android.gms.internal.ads.lr2;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.ot0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.vn0;
import com.google.android.gms.internal.ads.vu0;
import com.google.android.gms.internal.ads.ys1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6485g;
import p006a5.C6492o;
import p133q.C5918d;
import p192c5.C6520c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzt {
    /* access modifiers changed from: private */
    @GuardedBy("AdUtil.class")

    /* renamed from: i */
    public static boolean f27938i = false;
    public static final d33 zza = new zzf(Looper.getMainLooper());

    /* renamed from: a */
    private final AtomicReference<Pattern> f27939a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final AtomicReference<Pattern> f27940b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f27941c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f27942d = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("userAgentLock")

    /* renamed from: e */
    public String f27943e;

    /* renamed from: f */
    private boolean f27944f = false;

    /* renamed from: g */
    private boolean f27945g = false;

    /* renamed from: h */
    private final Executor f27946h = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    protected static final String m28842a(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m28854m();
        }
    }

    /* renamed from: b */
    private static KeyguardManager m28843b(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: c */
    private static Bundle m28844c(Context context) {
        try {
            return C6520c.m28321a(context).mo24352c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    /* renamed from: d */
    private static String m28845d(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    /* renamed from: e */
    private final JSONArray m28846e(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object f : collection) {
            m28847f(jSONArray, f);
        }
        return jSONArray;
    }

    /* renamed from: f */
    private final void m28847f(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zze((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzf((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m28846e((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object f : (Object[]) obj) {
                m28847f(jSONArray2, f);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: g */
    private final void m28848g(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zze((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzf((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m28846e((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m28846e(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: h */
    private static boolean m28849h(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: m */
    static final String m28854m() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: n */
    protected static final int[] m28855n() {
        return new int[]{0, 0};
    }

    public static final long zzA(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    public static final WebResourceResponse zzB(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(RtspHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzp().zzd(context, str));
            hashMap.put(RtspHeaders.CACHE_CONTROL, "max-stale=3600");
            String str3 = new zzbs(context).zzb(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", C6540C.UTF8_NAME, new ByteArrayInputStream(str3.getBytes(C6540C.UTF8_NAME)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            co0.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final int zzC(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (C6492o.m28290m()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37145l6)).booleanValue()) {
                return 0;
            }
        }
        return telephonyManager.getNetworkType();
    }

    public static final String zzD() {
        Resources d = com.google.android.gms.ads.internal.zzt.zzo().mo18580d();
        return d != null ? d.getString(C7046R.string.f27786s7) : "Test Ad";
    }

    public static final zzbv zzE(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                co0.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbt(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().mo18592s(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzF(Context context, String str) {
        Context a = ij0.m33229a(context);
        return C6520c.m28321a(a).mo24351b(str, a.getPackageName()) == 0;
    }

    public static final boolean zzG(String str) {
        if (!bo0.m30771l()) {
            return false;
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37245x3)).booleanValue()) {
            return false;
        }
        String str2 = (String) C8311wv.m39277c().mo18570b(p00.f37261z3);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) C8311wv.m39277c().mo18570b(p00.f37253y3);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(16)
    public static final boolean zzH(Context context) {
        KeyguardManager b;
        if (context == null || !C6492o.m28280c() || (b = m28843b(context)) == null || !b.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzI(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            co0.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().mo18592s(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzJ(Context context) {
        boolean z;
        if (C6492o.m28288k()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37127j6)).booleanValue()) {
                synchronized (zzt.class) {
                    z = f27938i;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean zzK(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzL(Context context) {
        Bundle c = m28844c(context);
        return TextUtils.isEmpty(m28845d(c)) && !TextUtils.isEmpty(c.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzM(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void zzN(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        ir2 b;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof ys1) {
                view2 = ((ys1) view2).getChildAt(0);
            }
            if ((view2 instanceof zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzA = zzA(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof vu0) {
                lr2 p = ((vu0) view2).mo18780p();
                if (p != null) {
                    str2 = p.f35215b;
                    int hashCode = view2.hashCode();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append(":");
                    sb.append(hashCode);
                    view2.setContentDescription(sb.toString());
                    if ((view2 instanceof ot0) && (b = ((ot0) view2).mo18740b()) != null) {
                        str = ir2.m33407a(b.f33466b);
                        i2 = b.f33474f;
                        str3 = b.f33443F;
                    }
                    co0.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzA), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = ir2.m33407a(b.f33466b);
            i2 = b.f33474f;
            str3 = b.f33443F;
            co0.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzA), Integer.toString(i, 2)}));
        } catch (Exception e) {
            co0.zzh("Failure getting view location.", e);
        }
    }

    public static final void zzO(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String zzcc : arrayList) {
            new zzcc(context, str, zzcc).zzb();
        }
    }

    public static final void zzP(Context context, Throwable th) {
        if (context != null) {
            try {
                if (m20.f35357b.mo34648e().booleanValue()) {
                    C6485g.m28260a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzQ(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzR(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            co0.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map<String, String> zzS(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzT(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzq().zzm(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzU(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m28855n();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] zzW(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m28855n()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.vn0 r1 = com.google.android.gms.internal.ads.C8241uv.m38463b()
            r5 = r4[r3]
            int r1 = r1.mo35447b(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.vn0 r1 = com.google.android.gms.internal.ads.C8241uv.m38463b()
            r3 = r4[r2]
            int r6 = r1.mo35447b(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzW(android.app.Activity):int[]");
    }

    public static final boolean zzX(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzp().f27941c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzt(view);
        long zzA = zzA(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37008W0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37065c7)).booleanValue()) {
                    return true;
                }
                if (zzA < ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37083e7)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @TargetApi(18)
    public static final void zzY(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzu(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            co0.zze(sb.toString());
        } catch (ActivityNotFoundException e) {
            co0.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzZ(Activity activity) {
        int[] zzU = zzU(activity);
        return new int[]{C8241uv.m38463b().mo35447b(activity, zzU[0]), C8241uv.m38463b().mo35447b(activity, zzU[1])};
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        co0.zzj(sb.toString());
        return 60000;
    }

    public static final boolean zzaa(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzX(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m28843b(context));
    }

    public static void zzm(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            po0.f37722a.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzt(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzt(android.view.View):boolean");
    }

    @TargetApi(18)
    public static final void zzu(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null && C6492o.m28282e()) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    public static final String zzv(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m28845d(m28844c(context));
    }

    public static final String zzx() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final DisplayMetrics zzy(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public final mb3<Map<String, String>> zzb(Uri uri) {
        return bb3.m30651k(new zzk(uri), this.f27946h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0039, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a A[Catch:{ Exception -> 0x00a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzd(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f27942d
            monitor-enter(r0)
            java.lang.String r1 = r4.f27943e     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = m28854m()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzae r1 = com.google.android.gms.ads.internal.zzt.zzq()     // Catch:{ Exception -> 0x001b }
            java.lang.String r1 = r1.zzd(r5)     // Catch:{ Exception -> 0x001b }
            r4.f27943e = r1     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            java.lang.String r1 = r4.f27943e     // Catch:{ all -> 0x00c3 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.C8241uv.m38463b()     // Catch:{ all -> 0x00c3 }
            boolean r1 = com.google.android.gms.internal.ads.vn0.m38857p()     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x0063
            r1 = 0
            r4.f27943e = r1     // Catch:{ all -> 0x00c3 }
            com.google.android.gms.internal.ads.d33 r1 = zza     // Catch:{ all -> 0x00c3 }
            com.google.android.gms.ads.internal.util.zzm r2 = new com.google.android.gms.ads.internal.util.zzm     // Catch:{ all -> 0x00c3 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00c3 }
            r1.post(r2)     // Catch:{ all -> 0x00c3 }
        L_0x0039:
            java.lang.String r1 = r4.f27943e     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x0069
            java.lang.Object r1 = r4.f27942d     // Catch:{ InterruptedException -> 0x0043 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x0039
        L_0x0043:
            java.lang.String r1 = m28854m()     // Catch:{ all -> 0x00c3 }
            r4.f27943e = r1     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c3 }
            int r3 = r1.length()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x005f
        L_0x005a:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00c3 }
        L_0x005f:
            com.google.android.gms.internal.ads.co0.zzj(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x0039
        L_0x0063:
            java.lang.String r1 = m28842a(r5)     // Catch:{ all -> 0x00c3 }
            r4.f27943e = r1     // Catch:{ all -> 0x00c3 }
        L_0x0069:
            java.lang.String r1 = r4.f27943e     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c3 }
            int r2 = r1.length()     // Catch:{ all -> 0x00c3 }
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch:{ all -> 0x00c3 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c3 }
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            r3.append(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00c3 }
            r4.f27943e = r6     // Catch:{ all -> 0x00c3 }
            c5.b r5 = p192c5.C6520c.m28321a(r5)     // Catch:{ Exception -> 0x00a9 }
            boolean r5 = r5.mo24356g()     // Catch:{ Exception -> 0x00a9 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r5 = r4.f27943e     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00a9 }
            r4.f27943e = r5     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b3
        L_0x00a9:
            r5 = move-exception
            com.google.android.gms.internal.ads.nn0 r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo18592s(r5, r1)     // Catch:{ all -> 0x00c3 }
        L_0x00b3:
            java.lang.String r5 = r4.f27943e     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00c3 }
            r4.f27943e = r5     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r5
        L_0x00c3:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c7
        L_0x00c6:
            throw r5
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzd(android.content.Context, java.lang.String):java.lang.String");
    }

    public final JSONObject zze(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m28848g(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzf(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m28848g(jSONObject, next, map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zzg(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zze(bundle);
        } catch (JSONException e) {
            co0.zzh("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final void zzk(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(zza2);
        sb.append(" milliseconds.");
        co0.zzi(sb.toString());
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, zzd(context, str));
        httpURLConnection.setUseCaches(false);
    }

    @TargetApi(26)
    public final void zzl(Context context) {
        if (C6492o.m28288k()) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37127j6)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzo(this));
            }
        }
    }

    public final void zzn(Context context, String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzp();
        bundle.putString("device", zzx());
        bundle.putString("eids", TextUtils.join(",", p00.m35911a()));
        C8241uv.m38463b();
        vn0.m38859r(context, str, "gmob-apps", bundle, true, new zzn(this, context, str));
    }

    public final boolean zzo(String str) {
        return m28849h(str, this.f27939a, (String) C8311wv.m39277c().mo18570b(p00.f37007W));
    }

    public final boolean zzp(String str) {
        return m28849h(str, this.f27940b, (String) C8311wv.m39277c().mo18570b(p00.f37015X));
    }

    public final boolean zzq(Context context) {
        if (this.f27945g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzq(this, (zzp) null), intentFilter);
        this.f27945g = true;
        return true;
    }

    public final boolean zzr(Context context) {
        if (this.f27944f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzs(this, (zzr) null), intentFilter);
        this.f27944f = true;
        return true;
    }

    @TargetApi(18)
    public final int zzs(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!C6492o.m28282e()) {
            zze.zza("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = 1;
        } else if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        h00 h00 = p00.f37070d3;
        h00 h002 = p00.f37079e3;
        if (true == ((Boolean) C8311wv.m39277c().mo18570b(h00)).equals(C8311wv.m39277c().mo18570b(h002))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
            o10 o10 = new o10();
            o10.mo18598e(new zzl(this, o10, context, uri));
            o10.mo18595b((Activity) context);
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(h002)).booleanValue()) {
            return 5;
        }
        C5918d a = new C5918d.C5919a().mo22909a();
        a.f24786a.setPackage(jv3.m33764a(context));
        a.mo22908a(context, uri);
        return 5;
    }
}
