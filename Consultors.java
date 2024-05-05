public class Consultores{

    private String nome;
    private Demandas demandas;
    private String contratos;
 
    public Consultores(){
 
    }
 
    public Consultores(String nome, Demandas demandas, String contratos){
 
        this.nome = nome;
        this.demandas = demandas;
        this.contratos = contratos;
    }
 
    public void getNome(){
     return nome;
    }
 
    public void setNome(String nome){
 
    }
 
    public void getDemandas(){
     return demandas;
    }
 
    public void setDemandas(Demandas demandas){
 
    }
 
    public void getContrato(){
     return contratos;
    }
 
    public void setContratos(Contrato contratos){
 
    }
  
 
    public void validarNome(){
 
    }
 
    public void qtdDemandas(){
 
    }
 
    public void contratar(){
     
    }
 
 @Override
 public String toString() {
     return "Consultores [nome=" + nome + ", demandas=" + demandas + ", contratos=" + contratos + "]";
 }
 
 @Override
 public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((nome == null) ? 0 : nome.hashCode());
     result = prime * result + ((demandas == null) ? 0 : demandas.hashCode());
     result = prime * result + ((contratos == null) ? 0 : contratos.hashCode());
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
     Consultores other = (Consultores) obj;
     if (nome == null) {
         if (other.nome != null)
             return false;
     } else if (!nome.equals(other.nome))
         return false;
     if (demandas == null) {
         if (other.demandas != null)
             return false;
     } else if (!demandas.equals(other.demandas))
         return false;
     if (contratos == null) {
         if (other.contratos != null)
             return false;
     } else if (!contratos.equals(other.contratos))
         return false;
     return true;
 }
 
    
 }
 
 
