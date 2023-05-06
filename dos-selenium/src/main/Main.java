package main;

import test.TestDos;

/**
 * @author FJMV
 * get() Abrimos el navegador pasando un url
 * navigate() esta funcion permite navegar en la página
 * close() esta funcion se usa para cerrar el navegador actual
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TestDos prueba = new TestDos();
        prueba.abrirNavegador();
    }
}
