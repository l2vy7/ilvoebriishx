package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C3572j;
import com.facebook.C3575l;
import com.facebook.C3642m;
import com.facebook.login.C3600a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.z */
/* compiled from: NativeProtocol */
public final class C3563z {

    /* renamed from: a */
    private static final String f13282a = "com.facebook.internal.z";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C3569f> f13283b = m11914f();

    /* renamed from: c */
    private static final List<C3569f> f13284c = m11913e();

    /* renamed from: d */
    private static final Map<String, List<C3569f>> f13285d = m11912d();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f13286e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final List<Integer> f13287f = Arrays.asList(new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});

    /* renamed from: com.facebook.internal.z$a */
    /* compiled from: NativeProtocol */
    static class C3564a implements Runnable {
        C3564a() {
        }

        public void run() {
            try {
                for (C3569f a : C3563z.f13283b) {
                    a.m11944b(true);
                }
            } finally {
                C3563z.f13286e.set(false);
            }
        }
    }

    /* renamed from: com.facebook.internal.z$b */
    /* compiled from: NativeProtocol */
    private static class C3565b extends C3569f {
        private C3565b() {
            super((C3564a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo12086d() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo12087e() {
            return "com.facebook.arstudio.player";
        }

        /* synthetic */ C3565b(C3564a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$c */
    /* compiled from: NativeProtocol */
    private static class C3566c extends C3569f {
        private C3566c() {
            super((C3564a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo12086d() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo12087e() {
            return "com.facebook.lite";
        }

        /* synthetic */ C3566c(C3564a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$d */
    /* compiled from: NativeProtocol */
    private static class C3567d extends C3569f {
        private C3567d() {
            super((C3564a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo12086d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo12087e() {
            return "com.facebook.katana";
        }

        /* synthetic */ C3567d(C3564a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$e */
    /* compiled from: NativeProtocol */
    private static class C3568e extends C3569f {
        private C3568e() {
            super((C3564a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo12086d() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo12087e() {
            return "com.facebook.orca";
        }

        /* synthetic */ C3568e(C3564a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$f */
    /* compiled from: NativeProtocol */
    private static abstract class C3569f {

        /* renamed from: a */
        private TreeSet<Integer> f13288a;

        private C3569f() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            if (r1.isEmpty() == false) goto L_0x0013;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void m11944b(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000d
                java.util.TreeSet<java.lang.Integer> r1 = r0.f13288a     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x000d
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x0013
            L_0x000d:
                java.util.TreeSet r1 = com.facebook.internal.C3563z.m11923o(r0)     // Catch:{ all -> 0x0015 }
                r0.f13288a = r1     // Catch:{ all -> 0x0015 }
            L_0x0013:
                monitor-exit(r0)
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3563z.C3569f.m11944b(boolean):void");
        }

        /* renamed from: c */
        public TreeSet<Integer> mo12088c() {
            TreeSet<Integer> treeSet = this.f13288a;
            if (treeSet == null || treeSet.isEmpty()) {
                m11944b(false);
            }
            return this.f13288a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract String mo12086d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract String mo12087e();

        /* synthetic */ C3569f(C3564a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.z$g */
    /* compiled from: NativeProtocol */
    public static class C3570g {

        /* renamed from: a */
        private C3569f f13289a;

        /* renamed from: b */
        private int f13290b;

        private C3570g() {
        }

        /* renamed from: a */
        public static C3570g m11948a(C3569f fVar, int i) {
            C3570g gVar = new C3570g();
            gVar.f13289a = fVar;
            gVar.f13290b = i;
            return gVar;
        }

        /* renamed from: b */
        public static C3570g m11949b() {
            C3570g gVar = new C3570g();
            gVar.f13290b = -1;
            return gVar;
        }

        /* renamed from: c */
        public int mo12089c() {
            return this.f13290b;
        }
    }

    /* renamed from: com.facebook.internal.z$h */
    /* compiled from: NativeProtocol */
    private static class C3571h extends C3569f {
        private C3571h() {
            super((C3564a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo12086d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo12087e() {
            return "com.facebook.wakizashi";
        }

        /* synthetic */ C3571h(C3564a aVar) {
            this();
        }
    }

    /* renamed from: A */
    static Intent m11907A(Context context, Intent intent, C3569f fVar) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !C3504i.m11735b(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: B */
    static Intent m11908B(Context context, Intent intent, C3569f fVar) {
        ResolveInfo resolveService;
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !C3504i.m11735b(context, resolveService.serviceInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: d */
    private static Map<String, List<C3569f>> m11912d() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3568e((C3564a) null));
        List<C3569f> list = f13283b;
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f13284c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
        return hashMap;
    }

    /* renamed from: e */
    private static List<C3569f> m11913e() {
        ArrayList arrayList = new ArrayList(m11914f());
        arrayList.add(0, new C3565b((C3564a) null));
        return arrayList;
    }

    /* renamed from: f */
    private static List<C3569f> m11914f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3567d((C3564a) null));
        arrayList.add(new C3571h((C3564a) null));
        return arrayList;
    }

    /* renamed from: g */
    private static Uri m11915g(C3569f fVar) {
        return Uri.parse("content://" + fVar.mo12087e() + ".provider.PlatformProvider/versions");
    }

    /* renamed from: h */
    public static int m11916h(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = descendingIterator.next().intValue();
            i2 = Math.max(i2, intValue);
            while (length >= 0 && iArr[length] > intValue) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == intValue) {
                if (length % 2 == 0) {
                    return Math.min(i2, i);
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static Bundle m11917i(C3572j jVar) {
        if (jVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", jVar.toString());
        if (jVar instanceof C3575l) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: j */
    public static Intent m11918j(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C3600a aVar, String str3, String str4) {
        C3566c cVar = new C3566c((C3564a) null);
        Context context2 = context;
        return m11907A(context, m11919k(cVar, str, collection, str2, z, z2, aVar, str3, str4), cVar);
    }

    /* renamed from: k */
    private static Intent m11919k(C3569f fVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C3600a aVar, String str3, String str4) {
        String d = fVar.mo12086d();
        if (d == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(fVar.mo12087e(), d).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C3642m.m12293s());
        if (!C3481f0.m11605P(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C3481f0.m11604O(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request,graph_domain");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", aVar.mo12231d());
        }
        putExtra.putExtra("legacy_override", C3642m.m12290p());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    /* renamed from: l */
    public static Intent m11920l(Context context) {
        for (C3569f next : f13283b) {
            Intent B = m11908B(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(next.mo12087e()).addCategory("android.intent.category.DEFAULT"), next);
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static Intent m11921m(Intent intent, Bundle bundle, C3572j jVar) {
        UUID q = m11925q(intent);
        if (q == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m11931w(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", q.toString());
        if (jVar != null) {
            bundle2.putBundle("error", m11917i(jVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: n */
    public static Intent m11922n(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C3600a aVar, String str3, String str4) {
        for (C3569f next : f13283b) {
            Context context2 = context;
            Intent A = m11907A(context, m11919k(next, str, collection, str2, z, z2, aVar, str3, str4), next);
            if (A != null) {
                return A;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e(f13282a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m11923o(com.facebook.internal.C3563z.C3569f r10) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            android.content.Context r2 = com.facebook.C3642m.m12279e()
            android.content.ContentResolver r3 = r2.getContentResolver()
            java.lang.String r2 = "version"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            android.net.Uri r4 = m11915g(r10)
            r9 = 0
            android.content.Context r6 = com.facebook.C3642m.m12279e()     // Catch:{ all -> 0x0072 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r10.mo12087e()     // Catch:{ all -> 0x0072 }
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = ".provider.PlatformProvider"
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x0072 }
            r7 = 0
            android.content.pm.ProviderInfo r10 = r6.resolveContentProvider(r10, r7)     // Catch:{ RuntimeException -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r10 = move-exception
            java.lang.String r6 = f13282a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r6, r0, r10)     // Catch:{ all -> 0x0072 }
            r10 = r9
        L_0x0044:
            if (r10 == 0) goto L_0x006c
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x004f }
            r9 = r10
            goto L_0x0054
        L_0x004f:
            java.lang.String r10 = f13282a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r10, r0)     // Catch:{ all -> 0x0072 }
        L_0x0054:
            if (r9 == 0) goto L_0x006c
        L_0x0056:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x006c
            int r10 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0072 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0072 }
            r1.add(r10)     // Catch:{ all -> 0x0072 }
            goto L_0x0056
        L_0x006c:
            if (r9 == 0) goto L_0x0071
            r9.close()
        L_0x0071:
            return r1
        L_0x0072:
            r10 = move-exception
            if (r9 == 0) goto L_0x0078
            r9.close()
        L_0x0078:
            goto L_0x007a
        L_0x0079:
            throw r10
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C3563z.m11923o(com.facebook.internal.z$f):java.util.TreeSet");
    }

    /* renamed from: p */
    public static Bundle m11924p(Intent intent) {
        if (!m11933y(m11931w(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    /* renamed from: q */
    public static UUID m11925q(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        if (m11933y(m11931w(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static C3572j m11926r(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new C3572j(string2);
        }
        return new C3575l(string2);
    }

    /* renamed from: s */
    private static C3570g m11927s(List<C3569f> list, int[] iArr) {
        m11934z();
        if (list == null) {
            return C3570g.m11949b();
        }
        for (C3569f next : list) {
            int h = m11916h(next.mo12088c(), m11929u(), iArr);
            if (h != -1) {
                return C3570g.m11948a(next, h);
            }
        }
        return C3570g.m11949b();
    }

    /* renamed from: t */
    public static int m11928t(int i) {
        return m11927s(f13283b, new int[]{i}).mo12089c();
    }

    /* renamed from: u */
    public static final int m11929u() {
        return f13287f.get(0).intValue();
    }

    /* renamed from: v */
    public static Bundle m11930v(Intent intent) {
        if (!m11933y(m11931w(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: w */
    public static int m11931w(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: x */
    public static boolean m11932x(Intent intent) {
        Bundle p = m11924p(intent);
        if (p != null) {
            return p.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: y */
    public static boolean m11933y(int i) {
        return f13287f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: z */
    public static void m11934z() {
        if (f13286e.compareAndSet(false, true)) {
            C3642m.m12288n().execute(new C3564a());
        }
    }
}
