package cph.kaewpila.pariwat.cpheasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SigUpActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText,userEditText, passwordEditText;
    private Button button;
    private String nameString,usetString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sig_up);

        initiaview();

        controler();

    }//main method

    private void controler() {
        button.setOnClickListener(SigUpActivity.this);

    }

    private void initiaview() {
        nameEditText = (EditText) findViewById(R.id.edtname);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnRegis);
    }

    @Override
    public void onClick(View v) {
        if (v == button) {

            //การดึงค่าจากtext มาแสดงผล
            nameString = nameEditText.getText().toString().trim();
            usetString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();

            //check space
            if (nameString.equals("") || usetString.equals("") ||passwordString.equals("")) {
                //have spac
                MyAlert myAlert = new MyAlert(SigUpActivity.this);
                myAlert.myDialog("มีช่องว่าง","กรุณากรอกทุกช่อง คะ");

            } else {
                //no space

            }

        }
    }
}   //main clas
