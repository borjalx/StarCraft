package starcraft;

import especies.Especie;
import especies.Protoss;
import especies.Terran;
import especies.Zerg;
import excepciones.ExcepcionStarcraft;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Starcraft {

    static ArrayList<Especie> aEspecies = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, ExcepcionStarcraft {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String arrayEntrada[];
        int longArray;
        boolean keepGoing = true;

        
        //ArrayList<Protoss> aProtoss = new ArrayList<Protoss>();
        //ArrayList<Zerg> aZerg = new ArrayList<Zerg>();
        //ArrayList<Terran> aTerran = new ArrayList<Terran>();

        do {
            try {
                String entrada = buffer.readLine();
                //Comprobamos que no entramos datos vacios
                if (entrada.isEmpty()) {
                    //Dato incorrecto
                    System.out.println("< ERROR 003 : Dato incorrecto >");
                } else {
                    //Dividimos la entrada de datos en varios arrays
                    arrayEntrada = entrada.split(" ");

                    //La primera posición del array debe ser A,R,M,C o S; si no, error.
                    switch (arrayEntrada[0].toLowerCase()) {
                        case "a":
                            //Comprobar que la longitud del array sea mayor a 5
                            if (arrayEntrada.length < 5) {
                                //Nº de argumentos inválidos
                                System.out.println("< ERROR 001: Nº de argumentos inválidos");
                            } else {
                                //La segunda posición debe ser el tipo de especie, si no, error
                                switch (arrayEntrada[1].toLowerCase()) {
                                    case "terran":
                                        //Con los terran el array debe ser de longitud = 7
                                        if (arrayEntrada.length != 7) {
                                            //Nº de argumentos inválidos
                                            System.out.println("< ERROR 001: Nº de argumentos inválidos");
                                        } else {

                                            //Comprobamos que el nombre no está repetido
                                            boolean repetido = false;
                                            for (Especie especie : aEspecies) {
                                                if (especie.getNombre().equalsIgnoreCase(arrayEntrada[2])) {
                                                    repetido = true;
                                                }
                                            }
                                            if (repetido) {
                                                //Ya existe escuadron con ese nombre
                                            } else {
                                                //Comprobamos que los 4 últimos dígitos son números
                                                boolean isNumero = true;
                                                for (int i = 3; i < 7; i++) {
                                                    //Comprobar si en la posicion que estamos es un número
                                                    if (isNumeric(arrayEntrada[i])) {
                                                    } else {
                                                        isNumero = false;
                                                    }
                                                }
                                                if (!isNumero) {
                                                    //Dato incorrecto
                                                    System.out.println("< ERROR 003 : Dato incorrecto >");
                                                } else {
                                                    //OK : Escuadron registrado
                                                    String nombre = arrayEntrada[2];
                                                    Double ataque = Double.parseDouble(arrayEntrada[3]);
                                                    Double defensa = Double.parseDouble(arrayEntrada[4]);
                                                    int edificios = Integer.parseInt(arrayEntrada[5]);
                                                    int tecnología = Integer.parseInt(arrayEntrada[6]);
                                                    Terran t = new Terran(nombre, ataque, defensa, edificios, tecnología);
                                                    aEspecies.add(t);
                                                    System.out.println("< OK : Escuadrón registrado >");
                                                }
                                            }
                                        }
                                        break;
                                    case "zerg":
                                        //Con los zerg el array debe ser de longitud = 7
                                        //Con los terran el array debe ser de longitud = 7
                                        if (arrayEntrada.length != 7) {
                                            //Nº de argumentos inválidos
                                            System.out.println("< ERROR 001: Nº de argumentos inválidos");
                                        } else {

                                            //Comprobamos que el nombre no está repetido
                                            boolean repetido = false;
                                            for (Especie especie : aEspecies) {
                                                if (especie.getNombre().equalsIgnoreCase(arrayEntrada[2])) {
                                                    repetido = true;
                                                }
                                            }
                                            if (repetido) {
                                                //Ya existe escuadron con ese nombre
                                            } else {
                                                //Comprobamos que los 4 últimos dígitos son números
                                                boolean isNumero = true;
                                                for (int i = 3; i < 7; i++) {
                                                    //Comprobar si en la posicion que estamos es un número
                                                    if (isNumeric(arrayEntrada[i])) {
                                                    } else {
                                                        isNumero = false;
                                                    }
                                                }
                                                if (!isNumero) {
                                                    //Dato incorrecto
                                                    System.out.println("< ERROR 003 : Dato incorrecto >");
                                                } else {
                                                    //OK : Escuadron registrado
                                                    String nombre = arrayEntrada[2];
                                                    Double ataque = Double.parseDouble(arrayEntrada[3]);
                                                    Double defensa = Double.parseDouble(arrayEntrada[4]);
                                                    int esbirros = Integer.parseInt(arrayEntrada[5]);
                                                    int overlords = Integer.parseInt(arrayEntrada[6]);
                                                    Zerg z = new Zerg(nombre, ataque, defensa, esbirros, overlords);
                                                    aEspecies.add(z);
                                                    System.out.println("< OK : Escuadrón registrado >");
                                                }
                                            }
                                        }
                                        break;
                                    case "protoss":
                                        //Con los protoss el array debe ser de longitud = 6
                                        if (arrayEntrada.length != 6) {
                                            //Nº de argumentos inválidos
                                            System.out.println("< ERROR 001: Nº de argumentos inválidos");
                                        } else {

                                            //Comprobamos que el nombre no está repetido
                                            boolean repetido = false;
                                            for (Especie especie : aEspecies) {
                                                if (especie.getNombre().equalsIgnoreCase(arrayEntrada[2])) {
                                                    repetido = true;
                                                }
                                            }
                                            if (repetido) {
                                                //Ya existe escuadron con ese nombre
                                            } else {
                                                //Comprobamos que los 4 últimos dígitos son números
                                                boolean isNumero = true;
                                                for (int i = 3; i < 6; i++) {
                                                    //Comprobar si en la posicion que estamos es un número
                                                    if (isNumeric(arrayEntrada[i])) {
                                                    } else {
                                                        isNumero = false;
                                                    }
                                                }
                                                if (!isNumero) {
                                                    //Dato incorrecto
                                                    System.out.println("< ERROR 003 : Dato incorrecto >");
                                                } else {
                                                    //Escuadrón registrado
                                                    String nombre = arrayEntrada[2];
                                                    Double ataque = Double.parseDouble(arrayEntrada[3]);
                                                    Double defensa = Double.parseDouble(arrayEntrada[4]);
                                                    int pilones = Integer.parseInt(arrayEntrada[5]);
                                                    Protoss p = new Protoss(nombre, ataque, defensa, pilones);
                                                    aEspecies.add(p);
                                                    System.out.println("< OK : Escuadrón registrado >");
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        //Sacar error 002: especie incorrecta
                                        System.out.println("< ERROR 002: Especie incorrecta >");
                                        break;
                                }
                            }
                            break;
                        case "r":
                            //Registrar batalla

                            //La longitud del array debe ser de 3
                            if (arrayEntrada.length == 3) {
                                
                                
                                //Comprobar que el nombre pertenece a un escuadrón
                                //Guardar datos del escuadrón
                                //La posición 3 debe ser el nombre de otro escuadrón
                                //Comprobar que el nombre pertenece a un escuadrón
                                //Guardar datos del escuadrón
                                //Creamos un array de 5 posiciones donde guardar el resultado de cada asalto
                                //En cada asalto se genera un número aleatorio entre 0 y 9 para cada escuadrón
                                //El número que le toque a cada escuadrón se le sumará al ataque
                                //Se restará al nuevo ataque la defensa del otro escuadrón
                                //Quién tenga el mayor ataque gana
                                //Se guarda cada victoria en una posición del array
                                //Se agrega una victoria al escuadrón ganador
                                
                                //Debe haber al menos dos objetos en el array de especies
                                if(aEspecies.size() > 1){
                                    //La posición 2 debe ser el nombre de un escuadrón
                                    
                                    
                                }else{
                                    //ERROR 004: Operación incorrecta
                                    System.out.println("< ERROR 004: Operación incorrecta>");
                                }
                            } else {
                                //Nº de argumentos inválidos
                                System.out.println("< ERROR 001: Nº de argumentos inválidos>");
                            }

                            break;
                        case "m":
                            //Mejorar escuadrón

                            if (aEspecies.isEmpty()) {
                                //Dato incorrecto
                                System.out.println("< ERROR 003 : Dato incorrecto >");
                            } else {

                                //La longitud del array debe ser de 4
                                if (arrayEntrada.length == 4) {
                                    //Guardaremos la posición, tipo y el escuadrón encontrado
                                    int pos = 0;
                                    String esp = "";
                                    //La posición 2 debe ser el nombre de un escuadrón
                                    //Comprobar que el nombre pertenece a un escuadrón
                                    boolean encontrado = false;
                                    for (int i = 0; i < aEspecies.size(); i++) {
                                        if (aEspecies.get(i).getNombre().equalsIgnoreCase(arrayEntrada[1])) {
                                            encontrado = true;
                                            //Guardamos el tipo de especie
                                            //Guardar la posición del escuadrón en el array
                                            pos = i;
                                            esp = aEspecies.getClass().getSimpleName();
                                            
                                            if (aEspecies.get(i) instanceof Terran)

                                            switch (esp) {
                                                case "terran":
                                                    //Guardamos el escuadrón encontrado
                                                    Terran t = (Terran) aEspecies.get(i);
                                                    //La posición 3 debe ser el nombre de una propiedad
                                                    //Comprobar que ha entrado una propiedad correcta

                                                    switch (arrayEntrada[2].toLowerCase()) {                                                        
                                                        case "edificios":
                                                            //La posición 4 debe ser un número
                                                            double ne = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                ne = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                System.out.println(t.getEdificios());
                                                                //Modificamos el escuadrón
                                                                t.setEdificios((int) ne);
                                                                //Nuevos valores
                                                                System.out.println(t.getEdificios());                                                                
                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        case "tecnologia":
                                                            double nt = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                nt = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                System.out.println(t.getTecnologia());
                                                                //Modificamos el escuadrón
                                                                t.setTecnologia((int) nt);
                                                                //Nuevos valores
                                                                System.out.println(t.getTecnologia());                                                                
                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            System.out.println("< ERROR 006: Propiedad incorrecta>");
                                                            break;
                                                    }
                                                    break;
                                                case "zerg":
                                                    //Guardamos el escuadrón encontrado
                                                    Zerg z = (Zerg) aEspecies.get(i);
                                                    
                                                    //La posición 3 debe ser el nombre de una propiedad
                                                    //Comprobar que ha entrado una propiedad correcta

                                                    switch (arrayEntrada[2].toLowerCase()) {                                                        
                                                        case "esbirros":
                                                            //La posición 4 debe ser un número
                                                            double ne = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                ne = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                System.out.println(z.getEsbirros());
                                                                //Modificamos el escuadrón
                                                                z.setEsbirros((int) ne);
                                                                //Nuevos valores
                                                                System.out.println(z.getEsbirros());                                                                
                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        case "overlords":
                                                            double no = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                no = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                System.out.println(z.getOverlords());
                                                                //Modificamos el escuadrón
                                                                z.setOverlords((int) no);
                                                                //Nuevos valores
                                                                System.out.println(z.getOverlords());                                                                
                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            System.out.println("< ERROR 006: Propiedad incorrecta>");
                                                            break;
                                                    }
                                                    break;
                                                case "protoss":
                                                    //Guardamos el escuadrón encontrado
                                                    Protoss p = (Protoss) aEspecies.get(i);
                                                    
                                                    //La posición 3 debe ser el nombre de una propiedad
                                                    //Comprobar que ha entrado una propiedad correcta

                                                    switch (arrayEntrada[2].toLowerCase()) {                                                        
                                                        case "pilones":
                                                            //La posición 4 debe ser un número
                                                            double np = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                np = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                System.out.println(p.getPilones());
                                                                //Modificamos el escuadrón
                                                                p.setPilones((int) np);
                                                                //Nuevos valores
                                                                System.out.println(p.getPilones());                                                                
                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            System.out.println("< ERROR 006: Propiedad incorrecta>");
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    //Especie incorrecta
                                                    System.out.println("< ERROR 002: Especie incorrecta >");
                                                    break;
                                            }
                                        }
                                    }

                                    /* if (encontrado) {
                                        switch (esp) {
                                            case "terran":

                                                break;
                                            case "zerg":
                                                break;
                                            case "protoss":
                                                break;
                                            default:
                                                //Propiedad incorrecta
                                                System.out.println("< ERROR 006: Propiedad incorrecta >");
                                                break;
                                        }

                                        //Modificamos el escuadrón
                                        //Guardamos los nuevos valores del escuadrón en el array
                                    } else {
                                        //No existe especie con ese nombre
                                        System.out.println(" < ERROR 005 : No existe especie con ese nombre >");
                                    }*/
                                } else {
                                    //Nº de argumentos inválidos
                                    System.out.println("< ERROR 001: Nº de argumentos inválidos");
                                }
                            }
                            break;
                        case "c":
                            break;
                        case "s":
                            keepGoing = false;
                            break;
                        default:
                            //Sacar error 004: operación incorrecta
                            System.out.println("< ERROR 004 - Operación incorrecta >");
                            break;
                    }
                }

            } catch (Exception e) {
            }
        } while (keepGoing);
    }

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public boolean existeEscuadron(String nombreEscuadron){
        
        boolean existe = false;
        
        for (Especie especie : aEspecies) {
            if(especie.getNombre().equalsIgnoreCase(nombreEscuadron)){
                return existe = true;
            }
        }
        
        return existe;
    }
    
    public int posicionEscuadronArray(String nombreEscuadron){
        
        int pos = 0;
        int i = 0;
        
        if(existeEscuadron(nombreEscuadron)){
            for (Especie especie : aEspecies) {
                if(especie.getNombre().equalsIgnoreCase(nombreEscuadron)){
                    pos = i;
                }
                i ++;
            }
        }
        
        return pos;
    }
}
