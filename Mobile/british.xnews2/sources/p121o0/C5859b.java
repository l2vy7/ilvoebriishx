package p121o0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: o0.b */
/* compiled from: InputConnectionCompat */
public final class C5859b {

    /* renamed from: o0.b$a */
    /* compiled from: InputConnectionCompat */
    class C5860a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C5862c f24606a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5860a(InputConnection inputConnection, boolean z, C5862c cVar) {
            super(inputConnection, z);
            this.f24606a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f24606a.mo22770a(C5863c.m25857a(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: o0.b$b */
    /* compiled from: InputConnectionCompat */
    class C5861b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C5862c f24607a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5861b(InputConnection inputConnection, boolean z, C5862c cVar) {
            super(inputConnection, z);
            this.f24607a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C5859b.m25855b(str, bundle, this.f24607a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: o0.b$c */
    /* compiled from: InputConnectionCompat */
    public interface C5862c {
        /* renamed from: a */
        boolean mo22770a(C5863c cVar, int i, Bundle bundle);
    }

    /* renamed from: a */
    public static InputConnection m25854a(InputConnection inputConnection, EditorInfo editorInfo, C5862c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (cVar == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        } else if (Build.VERSION.SDK_INT >= 25) {
            return new C5860a(inputConnection, false, cVar);
        } else {
            if (C5858a.m25853a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new C5861b(inputConnection, false, cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m25855b(java.lang.String r7, android.os.Bundle r8, p121o0.C5859b.C5862c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = 0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            o0.c r8 = new o0.c     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo22770a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p121o0.C5859b.m25855b(java.lang.String, android.os.Bundle, o0.b$c):boolean");
    }
}
