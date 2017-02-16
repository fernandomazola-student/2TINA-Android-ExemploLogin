package exemplologin.segundotina.fiap.com.br.exemplologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNome = (EditText)findViewById(R.id.edtNome);
        edtSenha = (EditText)findViewById(R.id.edtSenha);
    }

    public void logar(View v){

        String nome = edtNome.getText().toString().toUpperCase();
        String senha = edtSenha.getText().toString().toUpperCase();

        Intent it = new Intent(this, MainActivity.class);

        if(nome.isEmpty() && senha.isEmpty()){
            Toast.makeText(this, "Campo Login e/ Senha Vázios", Toast.LENGTH_SHORT).show();
        }else if(nome.equals("FIAP") && senha.equals("FIAP123")){
            startActivity(it);
        }else{
            Toast.makeText(this, getString(R.string.mensagem_erro), Toast.LENGTH_SHORT).show();
        }

    }

    public void cadastrar(View v){
        Intent it = new Intent(this, CadastrarActivity.class);
        startActivity(it);
    }
}
