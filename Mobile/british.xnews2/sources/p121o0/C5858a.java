package p121o0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

/* renamed from: o0.a */
/* compiled from: EditorInfoCompat */
public final class C5858a {

    /* renamed from: a */
    private static final String[] f24605a = new String[0];

    /* renamed from: a */
    public static String[] m25853a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f24605a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f24605a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f24605a;
    }
}
