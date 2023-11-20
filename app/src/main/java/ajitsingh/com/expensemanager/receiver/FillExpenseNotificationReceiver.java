package ajitsingh.com.expensemanager.receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

import ajitsingh.com.expensemanager.R;
import ajitsingh.com.expensemanager.activity.MainActivity;

public class FillExpenseNotificationReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
    Intent notificationIntent = new Intent(context, MainActivity.class);

    TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
    stackBuilder.addParentStack(MainActivity.class);
    stackBuilder.addNextIntent(notificationIntent);

    PendingIntent pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_ONE_SHOT);

    NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

    Notification notification = builder.setContentTitle("Preencha as despesas de hoje")
      .setContentText("Nunca perca uma despesa, preencha-a agora.")
      .setTicker("Cada despesa é importante!")
      .setSmallIcon(R.mipmap.ic_launcher)
      .setAutoCancel(true)
      .setContentIntent(pendingIntent).build();

    NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    notificationManager.notify(0, notification);
  }
}
