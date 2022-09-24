package british.xnews2;

import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyInstanceIDListenerService extends FirebaseInstanceIdService {
    /* renamed from: f */
    public void mo7222f() {
        try {
            startService(new Intent(this, RegistrationIntentService.class));
        } catch (Exception unused) {
        }
    }
}
