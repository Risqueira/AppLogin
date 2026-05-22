package br.ulbra.applogin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper {

    private static String nome = "BancoDados.db";
    private static int versao = 1;

    public DBHelper(Context context){
        super(context, nome,null,versao);
    }
    @Override
    public void onCreate (SQLiteDatabase db){
        String str = "CREATE TABLE utilizador (username TEXT PRIMARY KEY, password TEXT);";
        db.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS utilizador;");
        onCreate(db);
    }

    public long criarUtilizador(String userName, String password){
        SQLiteDatabase db = getWritableDatabase();
    }
}
