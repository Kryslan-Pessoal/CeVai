package br.com.cevai.Utilitarios;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;

/** Classe com métodos utilitários diversos */

public class Lib2 {

    //region LOGs
    //region Log Erro
    /** Coloca no Log o erro */
    public static void logE(String mensagem){
        Log.d("gpsk ERRO", mensagem);
    }
    /** Coloca no Log o erro, a classe, a linha e detalhes do erro (Tag = ERRO) */
    public static void logE(Exception e){
        Log.d("gpsk ERRO", "ERRO Classe: " + e.getStackTrace()[0].getClassName() + ". Linha: " +
                e.getStackTrace()[0].getLineNumber() + " ====> " + e.getMessage());
    }
    /** Coloca no Log o erro, a classe, a linha e detalhes do erro (Tag = ERRO) */
    public static void logE(OutOfMemoryError e){
        Log.d("gpsk ERRO", "ERRO Classe: " + e.getStackTrace()[0].getClassName() + ". Linha: " +
                e.getStackTrace()[0].getLineNumber() + " ====> " + e.getMessage());
    }
    /** Coloca no Log o erro, a classe, a linha e detalhes do erro além de
     * @param textComplementarErro que o dev pode definir caso queira
     * (Tag = ERRO) */
    public static void logE(String textComplementarErro, Exception e){
        Log.d("gpsk ERRO", "ERRO Classe: " + e.getStackTrace()[0].getClassName() + ". Linha: " +
                e.getStackTrace()[0].getLineNumber() + " ====> " + textComplementarErro + ". Detalhes do erro: " + e.getMessage());
    }
    //endregion Log Erro

    //region Log debug
    /** Logs simples para Debus rápidos.
     * @param informacao Informação que aparecerá no Debug
     * @param context para pegar o nome da classe que gerou o Log.
     * @param numeroDaLinhaDaInformacao use o
     *      * @see Thread.currentThread().getStackTrace()[2].getLineNumber() */
    public static void logDebug(String informacao, Context context, int numeroDaLinhaDaInformacao){
        String nomeDaClasse = context.getClass().getSimpleName();
        Log.d("gpsk DEBUG", "Classe: " + nomeDaClasse + ". Debug: " + informacao +
                ". Linha: " + numeroDaLinhaDaInformacao + ". Informação: " + informacao);
    }
    //endregion Log debug

    //region Log informativo
    /** Logs simples para informações úteis gerais sem context
     * @param informacao Informação que aparecerá no Debug */
    public static void logI(String informacao){
        Log.d("gpsk INFO", informacao);
    }

    /** Logs simples para informações úteis gerais (Não mostra a linha, use o
     * "obterNumeroDaLinhaAtualNoCodigo()" para mostra-la)
     * @param informacao Informação que aparecerá no Debug
     * @param context para pegar o nome da classe que gerou o Log.*/
    public static void logI(String informacao, Context context){
        String nomeDaClasse = context.getClass().getSimpleName();
        Log.d("gpsk INFO", "Info na classe: " + nomeDaClasse + ". Informação: " + informacao);
    }
    /** Logs simples para informações úteis gerais (mostra a linha)
     * @param informacao Informação que aparecerá no Debug
     * @param context para pegar o nome da classe que gerou o Log.
     * @param numeroDaLinhaDaInformacao use o
     * Thread.currentThread().getStackTrace()[2].getLineNumber() */
    public static void logI(String informacao, Context context, int numeroDaLinhaDaInformacao){
        String nomeDaClasse = context.getClass().getSimpleName();
        Log.d("gpsk INFO", "\n\nInfo na classe: " + nomeDaClasse +
                ". \n\t\tLinha: " + numeroDaLinhaDaInformacao + ". \n\t\t\tInformação: " + informacao);
    }
    //endregion Log informativo
    //endregion LOGs

    //region AUX para Logs
    /** @deprecated Pega o número desta classe e não da classe que solicita
     * Obtem o número da linha do código atual solicitado na thread atual.
     * @return int - Current line number.
     */
    public static int obterNumeroDaLinhaAtualNoCodigo() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
    //endregion AUX para Logs

    //region Dialogs
    /** Cria e exibe um dialog de Sucesso para o usuário
     * alertDialogBuilder pode ter um listener de botão positivo ou negativo com:
     * .setPositiveButton/setNegativeButton("", new DialogInterface.OnClickListener(){...}) **/
    public static AlertDialog.Builder dialogSucesso(String mensagem, Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        alertDialogBuilder.setTitle("Sucesso!");
        alertDialogBuilder.setMessage(mensagem);

        alertDialogBuilder.setPositiveButton("OK", null);

        AlertDialog dialog = alertDialogBuilder.create();
                            dialog.show();

        return alertDialogBuilder;
    }
    /** Cria e exibe um dialog de Sucesso para o usuário
     * alertDialogBuilder pode ter um listener de botão positivo ou negativo com:
     * .setPositiveButton/setNegativeButton("", new DialogInterface.OnClickListener(){...}) **/
    public static AlertDialog.Builder dialogSucesso(String titulo, String mensagem, Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        alertDialogBuilder.setTitle(titulo);
        alertDialogBuilder.setMessage(mensagem);

        alertDialogBuilder.setPositiveButton("OK", null);

        AlertDialog dialog = alertDialogBuilder.create();
        dialog.show();

        return alertDialogBuilder;
    }
    /** Cria e exibe um dialog de Sucesso para o usuário
     * alertDialogBuilder pode ter um listener de botão positivo ou negativo com:
     * .setPositiveButton/setNegativeButton("", new DialogInterface.OnClickListener(){...}) **/
    public static AlertDialog.Builder dialogErro(String mensagem, Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        alertDialogBuilder.setTitle("Erro!");
        alertDialogBuilder.setMessage(mensagem);

        alertDialogBuilder.setPositiveButton("OK", null);

        AlertDialog dialog = alertDialogBuilder.create();
        dialog.show();

        return alertDialogBuilder;
    }
    /** Cria e exibe um dialog de Sucesso para o usuário
     * alertDialogBuilder pode ter um listener de botão positivo ou negativo com:
     * .setPositiveButton/setNegativeButton("", new DialogInterface.OnClickListener(){...}) **/
    public static AlertDialog.Builder dialogErro(String titulo, String mensagem, Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        alertDialogBuilder.setTitle(titulo);
        alertDialogBuilder.setMessage(mensagem);

        alertDialogBuilder.setPositiveButton("OK", null);

        AlertDialog dialog = alertDialogBuilder.create();
        dialog.show();

        return alertDialogBuilder;
    }
    //endregion Dialogs
}
