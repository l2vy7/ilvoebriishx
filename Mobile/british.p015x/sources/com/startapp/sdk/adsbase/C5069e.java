package com.startapp.sdk.adsbase;

import android.content.SharedPreferences;
import android.os.Build;
import com.startapp.C5014n9;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.C12312o;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.sdk.adsbase.e */
/* compiled from: Sta */
public class C5069e implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f22383a;

    /* renamed from: b */
    public final C5071b f22384b;

    /* renamed from: com.startapp.sdk.adsbase.e$b */
    /* compiled from: Sta */
    public interface C5071b {
    }

    public C5069e(SharedPreferences sharedPreferences) {
        this(sharedPreferences, (C5071b) null);
    }

    /* renamed from: a */
    public C5070a edit() {
        return new C5070a(this.f22383a.edit(), this.f22383a.getAll(), this.f22384b);
    }

    public boolean contains(String str) {
        try {
            return this.f22383a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Map<String, ?> getAll() {
        try {
            return this.f22383a.getAll();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return this.f22383a.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    public float getFloat(String str, float f) {
        try {
            return this.f22383a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.f22383a.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    public long getLong(String str, long j) {
        try {
            return this.f22383a.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f22383a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        try {
            return this.f22383a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f22383a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f22383a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public C5069e(SharedPreferences sharedPreferences, C5071b bVar) {
        this.f22383a = sharedPreferences;
        this.f22384b = bVar;
    }

    /* renamed from: com.startapp.sdk.adsbase.e$a */
    /* compiled from: Sta */
    public static class C5070a implements SharedPreferences.Editor {

        /* renamed from: a */
        public final SharedPreferences.Editor f22385a;

        /* renamed from: b */
        public final Map<String, ?> f22386b;

        /* renamed from: c */
        public final C5071b f22387c;

        /* renamed from: d */
        public boolean f22388d;

        public C5070a(SharedPreferences.Editor editor, Map<String, ?> map, C5071b bVar) {
            this.f22385a = editor;
            this.f22386b = map;
            this.f22387c = bVar;
        }

        /* renamed from: a */
        public final <T> void mo21101a(String str, T t) {
            if (this.f22387c != null && !C5015nb.m22922a(this.f22386b.get(str), t)) {
                this.f22388d = true;
            }
        }

        public void apply() {
            if (Build.VERSION.SDK_INT < 9) {
                this.f22385a.commit();
            } else {
                this.f22385a.apply();
            }
            C5071b bVar = this.f22387c;
            if (bVar != null && this.f22388d) {
                this.f22388d = false;
                C5014n9.f22141d.mo20678a(((C12312o) bVar).f54698a.f22466b, MetaDataRequest.RequestReason.EXTRAS);
            }
        }

        public SharedPreferences.Editor clear() {
            if (!this.f22386b.isEmpty()) {
                this.f22388d = true;
            }
            this.f22385a.clear();
            return this;
        }

        public boolean commit() {
            return this.f22385a.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            mo21101a(str, Boolean.valueOf(z));
            this.f22385a.putBoolean(str, z);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            mo21101a(str, Float.valueOf(f));
            this.f22385a.putFloat(str, f);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            mo21101a(str, Integer.valueOf(i));
            this.f22385a.putInt(str, i);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            mo21101a(str, Long.valueOf(j));
            this.f22385a.putLong(str, j);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            mo21101a(str, str2);
            this.f22385a.putString(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set set) {
            mo21101a(str, set);
            this.f22385a.putStringSet(str, set);
            return this;
        }

        /* renamed from: a */
        public C5070a mo21100a(String str, String str2) {
            mo21101a(str, str2);
            this.f22385a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C5070a mo21098a(String str, int i) {
            mo21101a(str, Integer.valueOf(i));
            this.f22385a.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public C5070a mo21099a(String str, long j) {
            mo21101a(str, Long.valueOf(j));
            this.f22385a.putLong(str, j);
            return this;
        }

        /* renamed from: a */
        public C5070a remove(String str) {
            if (this.f22386b.containsKey(str)) {
                this.f22388d = true;
            }
            this.f22385a.remove(str);
            return this;
        }
    }
}
