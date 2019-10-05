package com.example.radiobuttondancheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGraoup;
    RadioButton rButton;
    Button btnPilih,btnMakan;
    CheckBox ckPizza, ckTongseng, ckCapcai, ckTiau, ckMiegoreng,ckNasgor;
    Spinner Splevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGraoup=(RadioGroup)findViewById(R.id.r_group);
        btnPilih=(Button)findViewById(R.id.btn_pilih);
        Splevel=(Spinner)findViewById(R.id.level_spin);
        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pilihRadio=rGraoup.getCheckedRadioButtonId();
                rButton=(RadioButton)findViewById(pilihRadio);
                Toast.makeText(getApplicationContext(),"Kamu Memilih"+rButton.getText(),Toast.LENGTH_LONG).show();
            }
        });
            ckPizza=(CheckBox)findViewById(R.id.ck_pizza);
            ckTongseng=(CheckBox)findViewById(R.id.ck_tongseng);
            ckCapcai=(CheckBox)findViewById(R.id.ck_capcai);
            ckTiau=(CheckBox)findViewById(R.id.ck_tiau);
            ckMiegoreng=(CheckBox)findViewById(R.id.ck_miegor);
            ckNasgor=(CheckBox)findViewById(R.id.ck_nasgor);
            btnMakan=(Button)findViewById(R.id.btn_makan);
            btnMakan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String pesanan="";
                    String level=Splevel.getSelectedItem().toString();
                    if (ckPizza.isChecked()){
                        pesanan+="pizza \n";
                    }if (ckTongseng.isChecked()){
                        pesanan+="tongseng \n";
                    }if (ckCapcai.isChecked()){
                        pesanan+="capcai\n";
                    }if (ckTiau.isChecked()){
                        pesanan+="tiau\n";
                    }if (ckMiegoreng.isChecked()){
                        pesanan+="miegor\n";
                    }if (ckNasgor.isChecked()){
                        pesanan+="nasigoreng";
                    }
                    Toast.makeText(getApplicationContext(),pesanan + level,Toast.LENGTH_LONG).show();

                }
            });

    }
}
