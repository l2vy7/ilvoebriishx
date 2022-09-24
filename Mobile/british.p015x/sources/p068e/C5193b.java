package p068e;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0600b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p068e.C5191a;
import p150t.C6077a;

/* renamed from: e.b */
/* compiled from: ActivityResultContracts */
public final class C5193b extends C5191a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m23556e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    /* renamed from: d */
    public Intent mo3632a(Context context, String[] strArr) {
        return m23556e(strArr);
    }

    /* renamed from: f */
    public C5191a.C5192a<Map<String, Boolean>> mo21378b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new C5191a.C5192a<>(Collections.emptyMap());
        }
        C6077a aVar = new C6077a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = C0600b.m3289a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new C5191a.C5192a<>(aVar);
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, Boolean> mo3633c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }
}
