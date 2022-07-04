
package proyecto1;

import vista.inicios;

public class Principal {

    public static void main(String[] args){
        /*boolean salir = false;
        int num = 0;
        int cont = 0;
        int opcion = 0;
        boolean equib = true;
        boolean exception = false;
        boolean exception1 = false;
        Casos caso1 = new Casos();
        Scanner entrada = new Scanner(System.in);
        try
        {
            System.out.println(" ----CUANTOS CASOS DESEA REGISTRAR----  ");
            num = entrada.nextInt();
            
            exception1 = false;
        }
        catch(InputMismatchException e) 
        {
            System.out.println("-- debe ser un dato entero --");
            exception1 = true;
        }
        finally
        {
            if(exception1==true) {
                System.out.println("-- se detecto una excepcion -- ");
            } else
            {
                System.out.println("contiue: ");
                System.out.println("");
                while ((salir != true) && (equib != false))
                {
                    System.out.println("\t\n---CASOS POLICIALES---\n"+
                            "1. registrar casos \n" +
                            "2. editar casos \n" +
                            "3. consultar casos \n" +
                            "4. consultar detectives\n" +
                            "5. eliminar casos\n" +
                            "6. salir"+
                              "\n ingrese opcion\n");
                        try
                        {
                            opcion = entrada.nextInt();

                            exception = false;
                        }
                        catch(java.util.InputMismatchException e)
                        {
                            System.out.println("-- debe ser un dato entero --");
                            exception = true;
                            equib = false;
                        }
                        finally 
                        {
                            if(exception == false)
                            {
                                System.out.println("sin excepciones.");
                            }
                        }
                        
                    switch(opcion)
                    {
                        case 1:
                            if (caso1.setCasos(num) == false)
                            {
                                equib = false;
                            }
                            break;
                        case 2:
                            if (caso1.setnewcaso(num) == false)
                                {
                                    equib = false;
                                }
                            break;
                        case 3:
                            caso1.mostrarCasos(num);
                            break;
                        case 4: 
                            caso1.detectivesActivos();
                            break;
                        case 5:
                            caso1.delete(num);
                            break;
                        case 6:
                            salir = true;
                            break;
                    }
                }
            }
        }
        
    }*/
    
    new inicios().setVisible(true);
    
    }   
}


