import java.util.Calendar;

public class Livro {
    private String titulo;
    private String autor;
    private Integer ISBN;
    private Bool disponibilidade;

    public Int getISBN() {
      return ISBN;
    }
}

public class Usuario {
    private String nome;
    private Integer ID;
    private Emprestimo[] histEmprestimo;

    public acessarSistema() {

    }
}

public class Funcionario extends Usuario {
    
}

public class Emprestimo {
    private Date dataEmpr;
    private Date dataDevo;
    private Bool status;   
    public Integer ID;

    public Emprestimo (){
      ID = Livro.getISBN;
    }
}



public class MyClass {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println("Sum of x+y = " + z);
  }
}
