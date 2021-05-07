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
                                + "1.Agregar una tienda\n"
                                + "2.Listar una tienda\n"
                                + "3.modificar un tienda\n"
                                + "4.eliminar una tienda\n"
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
                                                }//fin del for que recorre la lista de tiendas
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
                                        break;
                                        case 3:
                                            if (t.isEmpty()) {
                                    System.out.println("Error Debe crear una Tienda antes de crear un Articulo");
                                } else {
                                    System.out.println("Corporaciones actualmente en el sistema: ");
                                    for (int i = 0; i < t.size(); i++) {
                                        System.out.println(i + ")" + t.get(i));
                                        System.out.println("");
                                    }//fin del for que recorre la lista de tiendas
                                    System.out.println("ingrese el indice de la Tienda cual usted desea agregar una Articulo: ");
                                    int opc1 =leer.nextInt();
                                    a=t.get(opc1).getArticulos();
                                    int num_serie, precio;
                                    String color, info_garan;
                                    System.out.println("Ingrese el Numero de Serie del Articulo: ");
                                    num_serie = sc.nextInt();
                                    System.out.println("Ingrese el Precio del Articulo: ");
                                    precio = sc.nextInt();
                                    System.out.println("Ingrese el Color del Articulo");
                                    color = sc.next();
                                    System.out.println("Ingrese la Informacion de Garantia: ");
                                    info_garan = sc.next();
                                            }
                                        break;
                                        case 4:
                                        
                                        break;
                                    }
                                    }
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }
                }
            }else{
                
            }
        }
    }
    }
}
