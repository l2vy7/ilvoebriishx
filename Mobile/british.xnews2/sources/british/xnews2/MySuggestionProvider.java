package british.xnews2;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class MySuggestionProvider extends ContentProvider {

    /* renamed from: b */
    private static final UriMatcher f6783b;

    /* renamed from: c */
    private static String[] f6784c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6783b = uriMatcher;
        uriMatcher.addURI("british.xnews2.MySuggestionProvider", "stores/search_suggest_query/*", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c5, code lost:
        if (r4 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cd, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cf, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d3, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d5, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e7, code lost:
        if (r4 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01cb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:98:0x0197] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01dd A[SYNTHETIC, Splitter:B:128:0x01dd] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f2 A[SYNTHETIC, Splitter:B:140:0x01f2] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01ff A[SYNTHETIC, Splitter:B:148:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0111  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.database.MatrixCursor m8065a(java.lang.String r20) {
        /*
            r19 = this;
            java.lang.String r0 = "_ico_g"
            java.lang.String r1 = "img_s"
            android.content.Context r2 = r19.getContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            java.lang.String r3 = r2.f7313c1
            r4 = 0
            if (r3 != 0) goto L_0x0010
            return r4
        L_0x0010:
            boolean r3 = r2.f7284X0
            r5 = 0
            if (r3 == 0) goto L_0x002e
            british.xnews2.l[] r3 = r2.f7231O1
            int r7 = r3.length
            r8 = 0
        L_0x0019:
            if (r8 >= r7) goto L_0x002e
            r9 = r3[r8]
            boolean r10 = r9.f7864J
            if (r10 == 0) goto L_0x002b
            boolean r10 = r9.f7871M0
            if (r10 != 0) goto L_0x0029
            android.graphics.Bitmap r9 = r9.f7869L0
            if (r9 == 0) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002f
        L_0x002b:
            int r8 = r8 + 1
            goto L_0x0019
        L_0x002e:
            r3 = 0
        L_0x002f:
            java.lang.String r7 = "suggest_intent_data"
            java.lang.String r8 = "suggest_text_2"
            java.lang.String r9 = "suggest_text_1"
            java.lang.String r10 = "_id"
            if (r3 == 0) goto L_0x0042
            java.lang.String r11 = "suggest_icon_1"
            java.lang.String[] r7 = new java.lang.String[]{r10, r9, r8, r11, r7}
            f6784c = r7
            goto L_0x0048
        L_0x0042:
            java.lang.String[] r7 = new java.lang.String[]{r10, r9, r8, r7}
            f6784c = r7
        L_0x0048:
            android.database.MatrixCursor r7 = new android.database.MatrixCursor
            java.lang.String[] r8 = f6784c
            r7.<init>(r8)
            r8 = 4
            if (r3 == 0) goto L_0x0056
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            goto L_0x0058
        L_0x0056:
            java.lang.Object[] r9 = new java.lang.Object[r8]
        L_0x0058:
            if (r20 == 0) goto L_0x026a
            java.lang.String r10 = r20.trim()
            java.lang.String r11 = ""
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x026a
            java.lang.String r10 = r20.toLowerCase()
            java.lang.String r10 = british.xnews2.C1692config.m8173W0(r10)
            java.lang.String r10 = r10.trim()
            british.xnews2.l[] r12 = r2.f7231O1
            int r13 = r12.length
            r14 = 0
            r15 = 0
        L_0x0077:
            if (r14 >= r13) goto L_0x026a
            r8 = r12[r14]
            boolean r4 = r8.f7864J
            if (r4 == 0) goto L_0x0257
            boolean r4 = r2.f7260T0
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = r8.f7901b
            if (r4 != 0) goto L_0x0093
            java.lang.String r4 = r8.f7898a
            java.lang.String r4 = british.xnews2.C1692config.m8173W0(r4)
            java.lang.String r4 = r4.toLowerCase()
            r8.f7901b = r4
        L_0x0093:
            boolean r4 = r2.f7266U0
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = r8.f7907d
            if (r4 != 0) goto L_0x00a7
            java.lang.String r4 = r8.f7904c
            java.lang.String r4 = british.xnews2.C1692config.m8173W0(r4)
            java.lang.String r4 = r4.toLowerCase()
            r8.f7907d = r4
        L_0x00a7:
            boolean r4 = r2.f7260T0
            if (r4 == 0) goto L_0x00c3
            java.lang.String r4 = r8.f7901b
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L_0x00c3
            java.lang.String r4 = r8.f7901b
            boolean r4 = r4.contains(r10)
            if (r4 != 0) goto L_0x00e9
            java.lang.String r4 = r8.f7901b
            boolean r4 = r10.contains(r4)
            if (r4 != 0) goto L_0x00e9
        L_0x00c3:
            boolean r4 = r2.f7266U0
            if (r4 == 0) goto L_0x00df
            java.lang.String r4 = r8.f7907d
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L_0x00df
            java.lang.String r4 = r8.f7907d
            boolean r4 = r4.contains(r10)
            if (r4 != 0) goto L_0x00e9
            java.lang.String r4 = r8.f7907d
            boolean r4 = r10.contains(r4)
            if (r4 != 0) goto L_0x00e9
        L_0x00df:
            java.util.ArrayList<java.lang.String> r4 = r8.f7928k
            if (r4 == 0) goto L_0x00eb
            boolean r4 = r4.contains(r10)
            if (r4 == 0) goto L_0x00eb
        L_0x00e9:
            r6 = 1
            goto L_0x010f
        L_0x00eb:
            java.util.ArrayList<java.lang.String> r4 = r8.f7928k
            if (r4 == 0) goto L_0x010e
            java.util.Iterator r4 = r4.iterator()
        L_0x00f3:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x010e
            java.lang.Object r16 = r4.next()
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            boolean r16 = r6.contains(r10)
            if (r16 != 0) goto L_0x00e9
            boolean r6 = r10.contains(r6)
            if (r6 == 0) goto L_0x00f3
            goto L_0x00e9
        L_0x010e:
            r6 = 0
        L_0x010f:
            if (r6 == 0) goto L_0x0257
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r9[r5] = r4
            boolean r4 = r2.f7272V0
            r6 = 2
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = r8.f7898a
            r16 = 1
            r9[r16] = r4
            boolean r4 = r2.f7278W0
            if (r4 == 0) goto L_0x0137
            java.lang.String r4 = r8.f7904c
            r9[r6] = r4
            r4 = 0
            goto L_0x0144
        L_0x0137:
            r4 = 0
            r9[r6] = r4
            goto L_0x0144
        L_0x013b:
            r4 = 0
            r16 = 1
            java.lang.String r5 = r8.f7904c
            r9[r16] = r5
            r9[r6] = r4
        L_0x0144:
            r5 = 3
            if (r3 == 0) goto L_0x023b
            r9[r5] = r4
            boolean r6 = r8.f7871M0
            if (r6 != 0) goto L_0x0223
            android.graphics.Bitmap r6 = r8.f7869L0
            if (r6 == 0) goto L_0x0223
            android.content.Context r6 = r19.getContext()     // Catch:{ FileNotFoundException -> 0x016f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x016f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x016f }
            r4.append(r1)     // Catch:{ FileNotFoundException -> 0x016f }
            int r5 = r8.f7964y     // Catch:{ FileNotFoundException -> 0x016f }
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x016f }
            r4.append(r0)     // Catch:{ FileNotFoundException -> 0x016f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x016f }
            java.io.FileInputStream r4 = r6.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x016f }
            r5 = 0
            goto L_0x0171
        L_0x016f:
            r4 = 0
            r5 = 1
        L_0x0171:
            if (r4 == 0) goto L_0x0178
            r4.close()     // Catch:{ Exception -> 0x0177 }
            goto L_0x0178
        L_0x0177:
        L_0x0178:
            if (r5 == 0) goto L_0x01f7
            android.content.Context r4 = r19.getContext()     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            r5.<init>()     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            r5.append(r1)     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            int r6 = r8.f7964y     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            r5.append(r6)     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            r5.append(r0)     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            r6 = 0
            java.io.FileOutputStream r4 = r4.openFileOutput(r5, r6)     // Catch:{ Exception -> 0x01ea, OutOfMemoryError -> 0x01e1, all -> 0x01d9 }
            android.graphics.Bitmap r5 = r8.f7869L0     // Catch:{ Exception -> 0x01d3, OutOfMemoryError -> 0x01cd, all -> 0x01cb }
            android.content.Context r6 = r19.getContext()     // Catch:{ Exception -> 0x01d3, OutOfMemoryError -> 0x01cd, all -> 0x01cb }
            r17 = r2
            android.graphics.Bitmap r2 = r8.f7869L0     // Catch:{ Exception -> 0x01d5, OutOfMemoryError -> 0x01cf, all -> 0x01cb }
            int r2 = r2.getWidth()     // Catch:{ Exception -> 0x01d5, OutOfMemoryError -> 0x01cf, all -> 0x01cb }
            int r2 = british.xnews2.C1692config.m8149E(r6, r2)     // Catch:{ Exception -> 0x01d5, OutOfMemoryError -> 0x01cf, all -> 0x01cb }
            android.content.Context r6 = r19.getContext()     // Catch:{ Exception -> 0x01d5, OutOfMemoryError -> 0x01cf, all -> 0x01cb }
            r18 = r3
            android.graphics.Bitmap r3 = r8.f7869L0     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d1, all -> 0x01cb }
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d1, all -> 0x01cb }
            int r3 = british.xnews2.C1692config.m8149E(r6, r3)     // Catch:{ Exception -> 0x01d7, OutOfMemoryError -> 0x01d1, all -> 0x01cb }
            r6 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r5, r2, r3, r6)     // Catch:{ Exception -> 0x01f0, OutOfMemoryError -> 0x01e7, all -> 0x01cb }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x01f0, OutOfMemoryError -> 0x01e7, all -> 0x01cb }
            r5 = 100
            r2.compress(r3, r5, r4)     // Catch:{ Exception -> 0x01f0, OutOfMemoryError -> 0x01e7, all -> 0x01cb }
            if (r4 == 0) goto L_0x01fc
        L_0x01c7:
            r4.close()     // Catch:{ IOException -> 0x01fc }
            goto L_0x01fc
        L_0x01cb:
            r0 = move-exception
            goto L_0x01db
        L_0x01cd:
            r17 = r2
        L_0x01cf:
            r18 = r3
        L_0x01d1:
            r6 = 1
            goto L_0x01e7
        L_0x01d3:
            r17 = r2
        L_0x01d5:
            r18 = r3
        L_0x01d7:
            r6 = 1
            goto L_0x01f0
        L_0x01d9:
            r0 = move-exception
            r4 = 0
        L_0x01db:
            if (r4 == 0) goto L_0x01e0
            r4.close()     // Catch:{ IOException -> 0x01e0 }
        L_0x01e0:
            throw r0
        L_0x01e1:
            r17 = r2
            r18 = r3
            r6 = 1
            r4 = 0
        L_0x01e7:
            if (r4 == 0) goto L_0x01fc
            goto L_0x01c7
        L_0x01ea:
            r17 = r2
            r18 = r3
            r6 = 1
            r4 = 0
        L_0x01f0:
            if (r4 == 0) goto L_0x01f5
            r4.close()     // Catch:{ IOException -> 0x01f5 }
        L_0x01f5:
            r2 = 0
            goto L_0x01fd
        L_0x01f7:
            r17 = r2
            r18 = r3
            r6 = 1
        L_0x01fc:
            r2 = 1
        L_0x01fd:
            if (r2 == 0) goto L_0x0228
            android.content.Context r2 = r19.getContext()     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            r3.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            r3.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            int r4 = r8.f7964y     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            r3.append(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            r3.append(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            java.io.File r2 = r2.getFileStreamPath(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            java.net.URI r2 = r2.toURI()     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            r3 = 3
            r9[r3] = r2     // Catch:{ Exception | OutOfMemoryError -> 0x0228 }
            goto L_0x0228
        L_0x0223:
            r17 = r2
            r18 = r3
            r6 = 1
        L_0x0228:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r9[r3] = r2
            goto L_0x0253
        L_0x023b:
            r17 = r2
            r18 = r3
            r3 = 4
            r6 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r4 = 3
            r9[r4] = r2
        L_0x0253:
            r7.addRow(r9)
            goto L_0x025d
        L_0x0257:
            r17 = r2
            r18 = r3
            r3 = 4
            r6 = 1
        L_0x025d:
            int r15 = r15 + 1
            int r14 = r14 + 1
            r2 = r17
            r3 = r18
            r4 = 0
            r5 = 0
            r8 = 4
            goto L_0x0077
        L_0x026a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.MySuggestionProvider.m8065a(java.lang.String):android.database.MatrixCursor");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f6783b.match(uri) != 1) {
            return null;
        }
        return m8065a(uri.getLastPathSegment().toLowerCase());
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
