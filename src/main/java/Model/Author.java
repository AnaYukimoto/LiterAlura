package Model;

public class Author {
    private String name;           // Nome do autor
    private String birthDate;      // Data de nascimento (pode ser String ou LocalDate)
    private String deathDate;      // Data de falecimento (opcional, pode ser null)
    private boolean isAlive;       // Se o autor está vivo ou não

    // Construtores
    public Author() {
        // Construtor padrão
    }

    public Author(String name, String birthDate, String deathDate, boolean isAlive) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.isAlive = isAlive;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    // Método toString para exibir informações do autor
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deathDate='" + deathDate + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
