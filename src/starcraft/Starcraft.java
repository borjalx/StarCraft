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
import java.util.Collections;

public class Starcraft {

    static ArrayList<Especie> aEspecies = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String arrayEntrada[];
        boolean keepGoing = true;

        do {
            try {
                String entrada = buffer.readLine();
                //Comprobamos que no entramos datos vacios
                if (entrada.isEmpty()) {
                    //Dato incorrecto
                    throw new ExcepcionStarcraft("< ERROR 003 : Dato incorrecto >");
                } else {
                    //Dividimos la entrada de datos en varios arrays
                    arrayEntrada = entrada.split(" ");

                    //La primera posición del array debe ser A,R,M,C o S; si no, error.
                    switch (arrayEntrada[0].toLowerCase()) {
                        case "a":
                            //Comprobar que la longitud del array sea mayor a 5
                            if (arrayEntrada.length < 5) {
                                //Nº de argumentos inválidos
                                throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos");
                            } else {
                                //La segunda posición debe ser el tipo de especie, si no, error
                                switch (arrayEntrada[1].toLowerCase()) {
                                    case "terran":
                                        //Con los terran el array debe ser de longitud = 7
                                        if (arrayEntrada.length != 7) {
                                            //Nº de argumentos inválidos
                                            throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos");
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
                                                    throw new ExcepcionStarcraft("< ERROR 003 : Dato incorrecto >");
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
                                            throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos");
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
                                                    throw new ExcepcionStarcraft("< ERROR 003 : Dato incorrecto >");
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
                                            throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos");
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
                                                    throw new ExcepcionStarcraft("< ERROR 003 : Dato incorrecto >");
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
                                        throw new ExcepcionStarcraft("< ERROR 002: Especie incorrecta >");
                                }
                            }
                            break;
                        case "r":
                            //Registrar batalla

                            //La longitud del array debe ser de 3
                            if (arrayEntrada.length == 3) {

                                //Guardar datos del escuadrón
                                //Creamos un array de 5 posiciones donde guardar el resultado de cada asalto
                                //En cada asalto se genera un número aleatorio entre 0 y 9 para cada escuadrón
                                //El número que le toque a cada escuadrón se le sumará al ataque
                                //Se restará al nuevo ataque la defensa del otro escuadrón
                                //Quién tenga el mayor ataque gana
                                //Se guarda cada victoria en una posición del array
                                //Se agrega una victoria al escuadrón ganador
                                //Debe haber al menos dos objetos en el array de especies
                                if (aEspecies.size() > 1) {
                                    //Comprobar que el nombre pertenece a cada escuadrón
                                    if (existeEscuadron(arrayEntrada[1]) && existeEscuadron(arrayEntrada[2])) {

                                        int res[] = new int[5];

                                        int pos2 = posicionEscuadronArray(arrayEntrada[2]);
                                        int pos1 = posicionEscuadronArray(arrayEntrada[1]);

                                        int j1 = 0;
                                        int j2 = 0;

                                        System.out.println("< Inicio batalla... >");
                                        System.out.println("Asalto nº1");
                                        res[0] = ganadorBatalla(aEspecies.get(pos1), aEspecies.get(pos2));
                                        System.out.println("Asalto nº2");
                                        res[1] = ganadorBatalla(aEspecies.get(pos1), aEspecies.get(pos2));
                                        System.out.println("Asalto nº3");
                                        res[2] = ganadorBatalla(aEspecies.get(pos1), aEspecies.get(pos2));
                                        System.out.println("Asalto nº4");
                                        res[3] = ganadorBatalla(aEspecies.get(pos1), aEspecies.get(pos2));
                                        System.out.println("Asalto nº5");
                                        res[4] = ganadorBatalla(aEspecies.get(pos1), aEspecies.get(pos2));

                                        System.out.println("< Fin de la batalla...");

                                        for (int re : res) {
                                            if (re == 1) {
                                                j1++;
                                            } else if (re == 2) {
                                                j2++;
                                            }
                                        }

                                        if (j1 > j2) {
                                            System.out.println("< Ok: La batalla la ha ganado el escuadron " + arrayEntrada[1] + " con " + j1 + " asaltos >");
                                            aEspecies.get(pos1).setNumeroVictorias(aEspecies.get(pos1).getNumeroVictorias() + 1);
                                        } else if (j2 > j1) {
                                            System.out.println("< Ok: La batalla la ha ganado el escuadron " + arrayEntrada[2] + " con " + j2 + " asaltos >");
                                            aEspecies.get(pos2).setNumeroVictorias(aEspecies.get(pos2).getNumeroVictorias() + 1);
                                        } else if (j1 == j2) {
                                            System.out.println("< Ok: La batalla ha acabado con empate>");
                                        }

                                        //Comprobar de que tipos son
                                        //Guardar los escuadrones
                                    } else {
                                        //Error 005
                                        throw new ExcepcionStarcraft("< Error 005: No existe especie con ese nombre >");
                                    }

                                } else {
                                    //ERROR 004: Operación incorrecta
                                    throw new ExcepcionStarcraft("< ERROR 008: Deben haber al menos 2 escuadrones>");
                                }
                            } else {
                                //Nº de argumentos inválidos
                                throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos>");
                            }

                            break;
                        case "m":
                            //Mejorar escuadrón

                            if (aEspecies.isEmpty()) {
                                throw new ExcepcionStarcraft("< ERROR 005 : No existe especie con ese nombre >");
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
                                            esp = aEspecies.get(i).getClass().getSimpleName().toLowerCase();

//                                            if (aEspecies.get(i) instanceof Terran)
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
                                                                //System.out.println(t.getEdificios());
                                                                //Modificamos el escuadrón
                                                                t.setEdificios((int) ne);
                                                                //Nuevos valores
                                                                //System.out.println(t.getEdificios());                                                                

                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        case "tecnologia":
                                                            double nt = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                nt = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                //System.out.println(t.getTecnologia());
                                                                //Modificamos el escuadrón
                                                                t.setTecnologia((int) nt);
                                                                //Nuevos valores
                                                                //System.out.println(t.getTecnologia());                                                                

                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            throw new ExcepcionStarcraft("< ERROR 006: Propiedad incorrecta>");
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
                                                                //Modificamos el escuadrón
                                                                z.setEsbirros((int) ne);
                                                                //Nuevos valores
                                                                //System.out.println(z.getEsbirros());                                                                

                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        case "overlords":
                                                            double no = 0;
                                                            if (isNumeric(arrayEntrada[3])) {
                                                                no = Integer.parseInt(arrayEntrada[3]);
                                                                //Valores anteriores
                                                                //System.out.println(z.getOverlords());
                                                                //Modificamos el escuadrón
                                                                z.setOverlords((int) no);
                                                                //Nuevos valores
                                                                //System.out.println(z.getOverlords());                                                                
                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            throw new ExcepcionStarcraft("< ERROR 006: Propiedad incorrecta>");
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
                                                                //System.out.println(p.getPilones());
                                                                //Modificamos el escuadrón
                                                                p.setPilones((int) np);
                                                                //Nuevos valores
                                                                //System.out.println(p.getPilones());                                                                

                                                                System.out.println("< OK: Propiedad mejorada >");
                                                            }
                                                            break;
                                                        default:
                                                            //Propiedad incorrecta
                                                            throw new ExcepcionStarcraft("< ERROR 006: Propiedad incorrecta>");
                                                    }
                                                    break;
                                                default:
                                                    //Especie incorrecta
                                                    throw new ExcepcionStarcraft("< ERROR 002: Especie incorrecta >");
                                            }
                                        } else {
                                            throw new ExcepcionStarcraft("< ERROR 005 : No existe especie con ese nombre >");
                                        }
                                    }
                                } else {
                                    //Nº de argumentos inválidos
                                    throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos");
                                }
                            }
                            break;
                        case "c":
                            if (aEspecies.isEmpty()) {
                                throw new ExcepcionStarcraft("< CLASIFICACION: No hay escuadrones registrados >");
                            } else {
                                if (arrayEntrada.length != 1) {
                                    throw new ExcepcionStarcraft("< ERROR 001: Nº de argumentos inválidos>");
                                } else {
                                    clasificacion();
                                }
                            }
                            break;
                        case "s":
                            keepGoing = false;
                            break;
                        default:
                            //Sacar error 004: operación incorrecta
                            throw new ExcepcionStarcraft("< ERROR 004 - Operación incorrecta >");
                    }
                }

            } catch (IOException e) {
                System.out.println("Error Entrada / Salidad!! " + e.getMessage());
            } catch (ExcepcionStarcraft e) {
                System.out.println(e.getMessage());
            }
        } while (keepGoing);
    }

    public static void clasificacion() {

        Collections.sort(aEspecies);

        if (aEspecies.size() <= 3) {
            for (Especie especie : aEspecies) {
                System.out.println(especie.toString());
            }

        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(aEspecies.get(i).toString());
            }
        }
    }

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
            if (d >= 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean existeEscuadron(String nombreEscuadron) {

        boolean existe = false;

        for (Especie especie : aEspecies) {
            if (especie.getNombre().equalsIgnoreCase(nombreEscuadron)) {
                return existe = true;
            }
        }

        return existe;
    }

    public static int posicionEscuadronArray(String nombreEscuadron) {

        int pos = 0;
        int i = 0;

        if (existeEscuadron(nombreEscuadron)) {
            for (Especie especie : aEspecies) {
                if (especie.getNombre().equalsIgnoreCase(nombreEscuadron)) {
                    pos = i;
                }
                i++;
            }
        }

        return pos;
    }

    public static int ganadorBatalla(Especie especie1, Especie especie2) {

        //Preguntar a MAR si la batalla está hecha correctamente
        //Aunque creo que el tipo de especie no es necesario, ya que utiliza las varibales comunes
        String nombreEspecie1 = especie1.getNombre();
        String nombreEspecie2 = especie2.getNombre();

        int ganador = 0;

        int random1 = (int) (Math.random() * 9) + 1;
        int random2 = (int) (Math.random() * 9) + 1;

        double de1 = especie1.getDefensa();
        double de2 = especie2.getDefensa();

        int a = 0;
        int b = 0;

        if (especie1 instanceof Terran) {
            Terran esc1 = (Terran) especie1;
            esc1.aumentarAtaque();
            a = (int) esc1.getAtaque() + random1;
            a -= de2;
        } else if (especie1 instanceof Zerg) {
            Zerg esc1 = (Zerg) especie1;
            a = (int) esc1.getAtaque() + random1;
            a -= de2;
        } else if (especie1 instanceof Protoss) {
            Protoss esc1 = (Protoss) especie1;
            a = (int) esc1.getAtaque() + random1;
            a -= de2;
        }

        if (especie2 instanceof Terran) {
            Terran esc2 = (Terran) especie2;
            esc2.aumentarAtaque();
            b = (int) esc2.getAtaque() + random2;
            b -= de1;
        } else if (especie2 instanceof Zerg) {
            Zerg esc2 = (Zerg) especie2;
            b = (int) esc2.getAtaque() + random2;
            b -= de1;
        } else if (especie2 instanceof Protoss) {
            Protoss esc2 = (Protoss) especie2;
            b = (int) esc2.getAtaque() + random2;
            b -= de1;
        }

        System.out.println("Ataca " + nombreEspecie1 + " - Nº aleatorio: " + random1 + " - Valor de su ataque : " + a);
        System.out.println("Ataca " + nombreEspecie2 + " - Nº aleatorio: " + random2 + " - Valor de su ataque : " + b);

        if (a > b) {
            ganador = 1;
            System.out.println("Ganador del asalto: " + nombreEspecie1);
        } else if (b > a) {
            ganador = 2;
            System.out.println("Ganador del asalto: " + nombreEspecie2);
        }

        return ganador;
    }

}
