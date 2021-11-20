/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestinoarchivos;
import java.io.*;
/**
 *
 * @author EQUIU
 */
public class GestionA {
    FileInputStream entrada; //variable que recibe los datos de entrada
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){
        
        
        
    }
    
    public String AbrirTexto(File archivo){//Metodo para barir archivo de texto
        
        String contenido = " ";
        try {
            
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read()) != -1){//lee el flujo de bytes de entrada metodo read devuelbe -1 cuando termina de leer el archivo.
                
                char caracter = (char)ascci;//convierte el numero ascci en caracteres
                contenido += caracter;
                
            }
            
        } catch (Exception e) {
            
            
            
        }
        return contenido;
        
    }
    
    //metodo para guardar un archivo de texto
    public String GuardarATexto(File archivo, String contenido){
        
        String respuesta = null;
        try {
            
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();//se llena el array con los bytes de contenido.
            salida.write(bytesTxt);//para guardar afuera
            respuesta = "Se guardo con exito el archivo";
            
        } catch (Exception e) {
        }
        return respuesta;    
        
    }
    
    //Abrir imagen
    public byte[] AbrirAImagen(File archivo){
        
        byte[] bytesImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
            
        }
        return bytesImg;
    }
    
    //Guardar Imagen
    public String GuardarAImagen(File archivo, byte[] bytesImg){
        
        String respuesta = null;
        
        try {
            
            salida = new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta = "La imagen se guardo con exito";
            
        } catch (Exception e) {
            
            
            
        }
        
        return respuesta;
        
    }
}
