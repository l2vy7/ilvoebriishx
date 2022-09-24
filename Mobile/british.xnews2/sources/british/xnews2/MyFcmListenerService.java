package british.xnews2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import p001a0.C0026i;

public class MyFcmListenerService extends FirebaseMessagingService {
    /* renamed from: g */
    public void mo7220g(RemoteMessage remoteMessage) {
        Object obj;
        C0026i.C0034e eVar;
        C0026i.C0034e eVar2;
        Class<preinicio> cls = preinicio.class;
        String str = remoteMessage.mo41944C0().get("message");
        if (str != null) {
            String replace = str.replace("@EURO@", "€");
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            try {
                sharedPreferences.getLong("idusu", 0);
            } catch (ClassCastException unused) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("idusu");
                edit.commit();
                edit.putLong("idusu", (long) sharedPreferences.getInt("idusu", 0));
                edit.commit();
            }
            if (sharedPreferences == null || !sharedPreferences.getBoolean("sin_acceso", false)) {
                int i = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
                if (replace.equals("ACC_APROB")) {
                    try {
                        getSharedPreferences("sh", 0).edit().putBoolean("glob_acceso_validado", true).commit();
                    } catch (Exception unused2) {
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 26) {
                        eVar2 = new C0026i.C0034e(this, C1692config.m8206y(this, 1).getId());
                    } else {
                        eVar2 = new C0026i.C0034e(this);
                    }
                    eVar2.mo63B(R.drawable.notif).mo85q(getResources().getString(R.string.acceso_aprobado)).mo84p(getResources().getString(R.string.acceso_aprobado_descr)).mo78j(true);
                    Bitmap p0 = C1692config.m8196p0(this);
                    if (p0 != null) {
                        eVar2.mo89v(p0);
                    }
                    eVar2.mo86r(5);
                    Intent intent = new Intent(this, cls);
                    if (i2 >= 11) {
                        intent.setFlags(268468224);
                    }
                    eVar2.mo83o(PendingIntent.getActivity(this, 8, intent, i));
                    ((NotificationManager) getSystemService("notification")).notify(8, eVar2.mo73c());
                    return;
                }
                try {
                    SharedPreferences sharedPreferences2 = getSharedPreferences("sh", 0);
                    String string = sharedPreferences2.getString("i", "");
                    if (string.length() > 16 && Integer.parseInt(string.substring(16, 17)) > 1 && !sharedPreferences2.getBoolean("glob_acceso_validado", false)) {
                        return;
                    }
                } catch (Exception unused3) {
                }
                String[] split = replace.split(";");
                if (split.length < 3) {
                    String replace2 = replace.replace("@x@", ";");
                    int length = replace2.split("@").length;
                    if (length == 8 || length == 5 || length == 9 || length == 11 || length == 12 || length == 13 || length == 7) {
                        C1692config.m8159L0(this, replace2);
                    }
                } else if (split[1].equals(SessionDescription.SUPPORTED_SDP_VERSION) || split[1].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || split[1].equals("2") || split[1].equals("3")) {
                    try {
                        SharedPreferences sharedPreferences3 = getSharedPreferences("sh", 0);
                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                        if (split[1].equals("3")) {
                            String str2 = split[4];
                            if (sharedPreferences3.getString("mensajechat_ult", "").equals(str2)) {
                                obj = "3";
                                if (System.currentTimeMillis() - sharedPreferences3.getLong("fchat_ult", System.currentTimeMillis()) < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                                    return;
                                }
                            } else {
                                obj = "3";
                            }
                            edit2.putLong("fchat_ult", System.currentTimeMillis());
                            edit2.putString("mensajechat_ult", str2);
                            String string2 = sharedPreferences3.getString("conv", "");
                            edit2.putString("conv", string2 + "@0@" + split[4].replace("@x@", ";"));
                            edit2.commit();
                        } else {
                            obj = "3";
                        }
                        if (!split[1].equals(obj) || !sharedPreferences3.getBoolean("activa", false)) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                eVar = new C0026i.C0034e(this, C1692config.m8206y(this, 1).getId());
                            } else {
                                eVar = new C0026i.C0034e(this);
                            }
                            C0026i.C0034e eVar3 = eVar;
                            eVar3.mo63B(R.drawable.notif).mo85q(split[2].replace("@x@", ";")).mo84p(split[3].replace("@x@", ";")).mo78j(true);
                            Bitmap p02 = C1692config.m8196p0(this);
                            if (p02 != null) {
                                eVar3.mo89v(p02);
                            }
                            if (split[6].equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                                Bitmap f0 = C1692config.m8186f0(C1692config.f7108H5 + "/srv/imgs/notif/n" + split[0] + ".png");
                                if (f0 != null) {
                                    try {
                                        eVar3.mo65D(new C0026i.C0029b().mo59n(f0).mo58m((Bitmap) null));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            eVar3.mo86r(5);
                            Intent intent2 = new Intent(this, cls);
                            if (Build.VERSION.SDK_INT >= 11) {
                                intent2.setFlags(268468224);
                            }
                            intent2.putExtra("notif_id", split[0]);
                            intent2.putExtra("notif_tipo", split[1]);
                            intent2.putExtra("notif_idelem", split[4].replace("@x@", ";"));
                            int i3 = sharedPreferences3.getInt("numnotif", 20);
                            if (split[5].equals(SessionDescription.SUPPORTED_SDP_VERSION)) {
                                i3++;
                                if (i3 > 99) {
                                    i3 = 20;
                                }
                                edit2.putInt("numnotif", i3);
                                edit2.commit();
                            }
                            int i4 = i3;
                            C1692config.m8146A(this, split[2].replace("@x@", ";"), split[3].replace("@x@", ";"), intent2, i4, 1, SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION);
                            eVar3.mo83o(PendingIntent.getActivity(this, i4, intent2, i));
                            ((NotificationManager) getSystemService("notification")).notify(i4, eVar3.mo73c());
                            return;
                        }
                        edit2.putString("f_id", SessionDescription.SUPPORTED_SDP_VERSION);
                        edit2.putString("f_idfrase", C1692config.f7110J5 + "");
                        edit2.putString("f_frase", split[4].replace("@x@", ";"));
                        C1692config.f7110J5 = C1692config.f7110J5 + 1;
                        edit2.commit();
                    } catch (Exception unused4) {
                    }
                }
            }
        }
    }
}
