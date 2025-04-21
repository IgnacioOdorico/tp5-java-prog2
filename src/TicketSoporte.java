import java.time.LocalDate;
public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCrecion;
    private Usuario usuario;
    private Tecnico tecnico;

    //constructores
    TicketSoporte(int id, String descripcion){
        this.id=id;
        this.descripcion=descripcion;
        this.estado="abierto";
    }
    TicketSoporte(int id, String descripcion,Usuario usuario){
        this.id=id;
        this.descripcion=descripcion;
        this.estado="abierto";
        this.usuario=usuario;

    }

    public TicketSoporte() {
    }

    public void cerrarTicket(){
        if( this.estado=="abierto" ){
            this.estado="cerrado";
        }
        else {
            System.out.println("su ticket ya estaba cerrado");
        }

    }
    public void mostrarDetalle(){
        System.out.println("id="+id+"\ndescripcion="+descripcion+"\nestado="+estado+"\nfecha de creacion="+fechaCrecion+"\n<<<usuario creador del tiked>>>"+usuario+"\nTECNICO ASIGNADO:"+tecnico);
    }
    //asignar tecnico
    public void asignarTecnico(Tecnico tecnico){
        this.tecnico=tecnico;
    }

    public int getId() {
        return id;
    }
}
