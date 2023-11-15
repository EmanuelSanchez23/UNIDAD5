public class actividad5 {
    

    public static void main(String[] args) {
        int[][] casas = {
            {100, 50, 30, 120, 60},
            {32, 122, 16, 80, 90},
            {45, 100, 56, 26, 36},
            {6, 110, 72, 33, 40}
        };
        System.out.println("Cosnumo por casa");
        actividad5.consumoCasa(casas);
        System.out.println("Consumo por dia");
        actividad5.consumoDia(casas);
    }

    public static void consumoCasa(int[][] casas) {
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += casas[i][j];
            }
            System.out.println(suma);
        }

    }

    public static void consumoDia(int[][] dias) {
        for (int columnas = 0; columnas < 5; columnas++) {
            int suma = 0;
            for (int filas = 0; filas < 4; filas++) {
                suma += dias[filas][columnas];

            }
            System.out.println(suma);
        }

    }

}


