package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.w2 */
/* compiled from: Sta */
public class C5126w2 {

    /* renamed from: com.startapp.w2$a */
    /* compiled from: Sta */
    public class C5127a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f22540a;

        /* renamed from: b */
        public final /* synthetic */ String f22541b;

        /* renamed from: c */
        public final /* synthetic */ Serializable f22542c;

        public C5127a(Context context, String str, Serializable serializable) {
            this.f22540a = context;
            this.f22541b = str;
            this.f22542c = serializable;
        }

        public void run() {
            Context context = this.f22540a;
            String str = this.f22541b;
            Serializable serializable = this.f22542c;
            if (str != null) {
                try {
                    C5126w2.m23391a(C5126w2.m23395c(context, (String) null), str, serializable);
                } catch (Throwable th) {
                    if (C5126w2.m23392a(4)) {
                        C5004d4.m22887a(th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23389a(Context context, String str, Serializable serializable) {
        try {
            m23391a(m23395c(context, (String) null), str, serializable);
        } catch (Throwable th) {
            if (m23392a(4)) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: b */
    public static void m23394b(Context context, String str, Serializable serializable) {
        try {
            ComponentLocator.m23305a(context).mo21222i().execute(new C5127a(context, str, serializable));
        } catch (Throwable th) {
            if (m23392a(1)) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: c */
    public static String m23395c(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    public static <T> List m23396d(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(m23393b(context, str));
            if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    if (list == null) {
                        return null;
                    }
                    for (String file2 : list) {
                        FileInputStream fileInputStream = new FileInputStream(new File(file, file2));
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        arrayList.add(readObject);
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (Throwable th) {
            if (m23392a(2)) {
                C5004d4.m22887a(th);
            }
        }
    }

    /* renamed from: b */
    public static String m23393b(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().toString());
        if (str != null) {
            str2 = File.separator + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> T m23386a(Context context, String str, Class<T> cls) {
        try {
            return m23387a(m23395c(context, (String) null), str);
        } catch (Throwable th) {
            if (!m23392a(2)) {
                return null;
            }
            C5004d4.m22887a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m23388a(Context context, String str) {
        if (str != null) {
            m23390a(new File(m23395c(context, str)));
            m23390a(new File(m23393b(context, str)));
        }
    }

    /* renamed from: a */
    public static void m23391a(String str, String str2, Serializable serializable) throws IOException {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public static <T> T m23387a(String str, String str2) throws IOException, ClassNotFoundException {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File file2 = new File(file, str2);
        if (!file2.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        T readObject = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return readObject;
    }

    /* renamed from: a */
    public static void m23390a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File a : listFiles) {
                m23390a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    public static boolean m23392a(int i) {
        try {
            AnalyticsConfig analyticsConfig = MetaData.f22407k.analytics;
            if (analyticsConfig == null || (analyticsConfig.mo46311e() & i) != i) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
