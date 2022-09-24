package british.p015x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C0742v;
import androidx.loader.app.C0798a;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import p128p0.C5880d;
import p172x0.C6338b;
import p172x0.C6339c;

/* renamed from: british.x.t_buscador_fr */
public class t_buscador_fr extends C0742v implements C0798a.C0799a<Cursor> {

    /* renamed from: A0 */
    String f8600A0 = SessionDescription.SUPPORTED_SDP_VERSION;

    /* renamed from: B0 */
    boolean f8601B0;

    /* renamed from: C0 */
    boolean f8602C0;

    /* renamed from: D0 */
    boolean f8603D0;

    /* renamed from: E0 */
    boolean f8604E0;

    /* renamed from: F0 */
    C1692config f8605F0;

    /* renamed from: G0 */
    SharedPreferences f8606G0;

    /* renamed from: H0 */
    C2094c f8607H0;

    /* renamed from: I0 */
    C2095d f8608I0;

    /* renamed from: J0 */
    Bundle f8609J0;

    /* renamed from: K0 */
    GradientDrawable f8610K0;

    /* renamed from: L0 */
    Drawable f8611L0;

    /* renamed from: M0 */
    Drawable f8612M0;

    /* renamed from: N0 */
    int f8613N0 = -1;

    /* renamed from: O0 */
    View f8614O0;

    /* renamed from: P0 */
    private C2093b f8615P0;

    /* renamed from: Q0 */
    private C5880d f8616Q0;

    /* renamed from: x0 */
    long f8617x0;

    /* renamed from: y0 */
    int f8618y0;

    /* renamed from: z0 */
    int f8619z0;

    /* renamed from: british.x.t_buscador_fr$a */
    class C2092a implements C5880d.C5882b {
        C2092a() {
        }

