public class Projetos {
    
    private Projeto novoProjeto;
    private String pessoasEnvolvidas;
    private Prazo prazoEntrega;
 
    public Projetos(){
 
    }
 
    public Projetos(Projeto novoProjeto, String pessoasEnvolvidas, Prazo prazoEntrega){
 
        this.novoProjeto = novoProjeto;
        this.pessoasEnvolvidas = pessoasEnvolvidas;
        this.prazoEntrega = prazoEntrega;
    }
 
    public void getNovoProjeto(){
     return novoProjeto;
    }
 
    public void setNovoProjeto(Projeto novoProjeto){
 
    }
 
    public void getpessoasEnvolvidas(){
     return pessoasEnvolvidas;
    }
 
    public void setPessoasEnvolvidas(String pessoasEnvolvidas){
 
    }
 
    public void getPrazoEntrega(){
     return prazoEntrega;
    }
 
    public void setPrazoEntrega(Prazo prazoEntrega){
 
    }
 
    public void adicionarProjeto(){
 
    }
 
    public void adicionarPessoas(){
 
    }
 
    public void validarPrazoEntrega(){
     
    }
 
 @Override
 public String toString() {
     return "Projetos [novoProjeto=" + novoProjeto + ", pessoasEnvolvidas=" + pessoasEnvolvidas + ", prazoEntrega="
             + prazoEntrega + "]";
 }
 
 @Override
 public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((novoProjeto == null) ? 0 : novoProjeto.hashCode());
     result = prime * result + (pessoasEnvolvidas ? 1231 : 1237);
     result = prime * result + ((prazoEntrega == null) ? 0 : prazoEntrega.hashCode());
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
     Projetos other = (Projetos) obj;
     if (novoProjeto == null) {
         if (other.novoProjeto != null)
             return false;
     } else if (!novoProjeto.equals(other.novoProjeto))
         return false;
     if (pessoasEnvolvidas != other.pessoasEnvolvidas)
         return false;
     if (prazoEntrega == null) {
         if (other.prazoEntrega != null)
             return false;
     } else if (!prazoEntrega.equals(other.prazoEntrega))
         return false;
     return true;
 }
 
    
 }
 
