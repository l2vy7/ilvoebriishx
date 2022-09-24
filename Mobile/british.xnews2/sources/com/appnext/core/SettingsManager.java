package com.appnext.core;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class SettingsManager {

    /* renamed from: eb */
    protected HashMap<String, Object> f12261eb = null;

    /* renamed from: ec */
    private ArrayList<ConfigCallback> f12262ec;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f12263m = 0;

    /* renamed from: w */
    protected HashMap<String, String> f12264w = null;

    public interface ConfigCallback {
        void error(String str);

        void loaded(HashMap<String, Object> hashMap);
    }

    /* renamed from: com.appnext.core.SettingsManager$a */
    private class C3163a extends AsyncTask<Object, Void, String> {
        private C3163a() {
        }

        /* renamed from: a */
        protected static String m10671a(Object... objArr) {
            if (objArr == null) {
                return "error: Internal error";
            }
            try {
                int length = objArr.length;
                String str = null;
                Context context = length >= 0 ? objArr[0] : null;
                if (context == null) {
                    return "error: Internal error";
                }
                String str2 = length > 0 ? objArr[1] : null;
                if (TextUtils.isEmpty(str2)) {
                    return "error: Internal error";
                }
                HashMap hashMap = length >= 2 ? objArr[2] : null;
                if (length >= 3) {
                    str = objArr[3];
                }
                C3210n.m10824ay();
                return C3210n.m10823a(context, str2, hashMap, str);
            } catch (Throwable unused) {
                return "error: Internal error";
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10671a(objArr);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            if (str == null) {
                int unused = SettingsManager.this.f12263m = 0;
                SettingsManager.this.m10657A("unknown error");
            } else if (str.startsWith("error:")) {
                int unused2 = SettingsManager.this.f12263m = 0;
                SettingsManager.this.m10657A(str.substring(7));
            } else {
                try {
                    HashMap<String, Object> z = SettingsManager.m10661z(str);
                    SettingsManager settingsManager = SettingsManager.this;
                    HashMap<String, Object> hashMap = settingsManager.f12261eb;
                    if (hashMap == null) {
                        settingsManager.f12261eb = z;
                    } else {
                        hashMap.putAll(z);
                    }
                    int unused3 = SettingsManager.this.f12263m = 2;
                    SettingsManager settingsManager2 = SettingsManager.this;
                    SettingsManager.m10660a(settingsManager2, (HashMap) settingsManager2.f12261eb);
                } catch (Throwable th) {
                    C3117a.m10553a("SettingsManager$onPostExecute", th);
                    int unused4 = SettingsManager.this.f12263m = 0;
                    SettingsManager.this.m10657A("parsing error");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m10657A(String str) {
        synchronized ("https://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(this.f12262ec).iterator();
            while (it.hasNext()) {
                ConfigCallback configCallback = (ConfigCallback) it.next();
                if (configCallback != null) {
                    configCallback.error(str);
                }
            }
            this.f12262ec.clear();
        }
    }

    /* renamed from: z */
    protected static HashMap<String, Object> m10661z(String str) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject.getString(next);
            try {
                JSONObject jSONObject2 = new JSONObject(string);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    String string2 = jSONObject2.getString(next2);
                    hashMap.put(next + "_" + next2, string2);
                }
            } catch (Throwable unused) {
                hashMap.put(next, string);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public final void mo10729h(String str, String str2) {
        if (this.f12264w == null) {
            this.f12264w = new HashMap<>();
        }
        this.f12264w.put(str, str2);
    }

    /* renamed from: i */
    public final void mo10730i(String str, String str2) {
        if (this.f12264w == null) {
            this.f12264w = new HashMap<>();
        }
        if (!this.f12264w.containsKey(str)) {
            this.f12264w.put(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo10243j();

    /* renamed from: j */
    public final void mo10731j(String str, String str2) {
        if (this.f12261eb == null) {
            this.f12261eb = new HashMap<>();
        }
        this.f12261eb.put(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract HashMap<String, String> mo10244k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract HashMap<String, String> mo10245l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo10246m();

    /* renamed from: y */
    public final String mo10732y(String str) {
        HashMap<String, Object> hashMap = this.f12261eb;
        String str2 = (hashMap == null || !hashMap.containsKey(str)) ? null : (String) this.f12261eb.get(str);
        if (str2 != null) {
            return str2;
        }
        if (mo10245l().containsKey(str)) {
            return mo10245l().get(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.f12263m = 0;
        m10657A("Internal Error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10728a(android.content.Context r7, java.lang.String r8, com.appnext.core.SettingsManager.ConfigCallback r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            boolean r1 = com.appnext.core.C3198g.m10800k(r7)     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0013
            r6.f12263m = r0     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x0011
            java.lang.String r7 = "Connection Error"
            r9.error(r7)     // Catch:{ all -> 0x008e }
        L_0x0011:
            monitor-exit(r6)
            return
        L_0x0013:
            java.util.ArrayList<com.appnext.core.SettingsManager$ConfigCallback> r1 = r6.f12262ec     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r6.f12262ec = r1     // Catch:{ all -> 0x008e }
        L_0x001e:
            int r1 = r6.f12263m     // Catch:{ all -> 0x008e }
            r2 = 2
            if (r1 != r2) goto L_0x002b
            if (r9 == 0) goto L_0x008c
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r6.f12261eb     // Catch:{ all -> 0x008e }
            r9.loaded(r7)     // Catch:{ all -> 0x008e }
            goto L_0x0095
        L_0x002b:
            if (r1 != 0) goto L_0x0085
            r1 = 1
            r6.f12263m = r1     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r3.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = r6.mo10243j()     // Catch:{ all -> 0x008e }
            r3.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "?packageId="
            r3.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = r7.getPackageName()     // Catch:{ all -> 0x008e }
            r3.append(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "&id="
            r3.append(r4)     // Catch:{ all -> 0x008e }
            r3.append(r8)     // Catch:{ all -> 0x008e }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "pck"
            java.lang.String r4 = r7.getPackageName()     // Catch:{ all -> 0x008e }
            r6.mo10729h(r3, r4)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "vid"
            java.lang.String r4 = com.appnext.core.C3198g.m10786av()     // Catch:{ all -> 0x008e }
            r6.mo10729h(r3, r4)     // Catch:{ all -> 0x008e }
            com.appnext.core.SettingsManager$a r3 = new com.appnext.core.SettingsManager$a     // Catch:{ all -> 0x008e }
            r4 = 0
            r3.<init>()     // Catch:{ all -> 0x008e }
            java.util.concurrent.Executor r4 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ all -> 0x008e }
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x008e }
            r5[r0] = r7     // Catch:{ all -> 0x008e }
            r5[r1] = r8     // Catch:{ all -> 0x008e }
            java.util.HashMap r7 = r6.mo10244k()     // Catch:{ all -> 0x008e }
            r5[r2] = r7     // Catch:{ all -> 0x008e }
            r7 = 3
            java.lang.String r8 = r6.mo10246m()     // Catch:{ all -> 0x008e }
            r5[r7] = r8     // Catch:{ all -> 0x008e }
            r3.executeOnExecutor(r4, r5)     // Catch:{ all -> 0x008e }
        L_0x0085:
            if (r9 == 0) goto L_0x008c
            java.util.ArrayList<com.appnext.core.SettingsManager$ConfigCallback> r7 = r6.f12262ec     // Catch:{ all -> 0x008e }
            r7.add(r9)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r6)
            return
        L_0x008e:
            r6.f12263m = r0     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "Internal Error"
            r6.m10657A(r7)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r6)
            return
        L_0x0097:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.SettingsManager.mo10728a(android.content.Context, java.lang.String, com.appnext.core.SettingsManager$ConfigCallback):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m10660a(SettingsManager settingsManager, HashMap hashMap) {
        synchronized ("https://cdn.appnext.com/tools/sdk/confign") {
            Iterator it = new ArrayList(settingsManager.f12262ec).iterator();
            while (it.hasNext()) {
                ((ConfigCallback) it.next()).loaded(hashMap);
            }
            settingsManager.f12262ec.clear();
        }
    }
}
