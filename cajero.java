public class cajero {
    public static void main(String[] args) {

        System.out.println("Welcome to the ATM");

     
    //vamos a definir las variables 
    String usuario = "Cesar Aaron sanchez Gonzalez";
    String contraseña = "12345";      
    int saldoInicial = 1000;
    int errores = 0;

    //vamos a pedir el usuario y la contraseña y cada que se equivoque le vamos a poner un error y si llega a 3 errores se le va a bloquear la cuenta
   while (errores < 3) {


    System.out.println("Enter your password:");
    String passwordInput = System.console().readLine();


    if (passwordInput.equals(contraseña)) {

        //pedimos la contraseña y vamos a hacer que llame a otro archivo que se llama MenuCajero.java donde estara el menu del cajero 
        System.out.println("Login successful. Welcome, " + usuario + "!");
        MenuCajero.mostrarMenu(saldoInicial); //le vamos a mandar el saldo inicial al menu del cajero
         System.exit(0);

    } else  { 
        errores++; //esto aumenta 1 a la variable errores
            }
    }

}
}  