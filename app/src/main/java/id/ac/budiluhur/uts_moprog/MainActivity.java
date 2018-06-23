package id.ac.budiluhur.uts_moprog;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText vTxtA, vTxtB, vTxtC;

    protected float yTxtA, yTxtB, yTxtxC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtA = (EditText) findViewById(R.id.txtA);
        vTxtB = (EditText) findViewById(R.id.txtB);
        vTxtC = (EditText) findViewById(R.id.txtC);

        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vBtnKali = (Button) findViewById(R.id.btnKali);
        Button vBtnBagi = (Button) findViewById(R.id.btnBagi);
        Button vRef = (Button) findViewById(R.id.ref);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
        vRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vTxtA.setText("");
                vTxtB.setText("");
                vTxtC.setText("");
                vTxtA.requestFocus();
            }
        });
    }

    @Override
    public void onClick(View v) {
         try {
                yTxtA = Float.parseFloat(vTxtA.getText().toString());
                yTxtB = Float.parseFloat(vTxtB.getText().toString());

                switch (v.getId()) {
                    case R.id.btnTambah:
                        yTxtxC = yTxtA + yTxtB;
                        break;

                    case R.id.btnKurang:
                        yTxtxC = yTxtA - yTxtB;
                        break;

                    case R.id.btnKali:
                        yTxtxC = yTxtA * yTxtB;
                        break;

                    case R.id.btnBagi:
                        yTxtxC = yTxtA / yTxtB;
                        break;

                    default:
                        break;
                }
                vTxtC.setText(Float.toString(yTxtxC));
        } catch (Exception e){
                Toast.makeText(this,"Masukkan kedua angka", Toast.LENGTH_LONG).show();
        }
    }
}
