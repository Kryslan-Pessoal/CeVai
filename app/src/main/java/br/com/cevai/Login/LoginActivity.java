package br.com.cevai.Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import br.com.cevai.CadastroDeUsuario.CadastroDeUsuarioActivity;
import br.com.cevai.R;

/** Activity de Login dos Usuários */
public class LoginActivity extends AppCompatActivity {

    //region Globais

    /** TextView que ao ser clicado leva para a tela de cadastro de Usuário */
    TextView cadastreSe_textView;

    //endregion Globais


    //region onCreate
    /** Ao iniciar a Activity, carrega este método */
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        carregaOsViews();

        configuraOsViews();
    }

    /** Pega as Views da tela para poder manipulá-los */
    private void carregaOsViews() {
        cadastreSe_textView = findViewById(R.id.cadastreSe_textView);
    }
    /** Configura os Listeners dos Views */
    private void configuraOsViews(){
        //Ao clicar no "Cadastre-se"
        cadastreSe_textView.setOnLongClickListener(v -> {
            //Leva para a tela de Cadastro
            Intent intent = new Intent(this, CadastroDeUsuarioActivity.class);
            startActivity(intent);
            return false;
        });
    }
    //endregion onCreate


    //region Logar

    //region Entrar com Google

    //endregion Entrar com Google

    //region Entrar com Facebook

    //endregion Entrar com Facebook

    //region Entrar com sua Conta Ce Vai

    //endregion Entrar com sua Conta Ce Vai

    //endregion Logar


    //region Utilitários

    //region Gerais

    //endregion Gerais

    //region Funções da Activity
    /** Tudo colocado aqui será feito ao reiniciar esta activity */
    @Override
    protected void onResume(){
        super.onResume();
    }
    /** Tudo colocado aqui será feito ao pausar esta activity */
    @Override
    protected void onPause(){
        super.onPause();
    }
    /** Tudo colocado aqui será feito ao destruir esta activity */
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
    //endregion Funções da Activity


    //region Toast/View

    //endregion Toast/View

    //region Menu

    //endregion Menu

    //region Navegação

    //endregion Navegação


    //endregion Utilitários
}
