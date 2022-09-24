package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1181d;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    int f5412b = 0;

    /* renamed from: c */
    final HashMap<Integer, String> f5413c = new HashMap<>();

    /* renamed from: d */
    final RemoteCallbackList<C1178c> f5414d = new C1174a();

    /* renamed from: e */
    private final C1181d.C1182a f5415e = new C1175b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C1174a extends RemoteCallbackList<C1178c> {
        C1174a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C1178c cVar, Object obj) {
            MultiInstanceInvalidationService.this.f5413c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C1175b extends C1181d.C1182a {
        C1175b() {
        }

        /* renamed from: B5 */
        public void mo5844B5(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f5414d) {
                String str = MultiInstanceInvalidationService.this.f5413c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f5414d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f5414d.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f5413c.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f5414d.getBroadcastItem(i2).mo5859n1(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f5414d.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f5414d.finishBroadcast();
            }
        }

        /* renamed from: W5 */
        public void mo5845W5(C1178c cVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f5414d) {
                MultiInstanceInvalidationService.this.f5414d.unregister(cVar);
                MultiInstanceInvalidationService.this.f5413c.remove(Integer.valueOf(i));
            }
        }

        /* renamed from: d2 */
        public int mo5846d2(C1178c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f5414d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f5412b + 1;
                multiInstanceInvalidationService.f5412b = i;
                if (multiInstanceInvalidationService.f5414d.register(cVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f5413c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f5412b--;
                return 0;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f5415e;
    }
}
