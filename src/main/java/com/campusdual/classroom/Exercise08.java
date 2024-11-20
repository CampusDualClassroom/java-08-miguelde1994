package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        //Desde el método main() se llamará al método whileLoop() pasándole un valor "Y" por parámetro.
        whileLoop(5);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        //El método whileLoop() recibe un número entero por parámetro ("Y"). Dentro del método,
        // utilizando un bucle while, se llevarán a cabo comprobaciones cíclicas partiendo de cero ("X").
        // Mientras que "X" sea menor que "Y" se mostrará un mensaje que además incluya información sobre cuánto valdrá X
        // en la siguiente iteración, y se aumentará "X" en una unidad.
       int i=0;
        while (i<num) {
            System.out.println(i + " < " + num + ". El proximo ciclo valdra: " + (i + 1));
            i++;
        }

    }
}