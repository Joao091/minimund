public class Metas {
    
    private Meta novaMeta;
    private String metaAlcancada;
    private String recomendavel;
 
    public Metas(){
 
    }
 
    public Metas(Meta novaMeta, String metaAlcancada, String recomendavel){
 
        this.novaMeta = novaMeta;
        this.metaAlcancada = metaAlcancada;
        this.recomendavel = recomendavel;
    }
 
    public void getNovaMeta(){
     return novaMeta;
    }
 
    public void setNovaMeta(Meta novaMeta){
 
    }
 
    public void getMetaAlcancada(){
     return metaAlcancada;
    }
 
    public void setMetaAlcancada(boolean metaAlcancada){
 
    }
 
    public void getRecomendavel(){
     return recomendavel;
    }
 
    public void setRecomendavel(boolean recomendavel){
 
    }
 
    public void adicionarMeta(){
 
    }
 
    public void validarSucessoMeta(){
 
    }
 
    public void racomendacoesMetas(){
     
    }
 
 @Override
 public String toString() {
     return "Metas [novaMeta=" + novaMeta + ", metaAlcancada=" + metaAlcancada + ", recomendavel=" + recomendavel + "]";
 }
 
 @Override
 public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((novaMeta == null) ? 0 : novaMeta.hashCode());
     result = prime * result + (metaAlcancada ? 1231 : 1237);
     result = prime * result + (recomendavel ? 1231 : 1237);
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
     Metas other = (Metas) obj;
     if (novaMeta == null) {
         if (other.novaMeta != null)
             return false;
     } else if (!novaMeta.equals(other.novaMeta))
         return false;
     if (metaAlcancada != other.metaAlcancada)
         return false;
     if (recomendavel != other.recomendavel)
         return false;
     return true;
 }
 
    
 
 }
