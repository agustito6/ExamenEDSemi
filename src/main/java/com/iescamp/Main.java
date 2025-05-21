package com.iescamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🛡️ Validador de Contraseñas Seguras");
        System.out.println("Debe tener al menos 8 caracteres, una mayúscula, una minúscula y un número.");

        System.out.print("Introduce tu contraseña: ");
        String password = scanner.nextLine();

        try {
            boolean resultado = validator.isValid(password);
            if (resultado) {
                System.out.println("✅ Contraseña válida");
            } else {
                System.out.println("❌ Contraseña inválida");
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error inesperado: " + e.getMessage());
        }
    }
}