import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private static int contadorTickets = 0;
    private List<TicketSoporte> tickets = new ArrayList<>();

    // Crear un nuevo ticket y agregarlo a la lista
    public void crearTicket(int id, String descripcion, Usuario usuario) {
        TicketSoporte nuevoTicket = new TicketSoporte(id, descripcion, usuario);
        tickets.add(nuevoTicket);
        contadorTickets++;
        System.out.println("Ticket creado con ID: " + id);
    }

    // Asignar un técnico a un ticket
    public void AsignarTecnico(TicketSoporte ticket, Tecnico tecnico) {
        ticket.asignarTecnico(tecnico);
        System.out.println("Técnico asignado al ticket ID: " + ticket.getId());
    }

    // Mostrar todos los tickets
    public void listarTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets registrados.");
        } else {
            for (TicketSoporte t : tickets) {
                t.mostrarDetalle();
                System.out.println("-------------------------------");
            }
        }
    }

    // Obtener la cantidad de tickets creados
    public static int getContadorTickets() {
        return contadorTickets;
    }
}

