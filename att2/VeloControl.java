class VeloControl{

    String marca;
    int Velo_atual;
    int Velo_max;

public VeloControl (String marca, int Velo_atual){

    this.marca = marca;
    this.Velo_atual = Velo_atual;
    this.Velo_max = 0;
}

public void acelerar(int valor) {
   if(valor > 0){
       int novaVelocidade = this.Velo_atual + valor;

       if (novaVelocidade > this.Velo_max){

           this.Velo_atual = this.Velo_max;
       }else{
           this.Velo_atual = novaVelocidade;
       }
   }
}
public void frear (int valor){
      if(valor > this.Velo_atual) {
          System.out.print("Não é possivel frear mais doq a velocidade atual!!");
          this.Velo_atual = 0;
          
      } else if (valor > 0) {
          this.Velo_atual -= valor;
          
      }
       if(this.Velo_atual < 0){
           this.Velo_atual = 0;
       }

}

public int getVelo_atual(){
  return this.Velo_atual;

}
public int getVelo_max(){
    return this.Velo_max;
}
public String getMarca(){
    return marca;
}
}
