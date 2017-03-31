package susy.broadcastlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by susy on 31/03/17.
 */

public class AutoBoot extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        switch (action){
            case Intent.ACTION_BOOT_COMPLETED:
                Toast.makeText(context, "Boot complet", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "power conected", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "power disconect", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
