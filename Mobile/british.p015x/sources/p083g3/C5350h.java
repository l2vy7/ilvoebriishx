package p083g3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C3642m;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g3.h */
/* compiled from: InAppPurchaseEventManager */
class C5350h {

    /* renamed from: a */
    private static final HashMap<String, Method> f23556a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f23557b = new HashMap<>();

    /* renamed from: c */
    private static final String f23558c = C3642m.m12279e().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f23559d = C3642m.m12279e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f23560e = C3642m.m12279e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    static Object m24066a(Context context, IBinder iBinder) {
        return m24079n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
    }

    /* renamed from: b */
    static void m24067b() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f23559d;
        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
        if (j == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    private static ArrayList<String> m24068c(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = f23560e.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f23560e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: d */
    private static Class<?> m24069d(Context context, String str) {
        HashMap<String, Class<?>> hashMap = f23557b;
        Class<?> cls = hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            hashMap.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    /* renamed from: e */
    private static Method m24070e(Class<?> cls, String str) {
        Class<String> cls2 = String.class;
        HashMap<String, Method> hashMap = f23556a;
        Method method = hashMap.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c == 1) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, Bundle.class};
            } else if (c == 2) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2};
            } else if (c == 3) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2};
            } else if (c == 4) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2, Bundle.class};
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            hashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return method;
        }
    }

    /* renamed from: f */
    private static ArrayList<String> m24071f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        if (m24080o(context, obj, str).booleanValue()) {
            String str2 = null;
            int i = 0;
            boolean z = false;
            do {
                Object n = m24079n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f23558c, str, str2, new Bundle()});
                if (n != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) n;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            } catch (JSONException unused) {
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || str2 == null) {
                            break;
                        }
                    }
                }
                str2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* renamed from: g */
    static ArrayList<String> m24072g(Context context, Object obj) {
        Class<?> d;
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null || (d = m24069d(context, "com.android.vending.billing.IInAppBillingService")) == null || m24070e(d, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return m24068c(m24071f(context, obj, "inapp"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> m24073h(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = m24080o(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r1] = r7
            r7 = 1
            java.lang.String r8 = f23558c
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = m24079n(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p083g3.C5350h.m24073h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    static ArrayList<String> m24074i(Context context, Object obj) {
        return m24068c(m24073h(context, obj, "inapp"));
    }

    /* renamed from: j */
    static ArrayList<String> m24075j(Context context, Object obj) {
        return m24068c(m24073h(context, obj, "subs"));
    }

    /* renamed from: k */
    static Map<String, String> m24076k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map<String, String> p = m24081p(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!p.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        p.putAll(m24077l(context, arrayList2, obj, z));
        return p;
    }

    /* renamed from: l */
    private static Map<String, String> m24077l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = f23558c;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object n = m24079n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (n != null) {
                Bundle bundle2 = (Bundle) n;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    m24082q(hashMap);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    static boolean m24078m(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: n */
    private static Object m24079n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e;
        Class<?> d = m24069d(context, str);
        if (d == null || (e = m24070e(d, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = d.cast(obj);
        }
        try {
            return e.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static Boolean m24080o(Context context, Object obj, String str) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Object n = m24079n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f23558c, str});
        if (n != null && ((Integer) n).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: p */
    private static Map<String, String> m24081p(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f23559d.getString(next, (String) null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(next, split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    private static void m24082q(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f23559d.edit();
        for (Map.Entry next : map.entrySet()) {
            edit.putString((String) next.getKey(), currentTimeMillis + ";" + ((String) next.getValue()));
        }
        edit.apply();
    }
}
