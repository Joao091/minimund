public class Clientes {
    
    private String nome;
    private Cpf cpf;
    private Pedidos pedidos;


    public Clientes() {
    }


    public Clientes(String nome, Cpf cpf, Pedidos pedidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = pedidos;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Cpf getCpf() {
        return cpf;
    }


    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }


    public Pedidos getPedidos() {
        return pedidos;
    }


    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    
     public void validarNome(){

   }

   public void validarCpf(){

   }

   public void entregaPedidos(){
    
   }

   


@Override
public String toString() {
    return "Clientes [nome=" + nome + ", cpf=" + cpf + ", pedidos=" + pedidos + "]";
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    result = prime * result + ((pedidos == null) ? 0 : pedidos.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Clientes other = (Clientes) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (cpf == null) {
        if (other.cpf != null)
            return false;
    } else if (!cpf.equals(other.cpf))
        return false;
    if (pedidos == null) {
        if (other.pedidos != null)
            return false;
    } else if (!pedidos.equals(other.pedidos))
        return false;
    return true;
}

   
}

