package exemplologin.segundotina.fiap.com.br.exemplologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

public class CadastrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        RadioButton rdb = (RadioButton)findViewById(R.id.rdbMasculino);
        if(rdb.isChecked()){
            Toast.makeText(this, "Selevcionado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Você não selecionou", Toast.LENGTH_SHORT).show();
        }

    }

}
