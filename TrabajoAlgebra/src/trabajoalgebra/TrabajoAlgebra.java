/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoalgebra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabajoAlgebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        boolean Salir = false;
        int opcion;
        System.out.println("Suma de matrices, producto de matrices, matriz inversa");
        System.out.println("");
        System.out.println("");
        while (!Salir) {
            System.out.println("1. Opcion 1: Suma de matrices");
            System.out.println("2. Opcion 2: Producto de matrices");
            System.out.println("3. Opcion 3: Matriz inversa");
            System.out.println("4. Opcion 4: Resta de Matrices");
            System.out.println("5. Opcion 5: Salir del menu");

            System.out.println("Elige un numero entre 1 - 5:   ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Elegiste suma de matrices");
                    int Matriz[][] = new int[3][3],Matriz2[][] = new int[3][3],Matriz3[][] = new int[3][3];

                    System.out.println("Ingresando los elementos de la primera matriz   ");
                    System.out.println("    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                        try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Son matrices, por favor, ingrese un número");
                            entrada.next(); // Limpiar el búfer del teclado
                            j--; // Repetir el mismo valor de j para que el usuario pueda ingresar otro número.
                          }
                        }
                    }
                    System.out.println("La primera matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz[i][j] + "   ");

                        }
                        System.out.println();
                    }

                    System.out.println("       ");
                    System.out.println("Ingresando los elementos de la segunda matriz:   ");
                    System.out.println("     ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                        try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz2[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Ya te comentamos, debes ingresar un numero");
                            entrada.next(); 
                            j--; 
                          }
                        }
                    }
                    System.out.println("La segunda matriz es:  ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz2[i][j] + "  ");

                        }
                        System.out.println();

                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            Matriz3[i][j] = Matriz[i][j] + Matriz2[i][j];

                        }

                    }
                    System.out.println("     ");
                    System.out.println("La suma de las dos matrices es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz3[i][j] + "   ");
                        }
                        System.out.println();
                    }
                    System.out.println

("-----------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Elegiste producto de matrices");
                    int Matriz5[][] = new int[3][3],
                     Matriz7[][] = new int[3][3],
                     multi[][] = new int[3][3];
                    ;
                    System.out.println("Ingresando elementos de la primera matriz");
                    System.out.println("       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                         try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz5[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Son matrices, por favor, ingrese un número");
                            entrada.next(); 
                            j--; 
                          }
                        }
                    }
                    System.out.println("La primera matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz5[i][j] + "   ");
                        }
                        System.out.println("");
                    }
                    System.out.println("      ");
                    System.out.println("Ingresando los elementos de la segunda matriz:     ");
                    System.out.println("       ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                    try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz7[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Ya te comentamos, debes ingresar un numero");
                            entrada.next(); 
                            j--; 
                          }
                        }
                    }

                    System.out.println("La segunda matriz es:      ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz7[i][j] + "    ");

                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            for (int k = 0; k < 3; k++) {
                                multi[i][j] = multi[i][j] + (Matriz5[i][k] * Matriz7[k][j]);
                            }
                        }

                    }

                    System.out.println("");
                    System.out.println("Mostrando matriz");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("   " + multi[i][j] + "    ");
                        }
                        System.out.println();
                    }
                    System.out.println

("---------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Elegiste matriz inversa");
                    System.out.println("       ");
                    System.out.println("        ");

                     double[][] matriz = {{2, 0, 1}, {1, 1, -4}, {3, 7, -3}}; // La matriz para la que queremos encontrar la inversa
        
                    int n = matriz.length;
                    double[][] matrizIdentidad = new double[n][n];

                    // Inicializamos la matriz identidad
                    for (int i = 0; i < n; i++) {
                        matrizIdentidad[i][i] = 1;
                    }

                    // Aplicamos el método de Gauss-Jordan para calcular la inversa
                    for (int i = 0; i < n; i++) {
                        double divisor = matriz[i][i];

                        // Dividir la fila i por el divisor
                        for (int j = 0; j < n; j++) {
                            matriz[i][j] /= divisor;
                            matrizIdentidad[i][j] /= divisor;
                        }

                        // Hacer ceros en otras filas
                        for (int k = 0; k < n; k++) {
                            if (k != i) {
                                double factor = matriz[k][i];

                                for (int j = 0; j < n; j++) {
                                    matriz[k][j] -= factor * matriz[i][j];
                                    matrizIdentidad[k][j] -= factor * matrizIdentidad[i][j];
                                }
                            }
                        }
                    }

                    // Imprimir la matriz inversa
                    System.out.println("La matriz inversa es:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(matrizIdentidad[i][j] + " ");
                        }
                        System.out.println();
                    }

                    
                    

                   
                    System.out.println

("-------------------------------------------------------------------------------------");
                    break;
                    
                case 4:
                       System.out.println("Elegiste resta de matrices");
                    int Matriz11[][] = new int[3][3],Matriz12[][] = new int[3][3],Matriz13[][] = new int[3][3];

                    System.out.println("Ingresando los elementos de la primera matriz   ");
                    System.out.println("    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                        try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz11[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Son matrices, por favor, ingrese un número");
                            entrada.next(); 
                            j--; 
                          }
                        }
                    }
                    System.out.println("La primera matriz es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz11[i][j] + "   ");

                        }
                        System.out.println();
                    }

                    System.out.println("       ");
                    System.out.println("Ingresando los elementos de la segunda matriz:   ");
                    System.out.println("     ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                    try {
                            System.out.print("Ingrese número en la posición [" + i + "][" + j + "]: ");
                    Matriz12[i][j] = entrada.nextInt();
                          } catch (Exception e) {
                            System.out.println("Ya te comentamos, debes ingresar un numero");
                            entrada.next(); 
                            j--; 
                          }
                        }
                    }
                    System.out.println("La segunda matriz es:  ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz12[i][j] + "  ");

                        }
                        System.out.println();

                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            Matriz13[i][j] = Matriz11[i][j] - Matriz12[i][j];

                        }

                    }
                    System.out.println("     ");
                    System.out.println("La resta de las dos matrices es:    ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(Matriz13[i][j] + "   ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                    
                    
                case 5:
                    System.out.println("Elegiste salir del menu");
                    Salir = true;
                    break;
                default:
                    System.out.println("Ingrese numeros entre 1 y 6");

            }
        }

        System.out.println("Fin del menú");
    }
    }
    

