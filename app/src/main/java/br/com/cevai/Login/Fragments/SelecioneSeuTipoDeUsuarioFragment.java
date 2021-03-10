package br.com.cevai.Login.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import br.com.cevai.R;

/** Fragment onde o usuário vai selecionar o seu tipo de usuário, podendo ser:
 * Aluno, Motorista ou Responsável. */
public class SelecioneSeuTipoDeUsuarioFragment extends Fragment {

    //region Globais

    /** View que representa o fragment */
    View viewPrincipal;

    /** TextView de OK, ao clicar, vai para a próxima tela de cadastro */
    TextView ok_textView;

    //endregion Globais


    //region onCreate
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewPrincipal = inflater.inflate(
                R.layout.selecionar_seu_tipo_de_usuario_fragment,
                container,
                false
        );

        carregaOsViews();

        configuraOsViews();

        return viewPrincipal;
    }

    /** Pega as Views da tela para poder manipulá-los */
    private void carregaOsViews() {
        ok_textView = viewPrincipal.findViewById(R.id.ok_textView);
    }

    /** Configura os Listeners dos Views */
    private void configuraOsViews() {
        ok_textView.setOnClickListener(v -> {
            //Chama o próximo Fragment, passando a opção Selecionada.

        });
    }
    //endregion onCreate


}
