package com.company;


import java.io.*;

public class Obfuscator {
    private static com.company.DownPicPlayMusic cl = new DownPicPlayMusic();
    private static Class c = cl.getClass();
    private static String sn = c.getSimpleName();
    private static String  rn = sn.substring(0,2);
    public static void main(String[] args){
        try(BufferedReader read = new BufferedReader(new FileReader("src/com/company/DownPicPlayMusic.java"))){
            String cod;
            boolean prov = false;
            while ((cod = read.readLine()) != null){
                cod = cod.replace(sn,rn);
                cod = cod.replaceAll("\\s+", " "); //удаление лишних пробелов
                boolean result = cod.matches("^(//.*)|(.*/\\*.*)|(.*\\*/)|$"); // регулярное выражение для удаления комментариев
                if(result){
                    boolean Result = cod.matches("^(.*\\*/)$"); //регулярное выражение для начала многострочного комментария
                    boolean Result_2 = cod.matches("^(.*/\\*.*)$"); //регулярное выражение для конца многострочного комментария
                    if(Result){ // Проверка на начало многострочного комментария
                        prov = false;
                    }
                    else if (Result_2){ // Проверка на конец многострочного  комментария
                        prov = true;
                    }
                    else{
                        prov = false;
                    }
                }
                else if (!prov){
                    w(cod);
                }
            }
        }
        catch (IOException  ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void w(String cod){
        try(BufferedWriter w = new BufferedWriter(new FileWriter("Itog.txt", true))){
            w.write(cod);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }

