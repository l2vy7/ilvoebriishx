package british.xnews2;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StickerContentProvider extends ContentProvider {

    /* renamed from: c */
    public static final Uri f6820c = new Uri.Builder().scheme("content").authority("british.xnews2.stickercontentprovider").appendPath(TtmlNode.TAG_METADATA).build();

    /* renamed from: d */
    private static final UriMatcher f6821d = new UriMatcher(-1);

    /* renamed from: b */
    private List<StickerPack> f6822b;

    /* renamed from: a */
    private AssetFileDescriptor m8076a(Uri uri, AssetManager assetManager, String str, String str2) {
        if (str.endsWith("_ico.png")) {
            str = str.replace("_ico.png", "_ico");
        }
        File file = new File(getContext().getFilesDir(), str);
        if (!file.exists()) {
            return null;
        }
        try {
            return new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0, -1);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private Cursor m8077b(Uri uri) {
        List<StickerPack> f = m8081f();
        if (f != null) {
            String lastPathSegment = uri.getLastPathSegment();
            for (StickerPack next : f) {
                if (lastPathSegment.equals(next.f6823b)) {
                    return m8080e(uri, Collections.singletonList(next));
                }
            }
        }
        return m8080e(uri, new ArrayList());
    }

    /* renamed from: c */
    private AssetFileDescriptor m8078c(Uri uri) throws IllegalArgumentException {
        AssetManager assets = getContext().getAssets();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 3) {
            String str = pathSegments.get(pathSegments.size() - 1);
            String str2 = pathSegments.get(pathSegments.size() - 2);
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("identifier is empty, uri: " + uri);
            } else if (!TextUtils.isEmpty(str)) {
                List<StickerPack> f = m8081f();
                if (f == null) {
                    return null;
                }
                for (StickerPack next : f) {
                    if (str2.equals(next.f6823b)) {
                        if (str.equals(next.f6826e)) {
                            return m8076a(uri, assets, str, str2);
                        }
                        for (Sticker sticker : next.mo7291a()) {
                            if (str.equals(sticker.f6817b)) {
                                return m8076a(uri, assets, str, str2);
                            }
                        }
                        continue;
                    }
                }
                return null;
            } else {
                throw new IllegalArgumentException("file name is empty, uri: " + uri);
            }
        } else {
            throw new IllegalArgumentException("path segments should be 3, uri is: " + uri);
        }
    }

    /* renamed from: d */
    private Cursor m8079d(Uri uri) {
        return m8080e(uri, m8081f());
    }

    /* renamed from: e */
    private Cursor m8080e(Uri uri, List<StickerPack> list) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sticker_pack_identifier", "sticker_pack_name", "sticker_pack_publisher", "sticker_pack_icon", "android_play_store_link", "ios_app_download_link", "sticker_pack_publisher_email", "sticker_pack_publisher_website", "sticker_pack_privacy_policy_website", "sticker_pack_license_agreement_website", "image_data_version", "animated_sticker_pack", "whatsapp_will_not_cache_stickers"});
        for (StickerPack next : list) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            newRow.add(next.f6823b);
            newRow.add(next.f6824c);
            newRow.add(next.f6825d);
            newRow.add(next.f6826e);
            newRow.add(next.f6837p);
            newRow.add(next.f6834m);
            newRow.add(next.f6827f);
            newRow.add(next.f6828g);
            newRow.add(next.f6829h);
            newRow.add(next.f6830i);
            newRow.add(next.f6831j);
            newRow.add(Integer.valueOf(next.f6832k ? 1 : 0));
            newRow.add(Integer.valueOf(next.f6833l ? 1 : 0));
        }
        Uri uri2 = uri;
        matrixCursor.setNotificationUri(getContext().getContentResolver(), uri);
        return matrixCursor;
    }

    /* renamed from: f */
    private List<StickerPack> m8081f() {
        m8084i(getContext());
        return this.f6822b;
    }

    /* renamed from: g */
    private Cursor m8082g(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sticker_file_name", "sticker_emoji"});
        List<StickerPack> f = m8081f();
        if (f != null) {
            for (StickerPack next : f) {
                if (lastPathSegment.equals(next.f6823b)) {
                    for (Sticker next2 : next.mo7291a()) {
                        matrixCursor.addRow(new Object[]{next2.f6817b, TextUtils.join(",", next2.f6818c)});
                    }
                }
            }
        }
        matrixCursor.setNotificationUri(getContext().getContentResolver(), uri);
        return matrixCursor;
    }

    /* renamed from: h */
    private void m8083h() {
        List<StickerPack> f = m8081f();
        if (f != null) {
            for (StickerPack next : f) {
                UriMatcher uriMatcher = f6821d;
                uriMatcher.addURI("british.xnews2.stickercontentprovider", "stickers_asset/" + next.f6823b + "/" + next.f6826e, 5);
                for (Sticker sticker : next.mo7291a()) {
                    UriMatcher uriMatcher2 = f6821d;
                    uriMatcher2.addURI("british.xnews2.stickercontentprovider", "stickers_asset/" + next.f6823b + "/" + sticker.f6817b, 4);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b1, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8084i(android.content.Context r22) {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01b2 }
            r0.<init>()     // Catch:{ all -> 0x01b2 }
            r1.f6822b = r0     // Catch:{ all -> 0x01b2 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ all -> 0x01b2 }
            british.xnews2.config r0 = (british.xnews2.C1692config) r0     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x01b0
            british.xnews2.l[] r2 = r0.f7231O1     // Catch:{ all -> 0x01b2 }
            if (r2 != 0) goto L_0x0018
            goto L_0x01b0
        L_0x0018:
            java.lang.String r2 = "sh"
            r3 = 0
            r4 = r22
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x01b2 }
            android.content.pm.PackageManager r5 = r22.getPackageManager()     // Catch:{ all -> 0x01b2 }
            r6 = 0
            android.content.pm.ApplicationInfo r4 = r22.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x0031 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0031 }
            android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
        L_0x0032:
            if (r6 == 0) goto L_0x003d
            java.lang.CharSequence r4 = r5.getApplicationLabel(r6)     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01b2 }
            goto L_0x003f
        L_0x003d:
            java.lang.String r4 = ""
        L_0x003f:
            java.lang.String r5 = ""
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01b2 }
            if (r5 != 0) goto L_0x01ae
            r15 = 0
        L_0x0048:
            british.xnews2.l[] r5 = r0.f7231O1     // Catch:{ all -> 0x01b2 }
            int r6 = r5.length     // Catch:{ all -> 0x01b2 }
            if (r15 >= r6) goto L_0x01ae
            r14 = r5[r15]     // Catch:{ all -> 0x01b2 }
            int r5 = r14.f7954t     // Catch:{ all -> 0x01b2 }
            r6 = 13
            if (r5 != r6) goto L_0x01a6
            boolean r5 = r14.f7933l1     // Catch:{ all -> 0x01b2 }
            if (r5 == 0) goto L_0x01a6
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01b2 }
            android.content.Context r6 = r21.getContext()     // Catch:{ all -> 0x01b2 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r7.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = "img_s"
            r7.append(r8)     // Catch:{ all -> 0x01b2 }
            int r8 = r14.f7964y     // Catch:{ all -> 0x01b2 }
            r7.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = "_ico"
            r7.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01b2 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x01b2 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x01b2 }
            if (r5 != 0) goto L_0x0086
            goto L_0x01a6
        L_0x0086:
            british.xnews2.StickerPack r13 = new british.xnews2.StickerPack     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r5.<init>()     // Catch:{ all -> 0x01b2 }
            int r6 = r14.f7964y     // Catch:{ all -> 0x01b2 }
            r5.append(r6)     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = ""
            r5.append(r6)     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = r5.toString()     // Catch:{ all -> 0x01b2 }
            java.lang.String r7 = r14.f7898a     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r5.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = "img_s"
            r5.append(r8)     // Catch:{ all -> 0x01b2 }
            int r8 = r14.f7964y     // Catch:{ all -> 0x01b2 }
            r5.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = "_ico.png"
            r5.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x01b2 }
            r10 = 0
            r16 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r5.<init>()     // Catch:{ all -> 0x01b2 }
            long r11 = r14.f7939n1     // Catch:{ all -> 0x01b2 }
            r5.append(r11)     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = ""
            r5.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r18 = r5.toString()     // Catch:{ all -> 0x01b2 }
            boolean r12 = r14.f7936m1     // Catch:{ all -> 0x01b2 }
            r19 = 0
            r5 = r13
            r8 = r4
            r11 = 0
            r17 = r12
            r12 = 0
            r20 = r13
            r13 = r16
            r3 = r14
            r14 = r18
            r18 = r15
            r15 = r17
            r16 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01b2 }
            r5.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r6.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r7 = "gal_a_"
            r6.append(r7)     // Catch:{ all -> 0x01b2 }
            int r3 = r3.f7964y     // Catch:{ all -> 0x01b2 }
            r6.append(r3)     // Catch:{ all -> 0x01b2 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = ""
            java.lang.String r3 = r2.getString(r3, r6)     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = "/"
            java.lang.String[] r3 = r3.split(r6)     // Catch:{ all -> 0x01b2 }
            int r6 = r3.length     // Catch:{ all -> 0x01b2 }
            r7 = 0
        L_0x010b:
            if (r7 >= r6) goto L_0x0189
            r8 = r3[r7]     // Catch:{ all -> 0x01b2 }
            java.lang.String r9 = ""
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x01b2 }
            if (r9 != 0) goto L_0x0185
            java.lang.String r9 = "@"
            java.lang.String[] r8 = r8.split(r9)     // Catch:{ all -> 0x01b2 }
            int r9 = r8.length     // Catch:{ all -> 0x01b2 }
            r10 = 4
            if (r9 == r10) goto L_0x0129
            int r9 = r8.length     // Catch:{ all -> 0x01b2 }
            r10 = 5
            if (r9 == r10) goto L_0x0129
            int r9 = r8.length     // Catch:{ all -> 0x01b2 }
            r10 = 6
            if (r9 != r10) goto L_0x0185
        L_0x0129:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x01b2 }
            android.content.Context r10 = r21.getContext()     // Catch:{ all -> 0x01b2 }
            java.io.File r10 = r10.getFilesDir()     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r11.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r12 = "gal_"
            r11.append(r12)     // Catch:{ all -> 0x01b2 }
            r12 = 0
            r13 = r8[r12]     // Catch:{ all -> 0x01b2 }
            r11.append(r13)     // Catch:{ all -> 0x01b2 }
            java.lang.String r12 = "_g.webp"
            r11.append(r12)     // Catch:{ all -> 0x01b2 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01b2 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x01b2 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x01b2 }
            if (r9 != 0) goto L_0x0156
            goto L_0x0185
        L_0x0156:
            british.xnews2.Sticker r9 = new british.xnews2.Sticker     // Catch:{ all -> 0x01b2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b2 }
            r10.<init>()     // Catch:{ all -> 0x01b2 }
            java.lang.String r11 = "gal_"
            r10.append(r11)     // Catch:{ all -> 0x01b2 }
            r11 = 0
            r8 = r8[r11]     // Catch:{ all -> 0x01b2 }
            r10.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = "_g.webp"
            r10.append(r8)     // Catch:{ all -> 0x01b2 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x01b2 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x01b2 }
            r10.<init>()     // Catch:{ all -> 0x01b2 }
            r9.<init>((java.lang.String) r8, (java.util.List<java.lang.String>) r10)     // Catch:{ all -> 0x01b2 }
            r5.add(r9)     // Catch:{ all -> 0x01b2 }
            int r8 = r5.size()     // Catch:{ all -> 0x01b2 }
            r9 = 29
            if (r8 <= r9) goto L_0x0186
            goto L_0x018a
        L_0x0185:
            r11 = 0
        L_0x0186:
            int r7 = r7 + 1
            goto L_0x010b
        L_0x0189:
            r11 = 0
        L_0x018a:
            int r3 = r5.size()     // Catch:{ all -> 0x01b2 }
            r6 = 2
            if (r3 <= r6) goto L_0x01a9
            r3 = r20
            r3.mo7292b(r5)     // Catch:{ all -> 0x01b2 }
            java.util.List<british.xnews2.StickerPack> r5 = r1.f6822b     // Catch:{ all -> 0x01b2 }
            r5.add(r3)     // Catch:{ all -> 0x01b2 }
            java.util.List<british.xnews2.StickerPack> r3 = r1.f6822b     // Catch:{ all -> 0x01b2 }
            int r3 = r3.size()     // Catch:{ all -> 0x01b2 }
            r5 = 9
            if (r3 <= r5) goto L_0x01a9
            goto L_0x01ae
        L_0x01a6:
            r18 = r15
            r11 = 0
        L_0x01a9:
            int r15 = r18 + 1
            r3 = 0
            goto L_0x0048
        L_0x01ae:
            monitor-exit(r21)
            return
        L_0x01b0:
            monitor-exit(r21)
            return
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x01b6
        L_0x01b5:
            throw r0
        L_0x01b6:
            goto L_0x01b5
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.StickerContentProvider.m8084i(android.content.Context):void");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }

    public String getType(Uri uri) {
        m8083h();
        int match = f6821d.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.british.xnews2.stickercontentprovider.metadata";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.british.xnews2.stickercontentprovider.metadata";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/vnd.british.xnews2.stickercontentprovider.stickers";
        }
        if (match == 4) {
            return "image/webp";
        }
        if (match == 5) {
            return "image/png";
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not supported");
    }

    public boolean onCreate() {
        if ("british.xnews2.stickercontentprovider".startsWith(getContext().getPackageName())) {
            UriMatcher uriMatcher = f6821d;
            uriMatcher.addURI("british.xnews2.stickercontentprovider", TtmlNode.TAG_METADATA, 1);
            uriMatcher.addURI("british.xnews2.stickercontentprovider", "metadata/*", 2);
            uriMatcher.addURI("british.xnews2.stickercontentprovider", "stickers/*", 3);
            return true;
        }
        throw new IllegalStateException("your authority (british.xnews2.stickercontentprovider) for the content provider should start with your package name: " + getContext().getPackageName());
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        m8083h();
        int match = f6821d.match(uri);
        if (match == 4 || match == 5) {
            return m8078c(uri);
        }
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m8083h();
        int match = f6821d.match(uri);
        if (match == 1) {
            return m8079d(uri);
        }
        if (match == 2) {
            return m8077b(uri);
        }
        if (match == 3) {
            return m8082g(uri);
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }
}
