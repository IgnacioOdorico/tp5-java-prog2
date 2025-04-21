public class Main {
    public static void main(String[] args) {
        // Crear un sistema de soporte
        SistemaSoporte sistema = new SistemaSoporte();

        // Crear usuarios
        Usuario usuario1 = new Usuario(101, "Ana", "ana@mail.com");
        Usuario usuario2 = new Usuario(102, "Carlos", "carlos@mail.com");

        // Crear técnicos
        Tecnico tecnico1 = new Tecnico(201, "Luis", "Redes");
        Tecnico tecnico2 = new Tecnico(202, "Marta", "Software");

        // Crear tickets
        sistema.crearTicket(301, "No puedo acceder al sistema", usuario1);
        sistema.crearTicket(302, "Error 404 en la página", usuario2);
        sistema.crearTicket(303, "Problemas con la impresora", usuario1);

        // Mostrar la cantidad de tickets creados
        System.out.println("\nCantidad total de tickets creados: " + SistemaSoporte.getContadorTickets());

        // Asignar técnicos a algunos tickets
        TicketSoporte ticket1 = new TicketSoporte(304, "Pantalla azul", usuario2); // uno manual
        sistema.AsignarTecnico(ticket1, tecnico1); // asignar técnico manual
        ticket1.mostrarDetalle();

        System.out.println("\n----------------------------\n");

        // Listar todos los tickets creados dentro del sistema
        sistema.listarTickets();

        // Cerrar un ticket
        System.out.println("\nCerrando ticket 301...");
        ticket1.cerrarTicket();
        ticket1.mostrarDetalle();
    }
}
