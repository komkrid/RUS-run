package rus.bamrunglok.komkid.rusrun;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
        //Explicit
    private EditText userEditText, passwordEditText ;
    private ImageView imageView;
    private  static  final String urlLogo = "http://swiftcodingthai.com/rus/image/logo_rus.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widget
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView6);
        Picasso.with(this).load(urlLogo).into(imageView);

        //Load Imge from server
    }//Main Method

    public void clickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

} //main Class นี่คือคลาสหลัก
