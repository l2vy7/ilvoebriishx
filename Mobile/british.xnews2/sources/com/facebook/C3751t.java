package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3561x;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t */
/* compiled from: LegacyTokenHelper */
final class C3751t {

    /* renamed from: c */
    private static final String f13853c = "t";

    /* renamed from: a */
    private String f13854a;

    /* renamed from: b */
    private SharedPreferences f13855b;

    public C3751t(Context context) {
        this(context, (String) null);
    }

    /* renamed from: b */
    private void m12645b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f13855b.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString("value");
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString("value"));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length9 = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                arrayList.add(i, obj == JSONObject.NULL ? null : (String) obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: c */
    public static String m12646c(Bundle bundle) {
        C3489g0.m11687i(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* renamed from: d */
    static Date m12647d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: e */
    public static C3436c m12648e(Bundle bundle) {
        C3489g0.m11687i(bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
            return (C3436c) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? C3436c.FACEBOOK_APPLICATION_WEB : C3436c.WEB_VIEW;
    }

    /* renamed from: f */
    public static String m12649f(Bundle bundle) {
        C3489g0.m11687i(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    /* renamed from: g */
    public static boolean m12650g(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo12606a() {
        this.f13855b.edit().clear().apply();
    }

    /* renamed from: h */
    public Bundle mo12607h() {
        Bundle bundle = new Bundle();
        for (String next : this.f13855b.getAll().keySet()) {
            try {
                m12645b(next, bundle);
            } catch (JSONException e) {
                C3752u uVar = C3752u.CACHE;
                String str = f13853c;
                C3561x.m11891e(uVar, 5, str, "Error reading cached value for key: '" + next + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public C3751t(Context context, String str) {
        C3489g0.m11687i(context, "context");
        this.f13854a = C3481f0.m11604O(str) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        Context applicationContext = context.getApplicationContext();
        this.f13855b = (applicationContext != null ? applicationContext : context).getSharedPreferences(this.f13854a, 0);
    }
}
