package br.com.cevai.Utilitarios;

import android.content.Context;
import android.util.Log;

import androidx.appcompat.app.AlertDialog;
import br.com.cevai.R;


public class Lib {

    //LOG
    public static void log(String mensagem){
        Log.d("gpsk", mensagem);
    }
    public static void log(int mensagem){
        Log.e("gpsk", mensagem + "");
    }
    public static void loge(String mensagem){
        Log.e("gpsk", mensagem);
    }
    public static void loge(int mensagem){
        Log.e("gpsk", mensagem + "");
    }

    //DIALOG

    //SUCESSO
    public static void sucessoDialog(Context context, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle("Sucesso!")
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_sucesso)
                .show();
    }
    public static void sucessoDialog(Context context, String titulo, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_sucesso)
                .show();
    }

    //ERRO
    public static void erroDialog(Context context, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle("Erro")
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_erro)
                .show();
    }
    public static void erroDialog(Context context, String titulo, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_erro)
                .show();
    }

    //ATENÇÃO
    public static void atencaoDialog(Context context, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle("Atenção")
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_atencao)
                .show();
    }
    public static void atencaoDialog(Context context, String titulo, String mensagem){
        new AlertDialog.Builder(context)
                .setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setIcon(R.drawable.ic_atencao)
                .show();
    }
}
