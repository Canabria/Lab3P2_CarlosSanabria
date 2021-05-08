/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlossanabria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Sanabria
 */
public class Lab3P2_CarlosSanabria {
public static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        ArrayList<String> usa = new ArrayList<String>();
        ArrayList<String> pas = new ArrayList<String>();
        ArrayList<Tienda> t = new ArrayList();
        ArrayList<Articulos> a;
        ArrayList<Clientes> c;
        String resp = "";
        while (!resp.equalsIgnoreCase("f")) {
            System.out.println("Bienvenidos usted es un? (admin/supervisor/asessor/cliente)\n si quiere salir ingrese f");
            resp = leer.next();
            if (resp.equalsIgnoreCase("Admin")) {
                System.out.println("Ingrese su contraseña");
                String cont = leer.next();
                if (resp.equalsIgnoreCase("Admin") && resp.equalsIgnoreCase("1234")) {
                    while (op != 5) {
                        System.out.println("***MENU***\n"
                                + "1.Agregar\n"
                                + "2.Listar\n"
                                + "3.modificar\n"
                                + "4.eliminar\n"
                                + "Ingrese su opcion: ");
                        op = leer.nextInt();
                        switch (op) {
                            case 1:
                                int op1=0;
                                while(op1!=5){
                                    System.out.println("***MENU***\n"
                                            + "1.Agregar una tienda\n"
                                            + "2.Agregar un cliente\n"
                                            + "3.Agregar un articulo\n"
                                            + "4.Agregar un empleado\n"
                                            + "Ingrese su opcion: ");
                                    op1 = leer.nextInt();
                                    switch(op1){
                                        case 1:
                                            String ubicacion, producto_ven;
                                        int ID_unico, max_empleado, cant_cajas, max_art;
                                        System.out.println("Ingrese la Ubicacion de la Tienda");
                                        ubicacion = leer.next();
                                        System.out.println("Ingrese el producto Mas Vendido: ");
                                        producto_ven = leer.next();
                                        System.out.println("Ingrese el Identificador: ");
                                        ID_unico = leer.nextInt();
                                        System.out.println("Ingrese Cantidad Maxima de Empleados: ");
                                        max_empleado = leer.nextInt();
                                        System.out.println("Ingrese Cantidad Maxima de Cajas: ");
                                        cant_cajas = leer.nextInt();
                                        System.out.println("Ingrese Cantidad Maxima de Articulos: ");
                                        max_art = leer.nextInt();
                                                                               
                                        t.add(new Tienda(ubicacion,producto_ven,ID_unico,max_empleado,cant_cajas,max_art));
                                        break;
                                        case 2:
                                            if (t.isEmpty()) {
                                                System.out.println("Error Debe crear una Tienda antes de crear un Cliente");
                                            } else {
                                                System.out.println("Corporaciones actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                    System.out.println("");
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar una Articulo: ");
                                                int opc1 = leer.nextInt();
                                                c=t.get(opc1).getClientes();
                                            System.out.println("ingrese su nombre: ");
                                            String nom=leer.next();
                                            System.out.println("ingrese apellido: ");
                                            String ape=leer.next();
                                            System.out.println("ingrese su nacio: ");
                                            String naci=leer.next();
                                            System.out.println("ingrese su direcion de domicilio: ");
                                            String dom=leer.next();
                                            System.out.println("ingrese su salario: ");
                                            double sal=leer.nextDouble();
                                            System.out.println("ingrese la cantidad de su credito: ");
                                            double cred=leer.nextDouble();
                                            System.out.println("ingrese la cantidad de veces que comprado en la tienda: ");
                                            int comp=leer.nextInt();
                                            System.out.println("Que a comprado previamente en la tienda? : ");
                                            String compp=leer.next();
                                            System.out.println("Desea crear un cuenta en nuestro sistema? (si/no)");
                                            String resp1=leer.next();
                                            while (!resp1.equalsIgnoreCase("Si") && !resp1.equalsIgnoreCase("No")) {
                                                    System.out.println("Por favor ingrese (si/no): ");
                                                    resp1 = leer.next();
                                            }
                                            if(resp1.equalsIgnoreCase("si")){
                                                System.out.println("Ingrese un user name para registrarlo: ");
                                                String user=leer.next();
                                                System.out.println("Ingrese su contraseña: ");
                                                String contra=leer.next();
                                                while (!user.equalsIgnoreCase("Admin") && !contra.equalsIgnoreCase("1234")) {
                                                System.out.println("Por favor ingrese un username diferente para registrarlo: ");
                                                user=leer.next();
                                                System.out.println("Por favor ingrese su contraseña: ");
                                                contra=leer.next();
                                                }
                                                usa.add(user);
                                                pas.add(contra);
                                                System.out.println("que cuenta tien useted (supervisador/ assesor_finaciero/cliente)");
                                                String clases=leer.next();
                                                while (!clases.equalsIgnoreCase("supervisador") && !clases.equalsIgnoreCase("assesor_finaciero")&&!clases.equalsIgnoreCase("Cliente")) {
                                                System.out.println("Por favor ingrese: (supervisador/ assesor_finaciero/cliente)");
                                                clases=leer.next();
                                                c.add(new Clientes(nom,ape,naci,dom,sal,cred,comp,compp,clases));
                                                }
                                            }else if(resp1.equalsIgnoreCase("no")){
                                                System.out.println("okay regrese al menu principal");
                                                c.add(new Clientes(nom,ape,naci,dom,sal,cred,comp,compp));
                                            }
                                            }
                                        break;
                                        case 3:
                                             if (t.isEmpty()) {
                                                System.out.println("Error Debe crear una Tienda antes de crear un Articulo");
                                            } else {
                                                System.out.println("Corporaciones actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                    System.out.println("");
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar una Articulo: ");
                                                int opc1 = leer.nextInt();
                                                a= t.get(opc1).getArticulos();
                                                int num_serie, precio;
                                                String color, info_garan;
                                                System.out.println("Ingrese el Numero de Serie del Articulo: ");
                                                num_serie = leer.nextInt();
                                                System.out.println("Ingrese el Precio del Articulo: ");
                                                precio = leer.nextInt();
                                                System.out.println("Ingrese el Color del Articulo");
                                                color = leer.next();
                                                System.out.println("Ingrese la Informacion de Garantia: ");
                                                info_garan = leer.next();
                                                System.out.println("Que tipo de Articulo es: (Televisor/Teatro/EquipoSonido/Consola)");
                                                String tt = leer.next();
                                                while (!tt.equalsIgnoreCase("Televisor") && !tt.equalsIgnoreCase("Teatro") && !tt.equalsIgnoreCase("EquipoSonido") && !tt.equalsIgnoreCase("Consola")) {
                                                    System.out.println("Por favor ingrese una de las cuatro Articulos:(Televisor/Teatro/EquipoSonido/Consola)");
                                                    tt = leer.next();
                                                }
                                                if (tt.equalsIgnoreCase("Televisor")) {
                                                    System.out.println("Es Smart TV? (Si/No): ");
                                                    String smart = leer.next();
                                                    while (!smart.equalsIgnoreCase("Si") && !smart.equalsIgnoreCase("No")) {
                                                        System.out.println("Por favor ingrese (si/no): ");
                                                        smart = leer.next();
                                                    }
                                                    System.out.println("Ingrese La Marca: ");
                                                    String marca = leer.next();
                                                    System.out.println("Ingrese el Tam de la Pantalla: ");
                                                    int tam_pan = leer.nextInt();
                                                    System.out.println("Ingrese La Cantidad de Conexiones: ");
                                                    int cant_conex = leer.nextInt();
                                                    System.out.println("Ingrse el grosor: ");
                                                    int grosor = leer.nextInt();
                                                    a.add(new Tele(smart, marca, tam_pan, cant_conex, grosor, num_serie, precio, color, info_garan));

                                                } else if (tt.equalsIgnoreCase("Consolas")) {
                                                    System.out.println("Ingrese cantidad De Almacenamiento: ");
                                                    int cant_almace = leer.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Controles: ");
                                                    int cant_contr = leer.nextInt();
                                                    System.out.println("Ingrese el Numero de Accesorios: ");
                                                    int num_acc = leer.nextInt();
                                                    System.out.println("Ingrese la Marca de La Consola");
                                                    String mar = leer.next();
                                                    System.out.println("Ingrese Informacion de La Tarjeta Grafica: ");
                                                    String info_VC = leer.next();

                                                    a.add(new Consol(cant_almace, cant_contr, num_acc, mar, info_VC, num_serie, precio, color, info_garan));
                                                } else if (tt.equalsIgnoreCase("Teatro")) {
                                                    System.out.println("Ingrese la cantidad Altavoces: ");
                                                    int cant_alt = leer.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Blue Ray: ");
                                                    int cant_discBR = leer.nextInt();
                                                    System.out.println("Ingrese la Informacion de Limpieza: ");
                                                    String info_limp = leer.next();
                                                    a.add(new Teatros(cant_alt, cant_discBR, info_limp, num_serie, precio, color, info_garan));
                                                } else if (tt.equalsIgnoreCase("EquipoSonido")) {
                                                    System.out.println("Ingrese la Cantidad de Altavoces: ");
                                                    int cant_a = leer.nextInt();
                                                    System.out.println("Ingrese la Potencia Maxima: ");
                                                    int pot_m = leer.nextInt();
                                                    System.out.println("Ingrese la cantidad de Puertos AUX: ");
                                                    int cant_p = leer.nextInt();
                                                    System.out.println("Ingrese la Capacidad de Discos: ");
                                                    int cant_dsic = leer.nextInt();
                                                    System.out.println("Ingrese la Cantidad de Puertos USB: ");
                                                    int cant_pU = leer.nextInt();
                                                    a.add(new Equipos_sonidos(cant_a, pot_m, cant_p, cant_dsic, cant_pU, num_serie, precio, color, info_garan));
                                                }

                                            }
                                        break;
                                        case 4:
                                             if (t.isEmpty()) {
                                                System.out.println("Error Debe crear una Tienda antes de crear un Articulo");
                                            } else {
                                                System.out.println("Tienda actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                    System.out.println("");
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar una empleado: ");
                                                int opc1 = leer.nextInt();
                                                ArrayList<Empleados> e=t.get(opc1).getEmpleados();
                                                 System.out.println("ingrese su nombre: ");
                                                 String nom=leer.next();
                                                 System.out.println("ingrese su apellido: ");
                                                 String ape=leer.next();
                                                 System.out.println("ingrese su salario: ");
                                                 double sal=leer.nextDouble();
                                                 System.out.println("ingrese su nacionalidad: ");
                                                 String naci=leer.next();
                                                 System.out.println("que tipo de empleado es: (cajero/supervisor/assesor_finenaciero");
                                                 String tipo=leer.next();
                                                 while (!tipo.equalsIgnoreCase("cajero") && !tipo.equalsIgnoreCase("supervisor")&&!tipo.equalsIgnoreCase("assesor_finenaciero")) {
                                                    System.out.println("Por favor ingrese (cajero/supervisor/assesor_finenaciero): ");
                                                    tipo = leer.next();
                                                }
                                                 if(tipo.equalsIgnoreCase("Cajero")){
                                                     System.out.println("Ingrese su horario: ");
                                                     String hora=leer.next();
                                                     System.out.println("Ingrese la meta al cual tiene que llegar: ");
                                                     String met=leer.next();
                                                     System.out.println("Cantidad de años laborados: ");
                                                     int cant_a=leer.nextInt();
                                                     System.out.println("Ingrese su hora de almuerzo: ");
                                                     int alm=leer.nextInt();
                                                     System.out.println("ingrese su empleados atendidos : ");
                                                     int empl_a=leer.nextInt();
                                                     e.add(new E_cajero(hora,met,cant_a,alm,empl_a,nom,ape,sal,naci));
                                                 }else if(tipo.equalsIgnoreCase("Supervisor")){
                                                     System.out.println("Ingrese el promedio de los cajeros: ");
                                                     double prome=leer.nextDouble();
                                                     System.out.println("Ingrese la meta de los cajeros supervisados: ");
                                                     String met=leer.next();
                                                     System.out.println("Ingrese el los cajeros en esta siendo super visados:  ");
                                                     String list=leer.next();
                                                     e.add(new E_Supevisor(prome,met,list,nom,ape,sal,naci));
                                                 }else if(tipo.equalsIgnoreCase("assesor_finenaciero")){
                                                     System.out.println("ingrese cantidad de productos vendidos: ");
                                                     int venta=leer.nextInt();
                                                     System.out.println("total de credito concedidos: ");
                                                     int cred=leer.nextInt();
                                                     System.out.println("ingrese los clientes que a atendido: ");
                                                     String list=leer.next();
                                                     e.add(new E_Assesor_F(venta,cred,list,nom,ape,sal,naci));
                                                 }
                                        break;
                                    
                                        }
                                    }
                                }
                                break;
                            case 2:{
                                int op2 = 0;
                                while (op2 != 5) {
                                    System.out.println("---*MENU---\n"
                                            + "1. Listar Tiendas\n"
                                            + "2. Listar Articulos \n"
                                            + "3. Listar Empleados\n"
                                            + "4. Listar Articulos\n"
                                            + "5. Salir"
                                            + "Ingrese su opcion: ");
                                    op2 = leer.nextInt();
                                    switch (op2) {
                                        case 1:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas agregados");
                                            } else {
                                                System.out.println("\nTiendas");
                                                for (Object ct : t) {
                                                    System.out.println(t.indexOf(ct) + ")" + ct + "\n");
                                                }
                                            }

                                            break;
                                        case 2:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas registradas en sistema ");
                                            } else {
                                                System.out.println("Tiendas actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea Listar un Articulo: ");
                                                int op11 =leer.nextInt();
                                                if (t.get(op11).getArticulos().isEmpty()) {
                                                    System.out.println("No hay ninguna Marca registrada en esta corporación");
                                                } else {
                                                    System.out.println("Articulos: ");
                                                    for (int i = 0; i < t.get(op11).getArticulos().size(); i++) {
                                                        System.out.println(t.get(i).getArticulos().get(i));
                                                    }
                                                }
                                            }

                                            break;
                                        case 3:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas registradas en sistema ");
                                            } else {
                                                System.out.println("Tiendas actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea listar un Empleado: ");
                                                int op11 = leer.nextInt();
                                                if (t.get(op11).getEmpleados().isEmpty()) {
                                                    System.out.println("No hay ningun Empleado registrado en esta Tienda");
                                                } else {
                                                    System.out.println("Empleados: ");
                                                    for (int i = 0; i < t.get(op11).getEmpleados().size(); i++) {
                                                        System.out.println(t.get(i).getEmpleados().get(i));
                                                    }
                                                }
                                            }

                                            break;
                                        case 4:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas registradas en sistema ");
                                            } else {
                                                System.out.println("Tiendas actualmente en el sistema: ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println(i + ")" + t.get(i));
                                                }
                                                System.out.println("ingrese el indice de la Tienda cual usted desea agregar un Cliente: ");
                                                int op11 = leer.nextInt();
                                                if (t.get(op11).getClientes().isEmpty()) {
                                                    System.out.println("No hay ninguna Marca registrada en esta corporación");
                                                } else {
                                                    System.out.println("Articulos: ");
                                                    for (int i = 0; i < t.get(op11).getClientes().size(); i++) {
                                                        System.out.println(t.get(i).getClientes().get(i));
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                    }
                                }
                                break;
                        
                            }
                            case 3:
                                break;
                            case 4:{
                              int op4 = 0;
                                while (op4 != 5) {
                                    System.out.println("---*MENU---\n"
                                            + "1. Eliminar Tiendas\n"
                                            + "2. Eliminar Articulos \n"
                                            + "3. Eliminar Empleados\n"
                                            + "4. Eliminar Articulos\n"
                                            + "5. Salir"
                                            + "Ingrese su opcion: ");
                                    op4 = leer.nextInt();
                                    switch (op4) {
                                        case 1:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Corporaciones para elmininar");
                                            } else {
                                                System.out.println("Ingrese la posicion de la tienda a eliminar ");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println("En la posicion " + i + ") " + ", está: " + t.get(i).getID_unico());
                                                    System.out.println("");
                                                }//fin del for que recorre la lista
                                                System.out.print("Ingrese poscion: ");
                                                int op44 = leer.nextInt();
                                                t.remove(op44);
                                                System.out.println("Se ha eliminado La Tienda");
                                            }
                                            break;
                                        case 2:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas en el sistema para escoger Articulos");
                                            } else {
                                                System.out.println("Ingrese la posicion de la Tienda");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println("En la posicion " + i + ") " + ", está: " + t.get(i).getID_unico());
                                                    System.out.println("");
                                                }
                                                System.out.print("Ingrese poscion de la Tienda: ");
                                                int op44 = leer.nextInt();
                                                if (t.get(op44).getArticulos().isEmpty()) {
                                                    System.out.println("No hay Articulos para eliminar ");
                                                } else {
                                                    for (int i = 0; i < t.get(op44).getArticulos().size(); i++) {
                                                        System.out.println(i + ")" + t.get(i).getArticulos().get(i));
                                                        System.out.println("");
                                                    }
                                                    System.out.println("Ingrse posicion de los Articulos a Eliminar");
                                                    int op3 = leer.nextInt();
                                                    t.get(op44).getArticulos().remove(op3);
                                                    System.out.println("Se ha eliminado el Articulo");
                                                }
                                            }
                                            break;
                                        case 3:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas en el sistema para escoger Empleados");
                                            } else {
                                                System.out.println("Ingrese la posicion de la Tienda");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println("En la posicion " + i + ") " + ", está: " + t.get(i).getID_unico());
                                                    System.out.println("");
                                                }
                                                System.out.print("Ingrese poscion de la Tienda: ");
                                                int op44 = leer.nextInt();
                                                if (t.get(op44).getEmpleados().isEmpty()) {
                                                    System.out.println("No hay Empleados para eliminar ");
                                                } else {
                                                    for (int i = 0; i < t.get(op44).getEmpleados().size(); i++) {
                                                        System.out.println(i + ")" + t.get(i).getEmpleados().get(i));
                                                        System.out.println("");
                                                    }
                                                    System.out.println("Ingrse posicion de el Empleado a Eliminar");
                                                    int op3 = leer.nextInt();
                                                    t.get(op44).getEmpleados().remove(op3);
                                                    System.out.println("Se ha eliminado el Empleado");
                                                }
                                            }
                                            
                                            break;
                                        case 4:
                                            if (t.isEmpty()) {
                                                System.out.println("No hay Tiendas en el sistema para escoger Clientes");
                                            } else {
                                                System.out.println("Ingrese la posicion de la Tienda");
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.println("En la posicion " + i + ") " + ", está: " + t.get(i).getID_unico());
                                                    System.out.println("");
                                                }
                                                System.out.print("Ingrese poscion de la Tienda: ");
                                                int op44 = leer.nextInt();
                                                if (t.get(op44).getClientes().isEmpty()) {
                                                    System.out.println("No hay Empleados para eliminar ");
                                                } else {
                                                    for (int i = 0; i < t.get(op44).getClientes().size(); i++) {
                                                        System.out.println(i + ")" + t.get(i).getClientes().get(i));
                                                        System.out.println("");
                                                    }
                                                    System.out.println("Ingrse posicion de el Cliente a Eliminar");
                                                    int op3 = leer.nextInt();
                                                    t.get(op44).getEmpleados().remove(op3);
                                                    System.out.println("Se ha eliminado el Cliente");
                                                }
                                            }
                                            break;
                                        default:
                                    }
                                }
                                
                                break;
                            }
                        }
                    }
                }
            }else{
                
            }
        }
    }
}
    

