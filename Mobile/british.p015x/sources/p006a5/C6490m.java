package p006a5;

import java.util.HashMap;

/* renamed from: a5.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6490m {
    /* renamed from: a */
    public static void m28276a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
