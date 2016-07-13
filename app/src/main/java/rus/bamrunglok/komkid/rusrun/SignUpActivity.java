package rus.bamrunglok.komkid.rusrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {
    //Explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup RadioGroup;
    private RadioButton avata0RadioButton,avata1RadioButton,avata2RadioButton,
            avata3RadioButton, avata4RadioButton;
    private String nameString, userString , passwordString, avataString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        RadioGroup = (RadioGroup) findViewById(R.id.radAvata);
        avata0RadioButton = (RadioButton) findViewById(R.id.radioButton);
        avata1RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        avata2RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        avata3RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        avata4RadioButton = (RadioButton) findViewById(R.id.radioButton5);



    }//main Method
    public void  clickSignUpSign(View view){

       //Get value from Edit Text
        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim(); //.trim() คือการตัดช่องว่าง


        //chenh space ค้นห้าช่องว่าง
        if (nameString.equals("") || userString.equals("") || passwordString.equals("")){
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่อง ครับ");
        }

    }//clickSignUp
}//Main class
