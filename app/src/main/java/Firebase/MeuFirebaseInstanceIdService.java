package Firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService {
    /**
     * Created by logonrm on 05/08/2017.
     * eh chamado quando o aplicativo receber um token(registration ID)
     * Este token representa o identificador do dispositivo  e precisa ser
     * enviado ao seu servidor , pois com ele é possível enviar uma mensagem para o dispositivo
     *
     */
        @Override
        public void onTokenRefresh() {
            super.onTokenRefresh();
            String firebaseToken = FirebaseInstanceId.getInstance().getToken();
            sendRegistrationToService(firebaseToken);
        }

        private void sendRegistrationToService(String refreshToken) {
            Log.d(TAG,"refresh token" + refreshToken);
        }

    }
