import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
    //NOME UTENTE, PASSWORD, ID
        String username;
        String password;
        int id;
        boolean flag = true;
        Scanner stringhe = new Scanner(System.in);
        Scanner passwd = new Scanner(System.in);
        Scanner intero = new Scanner(System.in);
        
        System.out.println("Inserisci i tuoi dati! \n In ordine username - password - codice ID. \nUsername: ");
        username = stringhe.nextLine();
        while (flag){
            if (username.length() < 1 || username.length() > 14){
                System.out.println("Username corto! Inserisci un user valido: ");
                username = stringhe.nextLine();
            } else{
                flag = false;
            }
        }
        System.out.println("\nInserisci una password: ");
        password = passwd.nextLine();
        flag = true;
        while (flag){
            if (password.equals(username) || password.length() < 4){
                System.out.println("La password non è valida! Inserisci una password valida: ");
                password = passwd.nextLine();
            } else{
                flag = false;
            }
        }
        System.out.println("\nInserisci un numero intero identificativo: ");
        id = intero.nextInt();
        flag = true;
        while (flag){
            if (id == 0){
                System.out.println("ID non valido! Inserisci un id valido: ");
                id = intero.nextInt();
            } else{
                flag = false;
            }
        }
        System.out.println("I tuoi dati sono: \n Username: " + username + "\n password: ****** \n Id: " + id);

    }
}