        /* renamed from: a */
        public boolean mo8201a(View view, Cursor cursor, int i) {
            C2094c cVar;
            boolean z;
            String str;
            boolean z2;
            LinearLayout linearLayout;
            Date date = null;
            if (view.getId() == R.id.iv_item) {
                C1692config config = t_buscador_fr.this.f8605F0;
                if (config.f7207K1 == 1 && !config.f7159C1.equals("") && !t_buscador_fr.this.f8605F0.f7165D1.equals("")) {
                    try {
                        linearLayout = (LinearLayout) view.getParent().getParent().getParent().getParent();
                        z2 = true;
                    } catch (Exception unused) {
                        linearLayout = null;
                        z2 = false;
                    }
                    if (z2) {
                        linearLayout.setBackgroundDrawable(t_buscador_fr.this.f8610K0);
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view.getParent().getParent().getParent();
                if (t_buscador_fr.this.f8601B0) {
                    ImageView imageView = (ImageView) frameLayout.findViewById(R.id.iv_item_sel);
                    int position = cursor.getPosition();
                    t_buscador_fr t_buscador_fr = t_buscador_fr.this;
                    if (position == t_buscador_fr.f8613N0) {
                        imageView.setImageDrawable(t_buscador_fr.f8611L0);
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                } else {
                    frameLayout.findViewById(R.id.ll_item_der).setVisibility(8);
                }
                ImageView imageView2 = (ImageView) view;
                if (cursor.getInt(cursor.getColumnIndex("img1_id")) == 0 && cursor.getString(cursor.getColumnIndex("img1_url")).equals("")) {
                    imageView2.setImageDrawable((Drawable) null);
                } else if (!cursor.isNull(i)) {
                    byte[] blob = cursor.getBlob(i);
                    imageView2.setImageBitmap(BitmapFactory.decodeByteArray(blob, 0, blob.length));
                } else {
                    imageView2.setImageDrawable(t_buscador_fr.this.mo3380N().getDrawable(R.drawable.loader_g));
                }
                if (!t_buscador_fr.this.f8603D0) {
                    imageView2.setVisibility(8);
                }
                return true;
            } else if (view.getId() == R.id.title) {
                TextView textView = (TextView) view;
                textView.setTypeface(Typeface.MONOSPACE);
                if (!t_buscador_fr.this.f8605F0.f7171E1.equals("")) {
                    textView.setTextColor(Color.parseColor("#" + t_buscador_fr.this.f8605F0.f7171E1));
                }
                return false;
            } else if (view.getId() == R.id.precio) {
                view.setVisibility(8);
                if (cursor.isNull(cursor.getColumnIndex("precio"))) {
                    return false;
                }
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setCurrency(Currency.getInstance(Locale.getDefault()));
                String format = decimalFormat.format(cursor.getDouble(cursor.getColumnIndex("precio")));
                if (format.length() > 1) {
                    String substring = format.substring(format.length() - 2, format.length() - 1);
                    if (substring.equals(",") || substring.equals(".")) {
                        format = format + SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                }
                TextView textView2 = (TextView) view;
                textView2.setTypeface(Typeface.MONOSPACE);
                if (t_buscador_fr.this.f8605F0.f7224N0.equals("")) {
                    textView2.setText(format + ".");
                } else {
                    textView2.setText(format + " " + Html.fromHtml(t_buscador_fr.this.f8605F0.f7224N0));
                }
                if (!t_buscador_fr.this.f8605F0.f7177F1.equals("")) {
                    textView2.setTextColor(Color.parseColor("#" + t_buscador_fr.this.f8605F0.f7177F1));
                }
                textView2.setVisibility(0);
                return true;
            } else if (view.getId() == R.id.antiguedad) {
                view.setVisibility(8);
                int i2 = cursor.getInt(cursor.getColumnIndex("anyo"));
                if (i2 != 0) {
                    String str2 = i2 + "";
                    int i3 = cursor.getInt(cursor.getColumnIndex("mes"));
                    String str3 = i3 + "";
                    boolean equals = str3.equals(SessionDescription.SUPPORTED_SDP_VERSION);
                    String str4 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    if (equals) {
                        str3 = str4;
                    }
                    int i4 = cursor.getInt(cursor.getColumnIndex("dia"));
                    String str5 = i4 + "";
                    if (!str5.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                        str4 = str5;
                    }
                    try {
                        date = DateFormat.getDateInstance(3, Locale.US).parse(str3 + "/" + str4 + "/" + str2);
                        z = true;
                    } catch (Exception unused2) {
                        z = false;
                    }
                    if (z) {
                        if (i3 == 0) {
                            str = i2 + "";
                        } else if (i4 == 0) {
                            String format2 = String.format(Locale.getDefault(), "%tB", new Object[]{date});
                            str = (format2.substring(0, 1).toUpperCase() + format2.substring(1)) + ", " + i2;
                        } else {
                            str = DateFormat.getDateInstance().format(date);
                        }
                        TextView textView3 = (TextView) view;
                        textView3.setTypeface(Typeface.MONOSPACE);
                        textView3.setText(str);
                        if (!t_buscador_fr.this.f8605F0.f7183G1.equals("")) {
                            textView3.setTextColor(Color.parseColor("#" + t_buscador_fr.this.f8605F0.f7183G1));
                        }
                        textView3.setVisibility(0);
                        return true;
                    }
                }
                return false;
            } else {
                if (view.getId() == R.id.tv_aux && cursor.getPosition() == cursor.getCount() - 1) {
                    t_buscador_fr t_buscador_fr2 = t_buscador_fr.this;
                    if (!t_buscador_fr2.f8602C0 && ((cVar = t_buscador_fr2.f8607H0) == null || cVar.getStatus() != AsyncTask.Status.RUNNING)) {
                        t_buscador_fr.this.f8618y0 = cursor.getCount();
                        t_buscador_fr.this.f8607H0 = new C2094c(cursor.getCount() + 1);
                        t_buscador_fr.this.f8607H0.execute(new String[0]);
                    }
                }
                return false;
            }
        }
    }

    /* renamed from: british.x.t_buscador_fr$b */
    public interface C2093b {
        /* renamed from: k */
        void mo8185k(String str, long j);
    }

    /* renamed from: british.x.t_buscador_fr$c */
    private class C2094c extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        int f8621a;

        /* renamed from: b */
        String f8622b;

        public C2094c(int i) {
            this.f8621a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01e0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r0 = "texto"
                java.lang.String r8 = r8.getString(r0)
                java.lang.String r1 = "UTF-8"
                java.lang.String r2 = ""
                if (r8 == 0) goto L_0x0032
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0031 }
                r8.<init>()     // Catch:{ Exception -> 0x0031 }
                r8.append(r2)     // Catch:{ Exception -> 0x0031 }
                java.lang.String r3 = "&texto="
                r8.append(r3)     // Catch:{ Exception -> 0x0031 }
                british.x.t_buscador_fr r3 = british.p015x.t_buscador_fr.this     // Catch:{ Exception -> 0x0031 }
                android.os.Bundle r3 = r3.f8609J0     // Catch:{ Exception -> 0x0031 }
                java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0031 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ Exception -> 0x0031 }
                r8.append(r0)     // Catch:{ Exception -> 0x0031 }
                java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x0031 }
                goto L_0x0032
            L_0x0031:
            L_0x0032:
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r0 = "idcat"
                r3 = 0
                int r8 = r8.getInt(r0, r3)
                if (r8 == 0) goto L_0x005b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r2)
                java.lang.String r2 = "&idcat="
                r8.append(r2)
                british.x.t_buscador_fr r2 = british.p015x.t_buscador_fr.this
                android.os.Bundle r2 = r2.f8609J0
                int r0 = r2.getInt(r0)
                r8.append(r0)
                java.lang.String r2 = r8.toString()
            L_0x005b:
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r0 = "precio"
                java.lang.String r8 = r8.getString(r0)
                if (r8 == 0) goto L_0x0089
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088 }
                r8.<init>()     // Catch:{ Exception -> 0x0088 }
                r8.append(r2)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r4 = "&precio="
                r8.append(r4)     // Catch:{ Exception -> 0x0088 }
                british.x.t_buscador_fr r4 = british.p015x.t_buscador_fr.this     // Catch:{ Exception -> 0x0088 }
                android.os.Bundle r4 = r4.f8609J0     // Catch:{ Exception -> 0x0088 }
                java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ Exception -> 0x0088 }
                r8.append(r0)     // Catch:{ Exception -> 0x0088 }
                java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x0088 }
                goto L_0x0089
            L_0x0088:
            L_0x0089:
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r0 = "dia"
                int r8 = r8.getInt(r0, r3)
                if (r8 == 0) goto L_0x00ed
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r2)
                java.lang.String r1 = "&dia="
                r8.append(r1)
                british.x.t_buscador_fr r1 = british.p015x.t_buscador_fr.this
                android.os.Bundle r1 = r1.f8609J0
                int r0 = r1.getInt(r0)
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = "&mes="
                r0.append(r8)
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r1 = "mes"
                int r8 = r8.getInt(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = "&anyo="
                r0.append(r8)
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r1 = "anyo"
                int r8 = r8.getInt(r1)
                r0.append(r8)
                java.lang.String r2 = r0.toString()
            L_0x00ed:
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r0 = "orden"
                int r8 = r8.getInt(r0, r3)
                if (r8 == 0) goto L_0x0133
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r2)
                java.lang.String r1 = "&orden="
                r8.append(r1)
                british.x.t_buscador_fr r1 = british.p015x.t_buscador_fr.this
                android.os.Bundle r1 = r1.f8609J0
                int r0 = r1.getInt(r0)
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                java.lang.String r8 = "&orden_tipo="
                r0.append(r8)
                british.x.t_buscador_fr r8 = british.p015x.t_buscador_fr.this
                android.os.Bundle r8 = r8.f8609J0
                java.lang.String r1 = "orden_tipo"
                boolean r8 = r8.getBoolean(r1)
                r0.append(r8)
                java.lang.String r2 = r0.toString()
            L_0x0133:
                r8 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x01d3 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d3 }
                r1.<init>()     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r4 = british.p015x.C1692config.f7109I5     // Catch:{ Exception -> 0x01d3 }
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r4 = "/srv/result.php?v=2&idapp="
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                r4 = 2261075(0x228053, float:3.168441E-39)
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r4 = "&idusu="
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                british.x.t_buscador_fr r4 = british.p015x.t_buscador_fr.this     // Catch:{ Exception -> 0x01d3 }
                long r4 = r4.f8617x0     // Catch:{ Exception -> 0x01d3 }
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r4 = "&fila="
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                int r4 = r7.f8621a     // Catch:{ Exception -> 0x01d3 }
                r1.append(r4)     // Catch:{ Exception -> 0x01d3 }
                r1.append(r2)     // Catch:{ Exception -> 0x01d3 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01d3 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x01d3 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x01d3 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x01d3 }
                r8 = 1
                r0.setDoInput(r8)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r8 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r8)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r0.setReadTimeout(r8)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.lang.String r8 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r8, r1)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.io.InputStream r8 = r0.getInputStream()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r2.<init>(r8)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r1.<init>(r2)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r8.<init>()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
            L_0x0197:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                if (r2 == 0) goto L_0x01b2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r4.<init>()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r4.append(r2)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.lang.String r2 = "\n"
                r4.append(r2)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r8.append(r2)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                goto L_0x0197
            L_0x01b2:
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r7.f8622b = r8     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                java.lang.String r1 = "@EURO@"
                java.lang.String r2 = "€"
                java.lang.String r8 = r8.replace(r1, r2)     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r7.f8622b = r8     // Catch:{ Exception -> 0x01cc, all -> 0x01ca }
                r0.disconnect()
                java.lang.Byte r8 = java.lang.Byte.valueOf(r3)
                return r8
            L_0x01ca:
                r8 = move-exception
                goto L_0x01de
            L_0x01cc:
                r8 = r0
                goto L_0x01d3
            L_0x01ce:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
                goto L_0x01de
            L_0x01d3:
                r0 = -1
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x01ce }
                if (r8 == 0) goto L_0x01dd
                r8.disconnect()
            L_0x01dd:
                return r0
            L_0x01de:
                if (r0 == 0) goto L_0x01e3
                r0.disconnect()
            L_0x01e3:
                goto L_0x01e5
            L_0x01e4:
                throw r8
            L_0x01e5:
                goto L_0x01e4
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscador_fr.C2094c.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (t_buscador_fr.this.mo3443p() != null) {
                t_buscador_fr t_buscador_fr = t_buscador_fr.this;
                t_buscador_fr.f8604E0 = false;
                t_buscador_fr.mo3919S1(true);
                t_buscador_fr.this.mo3915O1().removeFooterView(t_buscador_fr.this.f8614O0);
                if (b.byteValue() == 0 && !this.f8622b.contains("ANDROID:ERROR")) {
                    if (this.f8622b.contains("ANDROID:VACIO")) {
                        t_buscador_fr t_buscador_fr2 = t_buscador_fr.this;
                        t_buscador_fr2.mo3917Q1(t_buscador_fr2.mo3380N().getString(R.string.sin_resultados));
                        return;
                    }
                    String[] split = this.f8622b.split(";");
                    for (int i = 0; i < split.length; i++) {
                        if (split[i].trim().equals("SIHAYFOTOS")) {
                            t_buscador_fr.this.f8603D0 = true;
                        } else if (split[i].trim().equals("NOHAYFOTOS")) {
                            t_buscador_fr.this.f8603D0 = false;
                        } else if (split[i].trim().equals("FIN")) {
                            t_buscador_fr.this.f8602C0 = true;
                        } else if (!split[i].trim().equals("")) {
                            t_buscador_fr.this.f8618y0++;
                            String[] split2 = split[i].split(",");
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("_id", split2[0].trim());
                            contentValues.put("ref", "");
                            contentValues.put("titulo", split2[1].trim());
                            contentValues.put("descr", "");
                            contentValues.put("idcat", SessionDescription.SUPPORTED_SDP_VERSION);
                            contentValues.put("precio_descr", "");
                            contentValues.put("url_detalle", split2[4].trim());
                            contentValues.put("url_compra", "");
                            contentValues.put("img1_id", split2[2].trim());
                            String trim = split2[3].trim();
                            if (trim.equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                                contentValues.put("img1_url", "");
                            } else {
                                contentValues.put("img1_url", trim);
                            }
                            contentValues.put("det_cargado", 0);
                            String trim2 = split2[5].trim();
                            if (!trim2.equals("-1")) {
                                contentValues.put("precio", trim2);
                            }
                            contentValues.put("anyo", split2[6].trim());
                            contentValues.put("mes", split2[7].trim());
                            contentValues.put("dia", split2[8].trim());
                            t_buscador_fr.this.mo3443p().getContentResolver().insert(bd_provider.f6882c, contentValues);
                            t_buscador_fr.this.f8619z0++;
                        }
                    }
                    C2095d dVar = t_buscador_fr.this.f8608I0;
                    if (dVar == null || dVar.getStatus() != AsyncTask.Status.RUNNING) {
                        t_buscador_fr t_buscador_fr3 = t_buscador_fr.this;
                        t_buscador_fr3.f8608I0 = new C2095d();
                        t_buscador_fr.this.f8608I0.execute(new String[0]);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f8621a > 1) {
                t_buscador_fr t_buscador_fr = t_buscador_fr.this;
                if (t_buscador_fr.f8614O0 != null) {
                    t_buscador_fr.mo3915O1().addFooterView(t_buscador_fr.this.f8614O0);
                }
            }
        }
    }

    /* renamed from: british.x.t_buscador_fr$d */
    private class C2095d extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f8624a;

        /* renamed from: b */
        String f8625b;

        private C2095d() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r20) {
            /*
                r19 = this;
                r0 = r19
                british.x.t_buscador_fr r1 = british.p015x.t_buscador_fr.this
                androidx.fragment.app.FragmentActivity r1 = r1.mo3443p()
                r2 = -1
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                if (r1 != 0) goto L_0x0010
                return r2
            L_0x0010:
                java.lang.String r1 = "0"
                r0.f8625b = r1
                british.x.q r3 = new british.x.q
                british.x.t_buscador_fr r4 = british.p015x.t_buscador_fr.this
                androidx.fragment.app.FragmentActivity r4 = r4.mo3443p()
                r3.<init>(r4)
                android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ Exception -> 0x0024 }
                goto L_0x0025
            L_0x0024:
                r3 = 0
            L_0x0025:
                java.lang.String r14 = ""
                if (r3 == 0) goto L_0x00ad
                java.lang.String r13 = "_id"
                java.lang.String r12 = "img1_id"
                java.lang.String r11 = "img1_url"
                java.lang.String[] r7 = new java.lang.String[]{r13, r12, r11}
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "(img1_id NOT IN ("
                r5.append(r6)
                british.x.t_buscador_fr r6 = british.p015x.t_buscador_fr.this
                java.lang.String r6 = r6.f8600A0
                r5.append(r6)
                java.lang.String r6 = ")) AND (img1_p IS NULL)"
                r5.append(r6)
                java.lang.String r8 = r5.toString()
                r9 = 0
                r10 = 0
                r16 = 0
                java.lang.String r6 = "productos"
                java.lang.String r17 = "_id"
                java.lang.String r18 = "1"
                r5 = r3
                r15 = r11
                r11 = r16
                r4 = r12
                r12 = r17
                r17 = r2
                r2 = r13
                r13 = r18
                android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r6 = r5.moveToFirst()
                if (r6 == 0) goto L_0x00a4
                int r4 = r5.getColumnIndex(r4)
                java.lang.String r4 = r5.getString(r4)
                r0.f8625b = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                british.x.t_buscador_fr r6 = british.p015x.t_buscador_fr.this
                java.lang.String r7 = r6.f8600A0
                r4.append(r7)
                java.lang.String r7 = ","
                r4.append(r7)
                java.lang.String r7 = r0.f8625b
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r6.f8600A0 = r4
                int r2 = r5.getColumnIndex(r2)
                int r2 = r5.getInt(r2)
                int r4 = r5.getColumnIndex(r15)
                java.lang.String r4 = r5.getString(r4)
                goto L_0x00a6
            L_0x00a4:
                r4 = r14
                r2 = 0
            L_0x00a6:
                r5.close()
                r3.close()
                goto L_0x00b1
            L_0x00ad:
                r17 = r2
                r4 = r14
                r2 = 0
            L_0x00b1:
                java.lang.String r3 = r0.f8625b
                boolean r1 = r3.equals(r1)
                r3 = 1
                if (r1 == 0) goto L_0x00bf
                java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
                return r1
            L_0x00bf:
                boolean r1 = r4.equals(r14)
                if (r1 == 0) goto L_0x00ea
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = british.p015x.C1692config.f7109I5
                r1.append(r4)
                java.lang.String r4 = "/srv/imgs/prods/"
                r1.append(r4)
                java.lang.String r4 = r0.f8625b
                r1.append(r4)
                java.lang.String r4 = "_"
                r1.append(r4)
                r1.append(r2)
                java.lang.String r2 = "_p.png"
                r1.append(r2)
                java.lang.String r4 = r1.toString()
            L_0x00ea:
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0162 }
                r1.<init>(r4)     // Catch:{ MalformedURLException -> 0x0162 }
                java.net.URLConnection r2 = r1.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{  }
                r2.setDoInput(r3)     // Catch:{  }
                r4 = 5000(0x1388, float:7.006E-42)
                r2.setConnectTimeout(r4)     // Catch:{  }
                r5 = 7000(0x1b58, float:9.809E-42)
                r2.setReadTimeout(r5)     // Catch:{  }
                r2.connect()     // Catch:{  }
                java.io.InputStream r6 = r2.getInputStream()     // Catch:{  }
                android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{  }
                r7.<init>()     // Catch:{  }
                r7.inJustDecodeBounds = r3     // Catch:{  }
                r8 = 0
                android.graphics.BitmapFactory.decodeStream(r6, r8, r7)     // Catch:{  }
                r6.close()     // Catch:{  }
                r2.disconnect()     // Catch:{  }
                british.x.t_buscador_fr r2 = british.p015x.t_buscador_fr.this     // Catch:{  }
                british.x.config r2 = r2.f8605F0     // Catch:{  }
                r2 = 300(0x12c, float:4.2E-43)
                int r2 = british.p015x.C1692config.m8192m(r7, r2, r2)     // Catch:{  }
                r7.inSampleSize = r2     // Catch:{  }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{  }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{  }
                r1.setDoInput(r3)     // Catch:{  }
                r1.setConnectTimeout(r4)     // Catch:{  }
                r1.setReadTimeout(r5)     // Catch:{  }
                r1.connect()     // Catch:{  }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{  }
                r2 = 0
                r7.inJustDecodeBounds = r2     // Catch:{  }
                r2 = 0
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1, r2, r7)     // Catch:{  }
                r1.close()     // Catch:{  }
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r1.<init>()
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{  }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{  }
                byte[] r2 = r1.toByteArray()
                r0.f8624a = r2
                r1.close()     // Catch:{ IOException -> 0x015c }
            L_0x015c:
                r1 = 0
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                return r1
            L_0x0162:
                return r17
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_buscador_fr.C2095d.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Byte b) {
            if (t_buscador_fr.this.mo3443p() != null) {
                if (b.byteValue() == 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("img1_p", this.f8624a);
                    ContentResolver contentResolver = t_buscador_fr.this.mo3443p().getContentResolver();
                    Uri uri = bd_provider.f6882c;
                    contentResolver.update(uri, contentValues, "img1_id='" + this.f8625b + "'", (String[]) null);
                }
                if (b.byteValue() != 1) {
                    t_buscador_fr t_buscador_fr = t_buscador_fr.this;
                    t_buscador_fr.f8608I0 = new C2095d();
                    t_buscador_fr.this.f8608I0.execute(new String[0]);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        bundle.putBoolean("hayfotos", this.f8603D0);
        bundle.putBoolean("mostrar_loader", this.f8604E0);
        bundle.putBoolean("fin", this.f8602C0);
        bundle.putInt("ncargados", this.f8619z0);
    }

    /* renamed from: P1 */
    public void mo3916P1(ListView listView, View view, int i, long j) {
        if (!this.f8605F0.f7189H1.equals("")) {
            this.f8613N0 = i;
            this.f8616Q0.notifyDataSetChanged();
        }
        Cursor query = mo3443p().getContentResolver().query(Uri.withAppendedPath(bd_provider.f6882c, String.valueOf(j)), new String[]{"url_detalle"}, (String) null, (String[]) null, (String) null);
        if (query.moveToFirst()) {
            this.f8615P0.mo8185k(query.getString(0), j);
        }
        query.close();
    }

    /* renamed from: U1 */
    public void mo4035d(C6339c<Cursor> cVar, Cursor cursor) {
        this.f8616Q0.mo22818j(cursor);
    }

    /* renamed from: e */
    public C6339c<Cursor> mo4036e(int i, Bundle bundle) {
        return new C6338b(mo3443p(), bd_provider.f6882c, new String[]{"_id", "titulo", "precio", "anyo", "mes", "dia", "url_detalle", "img1_p", "img1_id", "img1_url"}, (String) null, (String[]) null, "orden");
    }

    /* renamed from: j */
    public void mo4037j(C6339c<Cursor> cVar) {
        this.f8616Q0.mo22818j((Cursor) null);
    }

    /* renamed from: n0 */
    public void mo3435n0(Bundle bundle) {
        C2094c cVar;
        super.mo3435n0(bundle);
        View inflate = ((LayoutInflater) mo3443p().getSystemService("layout_inflater")).inflate(R.layout.list_footer, (ViewGroup) null, false);
        this.f8614O0 = inflate;
        inflate.findViewById(R.id.tv_footer).setBackgroundColor(-1);
        if (!this.f8601B0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            ((TextView) this.f8614O0.findViewById(R.id.tv_footer)).setLayoutParams(layoutParams);
        }
        mo3915O1().addFooterView(this.f8614O0);
        mo3918R1(this.f8616Q0);
        mo3915O1().removeFooterView(this.f8614O0);
        if (this.f8604E0) {
            mo3919S1(false);
        }
        mo3915O1().setCacheColorHint(0);
        C1692config config = this.f8605F0;
        if (config.f7207K1 == 0 && !config.f7159C1.equals("") && !this.f8605F0.f7165D1.equals("")) {
            mo3915O1().setBackgroundDrawable(this.f8610K0);
        }
        if (!this.f8602C0 && ((cVar = this.f8607H0) == null || cVar.getStatus() != AsyncTask.Status.RUNNING)) {
            C2094c cVar2 = new C2094c(this.f8619z0 + 1);
            this.f8607H0 = cVar2;
            cVar2.execute(new String[0]);
        }
        if (this.f8619z0 > 0) {
            C2095d dVar = this.f8608I0;
            if (dVar == null || dVar.getStatus() != AsyncTask.Status.RUNNING) {
                C2095d dVar2 = new C2095d();
                this.f8608I0 = dVar2;
                dVar2.execute(new String[0]);
            }
        }
    }

    /* renamed from: p0 */
    public void mo3444p0(Activity activity) {
        super.mo3444p0(activity);
        try {
            this.f8615P0 = (C2093b) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnTutSelectedListener");
        }
    }

    @TargetApi(13)
    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        int i;
        super.mo3457t0(bundle);
        C1692config config = (C1692config) mo3443p().getApplicationContext();
        this.f8605F0 = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        String[] strArr = {"titulo", "img1_p", "precio", "anyo", "dia"};
        int[] iArr = {R.id.title, R.id.iv_item, R.id.precio, R.id.antiguedad, R.id.tv_aux};
        SharedPreferences sharedPreferences = mo3443p().getSharedPreferences("sh", 0);
        this.f8606G0 = sharedPreferences;
        this.f8617x0 = sharedPreferences.getLong("idusu", 0);
        this.f8609J0 = mo3443p().getIntent().getExtras();
        this.f8601B0 = false;
        Display defaultDisplay = mo3443p().getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (i > ((int) ((mo3380N().getDisplayMetrics().density * 500.0f) + 0.5f))) {
            this.f8601B0 = true;
        }
        Drawable drawable = mo3380N().getDrawable(R.drawable.item_sel);
        this.f8611L0 = drawable;
        drawable.setColorFilter(Color.parseColor("#" + this.f8605F0.f7189H1), PorterDuff.Mode.MULTIPLY);
        if (!this.f8605F0.f7177F1.equals("")) {
            Drawable drawable2 = mo3380N().getDrawable(R.drawable.precio);
            this.f8612M0 = drawable2;
            drawable2.setColorFilter(Color.parseColor("#" + this.f8605F0.f7177F1), PorterDuff.Mode.MULTIPLY);
        }
        if (bundle == null) {
            this.f8602C0 = false;
            this.f8604E0 = true;
            this.f8619z0 = 0;
            try {
                SQLiteDatabase writableDatabase = new C2037q(mo3443p()).getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.execSQL("DELETE FROM productos");
                    writableDatabase.execSQL("DELETE FROM fotos");
                    writableDatabase.close();
                }
            } catch (Exception unused) {
            }
        } else {
            this.f8603D0 = bundle.getBoolean("hayfotos", true);
            this.f8604E0 = bundle.getBoolean("mostrar_loader", false);
            this.f8602C0 = bundle.getBoolean("fin", false);
            this.f8619z0 = bundle.getInt("ncargados", 0);
        }
        if (!this.f8605F0.f7159C1.equals("") && !this.f8605F0.f7165D1.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            this.f8610K0 = new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f8605F0.f7159C1), Color.parseColor("#" + this.f8605F0.f7165D1)});
        }
        mo3359G().mo4033c(1, (Bundle) null, this);
        C5880d dVar = new C5880d(mo3443p().getApplicationContext(), R.layout.list_item, (Cursor) null, strArr, iArr, 2);
        this.f8616Q0 = dVar;
        dVar.mo22826l(new C2092a());
    }
}
