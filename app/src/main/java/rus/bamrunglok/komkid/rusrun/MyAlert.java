package rus.bamrunglok.komkid.rusrun;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Komkid on 13/7/2559.
 */
public class MyAlert {
    public void myDialog(Context context,
                         String strTitle,
                         String strMessage){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);             // ปุ่ม Builder ย้อนกลับไม่สามารถใช้การได้
        builder.setIcon(R.drawable.doremon48);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { //เมื่อมีการกดปุ่มให้ทำไร
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //.dismissคำสั่งทำให้ ปุ่ม หายไป
            }
        });

        builder.show();
    }
}// Main Class
