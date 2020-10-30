package id.putraprima.androidtwowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.putraprima.androidtwowaydatabinding.databinding.ActivityMainBinding;
import id.putraprima.androidtwowaydatabinding.models.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Mahasiswa mhs = new Mahasiswa();
        binding.setMahasiswa(mhs);
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtResult.setText(binding.editTextNama.getText().toString());
            }
        });
    }
}