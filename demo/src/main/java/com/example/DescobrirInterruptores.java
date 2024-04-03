package com.example;

public class DescobrirInterruptores {
    public static void main(String[] args) {
        // Suponha que o estado inicial das lâmpadas seja: lâmpada 1 = apagada, lâmpada 2 = apagada, lâmpada 3 = acesa
        boolean[] estadoInicial = new boolean[]{false, false, true};
        
        System.out.println("Estado inicial das lâmpadas:");
        imprimirEstadoLampadas(estadoInicial);
        
        // Primeira ida à sala das lâmpadas
        alterarInterruptores(estadoInicial, new boolean[]{true, true, false});
        
        // Segunda ida à sala das lâmpadas
        alterarInterruptores(estadoInicial, new boolean[]{false, true, false});
        
        System.out.println("\nEstado final das lâmpadas após manipulação dos interruptores:");
        imprimirEstadoLampadas(estadoInicial);
    }
    
    public static void alterarInterruptores(boolean[] estadoLampadas, boolean[] interruptores) {
        for (int i = 0; i < estadoLampadas.length; i++) {
            estadoLampadas[i] = estadoLampadas[i] ^ interruptores[i];
        }
    }
    
    public static void imprimirEstadoLampadas(boolean[] estadoLampadas) {
        for (int i = 0; i < estadoLampadas.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + ": " + (estadoLampadas[i] ? "Acesa" : "Apagada"));
        }
    }
}
