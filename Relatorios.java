public class Relatorios {
    
    private String novoRelatorio;
    private String conteudo;
    private boolean descartarGuardar;
 
     public Relatorios(){
 
     }
 
     public Relatorios(String novoRelatorio, String conteudo, boolean descartarGuardar){
 
         this.novoRelatorio = novoRelatorio;
         this.conteudo = conteudo;
         this.descartarGuardar = descartarGuardar;
     }
 
     public void getNovoRelatorio(){
         return novoRelatorio;
        }
     
        public void setNovoRelatorio(String novoRelatorio){
     
        }
     
        public void getConteudo(){
         return conteudo;
        }
     
        public void setConteudo(String conteudo){
     
        }
     
        public void getDescartarGuardar(){
         return descartarGuardar;
        }
     
        public void setDescartarGuardar(boolean descartarGuardar){
     
        }
 
        public void adicionarRelatorio(){
 
        }
 
        public void conteudoRelatorio(){
 
        }
 
        public void validarserventiaRelatorio(){
 
        }
 
     @Override
     public String toString() {
         return "Relatorios [novoRelatorio=" + novoRelatorio + ", conteudo=" + conteudo + ", descartarGuardar="
                 + descartarGuardar + "]";
     }
 
     @Override
     public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + ((novoRelatorio == null) ? 0 : novoRelatorio.hashCode());
         result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
         result = prime * result + ((descartarGuardar == null) ? 0 : descartarGuardar.hashCode());
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
         Relatorios other = (Relatorios) obj;
         if (novoRelatorio == null) {
             if (other.novoRelatorio != null)
                 return false;
         } else if (!novoRelatorio.equals(other.novoRelatorio))
             return false;
         if (conteudo == null) {
             if (other.conteudo != null)
                 return false;
         } else if (!conteudo.equals(other.conteudo))
             return false;
         if (descartarGuardar == null) {
             if (other.descartarGuardar != null)
                 return false;
         } else if (!descartarGuardar.equals(other.descartarGuardar))
             return false;
         return true;
     }
 
        
 }
