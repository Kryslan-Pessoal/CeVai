package br.com.cevai.Login;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import br.com.cevai.R;

/** Activity de Login dos Usuários */
public class LoginActivity extends AppCompatActivity {

    //region onCreate
    /** Ao iniciar a Activity, carrega este método */
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    //endregion onCreate


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
