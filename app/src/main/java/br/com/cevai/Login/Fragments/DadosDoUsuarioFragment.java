package br.com.cevai.Login.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import br.com.cevai.R;

/** Fragmento onde o usuário entrará com informações básicas para seu cadastro no App:
 * Nome Completo, Senha e telefone (Endereço vai ser solicitado depois)  */
public class DadosDoUsuarioFragment extends Fragment {

    //region Globais

    /** View que representa o fragment */
    View viewPrincipal;

    //endregion Globais


    //region onCreate
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewPrincipal = inflater.inflate(
                R.layout.selecionar_seu_tipo_de_usuario_fragment,
                container,
                false
        );

        return viewPrincipal;
    }
    //endregion onCreate

}
