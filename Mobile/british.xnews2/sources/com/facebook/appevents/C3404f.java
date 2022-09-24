package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.C3642m;
import com.facebook.appevents.C3387a;
import com.facebook.appevents.C3392c;
import com.facebook.internal.C3481f0;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import p082g3.C5337b;

/* renamed from: com.facebook.appevents.f */
/* compiled from: AppEventStore */
class C3404f {

    /* renamed from: a */
    private static final String f12849a = "com.facebook.appevents.f";

    /* renamed from: com.facebook.appevents.f$a */
    /* compiled from: AppEventStore */
    private static class C3405a extends ObjectInputStream {
        public C3405a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C3387a.C3389b.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(C3392c.C3394b.class) : readClassDescriptor;
        }
    }

    C3404f() {
    }

    /* renamed from: a */
    public static synchronized void m11389a(C3387a aVar, C3424o oVar) {
        synchronized (C3404f.class) {
            C5337b.m24043b();
            C3421n c = m11391c();
            if (c.mo11853b(aVar)) {
                c.mo11854c(aVar).addAll(oVar.mo11859d());
            } else {
                c.mo11852a(aVar, oVar.mo11859d());
            }
            m11392d(c);
        }
    }

    /* renamed from: b */
    public static synchronized void m11390b(C3396d dVar) {
        synchronized (C3404f.class) {
            C5337b.m24043b();
            C3421n c = m11391c();
            for (C3387a next : dVar.mo11821f()) {
                c.mo11852a(next, dVar.mo11819c(next).mo11859d());
            }
            m11392d(c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.appevents.C3421n m11391c() {
        /*
            java.lang.Class<com.facebook.appevents.f> r0 = com.facebook.appevents.C3404f.class
            monitor-enter(r0)
            p082g3.C5337b.m24043b()     // Catch:{ all -> 0x0091 }
            android.content.Context r1 = com.facebook.C3642m.m12279e()     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            com.facebook.appevents.f$a r4 = new com.facebook.appevents.f$a     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.appevents.n r3 = (com.facebook.appevents.C3421n) r3     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.internal.C3481f0.m11630h(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002e }
            r1.delete()     // Catch:{ Exception -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = f12849a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r2 = r3
            goto L_0x0088
        L_0x0038:
            r3 = move-exception
            goto L_0x0040
        L_0x003a:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x005e
        L_0x003e:
            r3 = move-exception
            r4 = r2
        L_0x0040:
            java.lang.String r5 = f12849a     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x005d }
            com.facebook.internal.C3481f0.m11630h(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0054 }
            r1.delete()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0088
        L_0x0054:
            r1 = move-exception
            java.lang.String r3 = f12849a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0059:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            com.facebook.internal.C3481f0.m11630h(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = f12849a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0073:
            throw r2     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r4 = r2
        L_0x0075:
            com.facebook.internal.C3481f0.m11630h(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            java.lang.String r3 = f12849a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0059
        L_0x0088:
            if (r2 != 0) goto L_0x008f
            com.facebook.appevents.n r2 = new com.facebook.appevents.n     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0095
        L_0x0094:
            throw r1
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C3404f.m11391c():com.facebook.appevents.n");
    }

    /* renamed from: d */
    private static void m11392d(C3421n nVar) {
        Context e = C3642m.m12279e();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(e.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(nVar);
                C3481f0.m11630h(objectOutputStream2);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f12849a, "Got unexpected exception while persisting events: ", e);
                    try {
                        e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    C3481f0.m11630h(objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C3481f0.m11630h(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C3481f0.m11630h(objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.w(f12849a, "Got unexpected exception while persisting events: ", e);
            e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            C3481f0.m11630h(objectOutputStream);
        }
    }
}
