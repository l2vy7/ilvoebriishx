package british.p015x;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: british.x.n3 */
/* compiled from: s_widget_vistafb */
class C1869n3 implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private List<C2046r3> f7968a = new ArrayList();

    /* renamed from: b */
    private Context f7969b;

    /* renamed from: c */
    private int f7970c;

    /* renamed from: d */
    private int f7971d;

    /* renamed from: e */
    private String f7972e;

    /* renamed from: f */
    C1692config f7973f;

    /* renamed from: g */
    File f7974g;

    /* renamed from: h */
    SharedPreferences f7975h;

    /* renamed from: i */
    long f7976i;

    /* renamed from: j */
    boolean f7977j;

    /* renamed from: k */
    boolean f7978k;

    /* renamed from: l */
    int f7979l;

    /* renamed from: m */
    int f7980m;

    public C1869n3(Context context, Intent intent) {
        this.f7969b = context;
        this.f7970c = intent.getIntExtra("appWidgetId", 0);
        this.f7971d = C1692config.m8149E(context, 40);
        this.f7972e = Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7743a(british.p015x.C2046r3 r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "fperfil_"
            java.lang.String r1 = r9.f8447b
            java.lang.String r9 = r9.f8450e
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            java.lang.String r5 = british.p015x.C1692config.f7108H5     // Catch:{  }
            r4.append(r5)     // Catch:{  }
            java.lang.String r5 = "/srv/imgs/usus/"
            r4.append(r5)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            java.lang.String r5 = "_1"
            r4.append(r5)     // Catch:{  }
            r4.append(r11)     // Catch:{  }
            java.lang.String r11 = ".jpg?v="
            r4.append(r11)     // Catch:{  }
            r4.append(r9)     // Catch:{  }
            java.lang.String r11 = r4.toString()     // Catch:{  }
            r3.<init>(r11)     // Catch:{  }
            java.net.URLConnection r11 = r3.openConnection()     // Catch:{  }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{  }
            r3 = 1
            r11.setDoInput(r3)     // Catch:{  }
            r4 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r4)     // Catch:{  }
            r4 = 20000(0x4e20, float:2.8026E-41)
            r11.setReadTimeout(r4)     // Catch:{  }
            r11.connect()     // Catch:{  }
            java.io.InputStream r4 = r11.getInputStream()     // Catch:{  }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ MalformedURLException -> 0x00a0 }
            r4.close()     // Catch:{  }
            r11.disconnect()     // Catch:{  }
            java.io.File r11 = new java.io.File     // Catch:{  }
            java.io.File r4 = r8.f7974g     // Catch:{  }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
            r6.<init>()     // Catch:{  }
            r6.append(r0)     // Catch:{  }
            r6.append(r1)     // Catch:{  }
            r6.append(r10)     // Catch:{  }
            java.lang.String r7 = ".jpg"
            r6.append(r7)     // Catch:{  }
            java.lang.String r6 = r6.toString()     // Catch:{  }
            r11.<init>(r4, r6)     // Catch:{  }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{  }
            r4.<init>(r11)     // Catch:{  }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
            r6 = 100
            r5.compress(r11, r6, r4)     // Catch:{  }
            android.content.SharedPreferences r11 = r8.f7975h     // Catch:{  }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            r4.append(r0)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            r4.append(r10)     // Catch:{  }
            java.lang.String r10 = r4.toString()     // Catch:{  }
            r11.putString(r10, r9)     // Catch:{  }
            r11.commit()     // Catch:{  }
            return r3
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1869n3.mo7743a(british.x.r3, java.lang.String, java.lang.String):boolean");
    }

    public int getCount() {
        return this.f7968a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x074a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews getViewAt(int r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.util.List<british.x.r3> r0 = r1.f7968a
            java.lang.Object r0 = r0.get(r2)
            r3 = r0
            british.x.r3 r3 = (british.p015x.C2046r3) r3
            android.widget.RemoteViews r4 = new android.widget.RemoteViews
            android.content.Context r0 = r1.f7969b
            java.lang.String r0 = r0.getPackageName()
            r5 = 2131558703(0x7f0d012f, float:1.874273E38)
            r4.<init>(r0, r5)
            int r0 = r1.f7980m
            r5 = 2131363243(0x7f0a05ab, float:1.834629E38)
            java.lang.String r6 = "setTextColor"
            r4.setInt(r5, r6, r0)
            int r0 = r1.f7980m
            r5 = 2131363245(0x7f0a05ad, float:1.8346293E38)
            r4.setInt(r5, r6, r0)
            int r0 = r1.f7980m
            r5 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setInt(r5, r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "<i>"
            r0.append(r6)
            java.lang.String r6 = r3.f8449d
            r0.append(r6)
            java.lang.String r6 = "</i>"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r6 = 2131363245(0x7f0a05ad, float:1.8346293E38)
            r4.setTextViewText(r6, r0)
            boolean r0 = r1.f7977j
            java.lang.String r6 = ""
            java.lang.String r7 = "fperfil_"
            r8 = 8
            r9 = 2131363236(0x7f0a05a4, float:1.8346275E38)
            java.lang.String r10 = ".jpg"
            r11 = 1
            r12 = 0
            if (r0 != 0) goto L_0x0073
            r4.setViewVisibility(r9, r8)
            r0 = 2131363246(0x7f0a05ae, float:1.8346295E38)
            r4.setViewVisibility(r0, r8)
            goto L_0x0106
        L_0x0073:
            r4.setViewVisibility(r9, r12)
            r0 = 2131363246(0x7f0a05ae, float:1.8346295E38)
            r4.setViewVisibility(r0, r12)
            java.lang.String r0 = r3.f8450e
            java.lang.String r13 = "0"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0099
            boolean r0 = r1.f7978k
            if (r0 == 0) goto L_0x0092
            r0 = 2131231485(0x7f0802fd, float:1.8079052E38)
            r4.setImageViewResource(r9, r0)
            goto L_0x0106
        L_0x0092:
            r0 = 2131231487(0x7f0802ff, float:1.8079056E38)
            r4.setImageViewResource(r9, r0)
            goto L_0x0106
        L_0x0099:
            android.content.SharedPreferences r0 = r1.f7975h
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            java.lang.String r14 = r3.f8447b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = r0.getString(r13, r6)
            java.lang.String r13 = r3.f8450e
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "_p"
            boolean r0 = r1.mo7743a(r3, r6, r0)
            goto L_0x00c0
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            if (r0 == 0) goto L_0x00f3
            british.x.config r13 = r1.f7973f
            android.content.Context r14 = r1.f7969b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r7)
            java.lang.String r12 = r3.f8447b
            r15.append(r12)
            r15.append(r10)
            java.lang.String r12 = r15.toString()
            java.io.File r12 = r13.mo7517m0(r14, r12)
            british.x.config r13 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            android.net.Uri r12 = android.net.Uri.fromFile(r12)     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            int r14 = r1.f7971d     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            android.graphics.Bitmap r12 = r13.mo7477D(r12, r14, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            android.graphics.Bitmap r12 = british.p015x.C1692config.m8188g0(r12, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            r4.setImageViewBitmap(r9, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            if (r0 != 0) goto L_0x0106
            boolean r0 = r1.f7978k
            if (r0 == 0) goto L_0x0100
            r0 = 2131231485(0x7f0802fd, float:1.8079052E38)
            r4.setImageViewResource(r9, r0)
            goto L_0x0106
        L_0x0100:
            r0 = 2131231487(0x7f0802ff, float:1.8079056E38)
            r4.setImageViewResource(r9, r0)
        L_0x0106:
            r9 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            r4.setViewVisibility(r9, r8)
            r12 = 2131363237(0x7f0a05a5, float:1.8346277E38)
            r4.setViewVisibility(r12, r8)
            r4.setViewVisibility(r5, r8)
            r0 = 2131363235(0x7f0a05a3, float:1.8346273E38)
            r4.setViewVisibility(r0, r8)
            r0 = 2131363234(0x7f0a05a2, float:1.8346271E38)
            r4.setViewVisibility(r0, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "<b>"
            r0.append(r8)
            java.lang.String r8 = r3.f8448c
            r0.append(r8)
            java.lang.String r8 = "</b>"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r3.f8446a
            java.lang.String r13 = "1"
            boolean r8 = r8.equals(r13)
            java.lang.String r13 = "_g.jpg"
            r14 = 2131363233(0x7f0a05a1, float:1.834627E38)
            r15 = 300(0x12c, float:4.2E-43)
            java.lang.String r5 = " "
            if (r8 == 0) goto L_0x01d9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820887(0x7f110157, float:1.9274502E38)
            java.lang.String r0 = r0.getString(r5)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r5 = r3.f8450e
            java.lang.String r8 = "0"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x01d0
            android.content.SharedPreferences r5 = r1.f7975h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r10 = r3.f8447b
            r8.append(r10)
            java.lang.String r10 = "_g"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r5 = r5.getString(r8, r6)
            java.lang.String r8 = r3.f8450e
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x019f
            java.lang.String r5 = "_g"
            boolean r11 = r1.mo7743a(r3, r5, r6)
        L_0x019f:
            if (r11 == 0) goto L_0x01d1
            british.x.config r5 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = r3.f8447b
            r8.append(r7)
            r8.append(r13)
            java.lang.String r7 = r8.toString()
            java.io.File r5 = r5.mo7517m0(r6, r7)
            british.x.config r6 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x01d0 }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01d0 }
            android.graphics.Bitmap r5 = r6.mo7477D(r5, r15, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x01d0 }
            r6 = 2
            android.graphics.Bitmap r5 = british.p015x.C1692config.m8147C(r5, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x01d0 }
            r4.setImageViewBitmap(r14, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01d0 }
            goto L_0x01d1
        L_0x01d0:
            r11 = 0
        L_0x01d1:
            if (r11 == 0) goto L_0x0808
            r5 = 0
            r4.setViewVisibility(r9, r5)
            goto L_0x0808
        L_0x01d9:
            java.lang.String r6 = r3.f8446a
            java.lang.String r7 = "2"
            boolean r6 = r6.equals(r7)
            r7 = 100
            r8 = 60000(0xea60, float:8.4078E-41)
            r12 = 10000(0x2710, float:1.4013E-41)
            r16 = 0
            if (r6 == 0) goto L_0x02e7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820879(0x7f11014f, float:1.9274485E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            british.x.config r5 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "fperfilgal_"
            r9.append(r14)
            java.lang.String r15 = r3.f8451f
            r9.append(r15)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.io.File r5 = r5.mo7517m0(r6, r9)
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x02aa
            java.lang.String r5 = r3.f8451f
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x02a9 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a9 }
            r9.<init>()     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r15 = british.p015x.C1692config.f7108H5     // Catch:{ Exception -> 0x02a9 }
            r9.append(r15)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r15 = "/srv/imgs/ususgal/"
            r9.append(r15)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r15 = r3.f8447b     // Catch:{ Exception -> 0x02a9 }
            r9.append(r15)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r15 = "_"
            r9.append(r15)     // Catch:{ Exception -> 0x02a9 }
            r9.append(r5)     // Catch:{ Exception -> 0x02a9 }
            r9.append(r10)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a9 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x02a9 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ Exception -> 0x02a9 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x02a9 }
            r6.setDoInput(r11)     // Catch:{ Exception -> 0x02a9 }
            r6.setConnectTimeout(r12)     // Catch:{ Exception -> 0x02a9 }
            r6.setReadTimeout(r8)     // Catch:{ Exception -> 0x02a9 }
            r6.connect()     // Catch:{ Exception -> 0x02a9 }
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ Exception -> 0x02a9 }
            android.graphics.Bitmap r16 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ OutOfMemoryError -> 0x0277 }
            r10 = r16
            r9 = 1
            goto L_0x027a
        L_0x0277:
            r10 = r16
            r9 = 0
        L_0x027a:
            r8.close()     // Catch:{ Exception -> 0x02a9 }
            r6.disconnect()     // Catch:{ Exception -> 0x02a9 }
            if (r9 == 0) goto L_0x02a7
            british.x.config r6 = r1.f7973f     // Catch:{ Exception -> 0x02a9 }
            android.content.Context r8 = r1.f7969b     // Catch:{ Exception -> 0x02a9 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a9 }
            r9.<init>()     // Catch:{ Exception -> 0x02a9 }
            r9.append(r14)     // Catch:{ Exception -> 0x02a9 }
            r9.append(r5)     // Catch:{ Exception -> 0x02a9 }
            r9.append(r13)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x02a9 }
            java.io.File r5 = r6.mo7517m0(r8, r5)     // Catch:{ Exception -> 0x02a9 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x02a9 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x02a9 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02a9 }
            r10.compress(r5, r7, r6)     // Catch:{ Exception -> 0x02a9 }
            goto L_0x02aa
        L_0x02a7:
            r11 = r9
            goto L_0x02aa
        L_0x02a9:
            r11 = 0
        L_0x02aa:
            if (r11 == 0) goto L_0x02dc
            british.x.config r5 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            java.lang.String r8 = r3.f8451f
            r7.append(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            java.io.File r5 = r5.mo7517m0(r6, r7)
            british.x.config r6 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x02db }
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x02db }
            r7 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r5 = r6.mo7477D(r5, r7, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x02db }
            r6 = 2131363233(0x7f0a05a1, float:1.834627E38)
            r4.setImageViewBitmap(r6, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x02db }
            goto L_0x02dc
        L_0x02db:
            r11 = 0
        L_0x02dc:
            if (r11 == 0) goto L_0x0808
            r5 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            r6 = 0
            r4.setViewVisibility(r5, r6)
            goto L_0x0808
        L_0x02e7:
            java.lang.String r6 = r3.f8446a
            java.lang.String r9 = "3"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x03fd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820880(0x7f110150, float:1.9274487E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "fperfilgalv_"
            r9.append(r13)
            java.lang.String r13 = r3.f8451f
            r9.append(r13)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r0 = r0.mo7517m0(r6, r9)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x03b7
            java.lang.String r0 = r3.f8451f
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x03b2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03b2 }
            r9.<init>()     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = british.p015x.C1692config.f7108H5     // Catch:{ Exception -> 0x03b2 }
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = "/srv/imgs/videos_pro/v"
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            r9.append(r0)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = "_"
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = r3.f8447b     // Catch:{ Exception -> 0x03b2 }
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = "_th.jpg"
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03b2 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x03b2 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ Exception -> 0x03b2 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x03b2 }
            r6.setDoInput(r11)     // Catch:{ Exception -> 0x03b2 }
            r6.setConnectTimeout(r12)     // Catch:{ Exception -> 0x03b2 }
            r6.setReadTimeout(r8)     // Catch:{ Exception -> 0x03b2 }
            r6.connect()     // Catch:{ Exception -> 0x03b2 }
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ Exception -> 0x03b2 }
            android.graphics.Bitmap r16 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ OutOfMemoryError -> 0x037e }
            r12 = r16
            r9 = 1
            goto L_0x0381
        L_0x037e:
            r12 = r16
            r9 = 0
        L_0x0381:
            r8.close()     // Catch:{ Exception -> 0x03b2 }
            r6.disconnect()     // Catch:{ Exception -> 0x03b2 }
            if (r9 == 0) goto L_0x03b0
            british.x.config r6 = r1.f7973f     // Catch:{ Exception -> 0x03b2 }
            android.content.Context r8 = r1.f7969b     // Catch:{ Exception -> 0x03b2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03b2 }
            r9.<init>()     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r13 = "fperfilgalv_"
            r9.append(r13)     // Catch:{ Exception -> 0x03b2 }
            r9.append(r0)     // Catch:{ Exception -> 0x03b2 }
            r9.append(r10)     // Catch:{ Exception -> 0x03b2 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x03b2 }
            java.io.File r0 = r6.mo7517m0(r8, r0)     // Catch:{ Exception -> 0x03b2 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x03b6 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x03b6 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x03b6 }
            r12.compress(r0, r7, r6)     // Catch:{ Exception -> 0x03b6 }
            goto L_0x03b7
        L_0x03b0:
            r11 = r9
            goto L_0x03b7
        L_0x03b2:
            r0 = move-exception
            r0.printStackTrace()
        L_0x03b6:
            r11 = 0
        L_0x03b7:
            if (r11 == 0) goto L_0x03eb
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fperfilgalv_"
            r7.append(r8)
            java.lang.String r8 = r3.f8451f
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = r0.mo7517m0(r6, r7)
            british.x.config r6 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x03ea }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x03ea }
            r7 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r0 = r6.mo7477D(r0, r7, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x03ea }
            r6 = 2131363233(0x7f0a05a1, float:1.834627E38)
            r4.setImageViewBitmap(r6, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x03ea }
            goto L_0x03eb
        L_0x03ea:
            r11 = 0
        L_0x03eb:
            if (r11 == 0) goto L_0x03fa
            r6 = 2131363237(0x7f0a05a5, float:1.8346277E38)
            r7 = 0
            r4.setViewVisibility(r6, r7)
            r6 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            r4.setViewVisibility(r6, r7)
        L_0x03fa:
            r0 = r5
            goto L_0x0808
        L_0x03fd:
            java.lang.String r6 = r3.f8446a
            java.lang.String r9 = "4"
            boolean r6 = r6.equals(r9)
            java.lang.String r9 = "&rdquo;</b>"
            java.lang.String r13 = "<b>&ldquo;"
            if (r6 == 0) goto L_0x044e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820884(0x7f110154, float:1.9274496E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = r3.f8452g
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setTextViewText(r6, r5)
            r5 = 0
            r4.setViewVisibility(r6, r5)
            goto L_0x0808
        L_0x044e:
            java.lang.String r6 = r3.f8446a
            java.lang.String r14 = "5"
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x049b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820885(0x7f110155, float:1.9274498E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = r3.f8452g
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setTextViewText(r6, r5)
            r5 = 0
            r4.setViewVisibility(r6, r5)
            goto L_0x0808
        L_0x049b:
            java.lang.String r6 = r3.f8446a
            java.lang.String r14 = "6"
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x04e8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820882(0x7f110152, float:1.9274491E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = r3.f8452g
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setTextViewText(r6, r5)
            r5 = 0
            r4.setViewVisibility(r6, r5)
            goto L_0x0808
        L_0x04e8:
            java.lang.String r6 = r3.f8446a
            java.lang.String r14 = "7"
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x05f5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r9 = 2131820888(0x7f110158, float:1.9274504E38)
            java.lang.String r0 = r0.getString(r9)
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r3.f8452g
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "game_banner"
            r9.append(r13)
            java.lang.String r13 = r3.f8451f
            r9.append(r13)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r0 = r0.mo7517m0(r6, r9)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x05b6
            java.lang.String r0 = r3.f8451f
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x05b1 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b1 }
            r9.<init>()     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r13 = british.p015x.C1692config.f7108H5     // Catch:{ Exception -> 0x05b1 }
            r9.append(r13)     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r13 = "/android-app-creator/game/promo"
            r9.append(r13)     // Catch:{ Exception -> 0x05b1 }
            r9.append(r0)     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r13 = "/media/graphics/promo/banners/180x120.jpg"
            r9.append(r13)     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x05b1 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x05b1 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ Exception -> 0x05b1 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x05b1 }
            r6.setDoInput(r11)     // Catch:{ Exception -> 0x05b1 }
            r6.setConnectTimeout(r12)     // Catch:{ Exception -> 0x05b1 }
            r6.setReadTimeout(r8)     // Catch:{ Exception -> 0x05b1 }
            r6.connect()     // Catch:{ Exception -> 0x05b1 }
            java.io.InputStream r8 = r6.getInputStream()     // Catch:{ Exception -> 0x05b1 }
            android.graphics.Bitmap r16 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ OutOfMemoryError -> 0x057d }
            r12 = r16
            r9 = 1
            goto L_0x0580
        L_0x057d:
            r12 = r16
            r9 = 0
        L_0x0580:
            r8.close()     // Catch:{ Exception -> 0x05b1 }
            r6.disconnect()     // Catch:{ Exception -> 0x05b1 }
            if (r9 == 0) goto L_0x05af
            british.x.config r6 = r1.f7973f     // Catch:{ Exception -> 0x05b1 }
            android.content.Context r8 = r1.f7969b     // Catch:{ Exception -> 0x05b1 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05b1 }
            r9.<init>()     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r13 = "game_banner"
            r9.append(r13)     // Catch:{ Exception -> 0x05b1 }
            r9.append(r0)     // Catch:{ Exception -> 0x05b1 }
            r9.append(r10)     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x05b1 }
            java.io.File r0 = r6.mo7517m0(r8, r0)     // Catch:{ Exception -> 0x05b1 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x05b5 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x05b5 }
            r12.compress(r0, r7, r6)     // Catch:{ Exception -> 0x05b5 }
            goto L_0x05b6
        L_0x05af:
            r11 = r9
            goto L_0x05b6
        L_0x05b1:
            r0 = move-exception
            r0.printStackTrace()
        L_0x05b5:
            r11 = 0
        L_0x05b6:
            if (r11 == 0) goto L_0x05ea
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "game_banner"
            r7.append(r8)
            java.lang.String r8 = r3.f8451f
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = r0.mo7517m0(r6, r7)
            british.x.config r6 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x05e9 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x05e9 }
            r7 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r0 = r6.mo7477D(r0, r7, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x05e9 }
            r6 = 2131363233(0x7f0a05a1, float:1.834627E38)
            r4.setImageViewBitmap(r6, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x05e9 }
            goto L_0x05ea
        L_0x05e9:
            r11 = 0
        L_0x05ea:
            if (r11 == 0) goto L_0x03fa
            r6 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            r7 = 0
            r4.setViewVisibility(r6, r7)
            goto L_0x03fa
        L_0x05f5:
            java.lang.String r6 = r3.f8446a
            java.lang.String r14 = "8"
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x0642
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820881(0x7f110151, float:1.927449E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = r3.f8452g
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setTextViewText(r6, r5)
            r5 = 0
            r4.setViewVisibility(r6, r5)
            goto L_0x0808
        L_0x0642:
            java.lang.String r6 = r3.f8446a
            java.lang.String r14 = "9"
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x0759
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820880(0x7f110150, float:1.9274487E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "fbuscvideo_"
            r9.append(r13)
            java.lang.String r13 = r3.f8451f
            r9.append(r13)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r0 = r0.mo7517m0(r6, r9)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0714
            java.lang.String r0 = r3.f8451f
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x070f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x070f }
            r9.<init>()     // Catch:{ Exception -> 0x070f }
            java.lang.String r13 = british.p015x.C1692config.f7108H5     // Catch:{ Exception -> 0x070f }
            r9.append(r13)     // Catch:{ Exception -> 0x070f }
            java.lang.String r13 = "/srv/imgs/videos_busc/v"
            r9.append(r13)     // Catch:{ Exception -> 0x070f }
            r9.append(r0)     // Catch:{ Exception -> 0x070f }
            java.lang.String r0 = "_"
            r9.append(r0)     // Catch:{ Exception -> 0x070f }
            java.lang.String r0 = r3.f8447b     // Catch:{ Exception -> 0x070f }
            r9.append(r0)     // Catch:{ Exception -> 0x070f }
            java.lang.String r0 = "_th.jpg"
            r9.append(r0)     // Catch:{ Exception -> 0x070f }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x070f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x070f }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ Exception -> 0x070f }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x070f }
            r0.setDoInput(r11)     // Catch:{ Exception -> 0x070f }
            r0.setConnectTimeout(r12)     // Catch:{ Exception -> 0x070f }
            r0.setReadTimeout(r8)     // Catch:{ Exception -> 0x070f }
            r0.connect()     // Catch:{ Exception -> 0x070f }
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x070f }
            android.graphics.Bitmap r16 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ OutOfMemoryError -> 0x06d9 }
            r9 = r16
            r8 = 1
            goto L_0x06dc
        L_0x06d9:
            r9 = r16
            r8 = 0
        L_0x06dc:
            r6.close()     // Catch:{ Exception -> 0x070f }
            r0.disconnect()     // Catch:{ Exception -> 0x070f }
            if (r8 == 0) goto L_0x070d
            british.x.config r0 = r1.f7973f     // Catch:{ Exception -> 0x070f }
            android.content.Context r6 = r1.f7969b     // Catch:{ Exception -> 0x070f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x070f }
            r8.<init>()     // Catch:{ Exception -> 0x070f }
            java.lang.String r12 = "fbuscvideo_"
            r8.append(r12)     // Catch:{ Exception -> 0x070f }
            java.lang.String r12 = r3.f8451f     // Catch:{ Exception -> 0x070f }
            r8.append(r12)     // Catch:{ Exception -> 0x070f }
            r8.append(r10)     // Catch:{ Exception -> 0x070f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x070f }
            java.io.File r0 = r0.mo7517m0(r6, r8)     // Catch:{ Exception -> 0x070f }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0713 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0713 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0713 }
            r9.compress(r0, r7, r6)     // Catch:{ Exception -> 0x0713 }
            goto L_0x0714
        L_0x070d:
            r11 = r8
            goto L_0x0714
        L_0x070f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0713:
            r11 = 0
        L_0x0714:
            if (r11 == 0) goto L_0x0748
            british.x.config r0 = r1.f7973f
            android.content.Context r6 = r1.f7969b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fbuscvideo_"
            r7.append(r8)
            java.lang.String r8 = r3.f8451f
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = r0.mo7517m0(r6, r7)
            british.x.config r6 = r1.f7973f     // Catch:{ Exception | OutOfMemoryError -> 0x0747 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0747 }
            r7 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r0 = r6.mo7477D(r0, r7, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0747 }
            r6 = 2131363233(0x7f0a05a1, float:1.834627E38)
            r4.setImageViewBitmap(r6, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0747 }
            goto L_0x0748
        L_0x0747:
            r11 = 0
        L_0x0748:
            if (r11 == 0) goto L_0x03fa
            r6 = 2131363237(0x7f0a05a5, float:1.8346277E38)
            r7 = 0
            r4.setViewVisibility(r6, r7)
            r6 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            r4.setViewVisibility(r6, r7)
            goto L_0x03fa
        L_0x0759:
            java.lang.String r6 = r3.f8446a
            java.lang.String r7 = "10"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x07a5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820882(0x7f110152, float:1.9274491E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r6 = r3.f8452g
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r6 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            r4.setTextViewText(r6, r5)
            r5 = 0
            r4.setViewVisibility(r6, r5)
            goto L_0x0808
        L_0x07a5:
            java.lang.String r6 = r3.f8446a
            java.lang.String r7 = "11"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0808
            java.lang.String r6 = r1.f7972e
            if (r6 == 0) goto L_0x07d6
            java.lang.String r7 = "es"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x07c5
            java.lang.String r6 = r1.f7972e
            java.lang.String r7 = "ca"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x07d6
        L_0x07c5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "A "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L_0x07d6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131820899(0x7f110163, float:1.9274526E38)
            java.lang.String r0 = r0.getString(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            boolean r5 = r1.f7978k
            if (r5 == 0) goto L_0x0801
            r5 = 2131363235(0x7f0a05a3, float:1.8346273E38)
            r6 = 0
            r4.setViewVisibility(r5, r6)
            goto L_0x0808
        L_0x0801:
            r6 = 0
            r5 = 2131363234(0x7f0a05a2, float:1.8346271E38)
            r4.setViewVisibility(r5, r6)
        L_0x0808:
            r5 = 2131363243(0x7f0a05ab, float:1.834629E38)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r4.setTextViewText(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r5 = "EXTRA_ITEM"
            r0.putInt(r5, r2)
            java.lang.String r2 = r3.f8446a
            java.lang.String r5 = "EXTRA_TIPO"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8447b
            java.lang.String r5 = "EXTRA_IDUSU"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8451f
            java.lang.String r5 = "EXTRA_IDELEM"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8452g
            java.lang.String r5 = "EXTRA_IDELEM_2"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8453h
            java.lang.String r5 = "EXTRA_IDELEM_3"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8454i
            java.lang.String r5 = "EXTRA_PRIVADOS"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8448c
            java.lang.String r5 = "EXTRA_NOMBRE"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8455j
            java.lang.String r5 = "EXTRA_COMENTS"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8456k
            java.lang.String r5 = "EXTRA_FNAC_D"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8457l
            java.lang.String r5 = "EXTRA_FNAC_M"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8458m
            java.lang.String r5 = "EXTRA_FNAC_A"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8459n
            java.lang.String r5 = "EXTRA_SEXO"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8450e
            java.lang.String r5 = "EXTRA_VFOTO"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8460o
            java.lang.String r5 = "EXTRA_FNAC_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8461p
            java.lang.String r5 = "EXTRA_SEXO_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8462q
            java.lang.String r5 = "EXTRA_DESCR_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8463r
            java.lang.String r5 = "EXTRA_DIST_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8464s
            java.lang.String r5 = "EXTRA_COMENTS_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8465t
            java.lang.String r5 = "EXTRA_GALERIA_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8466u
            java.lang.String r5 = "EXTRA_PRIVADOS_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8467v
            java.lang.String r5 = "EXTRA_FOTOS_PERFIL"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8468w
            java.lang.String r5 = "EXTRA_FOTOS_CHAT"
            r0.putString(r5, r2)
            java.lang.String r2 = r3.f8449d
            java.lang.String r3 = "EXTRA_FCREA"
            r0.putString(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.putExtras(r0)
            r0 = 2131363242(0x7f0a05aa, float:1.8346287E38)
            r4.setOnClickFillInIntent(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1869n3.getViewAt(int):android.widget.RemoteViews");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:28|29|30|31|(3:33|34|(4:36|38|39|50))|37|38|39|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x02a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDataSetChanged() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "#FF"
            java.lang.String r2 = ";"
            android.content.Context r3 = r1.f7969b
            android.content.Context r3 = r3.getApplicationContext()
            british.x.config r3 = (british.p015x.C1692config) r3
            r1.f7973f = r3
            if (r3 != 0) goto L_0x0013
            return
        L_0x0013:
            android.content.Context r3 = r1.f7969b
            java.lang.String r4 = "sh"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)
            r1.f7975h = r3
            r6 = 0
            java.lang.String r4 = "idusu"
            long r3 = r3.getLong(r4, r6)
            r1.f7976i = r3
            android.content.Context r3 = r1.f7969b
            java.io.File r3 = r3.getFilesDir()
            r1.f7974g = r3
            r3 = 1
            r1.f7977j = r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = british.p015x.C1692config.f7107G5
            r4.append(r6)
            java.lang.String r6 = "widget.e-droid.net/srv/widget_fb.php?widget=1&idusu="
            r4.append(r6)
            long r6 = r1.f7976i
            r4.append(r6)
            java.lang.String r6 = "&c="
            r4.append(r6)
            android.content.SharedPreferences r6 = r1.f7975h
            java.lang.String r7 = "cod"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.content.Context r6 = r1.f7969b
            android.appwidget.AppWidgetManager r6 = android.appwidget.AppWidgetManager.getInstance(r6)
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            android.content.Context r8 = r1.f7969b
            java.lang.String r8 = r8.getPackageName()
            r9 = 2131558702(0x7f0d012e, float:1.8742727E38)
            r7.<init>(r8, r9)
            r8 = 2131363231(0x7f0a059f, float:1.8346265E38)
            r9 = 8
            r7.setViewVisibility(r8, r9)
            r10 = 2131363240(0x7f0a05a8, float:1.8346283E38)
            r7.setViewVisibility(r10, r9)
            r11 = 2131363239(0x7f0a05a7, float:1.8346281E38)
            r7.setViewVisibility(r11, r5)
            int r12 = r1.f7970c
            r6.updateAppWidget(r12, r7)
            i9.b r12 = new i9.b     // Catch:{ Exception -> 0x02bf }
            r12.<init>()     // Catch:{ Exception -> 0x02bf }
            r13 = 10000(0x2710, float:1.4013E-41)
            p313i9.C12789c.m54266h(r12, r13)     // Catch:{ Exception -> 0x02bf }
            r13 = 60000(0xea60, float:8.4078E-41)
            p313i9.C12789c.m54267i(r12, r13)     // Catch:{ Exception -> 0x02bf }
            b9.h r13 = new b9.h     // Catch:{ Exception -> 0x02bf }
            r13.<init>(r12)     // Catch:{ Exception -> 0x02bf }
            l8.e r12 = new l8.e     // Catch:{ Exception -> 0x02bf }
            r12.<init>(r4)     // Catch:{ Exception -> 0x02bf }
            x8.g r4 = new x8.g     // Catch:{ Exception -> 0x02bf }
            x8.d r14 = p338x8.C12957d.BROWSER_COMPATIBLE     // Catch:{ Exception -> 0x02bf }
            r4.<init>(r14)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r4 = "User-Agent"
            java.lang.String r14 = "Android Vinebre Software"
            r12.mo47794K(r4, r14)     // Catch:{ Exception -> 0x02bf }
            g8.q r4 = r13.mo43518a(r12)     // Catch:{ Exception -> 0x02bf }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x02bf }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x02bf }
            g8.i r4 = r4.mo47805b()     // Catch:{ Exception -> 0x02bf }
            java.io.InputStream r4 = r4.mo43577k()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r14 = "UTF-8"
            r13.<init>(r4, r14)     // Catch:{ Exception -> 0x02bf }
            r12.<init>(r13)     // Catch:{ Exception -> 0x02bf }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            r4.<init>()     // Catch:{ Exception -> 0x02bf }
        L_0x00cf:
            java.lang.String r13 = r12.readLine()     // Catch:{ Exception -> 0x02bf }
            if (r13 == 0) goto L_0x00d9
            r4.append(r13)     // Catch:{ Exception -> 0x02bf }
            goto L_0x00cf
        L_0x00d9:
            java.lang.String r12 = "ANDROID:OK CAD:"
            int r12 = r4.indexOf(r12)     // Catch:{ Exception -> 0x02bf }
            r13 = -1
            if (r12 == r13) goto L_0x02c3
            r14 = 15
            int r12 = r12 + r14
            java.lang.String r4 = r4.substring(r12)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r12 = "@"
            java.lang.String[] r4 = r4.split(r12)     // Catch:{ Exception -> 0x02bf }
            int r12 = r4.length     // Catch:{ Exception -> 0x02bf }
            if (r12 <= 0) goto L_0x02c3
            r12 = r4[r5]     // Catch:{ Exception -> 0x02bf }
            int r12 = r12.indexOf(r2)     // Catch:{ Exception -> 0x02bf }
            if (r12 == r13) goto L_0x02c3
            r12 = r4[r5]     // Catch:{ Exception -> 0x02bf }
            java.lang.String[] r12 = r12.split(r2)     // Catch:{ Exception -> 0x02bf }
            r13 = r12[r5]     // Catch:{ Exception -> 0x02bf }
            java.lang.String r15 = "1"
            boolean r13 = r13.equals(r15)     // Catch:{ Exception -> 0x02bf }
            r1.f7977j = r13     // Catch:{ Exception -> 0x02bf }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            r13.<init>()     // Catch:{ Exception -> 0x02bf }
            r13.append(r0)     // Catch:{ Exception -> 0x02bf }
            r15 = r12[r3]     // Catch:{ Exception -> 0x02bf }
            r13.append(r15)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x02bf }
            int r13 = android.graphics.Color.parseColor(r13)     // Catch:{ Exception -> 0x02bf }
            r1.f7979l = r13     // Catch:{ Exception -> 0x02bf }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            r13.<init>()     // Catch:{ Exception -> 0x02bf }
            r13.append(r0)     // Catch:{ Exception -> 0x02bf }
            r15 = r12[r3]     // Catch:{ Exception -> 0x02bf }
            r13.append(r15)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x02bf }
            boolean r13 = british.p015x.C1692config.m8153I(r13)     // Catch:{ Exception -> 0x02bf }
            r1.f7978k = r13     // Catch:{ Exception -> 0x02bf }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            r13.<init>()     // Catch:{ Exception -> 0x02bf }
            r13.append(r0)     // Catch:{ Exception -> 0x02bf }
            r0 = 2
            r12 = r12[r0]     // Catch:{ Exception -> 0x02bf }
            r13.append(r12)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x02bf }
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x02bf }
            r1.f7980m = r12     // Catch:{ Exception -> 0x02bf }
            r12 = 2131363241(0x7f0a05a9, float:1.8346285E38)
            java.lang.String r13 = "setBackgroundColor"
            int r15 = r1.f7979l     // Catch:{ Exception -> 0x02bf }
            r7.setInt(r12, r13, r15)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r12 = "setTextColor"
            int r13 = r1.f7980m     // Catch:{ Exception -> 0x02bf }
            r7.setInt(r8, r12, r13)     // Catch:{ Exception -> 0x02bf }
            int r12 = r4.length     // Catch:{ Exception -> 0x02bf }
            if (r12 <= r3) goto L_0x018d
            r12 = r4[r3]     // Catch:{ Exception -> 0x02bf }
            java.lang.String r13 = "SIGNUP;"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x02bf }
            if (r12 == 0) goto L_0x018d
            r7.setViewVisibility(r11, r9)     // Catch:{ Exception -> 0x02bf }
            r7.setViewVisibility(r10, r5)     // Catch:{ Exception -> 0x02bf }
            android.content.Context r0 = r1.f7969b     // Catch:{ Exception -> 0x02bf }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x02bf }
            r2 = 2131821042(0x7f1101f2, float:1.9274816E38)
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x02bf }
            r7.setTextViewText(r8, r0)     // Catch:{ Exception -> 0x02bf }
            r7.setViewVisibility(r8, r5)     // Catch:{ Exception -> 0x02bf }
            int r0 = r1.f7970c     // Catch:{ Exception -> 0x02bf }
            r6.updateAppWidget(r0, r7)     // Catch:{ Exception -> 0x02bf }
            return
        L_0x018d:
            java.util.List<british.x.r3> r12 = r1.f7968a     // Catch:{ Exception -> 0x02bf }
            r12.clear()     // Catch:{ Exception -> 0x02bf }
            r12 = 1
        L_0x0193:
            int r13 = r4.length     // Catch:{ Exception -> 0x02bf }
            if (r12 >= r13) goto L_0x02c3
            r13 = r4[r12]     // Catch:{ Exception -> 0x02bf }
            boolean r13 = r13.contains(r2)     // Catch:{ Exception -> 0x02bf }
            if (r13 == 0) goto L_0x02ab
            r13 = r4[r12]     // Catch:{ Exception -> 0x02bf }
            java.lang.String[] r13 = r13.split(r2)     // Catch:{ Exception -> 0x02bf }
            int r15 = r13.length     // Catch:{ Exception -> 0x02bf }
            if (r15 <= r0) goto L_0x02ab
            r15 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r8 = r13[r3]     // Catch:{ Exception -> 0x02bf }
            r5 = r13[r0]     // Catch:{ Exception -> 0x02bf }
            r16 = 3
            r0 = r13[r16]     // Catch:{ Exception -> 0x02bf }
            r16 = 4
            r16 = r13[r16]     // Catch:{ Exception -> 0x02bf }
            r17 = 5
            r10 = r13[r17]     // Catch:{ Exception -> 0x02bf }
            british.x.r3 r11 = new british.x.r3     // Catch:{ Exception -> 0x02bf }
            r11.<init>()     // Catch:{ Exception -> 0x02bf }
            r11.f8446a = r15     // Catch:{ Exception -> 0x02bf }
            r11.f8447b = r8     // Catch:{ Exception -> 0x02bf }
            r11.f8448c = r5     // Catch:{ Exception -> 0x02bf }
            r11.f8450e = r0     // Catch:{ Exception -> 0x02bf }
            r11.f8451f = r10     // Catch:{ Exception -> 0x02bf }
            r0 = 6
            r5 = r13[r0]     // Catch:{ Exception -> 0x02bf }
            r11.f8452g = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 7
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8454i = r5     // Catch:{ Exception -> 0x02bf }
            r5 = r13[r9]     // Catch:{ Exception -> 0x02bf }
            r11.f8456k = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 9
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8457l = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 10
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8458m = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 11
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8459n = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 12
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8455j = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 13
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8467v = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 14
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8466u = r5     // Catch:{ Exception -> 0x02bf }
            r5 = r13[r14]     // Catch:{ Exception -> 0x02bf }
            r11.f8468w = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 16
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8464s = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 17
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8460o = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 18
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8461p = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 19
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8462q = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 20
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8465t = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 21
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8463r = r5     // Catch:{ Exception -> 0x02bf }
            r5 = 22
            r5 = r13[r5]     // Catch:{ Exception -> 0x02bf }
            r11.f8453h = r5     // Catch:{ Exception -> 0x02bf }
            java.lang.String r5 = british.p015x.C1692config.m8200u(r16)     // Catch:{ Exception -> 0x02bf }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x02bf }
            java.lang.String r10 = "ddMMyyHHmm"
            r8.<init>(r10)     // Catch:{ Exception -> 0x02bf }
            android.content.Context r10 = r1.f7969b     // Catch:{ Exception -> 0x02a6 }
            java.text.DateFormat r10 = android.text.format.DateFormat.getDateFormat(r10)     // Catch:{ Exception -> 0x02a6 }
            android.content.Context r13 = r1.f7969b     // Catch:{ Exception -> 0x02a6 }
            java.text.DateFormat r13 = android.text.format.DateFormat.getTimeFormat(r13)     // Catch:{ Exception -> 0x02a6 }
            java.util.Date r5 = r8.parse(r5)     // Catch:{ Exception -> 0x02a6 }
            java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x02a6 }
            java.util.Calendar r15 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x02a6 }
            r15.setTime(r5)     // Catch:{ Exception -> 0x02a6 }
            int r14 = r15.get(r3)     // Catch:{ Exception -> 0x02a6 }
            int r9 = r8.get(r3)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r3 = " "
            if (r14 != r9) goto L_0x028a
            int r9 = r15.get(r0)     // Catch:{ Exception -> 0x02a6 }
            int r0 = r8.get(r0)     // Catch:{ Exception -> 0x02a6 }
            if (r9 != r0) goto L_0x028a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a6 }
            r0.<init>()     // Catch:{ Exception -> 0x02a6 }
            android.content.Context r8 = r1.f7969b     // Catch:{ Exception -> 0x02a6 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Exception -> 0x02a6 }
            r9 = 2131820893(0x7f11015d, float:1.9274514E38)
            java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r8)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r3)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r3 = r13.format(r5)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r3)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a6 }
            r11.f8449d = r0     // Catch:{ Exception -> 0x02a6 }
            goto L_0x02a6
        L_0x028a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a6 }
            r0.<init>()     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r8 = r10.format(r5)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r8)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r3)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r3 = r13.format(r5)     // Catch:{ Exception -> 0x02a6 }
            r0.append(r3)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a6 }
            r11.f8449d = r0     // Catch:{ Exception -> 0x02a6 }
        L_0x02a6:
            java.util.List<british.x.r3> r0 = r1.f7968a     // Catch:{ Exception -> 0x02bf }
            r0.add(r11)     // Catch:{ Exception -> 0x02bf }
        L_0x02ab:
            int r12 = r12 + 1
            r0 = 2
            r3 = 1
            r5 = 0
            r8 = 2131363231(0x7f0a059f, float:1.8346265E38)
            r9 = 8
            r10 = 2131363240(0x7f0a05a8, float:1.8346283E38)
            r11 = 2131363239(0x7f0a05a7, float:1.8346281E38)
            r14 = 15
            goto L_0x0193
        L_0x02bf:
            r0 = move-exception
            r0.printStackTrace()
        L_0x02c3:
            r2 = 2131363239(0x7f0a05a7, float:1.8346281E38)
            r3 = 8
            r7.setViewVisibility(r2, r3)
            r2 = 2131363240(0x7f0a05a8, float:1.8346283E38)
            r3 = 0
            r7.setViewVisibility(r2, r3)
            java.util.List<british.x.r3> r0 = r1.f7968a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02f0
            android.content.Context r0 = r1.f7969b
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131821064(0x7f110208, float:1.927486E38)
            java.lang.String r0 = r0.getString(r2)
            r2 = 2131363231(0x7f0a059f, float:1.8346265E38)
            r7.setTextViewText(r2, r0)
            r7.setViewVisibility(r2, r3)
        L_0x02f0:
            int r0 = r1.f7970c
            r6.updateAppWidget(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1869n3.onDataSetChanged():void");
    }

    public void onDestroy() {
        this.f7968a.clear();
    }
}
