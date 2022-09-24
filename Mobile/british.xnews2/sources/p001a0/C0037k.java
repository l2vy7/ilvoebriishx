package p001a0;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p001a0.C0026i;

/* renamed from: a0.k */
/* compiled from: NotificationCompatJellybean */
class C0037k {

    /* renamed from: a */
    private static final Object f117a = new Object();

    /* renamed from: b */
    private static Field f118b;

    /* renamed from: c */
    private static boolean f119c;

    /* renamed from: d */
    private static final Object f120d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m143a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m144b(C0026i.C0027a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f = aVar.mo49f();
        bundle2.putInt("icon", f != null ? f.mo3112g() : 0);
        bundle2.putCharSequence("title", aVar.mo53j());
        bundle2.putParcelable("actionIntent", aVar.mo44a());
        if (aVar.mo47d() != null) {
            bundle = new Bundle(aVar.mo47d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo45b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m147e(aVar.mo50g()));
        bundle2.putBoolean("showsUserInterface", aVar.mo52i());
        bundle2.putInt("semanticAction", aVar.mo51h());
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m145c(Notification notification) {
        synchronized (f117a) {
            if (f119c) {
                return null;
            }
            try {
                if (f118b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f119c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f118b = declaredField;
                }
                Bundle bundle = (Bundle) f118b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f118b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f119c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f119c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m146d(C0046n nVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", nVar.mo129i());
        bundle.putCharSequence("label", nVar.mo128h());
        bundle.putCharSequenceArray("choices", nVar.mo125e());
        bundle.putBoolean("allowFreeFormInput", nVar.mo123c());
        bundle.putBundle("extras", nVar.mo127g());
        Set<String> d = nVar.mo124d();
        if (d != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    private static Bundle[] m147e(C0046n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            bundleArr[i] = m146d(nVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m148f(Notification.Builder builder, C0026i.C0027a aVar) {
        IconCompat f = aVar.mo49f();
        builder.addAction(f != null ? f.mo3112g() : 0, aVar.mo53j(), aVar.mo44a());
        Bundle bundle = new Bundle(aVar.mo47d());
        if (aVar.mo50g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m147e(aVar.mo50g()));
        }
        if (aVar.mo46c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m147e(aVar.mo46c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo45b());
        return bundle;
    }
}
