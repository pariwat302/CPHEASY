package cph.kaewpila.pariwat.cpheasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initial View
        initialview();

        //contorller
        contoller();

    }   //Main Method

    private void contoller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);
    }

    private void initialview() {


        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegis);
        button = (Button) findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View v) {

        //for textview
        if (v == textView) {
            //ย้ายการทำงานจากเมนไปหน้าsignup
            Intent intent = new Intent(MainActivity.this,SigUpActivity.class);
            startActivity(intent);
        }

        //fof Buttom
        if (v == button) {

        }
    }
}   //Main Class นี่คือคลาสหลัก
