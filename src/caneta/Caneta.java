package caneta;

public class Caneta {
    public String modelo = null;
    public String cor = null;
    public float ponta;
    public int carga;
    public boolean tampada;
    
    public int Tampar(){
        return 1;
    }
    
      public int Destampar(){
        return 0;
    }
      
       public String Escrever(){
        return "Escrevendo!!!\n";
    }

    @Override
    public String toString() {
        String tampa;
        
        if(tampada == true){
             tampa = "Tampada!";
        }else{
             tampa = "Destampada!";
        }
        return "Caneta: " + "modelo = " + modelo + ",  cor = " + cor + ",  ponta = " + ponta + ",  carga = " + carga + ", e ela está = " + tampa;
    }

    
       
    
}
